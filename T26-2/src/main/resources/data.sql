use heroku_0d3d9a2e88b6da5;

DROP TABLE IF EXISTS `cientificos`;
DROP table IF EXISTS `proyectos`;
DROP table IF EXISTS `asignado_a`;

create table cientificos (
dni varchar(8), 
nombre_apellidos nvarchar(225),
PRIMARY KEY (dni)
);

create table proyectos (
id int NOT NULL AUTO_INCREMENT,
nombre nvarchar(225),
horas int,
PRIMARY KEY (id)
);

create table asignado_a(
id int NOT NULL AUTO_INCREMENT,
cientifico  varchar(8), 
proyecto int,
CONSTRAINT FK_dni_asignadoa FOREIGN KEY (cientifico) REFERENCES cientificos(dni)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FK_id_asignadoa FOREIGN KEY (proyecto) REFERENCES proyectos(id)
ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY (id)
);

insert into cientificos (`dni`, `nombre_apellidos`) values ('1234567A', 'Harry Potter');
insert into cientificos (`dni`, `nombre_apellidos`) values('8529637T', 'Pepe Perez');
insert into cientificos (`dni`, `nombre_apellidos`) values('8527419P', 'Laura Semper');

insert into proyectos (`nombre`, `horas`) values ('Big Bang', 100);
insert into proyectos (`nombre`, `horas`) values('Eight', 20);
insert into proyectos (`nombre`, `horas`) values('Open Mind',  50);

insert into asignado_a (`cientifico`, `proyecto`) values ('1234567A', 1);
insert into asignado_a (`cientifico`, `proyecto`) values('8529637T', 11);
insert into asignado_a (`cientifico`, `proyecto`) values('8527419P',  21);
