CREATE TABLE Cupom (
  `Id_Cupom` INT NOT NULL,
  `QTD_Cupom` INT NOT NULL,
  `Data_Validade` DATETIME NULL,
  `Instituicao_CNPJ` VARCHAR(45) NOT NULL,
  `URL` VARCHAR(255) NOT NULL,
  `Descricao` VARCHAR(255) NULL,
  `Categoria` VARCHAR(255) NULL,
  PRIMARY KEY (`Id_Cupom`),
  INDEX `fk_Cumpom_Instituicao1_idx` (`Instituicao_CNPJ` ASC) VISIBLE,
  CONSTRAINT `fk_Cumpom_Instituicao1`
    FOREIGN KEY (`Instituicao_CNPJ`)
    REFERENCES `Achados&Descontos`.`Instituicao` (`CNPJ`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

insert into Cupom (Id_Cupom, QTD_Cupom, Data_Validade, Instituicao_CNPJ , URL, Descricao, Categoria) Values(6969, 3, "2024-10-08 15:30:00", "69696969", "https://trello.com/b/lCVR1hHo/projeto-buscopom-achados-e-descontos", "Desconto acucarado", "Desconto Vip para Fregueses ");
insert into Cupom (Id_Cupom, QTD_Cupom, Data_Validade, Instituicao_CNPJ , URL, Descricao, Categoria) Values(6666, 3, "2024-10-08 15:30:00", "69696969", "https://trello.com/b/lCVR1hHo/projeto-buscopom-achados-e-descontos", "Desconto acucarado", "Ate 85% de decontos para amigos do Nosso querido Matheus");


