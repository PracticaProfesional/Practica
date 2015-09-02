-- Procedimientos almacenados de insercion en las tablas de la base de datos SIGOS


DELIMITER $   -- insertar en la tabla usuario
CREATE PROCEDURE InsertarUsuario (in nomUsu varchar(45), in pass varchar(45))
BEGIN
	insert into usuario (nombreUsuario, `password`)
	values (nomUsu, pass);
END $


DELIMITER $ -- insertar en la inventario
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


DELIMITER $
CREATE PROCEDURE InsertarSignosVitales (in pes double, in fc double, in par double,
		in imc double, in imb double, in h2o double, in mm double, in gc double,
		in `as` tinyint, in af tinyint, in ss tinyint, in pap tinyint, in im tinyint,
		in iv tinyint, in sc tinyint, in gm tinyint, in cp tinyint, in es tinyint,
		in pa tinyint, in glic varchar(45), in tall double)
BEGIN
	insert into signosvitales (peso, FC, PAR, IMC, IMB, H2O, MM, GC, `AS`, AF, SS, 
				PAP, IM, IV, SC, GM, CP, ES, PA, glicemia, talla)
	values (pes, fc, par, )
END $





-- Llamadas a los procedimientos almacenados
$
Call InsertarUsuario ('Juanito', '1234');
$

Call InsertarInventario ('Parasetamol', 'Pastillas', '100mg', 10);
$

Call InsertarTelefono ('86163602', 'Celular')

