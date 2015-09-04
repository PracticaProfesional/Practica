-- MySQL dump 10.13  Distrib 5.6.24, for linux-glibc2.5 (x86_64)
--
-- Host: 127.0.0.1    Database: sigos
-- ------------------------------------------------------
-- Server version	5.6.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Alergias`
--

DROP TABLE IF EXISTS `Alergias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Alergias` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombreAlergia` varchar(45) NOT NULL,
  `descripcionAlergia` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Alergias`
--

LOCK TABLES `Alergias` WRITE;
/*!40000 ALTER TABLE `Alergias` DISABLE KEYS */;
/*!40000 ALTER TABLE `Alergias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AntecedentesFamiliares`
--

DROP TABLE IF EXISTS `AntecedentesFamiliares`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AntecedentesFamiliares` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idPadecimientos` int(11) NOT NULL,
  `parentesco` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AntecedentesFamiliares`
--

LOCK TABLES `AntecedentesFamiliares` WRITE;
/*!40000 ALTER TABLE `AntecedentesFamiliares` DISABLE KEYS */;
/*!40000 ALTER TABLE `AntecedentesFamiliares` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AntecedentesPersonales`
--

DROP TABLE IF EXISTS `AntecedentesPersonales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AntecedentesPersonales` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idAlergias` int(11) DEFAULT NULL,
  `tratamiento` varchar(45) NOT NULL,
  `idPadecimientos` int(11) DEFAULT NULL,
  `idVacunas` int(11) DEFAULT NULL,
  `medicamento` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_padecimientos_idx` (`idPadecimientos`),
  KEY `fk_alergias_idx` (`idAlergias`),
  KEY `fk_vacunas_idx` (`idVacunas`),
  CONSTRAINT `fk_alergias` FOREIGN KEY (`idAlergias`) REFERENCES `Alergias` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_padecimientos` FOREIGN KEY (`idPadecimientos`) REFERENCES `Padecimientos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_vacunas` FOREIGN KEY (`idVacunas`) REFERENCES `Vacunas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AntecedentesPersonales`
--

LOCK TABLES `AntecedentesPersonales` WRITE;
/*!40000 ALTER TABLE `AntecedentesPersonales` DISABLE KEYS */;
/*!40000 ALTER TABLE `AntecedentesPersonales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ConsultaMedica`
--

DROP TABLE IF EXISTS `ConsultaMedica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ConsultaMedica` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idExpedienteMedico` int(11) NOT NULL,
  `idExamenFisico` int(11) DEFAULT NULL,
  `motivoConsulta` varchar(45) NOT NULL,
  `descripcionSintomas` varchar(45) NOT NULL,
  `diagnostico` varchar(45) DEFAULT NULL,
  `signosVitales` int(11) NOT NULL,
  `idCita` int(11) DEFAULT NULL,
  `idReceta` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_expedienteMedico_idx` (`idExpedienteMedico`),
  KEY `fk_examenFisico_idx` (`idExamenFisico`),
  KEY `fk_citaMedica_idx` (`idCita`),
  KEY `fk_receta_idx` (`idReceta`),
  KEY `fk_signosVitales_idx` (`signosVitales`),
  CONSTRAINT `fk_citaMedica` FOREIGN KEY (`idCita`) REFERENCES `cita` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_examenFisico` FOREIGN KEY (`idExamenFisico`) REFERENCES `ExamenFisico` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_expedienteMedico` FOREIGN KEY (`idExpedienteMedico`) REFERENCES `ExpedienteMedico` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_receta` FOREIGN KEY (`idReceta`) REFERENCES `Receta` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_signosVitales` FOREIGN KEY (`signosVitales`) REFERENCES `SignosVitales` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ConsultaMedica`
--

LOCK TABLES `ConsultaMedica` WRITE;
/*!40000 ALTER TABLE `ConsultaMedica` DISABLE KEYS */;
/*!40000 ALTER TABLE `ConsultaMedica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ExamenFisico`
--

DROP TABLE IF EXISTS `ExamenFisico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ExamenFisico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoria` varchar(45) DEFAULT NULL,
  `subCategoria` varchar(45) DEFAULT NULL,
  `detalle` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ExamenFisico`
--

LOCK TABLES `ExamenFisico` WRITE;
/*!40000 ALTER TABLE `ExamenFisico` DISABLE KEYS */;
/*!40000 ALTER TABLE `ExamenFisico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ExamenMedico`
--

DROP TABLE IF EXISTS `ExamenMedico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ExamenMedico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `archivoExamen` blob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ExamenMedico`
--

LOCK TABLES `ExamenMedico` WRITE;
/*!40000 ALTER TABLE `ExamenMedico` DISABLE KEYS */;
/*!40000 ALTER TABLE `ExamenMedico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ExpedienteMedico`
--

DROP TABLE IF EXISTS `ExpedienteMedico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ExpedienteMedico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idPaciente` int(11) NOT NULL,
  `idExamenMedico` int(11) DEFAULT NULL,
  `idAntecedentesPersonales` int(11) NOT NULL,
  `idAntecedentesFamiliares` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_paciente_idx` (`idPaciente`),
  KEY `fk_examenMedico_idx` (`idExamenMedico`),
  KEY `fk_antecedentesPersonales_idx` (`idAntecedentesPersonales`),
  KEY `fk_antecedentesFamiliares_idx` (`idAntecedentesFamiliares`),
  CONSTRAINT `fk_antecedentesFamiliares` FOREIGN KEY (`idAntecedentesFamiliares`) REFERENCES `AntecedentesFamiliares` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_antecedentesPersonales` FOREIGN KEY (`idAntecedentesPersonales`) REFERENCES `AntecedentesPersonales` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_examenMedico` FOREIGN KEY (`idExamenMedico`) REFERENCES `ExamenMedico` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_paciente` FOREIGN KEY (`idPaciente`) REFERENCES `Paciente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ExpedienteMedico`
--

LOCK TABLES `ExpedienteMedico` WRITE;
/*!40000 ALTER TABLE `ExpedienteMedico` DISABLE KEYS */;
/*!40000 ALTER TABLE `ExpedienteMedico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Inventario`
--

DROP TABLE IF EXISTS `Inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Inventario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Inventario`
--

LOCK TABLES `Inventario` WRITE;
/*!40000 ALTER TABLE `Inventario` DISABLE KEYS */;
/*!40000 ALTER TABLE `Inventario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Paciente`
--

DROP TABLE IF EXISTS `Paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Paciente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombrePaciente` varchar(45) NOT NULL,
  `apellido1Paciente` varchar(45) NOT NULL,
  `apellido2Paciente` varchar(45) NOT NULL,
  `sexo` tinyint(4) NOT NULL,
  `fechaNacimientoPaciente` date NOT NULL,
  `nacionalidadPaciente` varchar(45) NOT NULL,
  `cedulaPaciente` varchar(45) NOT NULL,
  `idtelefono` int(11) DEFAULT NULL,
  `direccion1` varchar(45) NOT NULL,
  `direccion2` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_telefono_idx` (`idtelefono`),
  CONSTRAINT `fk_telefono` FOREIGN KEY (`idtelefono`) REFERENCES `telefono` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Paciente`
--

LOCK TABLES `Paciente` WRITE;
/*!40000 ALTER TABLE `Paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `Paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Padecimientos`
--

DROP TABLE IF EXISTS `Padecimientos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Padecimientos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombrePadecimiento` varchar(45) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Padecimientos`
--

LOCK TABLES `Padecimientos` WRITE;
/*!40000 ALTER TABLE `Padecimientos` DISABLE KEYS */;
/*!40000 ALTER TABLE `Padecimientos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Receta`
--

DROP TABLE IF EXISTS `Receta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Receta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombreMedicamento` varchar(45) NOT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Receta`
--

LOCK TABLES `Receta` WRITE;
/*!40000 ALTER TABLE `Receta` DISABLE KEYS */;
/*!40000 ALTER TABLE `Receta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SignosVitales`
--

DROP TABLE IF EXISTS `SignosVitales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SignosVitales` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `peso` double NOT NULL,
  `FC` double NOT NULL,
  `PAR` double NOT NULL,
  `IMC` double NOT NULL,
  `IMB` double NOT NULL,
  `H2O` double NOT NULL,
  `MM` double NOT NULL,
  `GC` double NOT NULL,
  `AS` tinyint(1) NOT NULL,
  `AF` tinyint(1) NOT NULL,
  `SS` tinyint(1) NOT NULL,
  `PAP` tinyint(1) NOT NULL,
  `IM` tinyint(1) NOT NULL,
  `IV` tinyint(1) NOT NULL,
  `SC` tinyint(1) NOT NULL,
  `GM` tinyint(1) NOT NULL,
  `CP` tinyint(1) NOT NULL,
  `ES` tinyint(1) NOT NULL,
  `PA` tinyint(1) NOT NULL,
  `glicemia` varchar(45) DEFAULT NULL,
  `talla` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SignosVitales`
--

LOCK TABLES `SignosVitales` WRITE;
/*!40000 ALTER TABLE `SignosVitales` DISABLE KEYS */;
/*!40000 ALTER TABLE `SignosVitales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Usuario`
--

DROP TABLE IF EXISTS `Usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombreUsuario` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuario`
--

LOCK TABLES `Usuario` WRITE;
/*!40000 ALTER TABLE `Usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `Usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Vacunas`
--

DROP TABLE IF EXISTS `Vacunas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Vacunas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) NOT NULL,
  `fechaAplicacion` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Vacunas`
--

LOCK TABLES `Vacunas` WRITE;
/*!40000 ALTER TABLE `Vacunas` DISABLE KEYS */;
/*!40000 ALTER TABLE `Vacunas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cita`
--

DROP TABLE IF EXISTS `cita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cita` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `estado` tinyint(4) NOT NULL,
  `fechaCreacion` varchar(45) DEFAULT NULL,
  `fechaConsulta` varchar(45) DEFAULT NULL,
  `anotaciones` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cita`
--

LOCK TABLES `cita` WRITE;
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
/*!40000 ALTER TABLE `cita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefono`
--

DROP TABLE IF EXISTS `telefono`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `telefono` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `numeroTelefono` varchar(45) NOT NULL,
  `detalle` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefono`
--

LOCK TABLES `telefono` WRITE;
/*!40000 ALTER TABLE `telefono` DISABLE KEYS */;
/*!40000 ALTER TABLE `telefono` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'sigos'
--
/*!50003 DROP PROCEDURE IF EXISTS `InsertarPaciente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarPaciente`(in nomPac varchar(45), in ape1Pac varchar(45),
		in ape2Pac varchar(45), in sex tinyint, in fecNacPac date, 
		in nacPac varchar(45), cedPac varchar(45), in idTel int, in dir1 varchar(45),
		in dir2 varchar(45), in ema varchar(45))
BEGIN
	insert into paciente (nombrePaciente, apellido1Paciente, apellido2Paciente,
			sexo, fechaNacimientoPaciente, nacionalidadPaciente, cedulaPaciente,
			idtelefono, direccion1, direccion2, email)
	values (nomPac, ape1Pac, ape2Pac, sex, fecNacPac, nacPac, cedPac, idTel, dir1,
			dir2, ema);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-09-03 19:29:11
