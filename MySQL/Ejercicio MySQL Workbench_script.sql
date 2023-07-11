-- MySQL Script generated by MySQL Workbench
-- Fri Jul  7 13:35:41 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`country`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`country` ;

CREATE TABLE IF NOT EXISTS `mydb`.`country` (
  `id_country` SMALLINT NOT NULL,
  `country` VARCHAR(50) NULL,
  `last_update` TIMESTAMP NULL,
  PRIMARY KEY (`id_country`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`city`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`city` ;

CREATE TABLE IF NOT EXISTS `mydb`.`city` (
  `id_city` INT NOT NULL,
  `city` VARCHAR(50) NULL,
  `country_id` SMALLINT NULL,
  `last_update` TIMESTAMP NULL,
  `country_id_country` SMALLINT NOT NULL,
  PRIMARY KEY (`id_city`),
  INDEX `fk_city_country1_idx` (`country_id_country` ASC) VISIBLE,
  CONSTRAINT `fk_city_country1`
    FOREIGN KEY (`country_id_country`)
    REFERENCES `mydb`.`country` (`id_country`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`address`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`address` ;

CREATE TABLE IF NOT EXISTS `mydb`.`address` (
  `id_address` SMALLINT UNSIGNED NOT NULL,
  `address` VARCHAR(50) NULL,
  `address_2` VARCHAR(50) NULL,
  `district` VARCHAR(20) NULL,
  `city_id` SMALLINT NULL,
  `postal_code` VARCHAR(10) NULL,
  `phone` VARCHAR(20) NULL,
  `location` VARCHAR(20) NULL,
  `last_update` TIMESTAMP NULL,
  `city_idcity` INT NOT NULL,
  PRIMARY KEY (`id_address`),
  INDEX `fk_address_city_idx` (`city_idcity` ASC) VISIBLE,
  CONSTRAINT `fk_address_city`
    FOREIGN KEY (`city_idcity`)
    REFERENCES `mydb`.`city` (`id_city`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

USE mydb;
SELECT * FROM mydb.address
