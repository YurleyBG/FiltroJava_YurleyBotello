
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
     foreign key (Id_Ninja) references Ninja(Id),
     foreign key (Id_Mision) references Mision(Id),
     FechaInicio date ,
     FechaFin date 
);
create table Habilidad(
	 Id int auto_increment primary key,
	 Id_Ninja int ,
     foreign key (Id_Ninja) references Ninja(Id),
     Nombre  varchar(80),
     Descripcion varchar(100)
);




