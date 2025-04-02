insert into Ninja(Nombre,Rango,Aldea)values
("camilo","alto","villaConcha"),
("yefi","alto","villaDragon"),
("pablo","medio","villaEsmeralda"),
("sofi","alto","villaArcoiris"),
("carlos","bajo","villaDeseos");

insert into Mision(Descripcion,Rango,Recompensa)values
("combatir a los tigres de villa caiman","alto",100),
("encontrar el reino samurai perdido","alto",100),
("cambatir con los lobos perdidos del oeste","medio",70),
("combatir por el territorio de la llama","alto",100),
("buscar nuevas tribus","bajo",40);

insert into MisionNinja(Id_Ninja,Id_Mision,FechaInicio,FechaFin)values
(1,1,"2025-02-01",null),
(2,2,"2025-01-15","2025-01-16"),
(3,1,"2025-02-01",null),
(2,1,"2025-02-01","2025-02-11"),
(4,1,"2025-02-01",null);

insert into Habilidad(Id_Ninja,Nombre,Descripcion)values
(1,"Velocidad y camuflaje","Les permite atacar a su opnente rapidamente"),
(2,"Astucia y fuerza","Su astucia y fuerza le permiten combatir a muchos opnenetes al tiempo"),
(3,"Fuerza","Es bueno en combate frente a frente"),
(4,"Astucia y compañerismo"," buena lider "),
(5,"Velocidad"," bueno en contra Ataques ");