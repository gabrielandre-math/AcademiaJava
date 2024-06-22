-- Criação do Banco de Dados LocacaoFilme
create database locacaofilme;

-- Tabela Endereco
CREATE TABLE Endereco (
  logradouro  VARCHAR(40),
  tipo_log    VARCHAR(40),
  complemento VARCHAR(40),
  cidade      VARCHAR(40),
  uf          CHAR(1),
  cep         CHAR(8),
  numero      VARCHAR(10),
  bairro      VARCHAR(60),
  cod_end     SERIAL PRIMARY KEY NOT NULL
);
-- Tabela Profissao
CREATE TABLE Profissao (
    nome     VARCHAR(60),
    cod_prof SERIAL PRIMARY KEY NOT NULL
);
-- Tabela Categoria
CREATE TABLE Categoria (
    nome     VARCHAR(60),
    valor    NUMERIC(15,2),
    cod_cat  SERIAL PRIMARY KEY NOT NULL
);
-- Tabela Genero
CREATE TABLE Genero (
    nome     VARCHAR(60),
    cod_gen  SERIAL PRIMARY KEY NOT NULL
);
-- Tabela Ator
CREATE TABLE Ator (
    nome     VARCHAR(60),
    cod_ator SERIAL PRIMARY KEY NOT NULL
);
-- Tabela Filmes
CREATE TABLE Filme (
    titulo_original     VARCHAR(100),
    titulo              VARCHAR(100),
    quantidade          INTEGER,
    cod_filme           SERIAL PRIMARY KEY NOT NULL,
    fk_cod_cat          INTEGER NOT NULL,
    fk_cod_gen          INTEGER NOT NULL,
    FOREIGN KEY (fk_cod_cat) REFERENCES Categoria(cod_cat),
    FOREIGN KEY (fk_cod_gen) REFERENCES Genero(cod_gen)
);
-- Tabela Filme_Ator
CREATE TABLE FilmeAtor (
    ator           CHAR(1),
    diretor        CHAR(1),
    fk_cod_ator    INTEGER NOT NULL,
    fk_cod_filme   INTEGER NOT NULL,
    FOREIGN KEY (fk_cod_ator)  REFERENCES Ator(cod_ator),
    FOREIGN KEY (fk_cod_filme) REFERENCES Filme(cod_filme)
);
-- Tabela Cliente
CREATE TABLE Cliente (
    cpf         CHAR(11),
    nome        VARCHAR(60),
    telefone    VARCHAR(10),
    cod_cli     SERIAL PRIMARY KEY NOT NULL,
    fk_cod_prof    INTEGER,
    FOREIGN KEY (fk_cod_prof) REFERENCES Profissao(cod_prof)
);
-- Tabela Dependente
CREATE TABLE Dependente (
    parentesco         VARCHAR(20),
    fk_cod_cli         INTEGER NOT NULL,
    fk_cod_dep         INTEGER NOT NULL,
    PRIMARY KEY (fk_cod_cli, fk_cod_dep),
    FOREIGN KEY (fk_cod_cli) REFERENCES Cliente (cod_cli),
    FOREIGN KEY (fk_cod_dep) REFERENCES Cliente (cod_cli)
);
-- Tabela CliEndereco
CREATE TABLE ClieEndereco (
    fk_cod_end  INTEGER NOT NULL,
    fk_cod_cli  INTEGER NOT NULL,
    FOREIGN KEY (fk_cod_end) REFERENCES Endereco(cod_end),
    FOREIGN KEY (fk_cod_cli) REFERENCES Cliente(cod_cli)
);
-- Tabela Locacao
CREATE TABLE Locacao (
    data_loc    DATE,
    desconto    NUMERIC(15,2),
    multa       NUMERIC(15,2),
    sub_total   NUMERIC(15,2),
    cod_loc     SERIAL PRIMARY KEY NOT NULL,
    fk_cod_cli  INTEGER NOT NULL,
    FOREIGN KEY (fk_cod_cli) REFERENCES Cliente(cod_cli)
);
-- Tabela LocacaoFilme
CREATE TABLE locacaofilme (
    valor       NUMERIC(15,2),
    num_dias    INTEGER,
    data_devol  DATE,
    fk_cod_loc  INTEGER NOT NULL,
    fk_cod_film INTEGER NOT NULL,
    FOREIGN KEY (fk_cod_loc)  REFERENCES Locacao(cod_loc),
    FOREIGN KEY (fk_cod_film) REFERENCES Filme(cod_filme)
);
