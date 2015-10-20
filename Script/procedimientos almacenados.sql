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
CREATE PROCEDURE InsertarUsuario (in nomUsu varchar(45), in pass varchar(45))
BEGIN
	insert into usuario (nombreUsuario, `password`)
	values (nomUsu, pass);
END $


DELIMITER $$ -- insertar en la inventario
CREATE PROCEDURE InsertarInventario (in nom varchar(45), in tip varchar(45), 
		in des varchar(45), in can int)
BEGIN
	insert into inventario (nombre, tipo, descripcion, cantidad)
	values (nom, tip, des, can);
END $


DELIMITER $ -- insertar en la tabla telefono
CREATE PROCEDURE InsertarTelefono (in numTel varchar(45), in deta varchar(45))
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


DELIMITER $  -- insertar en la tabla receta
CREATE PROCEDURE InsertarReceta(in nomMed varchar(45), in cant int)
BEGIN
	insert into receta (nombreMedicamento, cantidad)
	values (nomMed, cant);
END $


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
	Select MAX(id) FROM nombreTabla;
END $

DELIMITER $
CREATE DEFINER=`root`@`localhost` PROCEDURE `ObtenerIdUsuario`(
    in nomUsu varchar(45), in con varchar(45)
    )
BEGIN
    SELECT  *
      FROM sigos.usuario
        WHERE usuario.nombreUsuario = nomUsu
          AND usuario.contrasena = con;
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
		in obs varchar(200), in est int)
BEGIN
	UPDATE ConsultaMedica
    SET diagnostico = diag, motivo2 = motiv, observaciones = obs, 
		estado = est 
    WHERE idExpedienteMedico = id;
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

-- Llamadas a los procedimientos almacenados

Call InsertarUsuario ('Juanito', '1234');
$

Call InsertarInventario ('Parasetamol', 'Pastillas', '100mg', 10);
$

Call InsertarTelefono ('26711972', 'Casa');
$

Call InsertarSignosVitales (1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
							1, 1, 1, 30);
$

Call InsertarReceta('Jarabe', 6);
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
	select nombre, cantidad, tamano, tipo from Inventario
delimiter $;


Call ConsultarOInsertarPadecimiento ('Vertigo')
