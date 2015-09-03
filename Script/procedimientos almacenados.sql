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


