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