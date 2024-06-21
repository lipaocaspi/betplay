-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema betplay
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema betplay
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `betplay` DEFAULT CHARACTER SET utf8 ;
USE `betplay` ;

-- -----------------------------------------------------
-- Table `betplay`.`match`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `betplay`.`match` (
  `id_match` INT NOT NULL AUTO_INCREMENT,
  `date_match` DATE NOT NULL,
  PRIMARY KEY (`id_match`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `betplay`.`country`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `betplay`.`country` (
  `id_country` INT NOT NULL AUTO_INCREMENT,
  `name_country` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_country`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `betplay`.`region`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `betplay`.`region` (
  `id_region` INT NOT NULL AUTO_INCREMENT,
  `name_region` VARCHAR(45) NOT NULL,
  `id_country` INT NOT NULL,
  PRIMARY KEY (`id_region`),
  INDEX `fk_region_country1_idx` (`id_country` ASC) VISIBLE,
  CONSTRAINT `fk_region_country1`
    FOREIGN KEY (`id_country`)
    REFERENCES `betplay`.`country` (`id_country`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `betplay`.`city`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `betplay`.`city` (
  `id_city` INT NOT NULL AUTO_INCREMENT,
  `name_city` VARCHAR(45) NOT NULL,
  `id_region` INT NOT NULL,
  PRIMARY KEY (`id_city`),
  INDEX `fk_city_region1_idx` (`id_region` ASC) VISIBLE,
  CONSTRAINT `fk_city_region1`
    FOREIGN KEY (`id_region`)
    REFERENCES `betplay`.`region` (`id_region`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `betplay`.`person`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `betplay`.`person` (
  `id_person` VARCHAR(20) NOT NULL,
  `name_person` VARCHAR(45) NOT NULL,
  `last_name_person` VARCHAR(45) NOT NULL,
  `date_of_birth_person` DATE NOT NULL,
  `email_person` VARCHAR(100) NOT NULL,
  `id_city` INT NOT NULL,
  PRIMARY KEY (`id_person`),
  INDEX `fk_person_city1_idx` (`id_city` ASC) VISIBLE,
  CONSTRAINT `fk_person_city1`
    FOREIGN KEY (`id_city`)
    REFERENCES `betplay`.`city` (`id_city`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `betplay`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `betplay`.`role` (
  `id_role` INT NOT NULL AUTO_INCREMENT,
  `description_role` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`id_role`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `betplay`.`tech`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `betplay`.`tech` (
  `id_tech` INT NOT NULL AUTO_INCREMENT,
  `degree_tech` VARCHAR(45) NOT NULL,
  `date_degree_tech` DATE NOT NULL,
  `id_person` VARCHAR(20) NOT NULL,
  `id_role` INT NOT NULL,
  PRIMARY KEY (`id_tech`),
  INDEX `fk_medic_person1_idx` (`id_person` ASC) VISIBLE,
  INDEX `fk_medic_role1_idx` (`id_role` ASC) VISIBLE,
  CONSTRAINT `fk_medic_person1`
    FOREIGN KEY (`id_person`)
    REFERENCES `betplay`.`person` (`id_person`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_medic_role1`
    FOREIGN KEY (`id_role`)
    REFERENCES `betplay`.`role` (`id_role`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `betplay`.`position`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `betplay`.`position` (
  `id_position` INT NOT NULL AUTO_INCREMENT,
  `description_position` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_position`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `betplay`.`player`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `betplay`.`player` (
  `id_player` INT NOT NULL AUTO_INCREMENT,
  `shirt_number_player` INT NOT NULL,
  `date_of_arrival_player` DATE NOT NULL,
  `goals_scored_player` INT NOT NULL,
  `yellow_cards_player` INT NOT NULL,
  `red_cards_player` INT NOT NULL,
  `id_position` INT NOT NULL,
  `id_person` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_player`),
  INDEX `fk_player_position1_idx` (`id_position` ASC) VISIBLE,
  INDEX `fk_player_person1_idx` (`id_person` ASC) VISIBLE,
  CONSTRAINT `fk_player_position1`
    FOREIGN KEY (`id_position`)
    REFERENCES `betplay`.`position` (`id_position`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_player_person1`
    FOREIGN KEY (`id_person`)
    REFERENCES `betplay`.`person` (`id_person`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `betplay`.`team`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `betplay`.`team` (
  `id_team` INT NOT NULL AUTO_INCREMENT,
  `name_team` VARCHAR(45) NOT NULL,
  `date_of_creation_team` DATE NOT NULL,
  `played_matches_team` INT NOT NULL,
  `won_matches_team` INT NOT NULL,
  `lost_matches_team` INT NOT NULL,
  `tied_matches_team` INT NOT NULL,
  `total_goals_team` INT NOT NULL,
  `goals_scored_team` INT NOT NULL,
  `goals_against_team` INT NOT NULL,
  `total_points_team` INT NOT NULL,
  `id_city` INT NOT NULL,
  PRIMARY KEY (`id_team`),
  INDEX `fk_team_city1_idx` (`id_city` ASC) VISIBLE,
  CONSTRAINT `fk_team_city1`
    FOREIGN KEY (`id_city`)
    REFERENCES `betplay`.`city` (`id_city`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `betplay`.`match_team`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `betplay`.`match_team` (
  `id_match_team` INT NOT NULL AUTO_INCREMENT,
  `id_match` INT NOT NULL,
  `id_team` INT NOT NULL,
  `score` INT NOT NULL,
  `yellow_cards` INT NOT NULL,
  `red_cards` INT NOT NULL,
  INDEX `fk_match_has_team_team1_idx` (`id_team` ASC) VISIBLE,
  INDEX `fk_match_has_team_match_idx` (`id_match` ASC) VISIBLE,
  PRIMARY KEY (`id_match_team`),
  CONSTRAINT `fk_match_has_team_match`
    FOREIGN KEY (`id_match`)
    REFERENCES `betplay`.`match` (`id_match`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_match_has_team_team1`
    FOREIGN KEY (`id_team`)
    REFERENCES `betplay`.`team` (`id_team`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `betplay`.`staff`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `betplay`.`staff` (
  `id_staff` INT NOT NULL AUTO_INCREMENT,
  `id_team` INT NOT NULL,
  `id_person` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_staff`),
  INDEX `fk_staff_team1_idx` (`id_team` ASC) VISIBLE,
  INDEX `fk_staff_person1_idx` (`id_person` ASC) VISIBLE,
  CONSTRAINT `fk_staff_team1`
    FOREIGN KEY (`id_team`)
    REFERENCES `betplay`.`team` (`id_team`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_staff_person1`
    FOREIGN KEY (`id_person`)
    REFERENCES `betplay`.`person` (`id_person`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;