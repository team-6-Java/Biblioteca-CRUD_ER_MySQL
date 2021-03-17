

drop table if exists Mensajes;
drop table if exists Prestamo;
drop table if exists Autor;
drop table if exists Libro;
drop table if exists Editorial;
drop table if exists Usuario;

create table Usuario (
username varchar(255) not null,
nombre varchar(255) not null,
apellido varchar(255),
email varchar(255) not null,
contraseña varchar(255) not null,
descripcion varchar(255),
imagen blob,
primary key (username)
);

create table Editorial(
id int auto_increment,
nombre varchar(255) not null,
primary key (id)
);

create table Autor(
id int auto_increment,
nombre varchar(255) not null,
apellido varchar(255),
primary key (id)
);

create table Libro(
id int auto_increment,
titulo varchar(255) not null,
isbn varchar(255) not null,
tematica varchar(255),
estado varchar(255)not null,
imagen blob,
paginas int not null,
descripcion varchar(255),
veces_prestado int,
usuario varchar(255),
editorial int,
autor int not null,
primary key(id),
foreign key (usuario) references Usuario(username) ,
foreign key (editorial) references Editorial(id) ,
foreign key (autor) references Autor(id) 
);

create table Prestamo(
id int auto_increment,
valoracion_libro varchar(255),
fecha_prestamo date not null,
fecha_devolucion date,
usuario varchar(255),
libro int,
primary key (id),
foreign key (usuario) references Usuario(username) ,
foreign key (libro) references Libro(id)
);

create table Mensajes(
id int auto_increment,
usuario1 varchar(255),
usuario2 varchar(255),
primary key (id),
foreign key (usuario1) references Usuario(username) ,
foreign key (usuario2) references Usuario(username) 
);


insert into Usuario (username,nombre,apellido,email,contraseña,descripcion,imagen) values('giorocor','Giovanny','Rodriguez','giovanny@hotmail.com','123456789','','');
insert into Usuario (username,nombre,apellido,email,contraseña,descripcion,imagen) values('jazamo','Javier','Zamorano','jaza23@outlook.es','123456789','','');
insert into Usuario (username,nombre,apellido,email,contraseña,descripcion,imagen) values('orlares','Orlando','Lopez','orlando1995@gmail.com','123456789','','');
insert into Usuario (username,nombre,apellido,email,contraseña,descripcion,imagen) values('valarias','Valeria','Arias','valeri1@hotmail.com','123456789','','');
insert into Usuario (username,nombre,apellido,email,contraseña,descripcion,imagen) values('lumar','Luisa','Martinez','lumartinez5@gmail.com','123456789','','');
insert into Usuario (username,nombre,apellido,email,contraseña,descripcion,imagen) values('andregar','Andres','Ospina','andruw15@hotmail.com','123456789','','');
insert into Usuario (username,nombre,apellido,email,contraseña,descripcion,imagen) values('lulo','Luis','Preciado','lucho25@gmail.com','123456789','','');
insert into Usuario (username,nombre,apellido,email,contraseña,descripcion,imagen) values('homersi','Homero','Simsomp','homerito45@gmail.com','123456789','','');
insert into Usuario (username,nombre,apellido,email,contraseña,descripcion,imagen) values('kasan','Katerine','Robles','katerrible@hotmail.com','123456789','','');
insert into Usuario (username,nombre,apellido,email,contraseña,descripcion,imagen) values('epe','Erika','Perez','kika24@hotmail.com','123456789','','');

insert into Editorial (id,nombre)values(1,'Alianza Editorial');
insert into Editorial (id,nombre)values(2,'Editorial Planeta');
insert into Editorial (id,nombre)values(3,'Cátedra');
insert into Editorial (id,nombre)values(4,'Mondadori');
insert into Editorial (id,nombre)values(5,'Ediciones Siruela');
insert into Editorial (id,nombre)values(6,'Blackie Books');
insert into Editorial (id,nombre)values(7,'Impedimenta');
insert into Editorial (id,nombre)values(8,'Malpaso');
insert into Editorial (id,nombre)values(9,'Nordica');
insert into Editorial (id,nombre)values(10,'Austral');

insert into Autor (id,nombre,apellido)values(1,'Lesley-Ann','Jones');
insert into Autor (id,nombre,apellido)values(2,'Woody','Allen');
insert into Autor (id,nombre,apellido)values(3,'Amin','Maalouf');
insert into Autor (id,nombre,apellido)values(4,'Marcos','Chicot');
insert into Autor (id,nombre,apellido)values(5,'Dan','Brown');
insert into Autor (id,nombre,apellido)values(6,'Stella','Gibbons');
insert into Autor (id,nombre,apellido)values(7,'Thomas','Coraghessan Boyle');
insert into Autor (id,nombre,apellido)values(8,'Oscar','Wilde');
insert into Autor (id,nombre,apellido)values(9,'Pablo','Neruda');
insert into Autor (id,nombre,apellido)values(10,'Franz','Kafka');
insert into Autor (id,nombre,apellido)values(11,'William',' Shakespeare');

insert into Libro (id,titulo,isbn,tematica,estado,imagen,paginas,descripcion,veces_prestado,usuario,editorial,autor)values(1,'Hero: David Bowie','9788491047889','Biografía: arte y espectáculo','','',552,'',0,'giorocor',1,1);
insert into Libro (id,titulo,isbn,tematica,estado,imagen,paginas,descripcion,veces_prestado,usuario,editorial,autor)values(2,'A propósito de nada','9788491819950','Autobiografía, Biografía','','',440,'',0,'jazamo',1,2);
insert into Libro (id,titulo,isbn,tematica,estado,imagen,paginas,descripcion,veces_prestado,usuario,editorial,autor)values(3,'Nuestros inesperados hermanos','9788413621210','Ficción de aventuras','','',296,'',0,'orlares',1,3);
insert into Libro (id,titulo,isbn,tematica,estado,imagen,paginas,descripcion,veces_prestado,usuario,editorial,autor)values(4,'El asesinato de Platón','9788408236702','Novela contemporánea | General Novela histórica | Antigua Grecia','','',944,'',0,'valarias',2,4);
insert into Libro (id,titulo,isbn,tematica,estado,imagen,paginas,descripcion,veces_prestado,usuario,editorial,autor)values(5,'El código Da Vinci','9789584240323','Novela contemporánea | General Novela','','',624,'',0,'valarias',2,5);
insert into Libro (id,titulo,isbn,tematica,estado,imagen,paginas,descripcion,veces_prestado,usuario,editorial,autor)values(6,'La hija de Robert Poste','9788493760137','Novela, Ciencia ficción,','','',368,'',0,'andregar',7,6);
insert into Libro (id,titulo,isbn,tematica,estado,imagen,paginas,descripcion,veces_prestado,usuario,editorial,autor)values(7,'Los Terranautas','9788417553722','Ciencia ficción','','',568,'',0,'andregar',7,7);
insert into Libro (id,titulo,isbn,tematica,estado,imagen,paginas,descripcion,veces_prestado,usuario,editorial,autor)values(8,'Cuentos de Oscar Wilde','9788408239420','Novela literaria | Relatos','','',160,'',0,'homersi',10,8);
insert into Libro (id,titulo,isbn,tematica,estado,imagen,paginas,descripcion,veces_prestado,usuario,editorial,autor)values(9,'Cien sonetos de amor','9788432237812','Poesía | General poesía','','',144,'',0,'kasan',10,9);
insert into Libro (id,titulo,isbn,tematica,estado,imagen,paginas,descripcion,veces_prestado,usuario,editorial,autor)values(10,'La metamorfosis','9788467043648','Novela literaria | Narrativa literaria clásicos','','',128,'',0,'epe',10,10);
insert into Libro (id,titulo,isbn,tematica,estado,imagen,paginas,descripcion,veces_prestado,usuario,editorial,autor)values(11,'Otelo','9788467058772','Teatro','','',160,'',0,'giorocor',10,11);

insert into Prestamo (id,valoracion_libro,fecha_prestamo,fecha_devolucion,usuario,libro)values(1,'Buen libro','2021-03-20','2021-02-21','valarias',1);
insert into Prestamo (id,valoracion_libro,fecha_prestamo,fecha_devolucion,usuario,libro)values(2,'Excelente','2021-03-20','2021-02-22','lumar',2);
insert into Prestamo (id,valoracion_libro,fecha_prestamo,fecha_devolucion,usuario,libro)values(3,'Muy aburrido','2021-03-21','2021-02-23','andregar',3);

insert into Mensajes (id,usuario1,usuario2)values(1,'homersi','lumar');
insert into Mensajes (id,usuario1,usuario2)values(2,'kasan','andregar');
insert into Mensajes (id,usuario1,usuario2)values(3,'epe','lulo');


