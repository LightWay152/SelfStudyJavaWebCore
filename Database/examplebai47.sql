CREATE DATABASE  IF NOT EXISTS `examplebai47` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `examplebai47`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: examplebai47
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `dethi`
--

DROP TABLE IF EXISTS `dethi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dethi` (
  `dethiid` int(11) NOT NULL AUTO_INCREMENT,
  `stt` int(11) DEFAULT NULL,
  `cauhoi` text,
  `dapan1` text,
  `dapan2` text,
  `dapan3` text,
  `dapan4` text,
  PRIMARY KEY (`dethiid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dethi`
--

LOCK TABLES `dethi` WRITE;
/*!40000 ALTER TABLE `dethi` DISABLE KEYS */;
INSERT INTO `dethi` VALUES (1,1,'Macro Polo Airlines can upgrade a ticket only ------- it is more than 48 hours prior to departure time','A. while','B. yet','C. on','D. if'),(2,2,' Seaton Landscaping makes sure that customers receive -------- service for a good price and within a reasonable amount of time.','A. approving','B.  outstanding','C. magnified','D. hopeful'),(3,3,'A new survey by the Allentown Gazette revealed a strong ------ for small, local coffee shops instead of large franchises','A. preference','B. choice','C. placement','D. decision'),(4,4,'A new survey by the Allentown Gazette revealed a strong ------ for small, local coffee shops instead of large franchises','A.  invest','B. invested','C. investing','D. invests'),(5,5,' Seaton Landscaping makes sure that customers receive -------- service for a good price and within a reasonable amount of time.','A. vary',' B. try','C. choose','D. induce'),(6,6,'Macro Polo Airlines can upgrade a ticket only ------- it is more than 48 hours prior to departure time','A. disappointed','B. pleased','C. excited','D. interested'),(13,1,'Macro Polo Airlines can upgrade a ticket only ------- it is more than 48 hours prior to departure time','A. while','B. yet','C. on','D. if'),(14,2,' Seaton Landscaping makes sure that customers receive -------- service for a good price and within a reasonable amount of time.','A. approving','B.  outstanding','C. magnified','D. hopeful'),(15,3,'A new survey by the Allentown Gazette revealed a strong ------ for small, local coffee shops instead of large franchises','A. preference','B. choice','C. placement','D. decision'),(16,4,'A new survey by the Allentown Gazette revealed a strong ------ for small, local coffee shops instead of large franchises','A.  invest','B. invested','C. investing','D. invests'),(17,5,' Seaton Landscaping makes sure that customers receive -------- service for a good price and within a reasonable amount of time.','A. vary',' B. try','C. choose','D. induce'),(18,6,'Macro Polo Airlines can upgrade a ticket only ------- it is more than 48 hours prior to departure time','A. disappointed','B. pleased','C. excited','D. interested');
/*!40000 ALTER TABLE `dethi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-21 10:07:45
