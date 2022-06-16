create database agencia;

use agencia;

CREATE TABLE `agencia`.`comprador` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cpf` VARCHAR(14) NOT NULL,
  `nome` VARCHAR(70) NOT NULL,
  PRIMARY KEY (`id`));

