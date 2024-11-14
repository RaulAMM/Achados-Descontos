CREATE TABLE Usuario (
  `Id_Usuario` INT NOT NULL,
  `Senha` VARCHAR(20) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `Nome` VARCHAR(45) NOT NULL,
  `Tipo` INT NOT NULL,
  PRIMARY KEY (`Id_Usuario`))
ENGINE = InnoDB;

insert into Usuario (Id_Usuario, Senha, Email, Nome, Tipo) values(1, "6969", "Jubiscreid69@yahoo.com.br", "Jubscreide", 1);
insert into Usuario (Id_Usuario, Senha, Email, Nome, Tipo) values(2, "3000", "Bys@hotmail.com", "Baldrake", 0);
insert into Usuario (Id_Usuario, Senha, Email, Nome, Tipo) values(3, "4500", "Saro@gmail.com", "Saronir", 0);
insert into Usuario (Id_Usuario, Senha, Email, Nome, Tipo) values(4, "123456", "CorinthiansNaVeia@gmail.com", "AdminOnFodao", 1);

