# Exercício 3

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/0e04a96f-7d3d-4294-8ebf-a9830e91bf05)

**Descrição**: Baseando-se na imagem acima, crie o código em SQL.

## Solução
## Código
~~~sql
create table Descobridor (
  id serial primary key,
  nome varchar(255) not null,
  pais varchar(100)
);
create table Grupo (
    id serial primary key,
    nome varchar(255) not null
);
create table PeriodoExistencia (
    id serial primary key,
    inicio date not null,
    fim date not null
);
create table Era (
    id serial primary key,
    nome varchar(255) not null,
    fk_existencia integer,
    foreign key(fk_existencia) references PeriodoExistencia(id)
);
create table Dinossauro (
    id serial primary key,
    nome varchar(255) not null,
    peso_toneladas float,
    anoDescoberta date,
    fk_grupo integer,
    fk_era integer,
    fk_descobridor integer,
    foreign key(fk_grupo) references Grupo(id),
    foreign key(fk_era) references era(id),
    foreign key(fk_descobridor) references Descobridor(id)
);
~~~
## Código que o professor fez
~~~sql
create table regioes
(
	id serial primary key,
	nome varchar(70) not null
)
 
create table grupos
(
	id serial primary key,
	nome varchar(30) not null
)
 
create table eras
(
	id serial primary key,
	nome varchar(30) not null
)
 
create table descobridores
(
	id serial primary key,
	nome varchar(80) not null
)
create table dinossauros
(
	id serial primary key,
	nome varchar(70) not null,
	toneladas integer not null,
	ano_descoberta integer not null,
	fk_grupo integer,
	fk_descobridor integer,
	fk_era integer,
	inicio integer,
	fim integer,
	fk_regiao integer,
	foreign key (fk_grupo) references grupos(id),
	foreign key (fk_descobridor) references descobridores(id),
	foreign key (fk_era) references eras(id),
	foreign key (fk_regiao) references regioes(id)
)
~~~
Criado por _Gabriel André._
