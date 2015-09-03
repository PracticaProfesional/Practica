-- Procedimientos almacenados de insercion en las tablas de la base de datos SIGOS


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


DELIMITER $ -- insertar en la tabla telefono
CREATE PROCEDURE InsertarSignosVitales (in pes double, in fc double, in par double,
		in imc double, in imb double, in h2o double, in mm double, in gc double,
		in ass tinyint(1), in af tinyint(1), in ss tinyint(1), in pap tinyint(1), 
		in im tinyint(1),
		in iv tinyint(1), in sc tinyint(1), in gm tinyint(1), in cp tinyint(1), 
		in es tinyint(1),
		in pa tinyint(1), in glic varchar(45), in tall double)
BEGIN
	insert into signosvitales (peso, FC, PAR, IMC, IMB, H2O, MM, GC, `AS`, AF, SS, 
				PAP, IM, IV, SC, GM, CP, ES, PA, glicemia, talla)
	values (pes, fc, par, imc, imb, h2o, mm, gc, ass, af, ss, pap, im, 
			iv, sc, gm, cp, es, pa, glic, tall);
END$


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
CREATE PROCEDURE InsertarPadecimientos (in nomPad varchar(45), in descrip varchar(45))
BEGIN
	insert into padecimientos(nombrePadecimiento, descripcion)
	values (nomPad, descrip);
END $


DELIMITER $  --  insertar en la tabla vacunas
CREATE PROCEDURE InsertarVacunas (in tip varchar(45), in fecApl date)
BEGIN
	insert into vacunas (tipo, fechaAplicacion)
	values (tip, fecApl);
END $


DELIMITER $  --  insertar en la tabla examen fisico
CREATE PROCEDURE InsertarExamenFisico (in cat varchar(45), in subCat varchar(45),
		in est tinyint(1), in det varchar(45))
BEGIN
	insert into examenfisico (categoria, subCategoria, estadoExamenFisico, detalle)
	values (cat, subCat, est, det);
END $


DELIMITER $  --  insertar en la tabla alergias0
CREATE PROCEDURE InsertarAlergias (in nomAle varchar(45), in desAle varchar(45))
BEGIN
	insert into alergias (nombreAlergia, descripcionAlergia)
	values (nomAle, desAle);
END $


DELIMITER $  --  insertar en la tabla cita
CREATE PROCEDURE InsertarCita (in est tinyint, in fecCrea date, in fecCon date,
		in anot varchar(15))
BEGIN
	insert into cita (estado, fechaCreacion, fechaConsulta, anotaciones)
	values (est, fecCrea, fecCon, anot);
END $


DELIMITER $  --  insertar en la tabla antecedentes personales
CREATE PROCEDURE InsertarAntecedentesPersonales (in idAle int, in trata varchar(45), 
		in idPad int, in idVac int, in med varchar(45))
BEGIN
	insert into antecedentespersonales (idAlergias, tratamiento, idPadecimientos, 
			idVacunas, medicamento)
	values (idAle, trata, idPad, idVac, med);
END $


DELIMITER $
CREATE PROCEDURE InsertarAntecedentesFamiliares (in idPad int, in par varchar(45))
BEGIN
	insert into antecedentesfamiliares (idPadecimientos, parentesco)
	values (idPad, par);
END $


DELIMITER $
CREATE PROCEDURE InsertarPaciente (in nomPac varchar(45), in ape1Pac varchar(45),
		in ape2Pac varchar(45), in sex tinyint, in fecNacPac date, 
		in nacPac varchar(45), cedPac varchar(45), in idTel int, in dir1 varchar(45),
		in dir2 varchar(45), in ema varchar(45))
BEGIN
	insert into paciente (nombrePaciente, apellido1Paciente, apellido2Paciente,
			sexo, fechaNacimientoPaciente, nacionalidadPaciente, cedulaPaciente,
			idtelefono, direccion1, direccion2, email)
	values (nomPac, ape1Pac, ape2Pac, sex, fecNacPac, nacPac, cedPac, idTel, dir1,
			dir2, ema);
END $



DELIMITER $
CREATE PROCEDURE InsertarExpedienteMedico (in idPac int, in idExaMed int,
		in idAntPer int, in idAntFam int)
BEGIN
	insert into expedientemedico (idPaciente, idExamenMedico,
			idAntecedentesPersonales, idAntecedentesFamiliares)
	values (idPac, idExaMed, idAntPer, idAntFam);
END $


DELIMITER $
CREATE PROCEDURE InsertarConsultaMedica (in idExpMed int, in idExaFis int, 
		in motiCon varchar(45), in descripSint varchar(45), in diag varchar(45),
		in idSigVit int, in idCit int, in idRec int)
BEGIN
	insert into consultamedica (idExpedienteMedico, idExamenFisico, motivoConsulta,
			descripcionSintomas, diagnostico, signosVitales, idCita, idReceta)
	values (idExpMed, idExaFis, motiCon, descripSint, diag, idSigVit, idCit, idRec);
END





-- Llamadas a los procedimientos almacenados
$
Call InsertarUsuario ('Juanito', '1234');
$

Call InsertarInventario ('Parasetamol', 'Pastillas', '100mg', 10);
$

Call InsertarTelefono ('86163602', 'Celular');
$

Call InsertarSignosVitales (1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
							'Si', 30);
$

Call InsertarReceta('Jarabe', 6);
$

Call InsertarExamenMedico ();
$

Call InsertarPadecimientos('Diabetes', 'Grado 1');
$

Call InsertarVacunas ('Tetano', '2015-03-15');
$

Call InsertarExamenFisico ('Ojos', 'Algo', 'Activo', 'Caratatas');
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
		'123456789', 1, 'Lib', 'Bag', 'ppasosv');
$

Call InsertarExpedienteMedico (1, null, 1, 1);
$

Call InsertarConsultaMedica (1, 1, 'Nada', 'Nada', 'Nada', 1, 1, 1)






