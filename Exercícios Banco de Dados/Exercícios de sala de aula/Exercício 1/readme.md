# Exercício 1
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/39816859-94f8-463e-8d4e-ee28bd17d738)
**Descrição**: Baseando-se na imagem acima, crie o código em SQL.

## Solução
## Código
~~~sql
create table TipoEvento (
    id serial primary key,
    tipo varchar(255) not null
);
create table Pessoa (
    cpf varchar(11) primary key,
    nome varchar(255) not null,
    email varchar(255) unique not null,
    fone varchar(15)
);
create table Evento (
    id serial primary key,
    nome varchar(255) not null,
    data_ini date,
    data_fim date,
    localizacao varchar(100) not null,
    fk_tipo integer,
    foreign key (fk_tipo) references TipoEvento(id)
);
create table Ingresso (
    id serial primary key,
    titulo varchar(20) not null,
    lugar varchar(20) not null,
    valor money not null,
    quantidade integer not null,
    fk_evento integer,
    foreign key(fk_evento) references Evento(id)
);
create table Compras (
    id serial primary key,
    fk_pessoa varchar(11),
    fk_ingresso integer,
    quantidade integer,
    foreign key (fk_ingresso) references Ingresso(id),
    foreign key (fk_pessoa) references Pessoa(cpf)
);
create table Programacao (
    id serial primary key,
    fk_evento integer,
    nome varchar(50) not null,
    descricao text,
    data_ini date,
    data_fim date,
    lugar varchar(30),
    responsavel varchar(50) not null,
    foreign key (fk_evento) references Evento(id)
);
~~~

Criado por _Gabriel André._
