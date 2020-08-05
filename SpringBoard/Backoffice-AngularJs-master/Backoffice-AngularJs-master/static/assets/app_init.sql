CREATE DATABASE `guestbook`;
USE `guestbook`;

CREATE TABLE `roles` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(60) NOT NULL,
  PRIMARY KEY (`role_id`),
  UNIQUE KEY `constraintRoleName` (`role_name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `signed_in_guests` (
  `guest_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `signingDate` datetime DEFAULT NULL,
  PRIMARY KEY (`guest_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `staff_details` (
  `staff_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `is_deleted` bit(1) NOT NULL,
  `email_address` varchar(50) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `date_of_joining` datetime NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `other_names` varchar(30) DEFAULT NULL,
  `mobile_number` varchar(30) NOT NULL,
  `national_id` varchar(30) NOT NULL,
  `password` varchar(100) NOT NULL,
  `personal_number` varchar(100) NOT NULL,
  PRIMARY KEY (`staff_id`),
  UNIQUE KEY `constraintPersonalNumber` (`personal_number`),
  UNIQUE KEY `constraintEmail` (`email_address`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


CREATE TABLE `staff_roles` (
  `staff_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`staff_id`,`role_id`),
  KEY `FKpw36v917phegjhfo1vdvx3wrr` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1



-- TEST QUERIES
-- select * from `guests`.`signed_in_guests`;
-- select * from `guests`.`staff_details`;