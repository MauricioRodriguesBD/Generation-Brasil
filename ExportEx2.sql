-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_rh2
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_cargo`
--

DROP TABLE IF EXISTS `tb_cargo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_cargo` (
  `id_cargo` bigint NOT NULL AUTO_INCREMENT,
  `funcao` varchar(20) NOT NULL,
  `salario` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id_cargo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_cargo`
--

LOCK TABLES `tb_cargo` WRITE;
/*!40000 ALTER TABLE `tb_cargo` DISABLE KEYS */;
INSERT INTO `tb_cargo` VALUES (1,'Desenvolvedor',200.00),(2,'Gestor',4000.44),(3,'Psicólogo',4500.00),(4,'Dev Java Jr',100.35),(5,'RH',3000.00);
/*!40000 ALTER TABLE `tb_cargo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_funcionarios`
--

DROP TABLE IF EXISTS `tb_funcionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_funcionarios` (
  `nome` varchar(255) NOT NULL,
  `rg` varchar(9) NOT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  `cargo` bigint DEFAULT NULL,
  KEY `cargo` (`cargo`),
  CONSTRAINT `tb_funcionarios_ibfk_1` FOREIGN KEY (`cargo`) REFERENCES `tb_cargo` (`id_cargo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_funcionarios`
--

LOCK TABLES `tb_funcionarios` WRITE;
/*!40000 ALTER TABLE `tb_funcionarios` DISABLE KEYS */;
INSERT INTO `tb_funcionarios` VALUES ('Mauricio','123456789','12341231231',1),('Mauricio','123456789','12341231231',1),('Mauricio','123456789','12341231231',1),('a','123456789','12341231231',1),('b','123456789','12341231231',2),('c','123456789','12341231231',3),('d','123456789','12341231231',4),('e','123456789','12341231231',5),('g','123456789','12341231231',1),('h','123456789','12341231231',3),('i','123456789','12341231231',2),('j','123456789','12341231231',2),('k','123456789','12341231231',2),('l','123456789','12341231231',1),('m','123456789','12341231231',4),('n','123456789','12341231231',3),('o','123456789','12341231231',2);
/*!40000 ALTER TABLE `tb_funcionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'db_rh2'
--

--
-- Dumping routines for database 'db_rh2'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-27 12:13:31
