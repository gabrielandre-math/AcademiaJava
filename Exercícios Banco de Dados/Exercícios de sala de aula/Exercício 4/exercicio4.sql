CREATE DATABASE DINOSSAUROS;
create table regioes
(
	id serial primary key,
	nome varchar(70) not null
);

create table grupos
(
	id serial primary key,
	nome varchar(30) not null
);
create table eras
(
	id serial primary key,
	nome varchar(30) not null
);

create table descobridores
(
	id serial primary key,
	nome varchar(80) not null
);
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
);
INSERT INTO eras (nome) VALUES
                            ('Inicial'),
                            ('Mediana'),
                            ('Final');
INSERT INTO regioes (nome) VALUES
    ('América do Norte'),
    ('Europa'),
    ('Ásia');
INSERT INTO grupos (nome) VALUES
    ('Terópodes'),
    ('Sauropodomorfos'),
    ('Ornitópodes');
INSERT INTO grupos (nome) VALUES
    ('Grande porte'),
    ('Médio porte'),
    ('Pequeno porte');
INSERT INTO descobridores (nome) VALUES
    ('John Smith'),
    ('Clayton'),
    ('Cristovão Assumpção');
INSERT INTO dinossauros (nome, toneladas, ano_descoberta, fk_grupo, fk_descobridor, fk_era, inicio, fim, fk_regiao) VALUES
    ('Tyrannosaurus rex', 8000, 1902, 1, 1, 2, 150, 65, 1),
    ('Stegosaurus', 2500, 1877, 2, 2, 1, 156, 144, 2),
    ('Velociraptor', 15, 1924, 1, 3, 3, 85, 70, 3);
INSERT INTO dinossauros (nome, toneladas, ano_descoberta, fk_grupo, fk_descobridor, fk_era, inicio, fim, fk_regiao) VALUES
    ('Tyrannosaurus rex', 8000, 1902, 1, 1, 2, 150, 65, 1),
    ('Stegosaurus', 2500, 1877, 2, 2, 1, 156, 144, 2),
    ('Velociraptor', 15, 1924, 1, 3, 3, 85, 70, 3);

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
select * from dinossauros;
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
