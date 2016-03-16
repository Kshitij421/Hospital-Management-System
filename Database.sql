-- MySQL dump 10.13  Distrib 5.6.26, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: project
-- ------------------------------------------------------
-- Server version	5.6.26

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
-- Table structure for table `admited`
--

DROP TABLE IF EXISTS `admited`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admited` (
  `Pid` char(12) DEFAULT NULL,
  `Bedid` int(11) DEFAULT NULL,
  `ADate` date DEFAULT NULL,
  `DDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admited`
--

LOCK TABLES `admited` WRITE;
/*!40000 ALTER TABLE `admited` DISABLE KEYS */;
/*!40000 ALTER TABLE `admited` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `appointment` (
  `Pid` char(12) DEFAULT NULL,
  `ADate` date DEFAULT NULL,
  `ATime` time DEFAULT NULL,
  `Diagnosis` varchar(20) DEFAULT NULL,
  KEY `Pid` (`Pid`),
  CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`),
  CONSTRAINT `appointment_ibfk_2` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`) ON DELETE CASCADE,
  CONSTRAINT `appointment_ibfk_3` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`) ON DELETE CASCADE,
  CONSTRAINT `appointment_ibfk_4` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`) ON DELETE CASCADE,
  CONSTRAINT `appointment_ibfk_5` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment`
--

LOCK TABLES `appointment` WRITE;
/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
INSERT INTO `appointment` VALUES ('Ke19952154','2015-09-20','09:30:00','Cold'),('Ar19951290','2015-09-20','09:45:00','Fever'),('Ke19952154','2015-09-18','08:30:00','Cold'),('Ke19952154','2015-09-16','04:30:00','Cold'),('Ct19951321','2015-09-21','01:00:00','Cold');
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bed`
--

DROP TABLE IF EXISTS `bed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bed` (
  `Bedid` int(11) NOT NULL DEFAULT '0',
  `Roomid` int(11) DEFAULT NULL,
  PRIMARY KEY (`Bedid`),
  KEY `Roomid` (`Roomid`),
  CONSTRAINT `bed_ibfk_1` FOREIGN KEY (`Roomid`) REFERENCES `room` (`Roomid`),
  CONSTRAINT `bed_ibfk_2` FOREIGN KEY (`Roomid`) REFERENCES `room` (`Roomid`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bed`
--

LOCK TABLES `bed` WRITE;
/*!40000 ALTER TABLE `bed` DISABLE KEYS */;
INSERT INTO `bed` VALUES (1,1),(2,1),(3,1),(4,1),(5,2),(6,2),(7,2),(8,2),(9,3),(10,3),(11,4),(12,4),(13,4),(14,5),(15,5),(16,5);
/*!40000 ALTER TABLE `bed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill` (
  `Pid` char(12) DEFAULT NULL,
  `Opd_billcharges` int(11) DEFAULT NULL,
  `ward_billcharges` int(11) DEFAULT NULL,
  KEY `Pid` (`Pid`),
  CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`),
  CONSTRAINT `bill_ibfk_2` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`) ON DELETE CASCADE,
  CONSTRAINT `bill_ibfk_3` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opd_bill`
--

DROP TABLE IF EXISTS `opd_bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `opd_bill` (
  `Pid` char(12) DEFAULT NULL,
  `Charges` int(11) DEFAULT NULL,
  `TDate` date DEFAULT NULL,
  KEY `Pid` (`Pid`),
  CONSTRAINT `opd_bill_ibfk_1` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`),
  CONSTRAINT `opd_bill_ibfk_2` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opd_bill`
--

LOCK TABLES `opd_bill` WRITE;
/*!40000 ALTER TABLE `opd_bill` DISABLE KEYS */;
/*!40000 ALTER TABLE `opd_bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient` (
  `pid` char(12) NOT NULL DEFAULT '',
  `name` varchar(20) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `bg` char(2) DEFAULT NULL,
  `phno` bigint(20) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `Ht` double DEFAULT NULL,
  `Wt` int(11) DEFAULT NULL,
  `Pincode` int(11) DEFAULT NULL,
  `City` char(10) DEFAULT NULL,
  `Email` char(20) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES ('Ar19951290','Abhishek Shirgaokar','1995-04-12','A+',1234567890,'katraj	',NULL,NULL,NULL,NULL,NULL),('Ct19951321','Chinmay Sawant','1995-07-13','A+',9850017321,'Katraj',6,80,NULL,NULL,NULL),('Ke19952154','Kshitij Warungase','1995-09-21','O+',8308959254,'katraj',NULL,60,NULL,NULL,NULL),('Kh19951231','Kamlesh Nikumbh','1995-08-12','a+',9422903731,'katraj',NULL,NULL,NULL,NULL,NULL),('Me19950267','Madhuri Sonawane','1995-05-02','A+',7709631267,'katraj',NULL,NULL,NULL,NULL,NULL),('Pe19951155','Pratik Shinde','1995-01-11','A+',9843124355,'Katraj',NULL,NULL,NULL,NULL,NULL),('Re20001449','Rutuj Warungase','2000-02-14','A+',9850712549,'Sinnar',5.5,50,NULL,NULL,NULL),('Rr20001649','Rutuj Binnar','2000-09-16','A+',1298543249,'Sinnar',5,60,NULL,NULL,NULL),('Se19950190','Shubham Ghule','1995-08-01','A+',1234567890,'Sinnar	',5.5,70,NULL,NULL,NULL),('Se19952312','Shubham Shinde','1995-07-23','A+',9764135412,'katraj',NULL,NULL,NULL,NULL,NULL),('Ur19950590','Umesh Vhatkar','1995-04-05','A+',1234567890,'Katraj',NULL,NULL,NULL,NULL,NULL),('Ve19950425','Varun Sonawane','1995-08-04','A+',8275584225,'katraj',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room` (
  `Roomid` int(11) NOT NULL DEFAULT '0',
  `Charges` int(11) DEFAULT NULL,
  `Type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Roomid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,500,'General'),(2,500,'General'),(3,2000,'ICU'),(4,1000,'Special'),(5,1000,'Special');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `test` (
  `Pid` char(12) DEFAULT NULL,
  `TDate` date DEFAULT NULL,
  `Test` varchar(20) DEFAULT NULL,
  `Charges` int(11) DEFAULT NULL,
  KEY `Pid` (`Pid`),
  CONSTRAINT `test_ibfk_1` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`),
  CONSTRAINT `test_ibfk_2` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test`
--

LOCK TABLES `test` WRITE;
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
INSERT INTO `test` VALUES ('Ke19952154','2015-09-20','Jaundice',250),('Ke19952154','2015-09-20','Chicken Pox',500),('Ke19952154','2015-09-18','jaundice',250),('Ke19952154','2015-09-18','chickenpox',500),('Ar19951290','2015-09-20','kkk',2000),('Ar19951290','2015-09-20','Jaundice',150),('Ar19951290','2015-09-20','aaa',400),('Ke19952154','2015-09-20','aaa',200),('Ct19951321','2015-09-21','Jaundice',1000),('Ct19951321','2015-09-21','aaaa',5000),('Ke19952154','2015-09-21','kkk',10000);
/*!40000 ALTER TABLE `test` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `treatment`
--

DROP TABLE IF EXISTS `treatment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `treatment` (
  `Pid` char(12) DEFAULT NULL,
  `treatment` varchar(256) DEFAULT NULL,
  `TDate` date DEFAULT NULL,
  KEY `Pid` (`Pid`),
  CONSTRAINT `treatment_ibfk_1` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`),
  CONSTRAINT `treatment_ibfk_2` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `treatment`
--

LOCK TABLES `treatment` WRITE;
/*!40000 ALTER TABLE `treatment` DISABLE KEYS */;
INSERT INTO `treatment` VALUES ('Ke19952154','Crosine	2\nNice	10','2015-09-20'),('Ke19952154','Crosine 20 Nice 20','2015-09-18'),('Ar19951290','Crosine	20\nNice	10','2015-09-20'),('Ke19952154','Crosine 20 Nice 2','2015-09-16'),('Ct19951321','Crosine	2\nNise	10','2015-09-21'),('Ct19951321','kjvsk;dkvsld','2015-09-21');
/*!40000 ALTER TABLE `treatment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ward_bill`
--

DROP TABLE IF EXISTS `ward_bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ward_bill` (
  `Pid` char(12) DEFAULT NULL,
  `Roomid` int(11) DEFAULT NULL,
  `Bedid` int(11) DEFAULT NULL,
  `AdmitDate` date DEFAULT NULL,
  `DischargeDate` date DEFAULT NULL,
  `bill` double DEFAULT NULL,
  KEY `Pid` (`Pid`),
  CONSTRAINT `ward_bill_ibfk_1` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`) ON DELETE CASCADE,
  CONSTRAINT `ward_bill_ibfk_2` FOREIGN KEY (`Pid`) REFERENCES `patient` (`pid`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ward_bill`
--

LOCK TABLES `ward_bill` WRITE;
/*!40000 ALTER TABLE `ward_bill` DISABLE KEYS */;
/*!40000 ALTER TABLE `ward_bill` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-09-21 22:30:34
