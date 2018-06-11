/*
SQLyog Enterprise - MySQL GUI
MySQL - 5.6.26-log 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `t_studentscore` (
	`ID` double ,
	`StudentID` double ,
	`Course` varchar (150),
	`Score` double 
); 
insert into `t_studentscore` (`ID`, `StudentID`, `Course`, `Score`) values('1','1','数学','80');
insert into `t_studentscore` (`ID`, `StudentID`, `Course`, `Score`) values('2','1','英语','95');
insert into `t_studentscore` (`ID`, `StudentID`, `Course`, `Score`) values('3','1','语文','99');
insert into `t_studentscore` (`ID`, `StudentID`, `Course`, `Score`) values('4','2','数学','85');
insert into `t_studentscore` (`ID`, `StudentID`, `Course`, `Score`) values('5','2','语文','98');
insert into `t_studentscore` (`ID`, `StudentID`, `Course`, `Score`) values('6','3','英语','60');
