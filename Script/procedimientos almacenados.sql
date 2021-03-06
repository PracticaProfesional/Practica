-- Procedimiento para reportes


DELIMITER $
CREATE DEFINER=`root`@`localhost` PROCEDURE `ReporteMS`(fechaDesde date, fechaHasta date)
BEGIN
	select ConsultaMedica.diagnostico, sexo, fechaNacimientoPaciente
	from ExpedienteMedico join ConsultaMedica
	on ExpedienteMedico.id = ConsultaMedica.idExpedienteMedico
	join Paciente on ExpedienteMedico.idPaciente = Paciente.id
	Where ConsultaMedica.fecha  between fechaDesde and fechaHasta order by ConsultaMedica.diagnostico;
END



-- SELECT DE SIGNOS VITALES PARA REPORTE
Select cedulaPaciente, nombrePaciente, apellido1Paciente, peso, FC, PAR, IMC, IMB, H2O, MM, GC, `AS`, AF, SS, PAP, IM, IV, SC, GM, CP, ES, PA, exMama, curaciones, temperatura, talla
from ExpedienteMedico join ConsultaMedica
on ExpedienteMedico.id = ConsultaMedica.idExpedienteMedico
join Paciente on ExpedienteMedico.idPaciente = Paciente.id
join SignosVitales on ConsultaMedica.signosVitales = SignosVitales.id

-- Procedimientos almacenados de insercion en las tablas de la base de datos SIGOS
DELIMITER $
CREATE PROCEDURE `InsertarCitaPaciente` (idC int, idP int)
BEGIN
	Insert into citapaciente(idCita, idPaciente)
	values(idC, idP);
END $

-- Alteracion en tabla consultamedica
ALTER TABLE `sigos`.`ConsultaMedica` 
ADD COLUMN `notaEnfermeria` VARCHAR(500) NULL COMMENT '' AFTER `observaciones`;
-- Eliminar cita
CREATE  PROCEDURE `EliminarCita`(hora varchar(10), fecha date)
BEGIN
	delete from cita 
		where horaConsulta = hora and fechaConsulta = fecha;
END

-- INNER JOIN CON DATOS DE PERSONAS EN CONSULTA MEDICA
SELECT ConsultaMedica.id,idExpedienteMedico,idPaciente, nombrePaciente,apellido1Paciente, apellido2Paciente,signosVitales from ExpedienteMedico join ConsultaMedica
on ExpedienteMedico.id = ConsultaMedica.idExpedienteMedico
join Paciente on ExpedienteMedico.id = Paciente.id
Where ConsultaMedica.fecha = '2015-08-22';


DELIMITER $   -- insertar en la tabla usuario
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarUsuario`(in usuario varchar(45), in pass varchar(45), in tipo tinyint(10))
BEGIN
	insert into Usuario(nombreUsuario, contrasena, tipo) 
    values(usuario, pass, tipo);
END$

DELIMITER $  -- inserta en la tabla inventario
CREATE PROCEDURE InsertarInventario (in nom varchar(100), in can int,
			in tam varchar(45), in via varchar(45))
BEGIN
	declare varTam varchar(45);
	declare varVia varchar(45);
		
	if tam <> '' then      -- si el parametro no esta vacio
		set varTam = tam;
	end if;

	if via <> '' then      -- si el parametro no esta vacio
		set varVia = via;
	end if;

	insert into inventario (nombre, cantidad, tamano, viaAdministracion)
	values (nom, can, varTam, varVia);
		
END $


DELIMITER $ -- insertar en la tabla telefono
CREATE PROCEDURE  InsertarTelefono (in numTel varchar(45), in deta varchar(45))
BEGIN
	insert into telefono (numeroTelefono, detalle)
	values (numTel, deta);
END $


DELIMITER $ -- insertar en la tabla SignosVitales
CREATE PROCEDURE InsertarSignosVitales (in pes double, in fc double, in par double,
		in imc double, in imb double, in h2o double, in mm double, in gc double,
		in ass tinyint(1), in af tinyint(1), in ss tinyint(1), in pap tinyint(1), 
		in im tinyint(1),
		in iv tinyint(1), in sc tinyint(1), in gm tinyint(1), in cp tinyint(1), 
		in es tinyint(1),
		in pa tinyint(1), in exaMama tinyint(1), in cura tinyint(1),
		in temp double, in tall double)
BEGIN
	insert into signosvitales (peso, FC, PAR, IMC, IMB, H2O, MM, GC, `AS`, AF, SS, 
				PAP, IM, IV, SC, GM, CP, ES, PA, exMama, curaciones, temperatura,
				talla)
	values (pes, fc, par, imc, imb, h2o, mm, gc, ass, af, ss, pap, im, 
			iv, sc, gm, cp, es, pa, exaMama, cura, temp, tall);
END $


DELIMITER $$

CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarReceta`(in des longtext)
BEGIN
	insert into Receta (descripcion)
	values (des);
END


DELIMITER $ -- insertar en la tabla de examen medico aqui no se utiliza la variable blob para hacer la insercio pero deberia
CREATE PROCEDURE InsertarExamenMedico ()
BEGIN
	insert into examenmedico ()
	values ();
END $


DELIMITER $  -- insertar en la tabla padecimientos
CREATE PROCEDURE InsertarPadecimientos (in nomPad varchar(45))
BEGIN
	insert into padecimientos(nombrePadecimiento)
	values (nomPad);
END $


DELIMITER $  --  insertar en la tabla vacunas
CREATE PROCEDURE InsertarVacunas (in tip varchar(45), in fecApl date)
BEGIN
	insert into vacunas (tipo, fechaAplicacion)
	values (tip, fecApl);
END $


DELIMITER $  --  insertar en la tabla examen fisico
CREATE PROCEDURE InsertarExamenFisico (in cat varchar(45), in subCat varchar(45),
			in det varchar(45), in idConMed int)
BEGIN
	insert into examenfisico (categoria, subCategoria, detalle, idConsultaMedica)
	values (cat, subCat, det, idConMed);
END $


DELIMITER $  --  insertar en la tabla alergias0
CREATE PROCEDURE InsertarAlergias (in nomAle varchar(45), in desAle varchar(45))
BEGIN
	insert into alergias (nombreAlergia, descripcionAlergia)
	values (nomAle, desAle);
END $


DELIMITER $  --  insertar en la tabla cita
CREATE PROCEDURE InsertarCita (in est tinyint, in fecCon date,
		in anot varchar(45), in hor varchar(10))
BEGIN
	insert into cita (estado, fechaConsulta, anotaciones, horaConsulta)
	values (est, fecCon, anot, hor);
END $


DELIMITER $  --  insertar en la tabla antecedentes personales
CREATE PROCEDURE InsertarAntecedentesPersonales (in trata varchar(45), in med varchar(45),
		in idAle int, in idVac int)
BEGIN
	declare alergia int;
	declare vacuna int;
	
	if idAle <> 0 then
		set alergia = idAle;
	end if;

	if idVac <> 0 then
		set vacuna = idVac;
	end if;

	insert into AntecedentesPersonales (tratamiento, medicamento, idAlergias, idVacunas)
	values (trata, med, alergia, vacuna);
END $


DELIMITER $
CREATE PROCEDURE InsertarAntecedentesFamiliares (in par varchar(45), in des varchar(100))
BEGIN
	insert into AntecedentesFamiliares (parentesco, descripcion)
	values (par, des);
END $


DELIMITER $
CREATE PROCEDURE InsertarPaciente (in nomPac varchar(45), in ape1Pac varchar(45),
		in ape2Pac varchar(45), in sex tinyint, in fecNacPac date, 
		in nacPac varchar(45), cedPac varchar(45), in idTel int,  in dir1 varchar(45),
		in dir2 varchar(45), in ema varchar(45), in tip int)
BEGIN
	insert into paciente (nombrePaciente, apellido1Paciente, apellido2Paciente,
			sexo, fechaNacimientoPaciente, nacionalidadPaciente, 
			cedulaPaciente, idtelefono, direccion1, direccion2, email, tipo)
	values (nomPac, ape1Pac, ape2Pac, sex, fecNacPac, nacPac, cedPac, idTel, dir1,
			dir2, ema, tip);
END $



DELIMITER $
CREATE PROCEDURE InsertarExpedienteMedico (in idPac int,
		in idAntPer int, in idAntFam int)
BEGIN
	insert into expedientemedico (idPaciente,
			idAntecedentesPersonales, idAntecedentesFamiliares)
	values (idPac, idAntPer, idAntFam);
END $


DELIMITER $
CREATE  PROCEDURE `InsertarConsultaMedica`(in idExpMed int, 
		in motiCon varchar(45), in descripSint varchar(45), in diag varchar(45),
		in idSigVit int,in fech date, in motivo varchar(45), in obser varchar (200), in notaE varchar(500),
		in est int)
BEGIN
	insert into ConsultaMedica (idExpedienteMedico, motivoConsulta,
			descripcionSintomas, diagnostico, signosVitales,fecha, motivo2, observaciones, 
			notaEnfermeria, estado)
	values (idExpMed, motiCon, descripSint, diag, idSigVit,fech, motivo, obser, notaE, est);
END $


DELIMITER $
CREATE PROCEDURE InsertarAntecedentesPersonalesPadecimientos (in idPad int,
		in idAntPer int)
BEGIN
	insert into `AntecedentesPersonales-Padecimientos` (idPadecimientos, 
			idAntecedentesPersonales)
	values (idPad, idAntPer);
END $

DELIMITER $
CREATE PROCEDURE InsertarAntecedentesFamiliaresPadecimientos (in idPad int,
		in idAntFam int)
BEGIN
	insert into `AntecedentesFamiliares-Padecimientos` (idPadecimiento, 
			idAntecedenteFamiliar)
	values (idPad, idAntFam);
END $

DELIMITER $
CREATE DEFINER=`root`@`localhost` PROCEDURE `obtenerExpedientePaciente`()
BEGIN
	SELECT id, cedulaPaciente, nombrePaciente,apellido1Paciente,apellido2Paciente, fechaNacimientoPaciente, sexo FROM sigos.Paciente;
END $

DELIMITER $
CREATE DEFINER=`root`@`localhost` PROCEDURE `obtenerUltimoId`(in tabla varchar(45))
BEGIN
	declare nombreTabla Varchar(45);
	set nombreTabla = tabla;
	Select MAX(id) FROM nombreTabla;ObtenerIdUsuario
END $

DELIMITER $
CREATE DEFINER=`root`@`localhost` PROCEDURE `ObtenerIdUsuario`()
BEGIN
    SELECT  *
      FROM sigos.Usuario;
END $

-- PROCEDIMIENTOS NUEVOS 19-09-2015
DELIMITER $
CREATE  PROCEDURE `obtenerExamenFisico`(idpas int)
BEGIN
	Select categoria, subCategoria, detalle from ExamenFisico
		where id = idpas;
END $

DELIMITER $
CREATE PROCEDURE obtenerIdPaciente (cedula varchar(45))
BEGIN
	Select id from Paciente
		Where cedulaPaciente = cedula;
END $

DELIMITER $
CREATE PROCEDURE `obtenerIdExpedienteMedico` (idpas int)
BEGIN
	Select id from ExpedienteMedico
    where idPaciente = idpas;
END $

DELIMITER $
CREATE PROCEDURE `obtenerIdExamenExpediente` (idEx int)
BEGIN
	Select idExamenFisico from `ExamenFisico-Expediente`
		where idExpediente = idEx;
END $


--  ACTUALIZA ALGUNOS DATOS DE LA TABLA ConsultaMedica.
DELIMITER $
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizarConsultaMedica`(
		in id int, in diag varchar(45), in motiv varchar(45), 
		in obs varchar(200), in est int, fechaAc date)
BEGIN
	UPDATE ConsultaMedica
    SET diagnostico = diag, motivo2 = motiv, observaciones = obs, 
		estado = est 
    WHERE idExpedienteMedico = id and fechaConsulta = fechaAc;
END $

DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `obtenerPacientesConsulta`(fecha date)
BEGIN
	SELECT ConsultaMedica.id,idExpedienteMedico,idPaciente, nombrePaciente,apellido1Paciente, apellido2Paciente,signosVitales from ExpedienteMedico join ConsultaMedica
	on ExpedienteMedico.id = ConsultaMedica.idExpedienteMedico
	join Paciente on ExpedienteMedico.idPaciente = Paciente.id
	Where ConsultaMedica.fecha = fecha and ConsultaMedica.estado = '2';
END $

DELIMITER $
CREATE DEFINER=`root`@`localhost` PROCEDURE `ConsultarFechaCita`(fechaCita date)
BEGIN
	select * from cita 
    where cita.fechaConsulta = fechaCita;
END $

CREATE  PROCEDURE `ActualizarEstadoCita`(in est int, in fec date, in hor varchar(10))
BEGIN
	update cita
    set estado = est
    where fechaConsulta = fec  and horaConsulta = hor;
END

CREATE DEFINER=`root`@`localhost` PROCEDURE `ActualizarUsuario`(in idU tinyint, in nomU varchar(45), in pass varchar(45))
BEGIN
	declare passNueva varchar(45);
    if passNueva <> '' then
    update Usuario
    set Usuario.contrasena = passNueva;
    end if;
	update Usuario
    set nombreUsuario = nomU
    where id = idU;
END

-- Llamadas a los procedimientos almacenados

Call InsertarUsuario ('Juanito', '1234');
$

Call InsertarInventario ('Alegra 100mg', 60, '', 'oral');
$

Call InsertarTelefono ('26711972', 'Casa');
$

Call InsertarSignosVitales (1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
							1, 1, 1, 30);
$

Call 




('Jarabe', 6);
$

Call InsertarExamenMedico ();
$

Call InsertarPadecimientos('Diabetes', 'Grado 1');
$

Call InsertarVacunas ('Tetano', '2015-03-15');
$

Call InsertarExamenFisico ('Ojos', 'Algo', 'Caratatas');
$

Call InsertarAlergias ('Gatos', 'Alergia a los gatos');
$

Call InsertarCita ('1', '2015-09-02', 2015-09-20, 'Nada');
$

Call InsertarAntecedentesPersonales (1, 'Nada', 1, 1, 'Nada');
$

Call InsertarAntecedentesFamiliares (1, 'Abuelo');
$

Call InsertarPaciente ('Pedro', 'Pasos', 'Vargas', 1, '2015-03-22', 'costa rica',
		'123456789', 'Lib', 'Bag', 'ppasosv');
$

Call InsertarExpedienteMedico (1, null, 1, 1);
$

Call InsertarConsultaMedica (1, 1, 'Nada', 'Nada', 'Nada', 1, 1, 1);
$

Call InsertarAntecedentesPersonalesPadecimientos (1, 1);
$
Call InsertarCita('0','2015-09-17','Cadena de texto bastante larguisisima','08:30');








-- Inserciones en la tabla Padecimientos para formar el catalogo
Call InsertarPadecimientos('Vertigo');
$
Call InsertarPadecimientos('Sordera');
$
Call InsertarPadecimientos('Miopia');
$
Call InsertarPadecimientos('Astigmatismo');
$


-- Padecimientos del corazon
Call InsertarPadecimientos('Presion Alta');
$

Call InsertarPadecimientos('Soplo');
$
Call InsertarPadecimientos('Infarto');
$
Call InsertarPadecimientos('Arritmia');
$
Call InsertarPadecimientos('Taquicardia');
$



-- Padecimientos neurologicos
Call InsertarPadecimientos('ECV');
$
Call InsertarPadecimientos('Convulsiones');
$

-- Padecimientos del metabolismo
Call InsertarPadecimientos('Pre-diabetes');
$
Call InsertarPadecimientos('Dislipidemia');
$
Call InsertarPadecimientos('Diabetes');
$
Call InsertarPadecimientos('Obesidad');
$
Call InsertarPadecimientos('Sobre peso');
$
Call InsertarPadecimientos('Bajo peso');
$



-- Padecimientos pulmobares
Call InsertarPadecimientos('Asama');
$
Call InsertarPadecimientos('EPOC');
$


-- Padecimientos de la tiroides
Call InsertarPadecimientos('Hipotiroidismo');
$
Call InsertarPadecimientos('Hipertiroidismo');
$
Call InsertarPadecimientos('Tiroiditis');
$


-- Padecimientos enfermedades mentales
Call InsertarPadecimientos('Ansiedad');
$
Call InsertarPadecimientos('Depresion');
$
Call InsertarPadecimientos('Esquisofrenia');
$
Call InsertarPadecimientos('Alzheimer');
$
Call InsertarPadecimientos('Trastornos Alimenticios');
$


-- Padecimientos cancer
Call InsertarPadecimientos('Piel');
$
Call InsertarPadecimientos('Mama');
$
Call InsertarPadecimientos('Pulmon');
$
Call InsertarPadecimientos('Gastrico');
$
Call InsertarPadecimientos('Tiroides');
$
Call InsertarPadecimientos('Prostata');
$
Call InsertarPadecimientos('Colon');
$
Call InsertarPadecimientos('Leucemia');
$
Call InsertarPadecimientos('Melanoma');
$



-- Padecimientos varios
Call InsertarPadecimientos('Insuficiencia renal');
$
Call InsertarPadecimientos('Calculo renal');
$




-- Padecimientos musculoesqueleticos
Call InsertarPadecimientos('Atritis');
$
Call InsertarPadecimientos('Fibromialgia');
$
Call InsertarPadecimientos('Lumbalgia');
$
Call InsertarPadecimientos('Gonoartrosis');
$
Call InsertarPadecimientos('Artrosis');
$


-- Padecimientos Gastroinstestinales
Call InsertarPadecimientos('Gastritis');
$
Call InsertarPadecimientos('Reflujo');
$
Call InsertarPadecimientos('Colitis');
$
Call InsertarPadecimientos('Estreñimiento');
$
Call InsertarPadecimientos('Colelitiasis');
$
Call InsertarPadecimientos('Ulcera');
$
Call InsertarPadecimientos('Hepatitis');
$
Call InsertarPadecimientos('Polipos');



-- Procedimientos para consultar
DELIMITER $
CREATE PROCEDURE ConsultarIdPadecimiento (in nom varchar(45) )
BEGIN
		select id from Padecimientos
		where nombrePadecimiento = nom;
END $


Call ConsultarIdPadecimiento ('Dislipidemia');
$


$
Call InsertarAntPer ('nada', 'nada', 0, 0);
$

DELIMITER $
CREATE PROCEDURE ConsultarOInsertarPadecimiento (in nom varchar(45))
BEGIN
	declare nombreP varchar(45);

	select nombrePadecimiento into nombreP from Padecimientos
	where nombrePadecimiento = nom;
	
	if nombreP <=> null then
		insert into padecimientos (nombrePadecimiento)
		values (nom);
		
	end if;
		
END $

DELIMITER $;

CREATE VIEW ListarInventario AS
	select nombre, cantidad, tamano, viaAdministracion from Inventario order by tamano
delimiter $;

$
Call ConsultarOInsertarPadecimiento ('Vertigo')
$


DELIMITER $
CREATE PROCEDURE ObtenerIdInventario (in nom varchar(100))
BEGIN
	select id from Inventario
	where nombre = nom;
END $

call ObtenerIdInventario('Dotur');
$

DELIMITER $
CREATE PROCEDURE ActualizarInventario (in idI int, in nom varchar(100),
		in can int, in tam varchar(45), in via varchar(45))
BEGIN
	declare varTam varchar(45);
	declare varVia varchar(45);
		
	if tam <> '' then      -- si el parametro no esta vacio
		set varTam = tam;
	end if;

	if via <> '' then      -- si el parametro no esta vacio
		set varVia = via;
	end if;

	update Inventario
	set nombre = nom, cantidad =  can, tamano = varTam, viaAdministracion = varVia
	where id = idI;
END $

Call actualizarInventario (1, 'Acetaminofen', 50, '', '1')
$

DELIMITER $
CREATE PROCEDURE EliminarInventario(in nom varchar(100))
BEGIN
	delete from Inventario
	where nombre = nom;
END $


DELIMITER $
CREATE PROCEDURE DescontarInventario(in nom varchar(100), in can int)
BEGIN
	update Inventario
	set cantidad = cantidad - can
	where nombre = nom;
END $

Call DescontarInventario('Gazas', 4);
$


DELIMITER $
CREATE PROCEDURE InsertarRecetaEnConsulta(in idExp int, in fechaAC date, 
			in idRec int)
BEGIN
	update ConsultaMedica
	set idReceta = idRec
	where idExpedienteMedico = idExp and fecha = fechaAC;
END $

Call InsertarRecetaEnConsulta (1, '2015-10-30', 1);
$

DELIMITER $
CREATE PROCEDURE ListarMedicamentosInventario ()
BEGIN
	select nombre, cantidad from Inventario
	where viaAdministracion is not null;
END $

call ListarMedicamentosInventario ()
$

CREATE PROCEDURE InsertarConsultaInventario (in nombreMed varchar(100), 
		in cant int)
BEGIN
	declare ultimoId int;
	declare varIdInventario int;

	select MAX(id) into ultimoId from ConsultaMedica;
	select id into varIdInventario from Inventario
	where nombre = nombreMed;

	insert into `Consulta-Inventario` (idInventario, idConsultaMedica, cantidad)
	values (varIdInventario, ultimoId, cant);
END $

Call InsertarConsultaInventario('Ibuprofeno', 3);
$



-- PROCEDIMIENTO ALMACENADO PARA UTILIZAR EN REPORTE DE MEDICAMENTOS
DELIMITER $
CREATE PROCEDURE ReporteDeMedicamentos(in fechaDesde date, in fechaHasta date)
BEGIN
	select `Consulta-Inventario`.id, `Consulta-Inventario`.idInventario, 
			`Consulta-Inventario`.idConsultaMedica, `Consulta-Inventario`.cantidad,
		Inventario.nombre,
		Paciente.nombrePaciente,
		Paciente.tipo,
		ConsultaMedica.fecha
	from `Consulta-Inventario` join Inventario
	on `Consulta-Inventario`.idInventario = Inventario.id
	join ConsultaMedica on `Consulta-Inventario`.idConsultaMedica = ConsultaMedica.id
	join ExpedienteMedico on ConsultaMedica.idExpedienteMedico = ExpedienteMedico.id
	join Paciente on ExpedienteMedico.idPaciente = Paciente.id
	where ConsultaMedica.fecha between fechaDesde and fechaHasta
	order by `Consulta-Inventario`.id;
END $

-- PROCEDIMIENTO ALMACENADO PARA SELECCIONAR EL ID DE LA TABLA CITA
CREATE DEFINER=`root`@`localhost` PROCEDURE `seleccionarCitaPaciente`(fecha varchar(10), hora varchar(10))
BEGIN
    declare idC varchar(10);
    set idC = (	select 
                        id 
		from 
                        cita 
		where 
                        fechaConsulta = fecha and horaConsulta = hora);
    select 
            id 
    from 
            citapaciente 
    where 
            citapaciente.idCita  = idC;
END

DELIMITER $
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarCitaPaciente`(idC varchar(10))
BEGIN
	delete 
    from 
		citapaciente
    where 
		id = idC;
END $
Call ReporteDeMedicamentos('2015-11-30', '2015-12-01')





-- PROCEDIMIENTOS ALMACENADOS A PARTIR DE LA NUEVA VERSION

DELIMITER $
CREATE PROCEDURE ObtenerDatosPaciente (in ced varchar(45) )
BEGIN
	select * from Paciente join Telefono
	on Paciente.idtelefono = Telefono.id
    where Paciente.cedulaPaciente = ced;
END $

Call ObtenerDatosPaciente('222')

DELIMITER $
CREATE PROCEDURE ActualizarDatosPaciente (in idP int, in nomP varchar(45), in ape1 varchar(45), 
		in ape2 varchar(45), in sex tinyint, in fecNacP date, in naci varchar(45),
        in ced varchar(45), in idTel int, in dir1 varchar(45), in dir2 varchar(45),
        in ema varchar(45), in tip int, in numTel varchar(45))
BEGIN
	update Paciente
    set nombrePaciente = nomP, apellido1Paciente = ape1, apellido2Paciente = ape2,
		sexo = sex, fechaNacimientoPaciente = fecNacP, nacionalidadPaciente = naci,
        cedulaPaciente = ced, direccion1 = dir1, direccion2 = dir2, email = ema,
        tipo = tip
        where id = idP;
        
	update Telefono
    set numeroTelefono = numTel
    where Telefono.id = idTel;
END $

Call ActualizarDatosPaciente (2, 'Juan Jose', 'Pasos', 'Vargas', 1, '1991-02-15',
		'Nicaraguense', '222', 2, 'Santa Cruz', 'Bagaces', 'juajo@hotmail.com',
        1, '87059456')
        
        
        
        
 -- PROCEDIMIENTO ALMACENADO PARA QUE INSERTA EN LA TABLA ExpedienteMedico
DELIMITER $
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarExpedienteMedico2`(in idPac int,
		in aler text)
BEGIN
	declare varAler varchar(45);
    
    if aler <> '' then      -- si el parametro no esta vacio
		set varAler = aler;
	end if;

	insert into expedientemedico (idPaciente, alergias)
	values (idPac, varAler);
END $

Call InsertarExpedienteMedico2 (3, null)

-- Procedimiento almacenado que inserta en la tabla ExpedientePadecimientos
DELIMITER $
CREATE PROCEDURE InsertarExpedientePadecimientos(in idPad int, in idExp int, 
		in tra varchar(45), in med varchar(45))
BEGIN
	declare varTra varchar(45);
    declare varMed varchar(45);
    
    if tra <> '' then      -- si el parametro no esta vacio
		set varTra = tra;
	end if;
    
    if med <> '' then
		set varMed = med;
	end if;
    
    insert into `expediente-padecimientos` (idPadecimiento, idExpediente, tratamiento,
			medicamento)
	values (idPad, idExp, varTra, varMed);
END $

Call InsertarExpedientePadecimientos (5, 4, null, null)

-- Procedimiento almacenado que inserta vacunas en la tabla Vacunas
DELIMITER $
CREATE PROCEDURE `ConsultarInsertarVacuna`(in vac varchar(45))
BEGIN
	declare tipVacuna varchar(45);

	select vacuna into tipVacuna from vacunas
	where vacuna = vac;
	
	if tipVacuna <=> null then
		insert into vacunas (vacuna)
		values (vac);
		
	end if;
		
END $

$
Call ConsultarInsertarVacuna('bpm');


-- Procedimiento que inserta en la tabla Expediente-Vacunas
DELIMITER $
CREATE PROCEDURE `InsertarExpedienteVacunas` (in idVac int, in idExp int, 
		in fecVac date)
BEGIN
	declare fechaVacuna date;
    
    if fecVac <> '' then      -- si el parametro no esta vacio
		set fechaVacuna = fecVac;
	end if;
    
    insert into `expediente-vacunas` (idVacuna, idExpediente, fecha)
	values (idVac, idExp, fechaVacuna);
END $

Call InsertarExpedienteVacunas (7, 5, '');


-- Procedimiento almacenado para obtener los id's de la tabla vacunas utilizando de parametro el nombre de a=la vacuna
DELIMITER $
CREATE PROCEDURE `ObtenerIdVacuna`(in nom varchar(100))
BEGIN
	select id from Vacunas
	where vacuna = nom;
END $


Call ObtenerIdVacuna ('AH1N1')


-- Procedimiento que inserta en la tabla expedeiente-padecemientosfamiliares
DELIMITER $
CREATE PROCEDURE `InsertarExpedientePadecimientosFamiliares`(in idPad int, in idExp int, 
		in par varchar(45), in des varchar(45))
BEGIN
	declare varPar varchar(45);
    declare varDes varchar(45);
    
    if par <> '' then      -- si el parametro no esta vacio
		set varPar = par;
	end if;
    
    if des <> '' then
		set varDes = des;
	end if;
    
    insert into `expediente-padecimientosfamiliares` (idPadecimiento, idExpediente, parentesco,
			descripcion)
	values (idPad, idExp, varPar, varDes);
END $


-- Procedimiento almacenado que consulta los padecimientos familiares de cada paciente
DELIMITER $
CREATE PROCEDURE `ListarPadecimientosFamilires` (in idExp int)
BEGIN
	select padecimientos.nombrePadecimiento,
		   `expediente-padecimientosfamiliares`.parentesco,
           `expediente-padecimientosfamiliares`.descripcion,
           `expediente-padecimientosfamiliares`.idPadecimiento
	from `expediente-padecimientosfamiliares` join padecimientos
	on `expediente-padecimientosfamiliares`.idPadecimiento = padecimientos.id 
	where `expediente-padecimientosfamiliares`.idExpediente = IdExp;
END $

Call `ListarPadecimientosFamilires` (3);      


DELIMITER $
CREATE PROCEDURE EliminarPadecimientosFamiliares (in idPad int, in idExp int)
BEGIN
	delete from `expediente-padecimientosfamiliares`
	where idPadecimiento = idPad and idExpediente = idExp;
END $

DELIMITER $
CREATE PROCEDURE ListarVacunas (in idExp int)
BEGIN
	select vacunas.vacuna,
		   `expediente-vacunas`.fecha,
		   `expediente-vacunas`.id
	from `expediente-vacunas` join vacunas
	on `expediente-vacunas`.idVacuna = vacunas.id
	where `expediente-vacunas`.idExpediente = idExp;
END $

Call ListarVacunas (4);


DELIMITER $
CREATE PROCEDURE `EliminarVacunasExpediente`(in idExpVac int)
BEGIN
	delete from `expediente-vacunas`
	where id = idExpVac;
END $

DELIMITER $
CREATE PROCEDURE ObtenerAlergiaExpediente (in idExp int)
BEGIN
	select alergias from expedientemedico
	where id = idExp;
END $

Call ObtenerAlergiaExpediente (3)


DELIMITER $
CREATE PROCEDURE ActualizarAlergiaExpediente (in idExp int, in aler text)
BEGIN
	update expedientemedico
    set alergias = aler
    where id = idExp;
END $

Call ActualizarAlergiaExpediente (1, 'Al polvo:leve\n A la pintura')



DELIMITER $
CREATE PROCEDURE ListarPadecimientosPersonales(in idExp int)
BEGIN
	select padecimientos.nombrePadecimiento,
		   `expediente-padecimientos`.tratamiento,
           `expediente-padecimientos`.medicamento,
           `expediente-padecimientos`.id
	from `expediente-padecimientos` join padecimientos
	on `expediente-padecimientos`.idPadecimiento = padecimientos.id 
	where `expediente-padecimientos`.idExpediente = IdExp;
END $

Call ListarPadecimientosPersonales (3);


DELIMITER $
CREATE PROCEDURE `EliminarPadecimientosPersonales`(in idExpPad int)
BEGIN
	delete from `expediente-padecimientos`
	where id = idExpPad;
END $

Call `EliminarPadecimientosPersonales` (2)


DELIMITER $
CREATE PROCEDURE ListarConsultas (in idExp int)
BEGIN
	select id, fecha from consultamedica
    where idExpedienteMedico = idExp;
END $

Call ListarConsultas(4)

DELIMITER $
CREATE PROCEDURE ObtenerDatosConsultaMedica(in idConMed int)
BEGIN
	select consultamedica.motivo2, 
		   consultamedica.descripcionSintomas, 
           consultamedica.diagnostico,
           receta.descripcion,
           consultamedica.notaEnfermeria
	from consultamedica  LEFT OUTER JOIN receta
	on receta.id = consultamedica.idReceta
    where consultamedica.id = idConMed;
			
END $

Call ObtenerDatosConsultaMedica(11);
$


DELIMITER $
CREATE PROCEDURE ListarExamenFisicoPorConsulta (in idConMed int)
BEGIN
	select examenfisico.categoria,
		   examenfisico.subCategoria,
           examenfisico.detalle
	from examenfisico join consultamedica
	on examenfisico.idConsultaMedica = consultamedica.id
	where consultamedica.id = idConMed;
END $

Call ListarExamenFisicoPorConsulta (1)

CREATE DEFINER=`root`@`localhost` PROCEDURE `ActualizarConsultMedicaPorId`(in idConsultaMedica int, 
		in diag varchar(45), in motiv varchar(45), 
        in obs varchar(200), in est int)
BEGIN
	UPDATE ConsultaMedica
    SET diagnostico = diag, motivo2 = motiv, observaciones = obs, 
		estado = est 
    WHERE consultamedica.id = idConsultaMedica;
END


DELIMITER $
CREATE PROCEDURE EliminarConsultaMedica (in idConsultaMedica int)
BEGIN
	delete from consultamedica
    where id = idConsultaMedica;
END $

Call EliminarConsultaMedica (26)