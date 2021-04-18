/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.23 : Database - empdetails
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`empdetails` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `empdetails`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `addressID` int NOT NULL,
  `CITY` varchar(255) DEFAULT NULL,
  `COUNTRY` varchar(255) DEFAULT NULL,
  `PINCODE` varchar(255) DEFAULT NULL,
  `STATE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`addressID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `address` */

insert  into `address`(`addressID`,`CITY`,`COUNTRY`,`PINCODE`,`STATE`) values 
(1,'INDORE','INDIA','347899','MP'),
(4,'INDORE','INDIA','347899','MP');

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `DepartmentID` int NOT NULL,
  `Department` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`DepartmentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `department` */

insert  into `department`(`DepartmentID`,`Department`,`region`) values 
(2,'IT',NULL),
(5,'IT',NULL);

/*Table structure for table `employeemaster` */

DROP TABLE IF EXISTS `employeemaster`;

CREATE TABLE `employeemaster` (
  `empID` int NOT NULL,
  `empActive` bit(1) NOT NULL,
  `empAge` int NOT NULL,
  `empCTC` double NOT NULL,
  `empName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `address_addressID` int DEFAULT NULL,
  `department_DepartmentID` int DEFAULT NULL,
  PRIMARY KEY (`empID`),
  KEY `FKqopkmf5adif7iureoan13hhi2` (`address_addressID`),
  KEY `FKtf5jqxvlji0sfymo6909djkt4` (`department_DepartmentID`),
  CONSTRAINT `FKqopkmf5adif7iureoan13hhi2` FOREIGN KEY (`address_addressID`) REFERENCES `address` (`addressID`),
  CONSTRAINT `FKtf5jqxvlji0sfymo6909djkt4` FOREIGN KEY (`department_DepartmentID`) REFERENCES `department` (`DepartmentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `employeemaster` */

insert  into `employeemaster`(`empID`,`empActive`,`empAge`,`empCTC`,`empName`,`password`,`address_addressID`,`department_DepartmentID`) values 
(3,'',50,2000100,NULL,'SUNIL',4,5);

/*Table structure for table `hibernate_sequence` */

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `hibernate_sequence` */

insert  into `hibernate_sequence`(`next_val`) values 
(6),
(6),
(6);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
