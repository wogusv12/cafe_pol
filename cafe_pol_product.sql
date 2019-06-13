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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `product` (
  `ProIndex` int(11) NOT NULL AUTO_INCREMENT,
  `ProKoName` varchar(45) NOT NULL,
  `ProEnName` varchar(45) NOT NULL,
  `ProPrice` int(11) NOT NULL,
  `ProIce` tinyint(1) NOT NULL,
  `ProCategory` varchar(45) NOT NULL,
  PRIMARY KEY (`ProIndex`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'콜드브루','ColdBrew',4500,1,'ColdBrew'),(2,'콜드 브루 몰트','ColdBrew Malt',8500,1,'ColdBrew'),(3,'콜드 브루 플로트','ColdBrew Float',8000,1,'ColdBrew'),(4,'콜드 폼 콜드 브루','Cold Foam ColdBrew',5800,1,'ColdBrew'),(5,'돌체 콜드브루','Dolce ColdBrew',5800,1,'ColdBrew'),(6,'바닐라 크림 콜드 브루','Vanilla Cream ColdBrew',5500,1,'ColdBrew'),(7,'카페라떼','Caffe Latte',4600,0,'Espresso'),(8,'아이스 카페 라떼','Ice Caffe Latte',4600,1,'Espresso'),(9,'카페 모카','Caffe Mocha',5100,0,'Espresso'),(10,'아이스 카페 모카','Ice Caffe Mocha',5100,1,'Espresso'),(11,'카라멜 마키아또','Caramel Macchiato',5600,0,'Espresso'),(12,'아이스 카라멜 마키아또','Ice Caramel Macchiato',5600,1,'Espresso'),(13,'그린티 크림 프라푸치노','Green Tea Prappuccino',6300,1,'Prapuccino'),(14,'카라멜 프라푸치노','Caramel Prappuccino',6400,1,'Prapuccino'),(15,'다크 카라멜 커피 프라푸치노','Dark Caramel Coffee Prappuccino',6300,1,'Prapuccino'),(16,'모카 프라푸치노','Mocha Prappuccino',5000,1,'Prapuccino'),(17,'바닐라 크림 프라푸치노','Vanilla Cream Frappuccino',4800,1,'Prapuccino'),(18,'자바 칩 프라푸치노','Java Chip Frappuccino',6100,1,'Prapuccino'),(19,'딸기 요거트 블렌디드','Strawberry Yogurt Blended',6100,1,'Blandid'),(20,'딸기 피치 블렌디드','Strawberry Peach Blended',6300,1,'Blandid'),(21,'망고 바나나 블렌디드','Mango Banana Blended',6300,1,'Blandid'),(22,'망고 패션 후르츠 블렌디드','Mango Passion Fruit Blended',5000,1,'Blandid'),(23,'아몬드 바나나 블렌디드','Almond Banana Blended',6500,1,'Blandid'),(24,'아보카도 블렌디드','Avocado Blended',6900,1,'Blandid'),(25,'그린 티 라뗴','Green Tea Latte',5900,0,'Tibana'),(26,'라임 패션 티','Lime Passion Tea',5600,0,'Tibana'),(27,'레몬 민트 티','Lemon Mint Tea',5600,0,'Tibana'),(28,'민트 블렌드 티','Mint Blend Brewed Tea',4100,0,'Tibana'),(29,'아이스 라임 패션 티','Iced Lime Passion Tea',5600,1,'Tibana'),(30,'아이스 레몬 민트 티','Iced Lemon Mint Tea',5600,1,'Tibana'),(31,'DT밀당 케이크 촉촉 초코','DT Cake_Rich Chocolate',3900,0,'Food'),(32,'구운 바나나 케이크','Baked Banana Cake',4600,0,'Food'),(33,'레드벨벳 크림치즈 케이크','Red Velvet Cream Cheese Cake',5500,0,'Food'),(34,'마스카포네 티라미수 케이크','Mascarpone Tiramisu Cake',5900,0,'Food'),(35,'블루베리 쿠키 치즈 케이크','Blueberry Cookie Cheese Cake',6900,0,'Food'),(36,'초콜릿 페스티벌 케이크','Chocolate Festival Cake',5800,0,'Food');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-13 17:18:57
