create table Ninja(
	 Id int auto_increment primary key,
	 Nombre Varchar(45),
	 Rango varchar(45),
	 Aldea varchar(50)
);
create table Mision(
	 Id int auto_increment primary key,
	 Descripcion Varchar(100),
	 Rango varchar(45),
	 Recompensa int 
);
create table MisionNinja(
	 Id int auto_increment primary key,
	 Id_Ninja int ,
     Id_Mision int ,
     foreign key (Id_Ninja) references Ninja(id),
     foreign key (Id_Mision) references Mision(id),
     FechaInicio date ,
     FechaFin date 
);
create table Habilidad(
	 Id int auto_increment primary key,
	 Id_Ninja int ,
     foreign key (Id_Ninja) references Ninja(id),
     Nombre  varchar(80),
     Descripcion varchar(100)
);

