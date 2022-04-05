
-- Mysql
DROP DATABASE `techcareer_springboot_1`;
CREATE SCHEMA `techcareer_springboot_1` DEFAULT CHARACTER SET utf8 COLLATE utf8_turkish_ci ;
use techcareer_springboot_1;

CREATE TABLE admin(
"id INT NOT NULL AUTO_INCREMENT,
"admin_name" VARCHAR(150) NULL,
"admin_surname" VARCHAR(150) NULL,
  `created_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY (`id`));


--H2DB
-- https://www.tutorialspoint.com/h2_database/h2_database_create.htm
CREATE TABLE admin (
   id INT NOT NULL,
   admin_name VARCHAR(150),
   admin_surname VARCHAR(20) ,
   create_date TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
   PRIMARY KEY (id));
);

INSERT INTO admin VALUES ( 'Ramesh', 'Ahmedabad');