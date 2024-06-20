# Exercício 2
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/01cd6795-3f69-4007-9309-41442cf90507)


**Descrição**: Baseando-se na imagem acima, crie o código em SQL.

## Solução
## Código
~~~sql
create table Editora (
    id serial primary key,
    nome varchar(255) not null
);
create table Categoria (
    id serial primary key,
    tipo_categoria varchar(50)
);
create table Autor (
    id serial primary key,
    nome varchar(255) not null,
    nacionalidade varchar(50)
);
create table Livro (
    isbn varchar(22) primary key,
    titulo varchar(50) not null,
    ano_publicacao date,
    fk_editora integer,
    fk_categoria integer,
    foreign key (fk_editora) references Editora(id),
    foreign key (fk_categoria) references Categoria(id)
);
create table livroAutor (
    id serial primary key,
    fk_livro varchar(22),
    fk_autor integer,
    foreign key (fk_livro) references Livro(isbn),
    foreign key (fk_autor) references Autor(id)
);
~~~

Criado por _Gabriel André._
