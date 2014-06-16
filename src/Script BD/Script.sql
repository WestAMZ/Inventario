-- MySQL dump 10.13  Distrib 5.5.38, for Win64 (x86)
--
-- Host: localhost    Database: inventario
-- ------------------------------------------------------
-- Server version	5.5.38

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
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `categoria` varchar(30) DEFAULT NULL,
  `proveedor` varchar(30) DEFAULT NULL,
  `costo` float DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `Cantidad` float NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Diclofenac','Analgecico','Rarpe',3,7,4,NULL),(2,'Panadol','tableta','lab. ramos',4,6,3,NULL),(3,'Manzatin E','Pomada','Lab.Ibanias',15.9,20.44,25,NULL),(4,'Mupinal','Pomada','Lab.Ivanias',35,41.06,10,NULL),(5,'Hidropolivit','Vitaminas','Lab.Ivanias',110,121,12,NULL),(6,'Camibar','Cicatrizante','Lab.Mendieta',23,26.85,15,NULL),(7,'Acetominofen','Analgecico','Farmacia Estrella Roja',30.09,42,20,NULL),(8,'Clotrimazol','Pomada','Farmacia Estrella Roja',50,61.1,12,NULL),(9,'Corgentizol','Pomada','Lab. Ivanias',42.21,49.65,12,NULL),(10,'Hierro Aminoquelado','Analgecico','Lab.Ramos',90.12,100,20,NULL),(11,'Dermatop','Pomada','Lab.Ramos',32,40.5,10,NULL),(12,'Neobol','Cicatrizante','Lab.Ramos',41,50,5,NULL),(13,'Simvastatina','Analgecico','Lab.Leiva',22,30,30,NULL),(15,'Triple Antibiotico','Pomada','Lab.Ramos',33,41.12,8,NULL),(16,'Podofilina','Cicatrizante','Lab.Ivanias',42,48.9,12,NULL),(17,'Miconazol','Pomada','Farmacia Estrella Roja',45,53.11,5,NULL),(18,'Lacritir','Oftalmico','Lab.Ramos',22,29.5,6,NULL),(19,'Dolofin','Tabletas','Lab.Ramos',12,19,15,'null'),(20,'Alka-zelter','Tableta','Farmacia Estrella Roja',5,9,25,NULL),(21,'HigadoSanil','Tabletas','Lab.Ramos',8,12,20,NULL),(22,'AlcoholGel','Liquido','Lab.Ramos',23,40,12,NULL),(23,'DicloRap','Tableta','Lab.Ramos',6,12,21,NULL),(24,'NAN1','Leche en Polvo','Farmacia Estrella Roja',100,150,6,NULL),(25,'Delor','Tableta','Lab.Ivanias',10,15.5,12,NULL),(26,'Tab-cin','Tableta','Lab.Ivanias',12,18,10,NULL),(27,'Tapon','pastilla','lab. Ramos',4,5.5,45,'pastilla para el malestar estomacal');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `name` varchar(10) DEFAULT NULL,
  `pass` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('west','12345'),('amchc','1111');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venta` (
  `producto` varchar(30) NOT NULL,
  `unidades` float DEFAULT NULL,
  `total` float NOT NULL,
  `cliente` varchar(30) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `Descripcion` varchar(30) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES ('NAN1',3,450,'Alberto',150,'Leche en Polvo','2014-06-15',24),('Neobol',4,200,'Alberto',50,'Cicatrizante','2014-06-15',12),('Hierro Aminoquelado',2,200,'Alberto',100,'Analgecico','2014-06-15',10),('Diclofenac',3,21,'Alberto',7,'Analgecico','2014-06-15',1),('Panadol',5,30,'Alberto',6,'tableta','2014-06-15',2),('NAN1',2,300,'Mario',150,'Leche en Polvo','2014-06-15',24),('Alka-zelter',6,54,'Mario',9,'Tableta','2014-06-15',20),('Diclofenac',10,70,'Mario',7,'Analgecico','2014-06-15',1),('Dermatop',1,40.5,'Mario',40.5,'Pomada','2014-06-15',11),('Neobol',2,100,'Mario',50,'Cicatrizante','2014-06-15',12),('Panadol',12,72,'Martha',6,'tableta','2014-06-15',2),('Simvastatina',4,120,'Martha',30,'Analgecico','2014-06-15',13),('Dolofin',2,38,'Martha',19,'Tabletas','2014-06-15',19),('Miconazol',1,53.11,'Martha',53.11,'Pomada','2014-06-15',17),('DicloRap',32,384,'Marin',12,'Tableta','2014-06-15',23),('Delor',4,62,'Teylor',15.5,'Tableta','2014-06-15',25),('Diclofenac',10,70,'Teylor',7,'Analgecico','2014-06-15',1),('Delor',5,77.5,'Teylor',15.5,'Tableta','2014-06-15',25),('Tab-cin',5,90,'Teylor',18,'Tableta','2014-06-15',26),('Camibar',2,53.7,'Teylor',26.85,'Cicatrizante','2014-06-15',6),('Mupinal',1,41.06,'Teylor',41.06,'Pomada','2014-06-15',4),('Dolofin',5,95,'Teylor',19,'Tabletas','2014-06-15',19),('Tab-cin',3,54,'Pamela',18,'Tableta','2014-06-15',26),('Podofilina',3,146.7,'Pamela',48.9,'Cicatrizante','2014-06-15',16),('Diclofenac',4,28,'Pamela',7,'Analgecico','2014-06-15',1),('DicloRap',12,144,'Pamela',12,'Tableta','2014-06-15',23),('Panadol',8,48,'Pamela',6,'tableta','2014-06-15',2),('Neobol',2,100,'Alberto',50,'Cicatrizante','2014-06-15',12),('NAN1',1,150,'Albert',150,'Leche en Polvo','2014-06-15',24),('Manzatin E',32,654.08,'westly',20.44,'Pomada','2014-06-16',3);
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-06-16 12:14:29
