drop database if exists bibliotecaDB;
create database bibliotecaDB;
use bibliotecaDB;

drop table if exists Mensajes;
drop table if exists Prestamo;
drop table if exists Autor;
drop table if exists Libro;
drop table if exists Editorial;
drop table if exists Usuario;

create table usuario (
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
foreign key (usuario) references Usuario(username) on delete cascade on update cascade,
foreign key (editorial) references Editorial(id) on update cascade,
foreign key (autor) references Autor(id) on update cascade
);

create table Prestamo(
id int auto_increment,
valoracion_libro varchar(255),
fecha_prestamo date not null,
fecha_devolucion date not null,
usuario varchar(255),
libro int,
primary key (id),
foreign key (usuario) references Usuario(username) on update cascade on delete cascade,
foreign key (libro) references Libro(id) on delete cascade on update cascade
);

create table Mensajes(
id int auto_increment,
usuario1 varchar(255),
usuario2 varchar(255),
primary key (id),
foreign key (usuario1) references Usuario(username) on update cascade,
foreign key (usuario2) references Usuario(username) on update cascade
);



INSERT INTO usuario VALUES("giorocor","Giovanny","Rodriguez","giovanny@hotmail.com","123456789","","");
INSERT INTO usuario VALUES("jazamo","Javier","Zamorano","jaza23@outlook.es","123456789","","");
INSERT INTO usuario VALUES("orlares","Orlando","Lopez","orlando1995@gmail.com","123456789","","");
INSERT INTO usuario VALUES("valarias","Valeria","Arias","valeri1@hotmail.com","123456789","","");
INSERT INTO usuario VALUES("lumar","Luisa","Martinez","lumartinez5@gmail.com","123456789","","");
INSERT INTO usuario VALUES("andregar","Andres","Ospina","andruw15@hotmail.com","123456789","","");
INSERT INTO usuario VALUES("lulo","Luis","Preciado","lucho25@gmail.com","123456789","","");
INSERT INTO usuario VALUES("homersi","Homero","Simsomp","homerito45@gmail.com","123456789","","");
INSERT INTO usuario VALUES("kasan","Katerine","Robles","katerrible@hotmail.com","123456789","","");
INSERT INTO usuario VALUES("epe","Erika","Perez","kika24@hotmail.com","123456789","","");

INSERT INTO Editorial VALUES(0,"Alianza Editorial");
INSERT INTO Editorial VALUES(0,"Editorial Planeta");
INSERT INTO Editorial VALUES(0,"Cátedra");
INSERT INTO Editorial VALUES(0,"Mondadori");
INSERT INTO Editorial VALUES(0,"Ediciones Siruela");
INSERT INTO Editorial VALUES(0,"Blackie Books");
INSERT INTO Editorial VALUES(0,"Impedimenta");
INSERT INTO Editorial VALUES(0,"Malpaso");
INSERT INTO Editorial VALUES(0,"Nordica");
INSERT INTO Editorial VALUES(0,"Austral");

INSERT INTO Autor VALUES(1,"Lesley-Ann","Jones");
INSERT INTO Autor VALUES(2,"Woody","Allen");
INSERT INTO Autor VALUES(3,"Amin","Maalouf");
INSERT INTO Autor VALUES(4,"Marcos","Chicot");
INSERT INTO Autor VALUES(5,"Dan","Brown");
INSERT INTO Autor VALUES(6,"Stella","Gibbons");
INSERT INTO Autor VALUES(7,"Thomas","Coraghessan Boyle");
INSERT INTO Autor VALUES(8,"Oscar","Wilde");
INSERT INTO Autor VALUES(9,"Pablo","Neruda");
INSERT INTO Autor VALUES(10,"Franz","Kafka");
INSERT INTO Autor VALUES(11,"William"," Shakespeare");

INSERT INTO Libro VALUES(0,"Hero: David Bowie","9788491047889","Biografía: arte y espectáculo","","",552,"",0,"giorocor",1,1);
INSERT INTO Libro VALUES(0,"A propósito de nada","9788491819950","Autobiografía, Biografía","","",440,"",0,"jazamo",1,2);
INSERT INTO Libro VALUES(0,"Nuestros inesperados hermanos","9788413621210","Ficción de aventuras","","",296,"",0,"orlares",1,3);
INSERT INTO Libro VALUES(0,"El asesinato de Platón","9788408236702","Novela contemporánea | General Novela histórica | Antigua Grecia","","",944,"",0,"valarias",2,4);
INSERT INTO Libro VALUES(0,"El código Da Vinci","9789584240323","Novela contemporánea | General Novela","","",624,"",0,"valarias",2,5);
INSERT INTO Libro VALUES(0,"La hija de Robert Poste","9788493760137","Novela, Ciencia ficción,","","",368,"",0,"andregar",7,6);
INSERT INTO Libro VALUES(0,"Los Terranautas","9788417553722","Ciencia ficción","","",568,"",0,"andregar",7,7);
INSERT INTO Libro VALUES(0,"Cuentos de Oscar Wilde","9788408239420","Novela literaria | Relatos","","",160,"",0,"homersi",10,8);
INSERT INTO Libro VALUES(0,"Cien sonetos de amor","9788432237812","Poesía | General poesía","","",144,"",0,"kasan",10,9);
INSERT INTO Libro VALUES(0,"La metamorfosis","9788467043648","Novela literaria | Narrativa literaria clásicos","","",128,"",0,"epe",10,10);
INSERT INTO Libro VALUES(0,"Otelo","9788467058772","Teatro","","",160,"",0,"giorocor",10,11);

INSERT INTO Prestamo VALUES(0,"Buen libro",'2021-03-20','2021-02-21',"valarias",1);
INSERT INTO Prestamo VALUES(0,"Excelente",'2021-03-20','2021-02-22',"lumar",2);
INSERT INTO Prestamo VALUES(0,"Muy aburrido",'2021-03-21','2021-02-23',"andregar",3);

INSERT INTO Mensajes VALUES(0,"homersi","lumar");
INSERT INTO Mensajes VALUES(0,"kasan","andregar");
INSERT INTO Mensajes VALUES(0,"epe","lulo");
