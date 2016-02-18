CREATE DATABASE IF NOT EXISTS AutopartesTona;

USE AutopartesTona;

CREATE TABLE IF NOT EXISTS Autopartes(
	id int not null auto_increment,
	Nombre varchar(50) not null,
	Modelo varchar(50) not null,
	Fabricante varchar(50) not null,
	Precio float not null,
	Cantidad int not null,
	isAlive boolean not null,
	PRIMARY KEY (id)
);

INSERT INTO Autopartes(Nombre, Modelo, Fabricante, Precio, Cantidad, isAlive)
VALUES("Cosa 1", "Modelo 1", "Fabriconic", 3.50, 20, true);
INSERT INTO Autopartes(Nombre, Modelo, Fabricante, Precio, Cantidad, isAlive)
VALUES("Cosa 2", "Modelo 10", "Modolo", 250, 20, true);
INSERT INTO Autopartes(Nombre, Modelo, Fabricante, Precio, Cantidad, isAlive)
VALUES("Cosa 3", "Modelo 100", "Fabriconic", 1.80, 30, true);
INSERT INTO Autopartes(Nombre, Modelo, Fabricante, Precio, Cantidad, isAlive)
VALUES("Cosa 4", "Modelo 10", "Carnicon", 5.50, 200, true);
INSERT INTO Autopartes(Nombre, Modelo, Fabricante, Precio, Cantidad, isAlive)
VALUES("Cosa 5", "Modelo 1000", "Fabriconic", 100, 100, true);
INSERT INTO Autopartes(Nombre, Modelo, Fabricante, Precio, Cantidad, isAlive)
VALUES("Cosa 6", "Modelo 1", "Carnicon", 2.50, 20, true);
INSERT INTO Autopartes(Nombre, Modelo, Fabricante, Precio, Cantidad, isAlive)
VALUES("Cosa 7", "Modelo 1000", "Carnicon", 5.50, 40, true);
INSERT INTO Autopartes(Nombre, Modelo, Fabricante, Precio, Cantidad, isAlive)
VALUES("Cosa 8", "Modelo 2", "Fabriconic", 250, 25, true);
INSERT INTO Autopartes(Nombre, Modelo, Fabricante, Precio, Cantidad, isAlive)
VALUES("Cosa 9", "Modelo 3", "Modolo", 2500, 13, true);