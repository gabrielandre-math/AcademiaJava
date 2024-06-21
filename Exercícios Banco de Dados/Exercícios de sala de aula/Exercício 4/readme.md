# Exercício 4
~~~sql
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
**Descrição**: Baseando-se no código acima, faça:.
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/75d6802a-1e3f-4fd5-8172-904007cac5d8)

## Solução
### 1 - Relacione as entidades e seus respectivos atributos para este banco de dados
### 2 - Crie o modelo conceitual desse banco de dados
### 3 - Crie o modelo lógico desse banco de dados
### 4 - Crie o comando SQL para a criação do banco de dados DINOSSAUROS
~~~sql
~~~
### 5 - Crie o comando SQL para a criação das tabelas solicitadas
~~~sql
~~~
### 6 - Crie o comando SQL para a inserção de pelo menos 3 registros acima, em todas as tabelas necessárias
~~~sql
~~~
### 7 - Crie uma consulta para relacionar todos os dados disponíveis de todos os dinossauros existentes no catálogo em ordem alfabética de nome
~~~sql
~~~
### 8 - Crie uma consulta para relacionar todos os dados disponíveis de todos os dinossauros existentes em ordem alfabética de Descobridor
~~~sql
~~~
### 9 - Crie uma consulta para relacionar todos os dados disponíveis dos dinossauros do grupo anquilossauros em ordem de ano de descoberta
~~~sql
~~~
### 10 - Crie uma consulta para relacionar todos os dados disponíveis dos dinossauros Ceratopsídeos ou anquilossauros com ano de descoberta entre 1900 e 1999.
~~~sql
~~~
Criado por _Gabriel André._
