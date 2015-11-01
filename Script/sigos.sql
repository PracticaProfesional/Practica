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


CREATE SCHEMA IF NOT EXISTS `sigos` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `sigos` ;


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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Alergias`
--

LOCK TABLES `Alergias` WRITE;
/*!40000 ALTER TABLE `Alergias` DISABLE KEYS */;
INSERT INTO `Alergias` VALUES (1,'Ninguna conocida','No aplica');
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
  `parentesco` varchar(45) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AntecedentesFamiliares`
--

LOCK TABLES `AntecedentesFamiliares` WRITE;
/*!40000 ALTER TABLE `AntecedentesFamiliares` DISABLE KEYS */;
INSERT INTO `AntecedentesFamiliares` VALUES (1,'Abuelos','No aplica');
/*!40000 ALTER TABLE `AntecedentesFamiliares` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AntecedentesFamiliares-Padecimientos`
--

DROP TABLE IF EXISTS `AntecedentesFamiliares-Padecimientos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AntecedentesFamiliares-Padecimientos` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `idPadecimiento` int(11) NOT NULL,
  `idAntecedenteFamiliar` int(11) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `fk_Padecimiento3_idx` (`idPadecimiento`),
  KEY `fk_AntecedenteFam3_idx` (`idAntecedenteFamiliar`),
  CONSTRAINT `fk_AntecedenteFam3` FOREIGN KEY (`idAntecedenteFamiliar`) REFERENCES `AntecedentesFamiliares` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Padecimiento3` FOREIGN KEY (`idPadecimiento`) REFERENCES `Padecimientos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AntecedentesFamiliares-Padecimientos`
--

LOCK TABLES `AntecedentesFamiliares-Padecimientos` WRITE;
/*!40000 ALTER TABLE `AntecedentesFamiliares-Padecimientos` DISABLE KEYS */;
/*!40000 ALTER TABLE `AntecedentesFamiliares-Padecimientos` ENABLE KEYS */;
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
  `idVacunas` int(11) DEFAULT NULL,
  `medicamento` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_alergias_idx` (`idAlergias`),
  KEY `fk_vacunas_idx` (`idVacunas`),
  CONSTRAINT `fk_alergias` FOREIGN KEY (`idAlergias`) REFERENCES `Alergias` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_vacunas` FOREIGN KEY (`idVacunas`) REFERENCES `Vacunas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AntecedentesPersonales`
--

LOCK TABLES `AntecedentesPersonales` WRITE;
/*!40000 ALTER TABLE `AntecedentesPersonales` DISABLE KEYS */;
INSERT INTO `AntecedentesPersonales` VALUES (5,1,'No tiene',1,'No toma');
/*!40000 ALTER TABLE `AntecedentesPersonales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AntecedentesPersonales-Padecimientos`
--

DROP TABLE IF EXISTS `AntecedentesPersonales-Padecimientos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AntecedentesPersonales-Padecimientos` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `idPadecimientos` int(11) NOT NULL,
  `idAntecedentesPersonales` int(11) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `fk_Padecimientos_idx` (`idPadecimientos`),
  KEY `fk_AntecendentesPersonales_idx` (`idAntecedentesPersonales`),
  CONSTRAINT `fk_AntecendentesPersonales` FOREIGN KEY (`idAntecedentesPersonales`) REFERENCES `AntecedentesPersonales` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Padecimientos` FOREIGN KEY (`idPadecimientos`) REFERENCES `Padecimientos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AntecedentesPersonales-Padecimientos`
--

LOCK TABLES `AntecedentesPersonales-Padecimientos` WRITE;
/*!40000 ALTER TABLE `AntecedentesPersonales-Padecimientos` DISABLE KEYS */;
INSERT INTO `AntecedentesPersonales-Padecimientos` VALUES (1,27,5),(2,36,5);
/*!40000 ALTER TABLE `AntecedentesPersonales-Padecimientos` ENABLE KEYS */;
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
  `motivoConsulta` varchar(45) NOT NULL,
  `descripcionSintomas` varchar(45) NOT NULL,
  `diagnostico` varchar(45) DEFAULT NULL,
  `signosVitales` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `motivo2` varchar(45) DEFAULT NULL,
  `observaciones` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_expedienteMedico_idx` (`idExpedienteMedico`),
  KEY `fk_signosVitales_idx` (`signosVitales`),
  CONSTRAINT `fk_expedienteMedico` FOREIGN KEY (`idExpedienteMedico`) REFERENCES `ExpedienteMedico` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_signosVitales` FOREIGN KEY (`signosVitales`) REFERENCES `SignosVitales` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ConsultaMedica`
--

LOCK TABLES `ConsultaMedica` WRITE;
/*!40000 ALTER TABLE `ConsultaMedica` DISABLE KEYS */;
INSERT INTO `ConsultaMedica` VALUES (2,1,'Diarrea','Retortijones','f',2,'2015-09-24','f','f'),(3,1,'diarrea','deposiciones freq','f',3,'2015-09-29','f','f'),(4,1,'Infeccion','Dolor de garganta','f',4,'2015-09-30','f','f'),(5,1,'ss','s','f',5,'2015-10-01','f','f');
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
  `idConsultaMedica` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_ConsultaMedica_idx` (`idConsultaMedica`),
  CONSTRAINT `fk_ConsultaMedica` FOREIGN KEY (`idConsultaMedica`) REFERENCES `ConsultaMedica` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `idExpediente` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fkExpediente_idx` (`idExpediente`),
  CONSTRAINT `fkExpediente` FOREIGN KEY (`idExpediente`) REFERENCES `ExpedienteMedico` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `idAntecedentesPersonales` int(11) NOT NULL,
  `idAntecedentesFamiliares` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_paciente_idx` (`idPaciente`),
  KEY `fk_antecedentesPersonales_idx` (`idAntecedentesPersonales`),
  KEY `fk_antecedentesFamiliares_idx` (`idAntecedentesFamiliares`),
  CONSTRAINT `fk_antecedentesFamiliares` FOREIGN KEY (`idAntecedentesFamiliares`) REFERENCES `AntecedentesFamiliares` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_antecedentesPersonales` FOREIGN KEY (`idAntecedentesPersonales`) REFERENCES `AntecedentesPersonales` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_paciente` FOREIGN KEY (`idPaciente`) REFERENCES `Paciente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ExpedienteMedico`
--

LOCK TABLES `ExpedienteMedico` WRITE;
/*!40000 ALTER TABLE `ExpedienteMedico` DISABLE KEYS */;
INSERT INTO `ExpedienteMedico` VALUES (1,1,5,1);
/*!40000 ALTER TABLE `ExpedienteMedico` ENABLE KEYS */;
UNLOCK TABLES;



-- -----------------------------------------------------
-- Table `sigos`.`Inventario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `sigos`.`Inventario` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `nombre` VARCHAR(100) NOT NULL ,
  `cantidad` INT NOT NULL ,
  `tamano` VARCHAR(45) NULL ,
  `tipo` INT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Paciente`
--

LOCK TABLES `Paciente` WRITE;
/*!40000 ALTER TABLE `Paciente` DISABLE KEYS */;
INSERT INTO `Paciente` VALUES (1,'Yanela','Alvarado','Pérez',2,'2015-09-24','costarricense','55555',31,'Nicoya','Nicoya','yanela@gmail.com');
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Padecimientos`
--

LOCK TABLES `Padecimientos` WRITE;
/*!40000 ALTER TABLE `Padecimientos` DISABLE KEYS */;
INSERT INTO `Padecimientos` VALUES (23,'Vertigo'),(24,'Sordera'),(25,'Miopia'),(26,'Astigmatismo'),(27,'Presion Alta'),(28,'Soplo'),(29,'Infarto'),(30,'Arritmia'),(31,'Taquicardia'),(32,'ECV'),(33,'Convulsiones'),(34,'Pre-diabetes'),(35,'Dislipidemia'),(36,'Diabetes'),(37,'Obesidad'),(38,'Sobre peso'),(39,'Bajo peso'),(40,'Asama'),(41,'EPOC'),(42,'Hipotiroidismo'),(43,'Hipertiroidismo'),(44,'Tiroiditis'),(45,'Ansiedad'),(46,'Depresion'),(47,'Esquisofrenia'),(48,'Alzheimer'),(49,'Trastornos Alimenticios'),(50,'Piel'),(51,'Mama'),(52,'Pulmon'),(53,'Gastrico'),(54,'Tiroides'),(55,'Prostata'),(56,'Colon'),(57,'Leucemia'),(58,'Melanoma'),(59,'Insuficiencia renal'),(60,'Calculo renal'),(61,'Atritis'),(62,'Fibromialgia'),(63,'Lumbalgia'),(64,'Gonoartrosis'),(65,'Artrosis'),(66,'Gastritis'),(67,'Reflujo'),(68,'Colitis'),(69,'Colelitiasis'),(70,'Ulcera'),(71,'Hepatitis'),(72,'Polipos');
/*!40000 ALTER TABLE `Padecimientos` ENABLE KEYS */;
UNLOCK TABLES;

--

-- -----------------------------------------------------
-- Table `sigos`.`Receta`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `sigos`.`Receta` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `descripcion` LONGTEXT NOT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;

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
  `exMama` tinyint(4) DEFAULT NULL,
  `curaciones` tinyint(4) DEFAULT NULL,
  `temperatura` double DEFAULT NULL,
  `talla` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SignosVitales`
--

LOCK TABLES `SignosVitales` WRITE;
/*!40000 ALTER TABLE `SignosVitales` DISABLE KEYS */;
INSERT INTO `SignosVitales` VALUES (2,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1),(3,2,2,2,2,2,2,2,2,1,1,1,0,1,1,1,1,1,1,1,1,1,2,2),(4,4,4,4,4,4,4,4,4,1,1,1,0,1,1,1,1,1,1,1,1,1,4,4),(5,444,4,4,4,44,4,44,4,1,1,1,0,1,1,1,1,1,1,1,1,1,4,4);
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
  `contrasena` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuario`
--

LOCK TABLES `Usuario` WRITE;
/*!40000 ALTER TABLE `Usuario` DISABLE KEYS */;
INSERT INTO `Usuario` VALUES (1,'victor','123');
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Vacunas`
--

LOCK TABLES `Vacunas` WRITE;
/*!40000 ALTER TABLE `Vacunas` DISABLE KEYS */;
INSERT INTO `Vacunas` VALUES (1,'Tetanos','2013-09-14');
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
  `estado` tinyint(4) DEFAULT NULL,
  `fechaConsulta` date DEFAULT NULL,
  `anotaciones` longtext,
  `horaConsulta` varchar(10) DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefono`
--

LOCK TABLES `telefono` WRITE;
/*!40000 ALTER TABLE `telefono` DISABLE KEYS */;
INSERT INTO `telefono` VALUES (21,'3333','Nada..'),(22,'56','Nada..'),(23,'55','Nada..'),(24,'646','Nada..'),(25,'646','Nada..'),(26,'66','Nada..'),(27,'8787','Nada..'),(28,'5454','Nada..'),(29,'55','Nada..'),(30,'666','Nada..'),(31,'464','Nada..');
/*!40000 ALTER TABLE `telefono` ENABLE KEYS */;
UNLOCK TABLES;


ALTER TABLE `sigos`.`paciente` ADD COLUMN `tipo` INT NOT NULL  AFTER `email` ;


ALTER TABLE `sigos`.`consultamedica` CHANGE COLUMN `notaEnfermeria` `notaEnfermeria` VARCHAR(500) NULL  , ADD COLUMN `estado` INT NOT NULL  AFTER `notaEnfermeria` ;

--
-- Dumping routines for database 'sigos'


CREATE TABLE `sigos`.`citapaciente` (
  `id` INT NOT NULL COMMENT '',
  `idCita` INT NULL COMMENT '',
  `idPaciente` INT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `fkCita_idx` (`idCita` ASC)  COMMENT '',
  INDEX `fkPaciente_idx` (`idPaciente` ASC)  COMMENT '',
  CONSTRAINT `fkCita`
    FOREIGN KEY (`idCita`)
    REFERENCES `sigos`.`cita` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkPaciente`
    FOREIGN KEY (`idPaciente`)
    REFERENCES `sigos`.`Paciente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `sigos`.`Consulta-Inventario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `sigos`.`Consulta-Inventario` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `idInventario` INT NOT NULL ,
  `idConsultaMedica` INT NOT NULL ,
  `cantidad` INT NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_idInventario_idx` (`idInventario` ASC) ,
  INDEX `fk_idConsultaMedica_idx` (`idConsultaMedica` ASC) ,
  CONSTRAINT `fk_idInventario`
    FOREIGN KEY (`idInventario` )
    REFERENCES `sigos`.`Inventario` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_idConsultaMedica`
    FOREIGN KEY (`idConsultaMedica` )
    REFERENCES `sigos`.`ConsultaMedica` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


ALTER TABLE `sigos`.`inventario` CHANGE COLUMN `tipo` `viaAdministracion` VARCHAR(45) NULL  ;


ALTER TABLE `sigos`.`consultamedica` ADD COLUMN `idReceta` INT NULL  AFTER `estado` ;























 

-- Dump completed on 2015-10-02 20:26:57
