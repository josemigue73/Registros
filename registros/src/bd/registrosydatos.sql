-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-10-2017 a las 19:20:54
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `registrosydatos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignaturas`
--

CREATE TABLE `asignaturas` (
  `IdAsignatura` int(11) NOT NULL,
  `Cod_Asignatura` varchar(5) NOT NULL,
  `Nom_Asignatura` varchar(40) NOT NULL,
  `Int_Horaria` int(2) NOT NULL,
  `Grado` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `asignaturas`
--



-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idpersona` int(11) NOT NULL,
  `codigo_cliente` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiantes`
--

CREATE TABLE `estudiantes` (
  `Cod_Estudiantes` int(11) NOT NULL,
  `Nombres` varchar(45) NOT NULL,
  `P_apellido` varchar(20) NOT NULL,
  `S_apellido` varchar(20) NOT NULL,
  `Telefono` varchar(20) NOT NULL,
  `Direccion` varchar(100) NOT NULL,
  `Tipo_Documento` varchar(2) NOT NULL,
  `Num_Documento` varchar(10) NOT NULL,
  `Año_Ingreso` varchar(10) NOT NULL,
  `Fecha_nacimiento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Ingreso de Estudiantes';

--
-- Volcado de datos para la tabla `estudiantes`
--



-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `matriculas`
--

CREATE TABLE `matriculas` (
  `idMatricula` int(11) NOT NULL,
  `Cod_Estudiantes` int(11) NOT NULL,
  `Año_Matricula` varchar(4) NOT NULL,
  `Grado` varchar(2) NOT NULL,
  `Grupo` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `matriculas`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `idpersona` int(11) NOT NULL,
  `Nombres` varchar(40) NOT NULL,
  `P_apellido` varchar(20) NOT NULL,
  `S_apellido` varchar(20) NOT NULL,
  `tipo_documento` varchar(15) NOT NULL,
  `num_documento` varchar(8) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(8) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tab_logros`
--

CREATE TABLE `tab_logros` (
  `IdLogros` int(11) NOT NULL,
  `Cod_Asignatura` varchar(5) NOT NULL DEFAULT '00000',
  `Descripcion` text NOT NULL,
  `Grado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tab_logros`
--



-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajador`
--

CREATE TABLE `trabajador` (
  `idpersona` int(11) NOT NULL,
  `Cargo` varchar(20) NOT NULL,
  `acceso` varchar(15) NOT NULL,
  `login` varchar(15) NOT NULL,
  `password` varchar(20) NOT NULL,
  `estado` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `trabajador`
--

-- Indices de la tabla `asignaturas`
--
ALTER TABLE `asignaturas`
  ADD PRIMARY KEY (`IdAsignatura`),
  ADD KEY `Cod_Asignatura` (`Cod_Asignatura`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idpersona`),
  ADD UNIQUE KEY `codigo_cliente_UNIQUE` (`codigo_cliente`);

--
-- Indices de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  ADD PRIMARY KEY (`Cod_Estudiantes`);

--
-- Indices de la tabla `matriculas`
--
ALTER TABLE `matriculas`
  ADD UNIQUE KEY `idMatricula` (`idMatricula`),
  ADD KEY `Cod_Estudiantes` (`Cod_Estudiantes`) USING BTREE;

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idpersona`),
  ADD UNIQUE KEY `email_UNIQUE` (`email`),
  ADD UNIQUE KEY `telefono_UNIQUE` (`telefono`);

--
-- Indices de la tabla `tab_logros`
--
ALTER TABLE `tab_logros`
  ADD PRIMARY KEY (`IdLogros`),
  ADD KEY `Cod_Asignatura` (`Cod_Asignatura`),
  ADD KEY `Grado` (`Grado`);

--
-- Indices de la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD PRIMARY KEY (`idpersona`),
  ADD UNIQUE KEY `login_UNIQUE` (`login`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asignaturas`
--
ALTER TABLE `asignaturas`
  MODIFY `IdAsignatura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  MODIFY `Cod_Estudiantes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `matriculas`
--
ALTER TABLE `matriculas`
  MODIFY `idMatricula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idpersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `tab_logros`
--
ALTER TABLE `tab_logros`
  MODIFY `IdLogros` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `matriculas`
--
ALTER TABLE `matriculas`
  ADD CONSTRAINT `matriculas_ibfk_1` FOREIGN KEY (`Cod_Estudiantes`) REFERENCES `estudiantes` (`Cod_Estudiantes`) ON DELETE CASCADE;

--
-- Filtros para la tabla `tab_logros`
--
ALTER TABLE `tab_logros`
  ADD CONSTRAINT `tab_logros_ibfk_1` FOREIGN KEY (`Cod_Asignatura`) REFERENCES `asignaturas` (`Cod_Asignatura`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD CONSTRAINT `trabajador_ibfk_1` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`idpersona`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
