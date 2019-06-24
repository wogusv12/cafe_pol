-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: cafe_pol
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `paymentdetail`
--

DROP TABLE IF EXISTS `paymentdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `paymentdetail` (
  `PayIndex` int(11) NOT NULL AUTO_INCREMENT,
  `ProName` varchar(45) NOT NULL,
  `PPIndex` int(11) NOT NULL,
  `ProNum` varchar(45) NOT NULL,
  `ProCup` varchar(45) NOT NULL,
  `ProSize` varchar(45) NOT NULL,
  `ProShot` varchar(45) NOT NULL,
  `ProIce` varchar(45) NOT NULL,
  PRIMARY KEY (`PayIndex`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paymentdetail`
--

LOCK TABLES `paymentdetail` WRITE;
/*!40000 ALTER TABLE `paymentdetail` DISABLE KEYS */;
INSERT INTO `paymentdetail` VALUES (2,'0',0,'4','개인용 컵','Tall','0','기본'),(3,'0',1,'2','개인용 컵','Tall','0','기본'),(4,'0',1,'1','개인용 컵','Tall','0','기본'),(5,'0',1,'1','개인용 컵','Tall','0','기본'),(6,'0',1,'1','플라스틱 컵','Tall','0','기본'),(7,'콜드 브루 몰트',0,'1','플라스틱 컵','Tall','0','기본');
/*!40000 ALTER TABLE `paymentdetail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-24 22:04:32
