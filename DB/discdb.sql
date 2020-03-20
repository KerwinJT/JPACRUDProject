-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema discgolfdisc
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `discgolfdisc` ;

-- -----------------------------------------------------
-- Schema discgolfdisc
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `discgolfdisc` DEFAULT CHARACTER SET utf8 ;
USE `discgolfdisc` ;

-- -----------------------------------------------------
-- Table `disc`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `disc` ;

CREATE TABLE IF NOT EXISTS `disc` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `manufacturer` VARCHAR(100) NOT NULL,
  `disc_model` VARCHAR(100) NOT NULL,
  `max_weight` DOUBLE(3,1) NOT NULL,
  `diameter_cm` DOUBLE(2,1) NOT NULL,
  `height_cm` DOUBLE(1,1) NOT NULL,
  `rim_depth_cm` DOUBLE(1,1) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS discuser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'discuser'@'localhost' IDENTIFIED BY 'discuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'discuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
