-- MySQL dump 10.13  Distrib 5.5.21, for Win32 (x86)
--
-- Host: localhost    Database: inventario
-- ------------------------------------------------------
-- Server version	5.5.21

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
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Diclofenac','Analgecico','Rarpe',3,7,4,'pastilla para el dolor'),(2,'Panadol','tableta','lab. ramos',4,6,3,'tableta antigripal y para la fiebre'),(3,'Manzatin E','Pomada','Lab.Ibanias',15.9,20.44,25,'poda hipolergenica'),(4,'Mupinal','Pomada','Lab.Ivanias',35,41.06,10,'pomada para infeccion cutanea'),(5,'Hidropolivit','Vitaminas','Lab.Ivanias',110,121,12,'vitaminas y antioxidantes'),(6,'Camibar','Cicatrizante','Lab.Mendieta',23,26.85,15,'pomada cicatrizante'),(7,'Acetominofen','Analgecico','Farmacia Estrella Roja',30.09,42,20,NULL),(8,'Clotrimazol','Pomada','Farmacia Estrella Roja',50,61.1,12,'pomada hipolergenica'),(9,'Corgentizol','Pomada','Lab. Ivanias',42.21,49.65,12,'pomada hipolergenica'),(10,'Hierro Aminoquelado','Analgecico','Lab.Ramos',90.12,100,20,'  '),(11,'Dermatop','Pomada','Lab.Ramos',32,40.5,10,'  '),(12,'Neobol','Cicatrizante','Lab.Ramos',41,50,5,'pomada cicatrizante'),(13,'Simvastatina','Analgecico','Lab.Leiva',22,30,30,'  '),(14,'Beclorino','Pulverizante','Farmacia Estrella Roja',60,70,6,'  '),(15,'Triple Antibiotico','Pomada','Lab.Ramos',33,41.12,8,'pomada hipolergenica'),(16,'Podofilina','Cicatrizante','Lab.Ivanias',42,48.9,12,'pomada cicatrizante'),(17,'Miconazol','Pomada','Farmacia Estrella Roja',45,53.11,5,'pomada hipolergenica'),(18,'Lacritir','Oftalmico','Lab.Ramos',22,29.5,6,'gotas para quitar malestares en el ojo'),(19,'Dolofin','Tabletas','Lab.Ramos',12,19,12,'tableta para el dolor y la fiebre'),(20,'Alka-zelter','Tableta','Farmacia Estrella Roja',5,8,25,'tableta eferbecente');
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
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES ('Panadol',2,12,'Alberto',6,'tableta','2014-06-14'),('Dolofin',3,57,'Marcos',19,'Tabletas','2014-06-14'),('Manzatin E',3,61.32,'Maria',20.44,'Pomada','2014-06-14'),('Neobol',2,100,'Maira',50,'Cicatrizante','2014-06-14'),('Lacritir',2,59,'Westly',29.5,'Oftalmico','2014-06-14'),('Mupinal',4,164.24,'Pamela',41.06,'Pomada','2014-06-14'),('Panadol',3,18,'Pamela',6,'tableta','2014-06-14'),('Neobol',1,50,'engel',50,'Cicatrizante','2014-06-14'),('Miconazol',10,531.1,'Beto',53.11,'Pomada','2014-06-14'),('Dermatop',2,81,'Beto',40.5,'Pomada','2014-06-14'),('Neobol',4,200,'Beto',50,'Cicatrizante','2014-06-14'),('Diclofenac',2,14,'Marcos',7,'Analgecico','2014-06-14'),('Neobol',7,350,'AlvaroG.',50,'Cicatrizante','2014-06-14');
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

-- Dump completed on 2014-06-15 11:48:37
