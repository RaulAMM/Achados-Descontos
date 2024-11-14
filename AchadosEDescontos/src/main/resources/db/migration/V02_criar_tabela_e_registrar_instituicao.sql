CREATE TABLE Instituicao (
  `Nome` VARCHAR(45) NOT NULL,
  `CNPJ` VARCHAR(45) NOT NULL,
  `Categoria` VARCHAR(45) NOT NULL,
  `Telefone` VARCHAR(45) NOT NULL,
  `Descricao` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`CNPJ`))
ENGINE = InnoDB;

insert into Instituicao(Nome, CNPJ, Categoria, Telefone, Descricao) Values("CasaDasPrimas LTDA", "69696969", "Servicos gerais", "(69)3336969", "Convento de freiras que oferecem servicos variados... Muito variados. OBS:Rezas semanais com desconto");
