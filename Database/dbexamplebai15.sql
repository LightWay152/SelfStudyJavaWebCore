CREATE DATABASE  IF NOT EXISTS `dbexamplebai15` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `dbexamplebai15`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: dbexamplebai15
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
-- Table structure for table `incompletesentenced`
--

DROP TABLE IF EXISTS `incompletesentenced`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `incompletesentenced` (
  `incompletesentencedid` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) DEFAULT NULL,
  `question` text,
  `option1` text,
  `option2` text,
  `option3` text,
  `option4` text,
  `correctanswer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`incompletesentencedid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `incompletesentenced`
--

LOCK TABLES `incompletesentenced` WRITE;
/*!40000 ALTER TABLE `incompletesentenced` DISABLE KEYS */;
INSERT INTO `incompletesentenced` VALUES (1,1,'As the company became ………., it didn’t need to rely on local suppliers, but could import equipment from other cities.','A. Richest','B. Failure','C. Successfully','D. Wealthier','D'),(2,2,'Richard Furst, a specialist in copyright law, is the most recent ……….to our staff.','A. Addition','B. Increased','C. Division','D. Additional','A'),(3,3,'We have two employees ……….create new marketing strategies.','A. Then','B. Which','C. Who','D. If','C'),(4,4,'……….he attended the conference, he didn’t think it was very informative.','A. Infact','B. Recently','C. Although','D. Also','C');
/*!40000 ALTER TABLE `incompletesentenced` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-21 12:02:36
