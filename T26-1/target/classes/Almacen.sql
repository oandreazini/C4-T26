use heroku_0d3d9a2e88b6da5;

DROP TABLE IF EXISTS `piezas`;
DROP table IF EXISTS `proveedores`;
DROP table IF EXISTS `suministra`;

create table piezas(
codigo int NOT NULL AUTO_INCREMENT,
nombre varchar(100),
 PRIMARY KEY (codigo)
);

create table proveedores (
codigo int NOT NULL AUTO_INCREMENT,
nombre varchar(100),
PRIMARY KEY (codigo)
);

create table suministra (
id int NOT NULL AUTO_INCREMENT,
codigo_pieza int,
id_proveedor int,
precio int,
CONSTRAINT FK_pieza_suminis FOREIGN KEY (codigo_pieza) REFERENCES piezas(codigo)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FK_proveedo_suminis FOREIGN KEY (id_proveedor) REFERENCES proveedores(codigo)
ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY (id)
);

insert into piezas (`nombre`) values('Tuerca');
insert into piezas (`nombre`) values(2, 'Tornillo');
insert into piezas ( `nombre`) values(3, 'Arandela');


insert into proveedores ( `nombre`) values ('Saltoki');
insert into proveedores ( `nombre`) values ('Bauhaus');
insert into proveedores ( `nombre`) values ('Leroy');

insert into suministra (`codigo_pieza`, `id_proveedor`, `precio`) values ( 11, 11, 2 );
insert into suministra (`codigo_pieza`, `id_proveedor`, `precio`) values ( 21, 21, 3);
insert into suministra (`codigo_pieza`, `id_proveedor`, `precio` ) values ( 31, 31, 5);

