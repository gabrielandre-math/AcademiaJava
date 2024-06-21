# Exercício 4
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
**Descrição**: Baseando-se no código acima, faça:.
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/75d6802a-1e3f-4fd5-8172-904007cac5d8)

## Solução
### 1 - Relacione as entidades e seus respectivos atributos para este banco de dados
Foi respondido apenas informando o código SQL do exercício, haja vista que o professor pediu para utilizar o banco criado por ele, para que todos pudessem ter a mesma experiência de inserção e modelagem no exercício.
### 2 - Crie o modelo conceitual desse banco de dados
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/6e713c4d-73ca-4c48-8e9e-494f898d6df5)
Utilizei os relacionamentos desta forma, pois considerei apenas a cardinalidade máxima e como o software (brModelo) não permitia representar apenas a máxima, tive que deixar por padrão (0,n) ou (0,1).
- **Relacionamento Dinossauro com Grupo**: Vários dinossauros podem pertencer a um grupo.
- **Relacionamento Dinossauro com Região**: Vários dinossauros podem morar em uma região.
- **Relacionamento Dinossauro com Era**: Vários dinossauros podem ter existido em uma era.
- **Relacionamento Dinossauro com Descobridor**: Vários dinossauros podem ter sido descobertos por um descobridor.
### 3 - Crie o modelo lógico desse banco de dados
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/a6169a30-6ab8-433e-b103-d6c8622eb346)

### 4 - Crie o comando SQL para a criação do banco de dados DINOSSAUROS
~~~sql
CREATE DATABASE DINOSSAUROS;
~~~
### 5 - Crie o comando SQL para a criação das tabelas solicitadas
O professor já forneceu o banco de dados a ser utilizado.
### 6 - Crie o comando SQL para a inserção de pelo menos 3 registros acima, em todas as tabelas necessárias
~~~sql
INSERT INTO regioes (nome) VALUES
    ('América do Norte'),
    ('Europa'),
    ('Ásia');
INSERT INTO grupos (nome) VALUES
    ('Terópodes'),
    ('Sauropodomorfos'),
    ('Ornitópodes'),
    ('Anquilossauros'),
    ('Ceratopsídeos');
INSERT INTO grupos (nome) VALUES
    ('Grande porte'),
    ('Médio porte'),
    ('Pequeno porte');
INSERT INTO descobridores (nome) VALUES
    ('John Smith'),
    ('Clayton'),
    ('Cristovão Assumpção');
~~~
### 7 - Crie uma consulta para relacionar todos os dados disponíveis de todos os dinossauros existentes no catálogo em ordem alfabética de nome
~~~sql
SELECT
    d.nome AS nome_dinossauro,
    d.toneladas,
    d.ano_descoberta,
    g.nome AS nome_grupo,
    e.nome AS nome_era,
    de.nome AS nome_descobridor,
    d.inicio,
    d.fim,
    r.nome AS nome_regiao
FROM
    dinossauros d
    LEFT JOIN grupos g ON d.fk_grupo = g.id
    LEFT JOIN eras e ON d.fk_era = e.id
    LEFT JOIN descobridores de ON d.fk_descobridor = de.id
    LEFT JOIN regioes r ON d.fk_regiao = r.id
ORDER BY
    nome_dinossauro ASC;
~~~
### 8 - Crie uma consulta para relacionar todos os dados disponíveis de todos os dinossauros existentes em ordem alfabética de Descobridor
~~~sql
SELECT
    d.nome AS nome_dinossauro,
    d.toneladas,
    d.ano_descoberta,
    g.nome AS nome_grupo,
    e.nome AS nome_era,
    de.nome AS nome_descobridor,
    d.inicio,
    d.fim,
    r.nome AS nome_regiao
FROM
    dinossauros d
    LEFT JOIN grupos g ON d.fk_grupo = g.id
    LEFT JOIN eras e ON d.fk_era = e.id
    LEFT JOIN descobridores de ON d.fk_descobridor = de.id
    LEFT JOIN regioes r ON d.fk_regiao = r.id
ORDER BY
    nome_descobridor ASC, nome_dinossauro ASC;
~~~
### 9 - Crie uma consulta para relacionar todos os dados disponíveis dos dinossauros do grupo anquilossauros em ordem de ano de descoberta
~~~sql
SELECT 
    d.nome AS nome_dinossauro,
    d.toneladas,
    d.ano_descoberta,
    g.nome AS nome_grupo,
    e.nome AS nome_era,
    de.nome AS nome_descobridor,
    d.inicio,
    d.fim,
    r.nome AS nome_regiao
FROM 
    dinossauros d
    JOIN grupos g ON d.fk_grupo = g.id
    LEFT JOIN eras e ON d.fk_era = e.id
    LEFT JOIN descobridores de ON d.fk_descobridor = de.id
    LEFT JOIN regioes r ON d.fk_regiao = r.id
WHERE 
    g.nome = 'Anquilossauros'
ORDER BY 
    d.ano_descoberta ASC;
~~~
### 10 - Crie uma consulta para relacionar todos os dados disponíveis dos dinossauros Ceratopsídeos ou anquilossauros com ano de descoberta entre 1900 e 1999.
~~~sql
SELECT 
    d.nome AS nome_dinossauro,
    d.toneladas,
    d.ano_descoberta,
    g.nome AS nome_grupo,
    e.nome AS nome_era,
    de.nome AS nome_descobridor,
    d.inicio,
    d.fim,
    r.nome AS nome_regiao
FROM 
    dinossauros d
    JOIN grupos g ON d.fk_grupo = g.id
    LEFT JOIN eras e ON d.fk_era = e.id
    LEFT JOIN descobridores de ON d.fk_descobridor = de.id
    LEFT JOIN regioes r ON d.fk_regiao = r.id
WHERE 
    (g.nome = 'Ceratopsídeos' OR g.nome = 'Anquilossauros')
    AND d.ano_descoberta BETWEEN 1900 AND 1999
ORDER BY 
    d.ano_descoberta ASC;
~~~
Criado por _Gabriel André._
