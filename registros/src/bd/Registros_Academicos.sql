-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-08-2017 a las 02:53:31
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `registros_academicos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_acudiente`
--

CREATE TABLE `datos_acudiente` (
  `Id_Acudiente` varchar(45) NOT NULL,
  `idEstudiante` int(11) NOT NULL,
  `Nombre_Cadudiente` varchar(45) NOT NULL,
  `Direccion` varchar(45) DEFAULT NULL,
  `Parentezco` int(11) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  `Estudiantes_idEstudiantes` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiantes`
--

CREATE TABLE `estudiantes` (
  `idEstudiantes` int(11) NOT NULL,
  `Tipo_Identificacion` varchar(2) NOT NULL,
  `Num_IDentificacion` varchar(45) NOT NULL,
  `P_Nombre` varchar(45) NOT NULL,
  `S_Nombre` varchar(45) DEFAULT NULL,
  `P_Apellido` varchar(45) NOT NULL,
  `S_Apellido` varchar(45) DEFAULT NULL,
  `Fecha_Nacimiento` datetime NOT NULL,
  `Edad` varchar(3) DEFAULT NULL,
  `Año_Ingreso` year(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `datos_acudiente`
--
ALTER TABLE `datos_acudiente`
  ADD PRIMARY KEY (`Id_Acudiente`,`Estudiantes_idEstudiantes`),
  ADD KEY `fk_Datos_Acudiente_Estudiantes_idx` (`Estudiantes_idEstudiantes`);

--
-- Indices de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  ADD PRIMARY KEY (`idEstudiantes`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  MODIFY `idEstudiantes` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `datos_acudiente`
--
ALTER TABLE `datos_acudiente`
  ADD CONSTRAINT `fk_Datos_Acudiente_Estudiantes` FOREIGN KEY (`Estudiantes_idEstudiantes`) REFERENCES `estudiantes` (`idEstudiantes`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
