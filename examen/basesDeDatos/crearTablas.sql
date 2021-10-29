--crear tabla productos

create table productos(
producto int primary key,
	Nombre varchar(100),
	Precio money
);

--crear tabla cajeros

create table cajeros(
	cajero int primary key,
	NomApels varchar(255)
);



--crear tabla venta

create table maquinas_registradoras(
	maquina int primary key,
	piso int
);

--crear tabla venta

create table venta(
	cajero int ,
	maquina int,
	producto int,
	
	foreign key (producto) references productos(producto),
	foreign key (cajero) references cajeros(cajero),
	foreign key (maquina) references maquinas_registradoras(maquina)
);

