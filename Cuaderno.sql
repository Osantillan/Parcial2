-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: cuaderno
-- ------------------------------------------------------
-- Server version	5.7.16-log

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
-- Temporary view structure for view `interrupciones_vista`
--

DROP TABLE IF EXISTS `interrupciones_vista`;
/*!50001 DROP VIEW IF EXISTS `interrupciones_vista`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `interrupciones_vista` AS SELECT 
 1 AS `interrupciones_totales`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `reporte`
--

DROP TABLE IF EXISTS `reporte`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reporte` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `actividad` varchar(45) DEFAULT NULL,
  `fecha` date NOT NULL,
  `h_inicio` varchar(7) NOT NULL,
  `h_final` varchar(7) NOT NULL,
  `tiempo` int(9) NOT NULL,
  `interrupciones` int(9) NOT NULL,
  `comentarios` varchar(100) DEFAULT NULL,
  `completado` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reporte`
--

LOCK TABLES `reporte` WRITE;
/*!40000 ALTER TABLE `reporte` DISABLE KEYS */;
INSERT INTO `reporte` VALUES (1,'Prueba de actividad','2018-03-14','09:00am','09:47am',44,3,'primer prueba de insercion a base de datos','S'),(2,'Prueba de actividad','2018-03-14','09:00am','09:47am',44,3,'primer prueba de insercion a base de datos','S'),(3,'Actividad 1','2018-03-14','11:00','11:11',8,3,'Actividad para guardar los datos en la DB','S'),(4,'Actividad 2','2018-03-14','04:03','04:04',1,0,'Prueba de guardado en DB','N'),(5,'Actividad 3','2018-03-15','04:06','04:07',1,0,'Verificacion de errores al momento de guardar datos a la DB','S'),(6,'Actividad 4','2018-03-15','11','11',1,0,'Se agregan nuevas lineas de codigo','S'),(7,'Avtividad 5','2018-03-16','12','12:30',6,9,'Actividad de selecion de fechas como reporte','S'),(8,'Actividad 6','2018-03-17','08:16am','09:00am',30,30,'Entregar el software','S'),(9,'Actividad 7','2018-03-16','08:31am','08:32am',1,0,'Se explicó el software','S');
/*!40000 ALTER TABLE `reporte` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `tiempo_vista`
--

DROP TABLE IF EXISTS `tiempo_vista`;
/*!50001 DROP VIEW IF EXISTS `tiempo_vista`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `tiempo_vista` AS SELECT 
 1 AS `tiempo_total`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `interrupciones_vista`
--

/*!50001 DROP VIEW IF EXISTS `interrupciones_vista`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `interrupciones_vista` AS select sum(`reporte`.`interrupciones`) AS `interrupciones_totales` from `reporte` where (`reporte`.`fecha` between '2018-03-15' and '2018-03-16') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `tiempo_vista`
--

/*!50001 DROP VIEW IF EXISTS `tiempo_vista`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `tiempo_vista` AS select sum(`reporte`.`tiempo`) AS `tiempo_total` from `reporte` where (`reporte`.`fecha` between '2018-03-15' and '2018-03-16') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-15  9:27:47
