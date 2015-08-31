-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 31, 2015 at 05:02 PM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sigos`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarPaciente`(in IdPac int, in nomPac varchar(45), 
		in ape1Pac varchar(45), in ape2Pac varchar(45), in fecNacPac date,
		in nacionalidadPac varchar(45), in cedPac varchar(45), in dir1 varchar(45),
		in dir2 varchar(45), in ema varchar(45), in tel int, in consMed int,
		in sex varchar(45))
BEGIN
	INSERT INTO Paciente (idPaciente, nombrePaciente, apellido1Paciente,
			apellido2Paciente, fechaNacimientoPaciente, nacionalidadPaciente,
			cedulaPaciente, direccion1, direccion2, email, telefono, 
			consultaMed, Sexo)
	VALUES (IdPac, nomPac, ape1Pac, ape2Pac, fecNacPac, nacionalidadPac, cedPac,
			dir1, dir2, ema, tel, consMed, sex);
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `adicciones`
--

CREATE TABLE IF NOT EXISTS `adicciones` (
  `idAdicciones` int(11) NOT NULL,
  `nombreAdiccion` varchar(45) NOT NULL,
  `descripcionAdiccion` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `alergias`
--

CREATE TABLE IF NOT EXISTS `alergias` (
  `idAlergias` int(11) NOT NULL,
  `nombreAlergia` varchar(45) NOT NULL,
  `descripcionAlergia` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `antecedentesfamiliares`
--

CREATE TABLE IF NOT EXISTS `antecedentesfamiliares` (
  `idAntecedentesFamiliares` int(11) NOT NULL,
  `padecimiento` varchar(45) NOT NULL,
  `parentesco` varchar(45) NOT NULL,
  `detalle` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `cita`
--

CREATE TABLE IF NOT EXISTS `cita` (
  `idcita` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `fechaCreacion` date NOT NULL,
  `fechaConsulta` date NOT NULL,
  `anotaciones` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cita`
--

INSERT INTO `cita` (`idcita`, `estado`, `fechaCreacion`, `fechaConsulta`, `anotaciones`) VALUES
(1, 1, '2015-08-28', '2015-09-01', 'Revisar reflejos');

-- --------------------------------------------------------

--
-- Table structure for table `consultamedica`
--

CREATE TABLE IF NOT EXISTS `consultamedica` (
  `idConsultaMedica` int(11) NOT NULL,
  `cedulaPaciente` varchar(45) NOT NULL,
  `motivoConsulta` varchar(45) NOT NULL,
  `descripcionSintomas` varchar(45) NOT NULL,
  `diagnostico` varchar(45) DEFAULT NULL,
  `citaMedica` int(11) NOT NULL,
  `receta` int(11) NOT NULL,
  `signosVitales` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `examenmedico`
--

CREATE TABLE IF NOT EXISTS `examenmedico` (
  `idExamenMedico` int(11) NOT NULL,
  `archivoExamen` blob
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `expedientemedico`
--

CREATE TABLE IF NOT EXISTS `expedientemedico` (
  `idExpedienteMedico` int(11) NOT NULL,
  `paciente` int(11) NOT NULL,
  `padecimientosP` int(11) DEFAULT NULL,
  `examenMedicoP` int(11) DEFAULT NULL,
  `adiccionesP` int(11) DEFAULT NULL,
  `alergiasP` int(11) DEFAULT NULL,
  `antedecentesFamP` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `inventario`
--

CREATE TABLE IF NOT EXISTS `inventario` (
  `idInventario` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `receta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `paciente`
--

CREATE TABLE IF NOT EXISTS `paciente` (
  `idPaciente` int(11) NOT NULL,
  `nombrePaciente` varchar(45) NOT NULL,
  `apellido1Paciente` varchar(45) NOT NULL,
  `apellido2Paciente` varchar(45) NOT NULL,
  `fechaNacimientoPaciente` date NOT NULL,
  `nacionalidadPaciente` varchar(45) NOT NULL,
  `cedulaPaciente` varchar(45) NOT NULL,
  `direccion1` varchar(45) NOT NULL,
  `direccion2` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `telefono` int(11) NOT NULL,
  `consultaMed` int(11) DEFAULT NULL,
  `Sexo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `padecimientos`
--

CREATE TABLE IF NOT EXISTS `padecimientos` (
  `idPadecimientos` int(11) NOT NULL,
  `fechaDiagnostico` varchar(45) DEFAULT NULL,
  `nombrePadecimiento` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `receta`
--

CREATE TABLE IF NOT EXISTS `receta` (
  `idReceta` int(11) NOT NULL,
  `nombreMedicamento` varchar(45) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `receta`
--

INSERT INTO `receta` (`idReceta`, `nombreMedicamento`, `cantidad`) VALUES
(1, 'Panadol', 3);

-- --------------------------------------------------------

--
-- Table structure for table `signosvitales`
--

CREATE TABLE IF NOT EXISTS `signosvitales` (
  `idSignosVitales` int(11) NOT NULL,
  `peso` double NOT NULL,
  `altura` double NOT NULL,
  `FC` double NOT NULL,
  `PAR` double NOT NULL,
  `IMC` double NOT NULL,
  `IMB` double NOT NULL,
  `H2O` double NOT NULL,
  `MM` double NOT NULL,
  `GC` double NOT NULL,
  `ASS` tinyint(1) NOT NULL,
  `AF` tinyint(1) NOT NULL,
  `SS` tinyint(1) NOT NULL,
  `PAP` tinyint(1) NOT NULL,
  `IM` tinyint(1) NOT NULL,
  `IV` tinyint(1) NOT NULL,
  `SC` tinyint(1) NOT NULL,
  `GM` tinyint(1) NOT NULL,
  `CP` tinyint(1) NOT NULL,
  `ES` tinyint(1) NOT NULL,
  `PA` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `signosvitales`
--

INSERT INTO `signosvitales` (`idSignosVitales`, `peso`, `altura`, `FC`, `PAR`, `IMC`, `IMB`, `H2O`, `MM`, `GC`, `ASS`, `AF`, `SS`, `PAP`, `IM`, `IV`, `SC`, `GM`, `CP`, `ES`, `PA`) VALUES
(1, 64, 1.83, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `telefono`
--

CREATE TABLE IF NOT EXISTS `telefono` (
  `idtelefono` int(11) NOT NULL,
  `numeroTelefono` varchar(45) NOT NULL,
  `detalle` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `telefono`
--

INSERT INTO `telefono` (`idtelefono`, `numeroTelefono`, `detalle`) VALUES
(1, '86585958', 'Kolbi');

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `idUsuario` int(11) NOT NULL,
  `nombreUsuario` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adicciones`
--
ALTER TABLE `adicciones`
  ADD PRIMARY KEY (`idAdicciones`);

--
-- Indexes for table `alergias`
--
ALTER TABLE `alergias`
  ADD PRIMARY KEY (`idAlergias`);

--
-- Indexes for table `antecedentesfamiliares`
--
ALTER TABLE `antecedentesfamiliares`
  ADD PRIMARY KEY (`idAntecedentesFamiliares`);

--
-- Indexes for table `cita`
--
ALTER TABLE `cita`
  ADD PRIMARY KEY (`idcita`);

--
-- Indexes for table `consultamedica`
--
ALTER TABLE `consultamedica`
  ADD PRIMARY KEY (`idConsultaMedica`), ADD KEY `citaMedica_idx` (`citaMedica`), ADD KEY `receta_idx` (`receta`), ADD KEY `signosVitales_idx` (`signosVitales`);

--
-- Indexes for table `examenmedico`
--
ALTER TABLE `examenmedico`
  ADD PRIMARY KEY (`idExamenMedico`);

--
-- Indexes for table `expedientemedico`
--
ALTER TABLE `expedientemedico`
  ADD PRIMARY KEY (`idExpedienteMedico`), ADD KEY `examenMed_idx` (`examenMedicoP`), ADD KEY `adiccionesPac_idx` (`adiccionesP`), ADD KEY `alergiasPac_idx` (`alergiasP`), ADD KEY `padecimientosPac_idx` (`padecimientosP`), ADD KEY `antecedentesFam_idx` (`antedecentesFamP`), ADD KEY `paciente_idx` (`paciente`);

--
-- Indexes for table `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`idInventario`), ADD KEY `rebajaReceta_idx` (`receta`);

--
-- Indexes for table `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idPaciente`), ADD KEY `telefono_idx` (`telefono`), ADD KEY `consultaMed_idx` (`consultaMed`);

--
-- Indexes for table `padecimientos`
--
ALTER TABLE `padecimientos`
  ADD PRIMARY KEY (`idPadecimientos`);

--
-- Indexes for table `receta`
--
ALTER TABLE `receta`
  ADD PRIMARY KEY (`idReceta`);

--
-- Indexes for table `signosvitales`
--
ALTER TABLE `signosvitales`
  ADD PRIMARY KEY (`idSignosVitales`);

--
-- Indexes for table `telefono`
--
ALTER TABLE `telefono`
  ADD PRIMARY KEY (`idtelefono`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `adicciones`
--
ALTER TABLE `adicciones`
  MODIFY `idAdicciones` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `antecedentesfamiliares`
--
ALTER TABLE `antecedentesfamiliares`
  MODIFY `idAntecedentesFamiliares` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `cita`
--
ALTER TABLE `cita`
  MODIFY `idcita` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `consultamedica`
--
ALTER TABLE `consultamedica`
  MODIFY `idConsultaMedica` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `examenmedico`
--
ALTER TABLE `examenmedico`
  MODIFY `idExamenMedico` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `expedientemedico`
--
ALTER TABLE `expedientemedico`
  MODIFY `idExpedienteMedico` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `padecimientos`
--
ALTER TABLE `padecimientos`
  MODIFY `idPadecimientos` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `receta`
--
ALTER TABLE `receta`
  MODIFY `idReceta` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `signosvitales`
--
ALTER TABLE `signosvitales`
  MODIFY `idSignosVitales` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `telefono`
--
ALTER TABLE `telefono`
  MODIFY `idtelefono` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `consultamedica`
--
ALTER TABLE `consultamedica`
ADD CONSTRAINT `citaMedica` FOREIGN KEY (`citaMedica`) REFERENCES `cita` (`idcita`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `receta` FOREIGN KEY (`receta`) REFERENCES `receta` (`idReceta`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `signosVitales` FOREIGN KEY (`signosVitales`) REFERENCES `signosvitales` (`idSignosVitales`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `expedientemedico`
--
ALTER TABLE `expedientemedico`
ADD CONSTRAINT `adiccionesPac` FOREIGN KEY (`adiccionesP`) REFERENCES `adicciones` (`idAdicciones`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `alergiasPac` FOREIGN KEY (`alergiasP`) REFERENCES `alergias` (`idAlergias`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `antecedentesFam` FOREIGN KEY (`antedecentesFamP`) REFERENCES `antecedentesfamiliares` (`idAntecedentesFamiliares`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `examenMed` FOREIGN KEY (`examenMedicoP`) REFERENCES `examenmedico` (`idExamenMedico`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `paciente` FOREIGN KEY (`paciente`) REFERENCES `paciente` (`idPaciente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `padecimientosPac` FOREIGN KEY (`padecimientosP`) REFERENCES `padecimientos` (`idPadecimientos`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `inventario`
--
ALTER TABLE `inventario`
ADD CONSTRAINT `rebajaReceta` FOREIGN KEY (`receta`) REFERENCES `receta` (`idReceta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `paciente`
--
ALTER TABLE `paciente`
ADD CONSTRAINT `consultaMed` FOREIGN KEY (`consultaMed`) REFERENCES `consultamedica` (`idConsultaMedica`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `telefono` FOREIGN KEY (`telefono`) REFERENCES `telefono` (`idtelefono`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
