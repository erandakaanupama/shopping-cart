DROP SCHEMA IF EXISTS `customer_shoping_cart`;
CREATE SCHEMA `customer_shoping_cart`;
USE `customer_shoping_cart`;

CREATE TABLE `cart`(
	`id` int(11) AUTO_INCREMENT NOT NULL,
    PRIMARY KEY(`id`)
)ENGINE = InnoDB CHARSET=latin1;

CREATE TABLE `customer`(
	`id` INT(11) AUTO_INCREMENT NOT NULL, 
	`name` VARCHAR(50) DEFAULT NULL, 
    `credit_limit` DOUBLE DEFAULT NULL, 
    `telephone` VARCHAR(15) DEFAULT NULL, 
    `address` VARCHAR(60) DEFAULT NULL,
    `cart_id` int(11) DEFAULT NULL,
    
    PRIMARY KEY(`id`),
    CONSTRAINT `FK_CART` FOREIGN KEY(`cart_id`) REFERENCES
    `cart`(`id`)
    ON DELETE NO ACTION ON UPDATE NO ACTION
)ENGINE = InnoDB CHARSET = latin1;

CREATE TABLE `product`(
	`id` INT(11) AUTO_INCREMENT NOT NULL, 
    `name` VARCHAR(50) DEFAULT NULL, 
    `price` DOUBLE DEFAULT NULL, 
    
)