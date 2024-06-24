-- Populando a tabela (Endereco)
INSERT INTO Endereco (logradouro, tipo_log, complemento, cidade, uf, cep, numero, bairro) VALUES
('Rua das Acácias', 'Rua', 'Apto 101', 'Rio de Janeiro', 'RJ', '20000000', '123', 'Copacabana'),
('Avenida Brasil', 'Avenida', 'Bloco B', 'São Paulo', 'SP', '01000000', '456', 'Centro'),
('Praça da Liberdade', 'Praça', 'Sala 2', 'Belo Horizonte', 'MG', '30140010', '789', 'Savassi'),
('Travessa dos Pioneiros', 'Travessa', 'Casa 3', 'Curitiba', 'PR', '80000000', '321', 'Centro'),
('Alameda Santos', 'Alameda', 'Conjunto 4', 'São Paulo', 'SP', '01418200', '654', 'Jardins'),
('Estrada do Coco', 'Estrada', 'Galpão 5', 'Salvador', 'BA', '40100000', '987', 'Stella Maris'),
('Rodovia dos Bandeirantes', 'Rodovia', 'Km 72', 'Campinas', 'SP', '13000000', '258', 'Jardim Londres'),
('Vila Nova Conceição', 'Vila', 'Casa 8', 'São Paulo', 'SP', '04547002', '369', 'Vila Nova Conceição'),
('Parque dos Patins', 'Parque', 'Quadra 10', 'Rio de Janeiro', 'RJ', '22470050', '147', 'Lagoa'),
('Largo do Machado', 'Largo', 'Prédio 2', 'Rio de Janeiro', 'RJ', '22221020', '258', 'Laranjeiras');
-- Populando a tabela (Profissao)
INSERT INTO Profissao (nome) VALUES ('Engenheiro Civil');
INSERT INTO Profissao (nome) VALUES ('Médico');
INSERT INTO Profissao (nome) VALUES ('Advogado');
INSERT INTO Profissao (nome) VALUES ('Professor');
INSERT INTO Profissao (nome) VALUES ('Arquiteto');
INSERT INTO Profissao (nome) VALUES ('Desenvolvedor de Software');
INSERT INTO Profissao (nome) VALUES ('Designer Gráfico');
INSERT INTO Profissao (nome) VALUES ('Enfermeiro');
INSERT INTO Profissao (nome) VALUES ('Psicólogo');
INSERT INTO Profissao (nome) VALUES ('Contador');
-- Populando a tabela (Categoria)
INSERT INTO Categoria (nome, valor) VALUES ('Ação', 3.99);
INSERT INTO Categoria (nome, valor) VALUES ('Comédia', 2.99);
INSERT INTO Categoria (nome, valor) VALUES ('Drama', 3.49);
INSERT INTO Categoria (nome, valor) VALUES ('Terror', 4.49);
INSERT INTO Categoria (nome, valor) VALUES ('Ficção Científica', 3.99);
INSERT INTO Categoria (nome, valor) VALUES ('Animação', 2.99);
INSERT INTO Categoria (nome, valor) VALUES ('Romance', 3.49);
INSERT INTO Categoria (nome, valor) VALUES ('Documentário', 4.99);
INSERT INTO Categoria (nome, valor) VALUES ('Suspense', 3.99);
INSERT INTO Categoria (nome, valor) VALUES ('Fantasia', 3.49);
INSERT INTO Genero (nome) VALUES
    ('Drama'),
    ('Romance'),
    ('Terror'),
    ('Suspense');
-- Populando a tabela (Genero)
INSERT INTO Genero (nome) VALUES ('Ação');
INSERT INTO Genero (nome) VALUES ('Comédia');
INSERT INTO Genero (nome) VALUES ('Drama');
INSERT INTO Genero (nome) VALUES ('Terror');
INSERT INTO Genero (nome) VALUES ('Ficção Científica');
INSERT INTO Genero (nome) VALUES ('Animação');
INSERT INTO Genero (nome) VALUES ('Romance');
INSERT INTO Genero (nome) VALUES ('Documentário');
INSERT INTO Genero (nome) VALUES ('Suspense');
INSERT INTO Genero (nome) VALUES ('Fantasia');
INSERT INTO Genero (nome) VALUES
    ('Drama'),
    ('Romance'),
    ('Terror'),
    ('Suspense');

-- Populando a tabela (Ator)
INSERT INTO Ator (nome) VALUES ('Robert Downey Jr.');
INSERT INTO Ator (nome) VALUES ('Scarlett Johansson');
INSERT INTO Ator (nome) VALUES ('Leonardo DiCaprio');
INSERT INTO Ator (nome) VALUES ('Meryl Streep');
INSERT INTO Ator (nome) VALUES ('Tom Hanks');
INSERT INTO Ator (nome) VALUES ('Jennifer Lawrence');
INSERT INTO Ator (nome) VALUES ('Denzel Washington');
INSERT INTO Ator (nome) VALUES ('Emma Stone');
INSERT INTO Ator (nome) VALUES ('Brad Pitt');
INSERT INTO Ator (nome) VALUES ('Natalie Portman');


-- Populando a tabela (Filme)
INSERT INTO Filme (titulo_original, titulo, quantidade, fk_cod_cat, fk_cod_gen) VALUES
('Inception', 'A Origem', 5, 1, 5),
('The Dark Knight', 'O Cavaleiro das Trevas', 7, 1, 1),
('Forrest Gump', 'Forrest Gump - O Contador de Histórias', 3, 3, 3),
('The Conjuring', 'Invocação do Mal', 4, 4, 4),
('Avengers: Endgame', 'Vingadores: Ultimato', 8, 1, 1),
('Finding Nemo', 'Procurando Nemo', 6, 2, 6),
('The Notebook', 'Diário de uma Paixão', 5, 7, 7),
('The Social Dilemma', 'O Dilema das Redes', 2, 8, 8),
('The Sixth Sense', 'O Sexto Sentido', 4, 9, 9),
('The Lord of the Rings: The Fellowship of the Ring', 'O Senhor dos Anéis: A Sociedade do Anel', 7, 10, 10),
('The Dark Knight', 'O Cavaleiro das Trevas', 5, 1, 1);

INSERT INTO Filme (titulo_original, titulo, quantidade, fk_cod_cat, fk_cod_gen) VALUES
('The Shawshank Redemption', 'Um Sonho de Liberdade', 100, 1, 1),
('The Godfather', 'O Poderoso Chefão', 80, 1, 1),
('Pulp Fiction', 'Tempo de Violência', 90, 3, 3),
('Forrest Gump', 'Forrest Gump - O Contador de Histórias', 110, 1, 1),
('Titanic', 'Titanic', 95, 4, 4),
('Gladiator', 'Gladiador', 88, 5, 5);
-- Inserção de Filmes
INSERT INTO Filme (titulo_original, titulo, quantidade, fk_cod_cat, fk_cod_gen)
VALUES
    ('The Matrix', 'Matrix', 10, 4, 1),
    ('Jurassic Park', 'Parque dos Dinossauros', 15, 1, 5),
    ('Die Hard', 'Duro de Matar', 20, 1, 2),
    ('Titanic', 'Titanic', 25, 5, 3),
    ('Friends with Benefits', 'Amizade Colorida', 30, 2, 4),
    ('Inception', 'A Origem', 35, 4, 2),
    ('The Notebook', 'Diário de uma Paixão', 40, 5, 3),
    ('The Dark Knight', 'O Cavaleiro das Trevas', 45, 1, 2),
    ('Harry Potter and the Philosopher''s Stone', 'Harry Potter e a Pedra Filosofal', 50, 4, 5),
    ('Avengers: Endgame', 'Vingadores: Ultimato', 55, 1, 1),
    ('Toy Story', 'Toy Story', 60, 2, 4);
INSERT INTO Filme (titulo_original, titulo, quantidade, fk_cod_cat, fk_cod_gen)
VALUES
    ('Matrix', 'Matrix', 10, 4, 1),
    ('Parque dos Dinossauros', 'Parque dos Dinossauros', 15, 1, 5),
    ('Duro de Matar', 'Duro de Matar', 20, 1, 2),
    ('Titanic', 'Titanic', 25, 5, 3),
    ('Amizade Colorida', 'Amizade Colorida', 30, 2, 4),
    ('A Origem', 'A Origem', 35, 4, 2),
    ('Diário de uma Paixão', 'Diário de uma Paixão', 40, 5, 3),
    ('O Cavaleiro das Trevas', 'O Cavaleiro das Trevas', 45, 1, 2),
    ('Harry Potter e a Pedra Filosofal', 'Harry Potter e a Pedra Filosofal', 50, 4, 5),
    ('Vingadores: Ultimato', 'Vingadores: Ultimato', 55, 1, 1),
    ('Toy Story', 'Toy Story', 60, 2, 4);
INSERT INTO Filme (titulo_original, titulo, quantidade, fk_cod_cat, fk_cod_gen) VALUES
    ('Inception', 'A Origem', 5, 1, 5),
    ('The Dark Knight', 'O Cavaleiro das Trevas', 7, 1, 1),
    ('Forrest Gump', 'Forrest Gump - O Contador de Histórias', 3, 3, 3),
    ('The Conjuring', 'Invocação do Mal', 4, 4, 4),
    ('Avengers: Endgame', 'Vingadores: Ultimato', 8, 1, 1),
    ('Finding Nemo', 'Procurando Nemo', 6, 2, 6),
    ('The Notebook', 'Diário de uma Paixão', 5, 7, 7),
    ('The Social Dilemma', 'O Dilema das Redes', 2, 8, 8),
    ('The Sixth Sense', 'O Sexto Sentido', 4, 9, 9),
    ('The Lord of the Rings: The Fellowship of the Ring', 'O Senhor dos Anéis: A Sociedade do Anel', 7, 10, 10),
    ('The Shawshank Redemption', 'Um Sonho de Liberdade', 100, 1, 1),
    ('The Godfather', 'O Poderoso Chefão', 80, 1, 1),
    ('Pulp Fiction', 'Tempo de Violência', 90, 3, 3),
    ('Titanic', 'Titanic', 95, 4, 4),
    ('Gladiator', 'Gladiador', 88, 5, 5),
    ('The Matrix', 'Matrix', 10, 4, 1),
    ('Jurassic Park', 'Parque dos Dinossauros', 15, 1, 5),
    ('Die Hard', 'Duro de Matar', 20, 1, 2),
    ('Toy Story', 'Toy Story', 60, 2, 4),
    ('The Hangover', 'Se Beber, Não Case', 45, 2, 3);

INSERT INTO Filme (titulo_original, titulo, quantidade, fk_cod_cat, fk_cod_gen)
VALUES
    ('Die Hard', 'Duro de Matar', 50, 1, 1),
    ('The Shawshank Redemption', 'Um Sonho de Liberdade', 70, 3, 2),
    ('Inception', 'A Origem', 60, 4, 1),
    ('Toy Story', 'Toy Story', 55, 1, 4),
    ('The Hangover', 'Se Beber, Não Case', 45, 2, 3);
INSERT INTO Filme (titulo_original, titulo, quantidade, fk_cod_cat, fk_cod_gen) VALUES
    ('The Matrix', 'Matrix', 10, 1, 1),
    ('Jurassic Park', 'Parque dos Dinossauros', 15, 2, 2),
    ('Die Hard', 'Duro de Matar', 20, 1, 3),
    ('Titanic', 'Titanic', 25, 2, 4),
    ('Friends with Benefits', 'Amizade Colorida', 30, 3, 5),
    ('Inception', 'A Origem', 35, 1, 6),
    ('The Notebook', 'Diário de uma Paixão', 40, 2, 7),
    ('The Dark Knight', 'O Cavaleiro das Trevas', 45, 1, 8),
    ('Harry Potter and the Philosopher''s Stone', 'Harry Potter e a Pedra Filosofal', 50, 2, 9),
    ('Avengers: Endgame', 'Vingadores: Ultimato', 55, 1, 1),
    ('Toy Story', 'Toy Story', 60, 2, 2),
    ('The Shawshank Redemption', 'Um Sonho de Liberdade', 70, 3, 3),
    ('The Godfather', 'O Poderoso Chefão', 80, 1, 4),
    ('Pulp Fiction', 'Tempo de Violência', 90, 2, 5),
    ('Forrest Gump', 'Forrest Gump - O Contador de Histórias', 100, 1, 6),
    ('Gladiator', 'Gladiador', 88, 3, 7);

-- Populando a tabela (FilmeAtor)
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('S', 'N', 1, 1);
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('S', 'N', 2, 2);
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('S', 'N', 3, 3);
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('S', 'N', 4, 4);
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('S', 'N', 5, 5);
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('S', 'N', 6, 6);
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('S', 'N', 7, 7);
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('S', 'N', 8, 8);
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('S', 'N', 9, 9);
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('S', 'N', 10, 10);
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('A', 'N', 3, 1);
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('A', 'N', 4, 1);
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('A', 'N', 5, 1);
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('A', 'N', 6, 1);
INSERT INTO FilmeAtor (ator, diretor, fk_cod_ator, fk_cod_filme) VALUES ('A', 'N', 7, 1);

-- Relacionando atores aos filmes
INSERT INTO FilmeAtor (fk_cod_filme, fk_cod_ator) VALUES
    (1, 3),
    (1, 6),
    (2, 3),
    (2, 9),
    (3, 5),
    (3, 10),
    (4, 7),
    (4, 10),
    (5, 1),
    (5, 6),
    (6, 1),
    (6, 10),
    (7, 2),
    (7, 8),
    (8, 3),
    (8, 4),
    (9, 6),
    (9, 7),
    (10, 1),
    (10, 2),
    (11, 2),
    (11, 8),
    (12, 3),
    (12, 4),
    (13, 4),
    (13, 7),
    (14, 4),
    (14, 6),
    (15, 5),
    (15, 9),
    (16, 4),
    (16, 9),
    (17, 1),
    (17, 5),
    (18, 1),
    (18, 5),
    (19, 2),
    (19, 8),
    (20, 3);

-- Populando a tabela (Cliente)
-- Inserts originais com nomes alterados de forma randomica
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('12345678900', 'Eduardo Alves', '999999999', 1);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('98765432100', 'Isabela Oliveira', '888888888', 2);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('11122233344', 'Felipe Pereira', '777777777', 3);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('55544433322', 'Beatriz Silva', '666666666', 4);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('99988877766', 'Ricardo Santos', '555555555', 5);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('33322211100', 'Carolina Costa', '444444444', 6);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('77766655588', 'Luiza Almeida', '333333333', 7);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('44455566699', 'Guilherme Oliveira', '222222222', 8);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('88899900011', 'Patrícia Lima', '111111111', 9);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('22233344455', 'Thiago Pereira', '000000000', 10);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('11122233366', 'Gabriela Souza', '333333333', 1);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('55544433377', 'Bruno Costa', '444444444', 2);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('99988877788', 'Júlio Santos', '555555555', 3);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('33322211199', 'Vanessa Almeida', '666666666', 4);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('77766655500', 'Renato Lima', '777777777', 5);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('44455566611', 'Carla Oliveira', '888888888', 6);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('88899900022', 'Márcio Silva', '999999999', 7);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('22233344466', 'Patricia Costa', '000000000', 8);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('66677788800', 'Diego Costa', '111111111', 9);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('12345678999', 'Ana Santos', '222222222', 10);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('12345678900', 'Eduardo Alves', '999999999', 1), ('98765432100', 'Isabela Oliveira', '888888888', 2), ('11122233344', 'Felipe Pereira', '777777777', 3);
-- Clientes com multas
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('11122233399', 'Rafaela Oliveira', '333333333', 1), ('99988877711', 'Pedro Costa', '555555555', 2), ('55544433388', 'Carolina Lima', '777777777', 3);

-- Populando a tabela (Dependente)
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Filho', 1, 2);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Filho', 1, 3);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Filho', 2, 4);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Filho', 3, 5);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Filho', 3, 6);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Filho', 5, 7);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Filho', 6, 8);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Filho', 8, 9);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Filho', 8, 10);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Sobrinho', 1, 4);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Sobrinha', 1, 5);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Enteado', 2, 3);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Enteada', 3, 2);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Sobrinho', 4, 7);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Enteado', 6, 10);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Sobrinha', 7, 8);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Sobrinha', 9, 6);
INSERT INTO Dependente (parentesco, fk_cod_cli, fk_cod_dep) VALUES ('Enteado', 10, 5);
-- Populando a tabela (ClieEndereco)
INSERT INTO ClieEndereco (fk_cod_end, fk_cod_cli) VALUES (1, 1);
INSERT INTO ClieEndereco (fk_cod_end, fk_cod_cli) VALUES (2, 2);
INSERT INTO ClieEndereco (fk_cod_end, fk_cod_cli) VALUES (3, 3);
INSERT INTO ClieEndereco (fk_cod_end, fk_cod_cli) VALUES (4, 4);
INSERT INTO ClieEndereco (fk_cod_end, fk_cod_cli) VALUES (5, 5);
INSERT INTO ClieEndereco (fk_cod_end, fk_cod_cli) VALUES (6, 6);
INSERT INTO ClieEndereco (fk_cod_end, fk_cod_cli) VALUES (7, 7);
INSERT INTO ClieEndereco (fk_cod_end, fk_cod_cli) VALUES (8, 8);
INSERT INTO ClieEndereco (fk_cod_end, fk_cod_cli) VALUES (9, 9);
INSERT INTO ClieEndereco (fk_cod_end, fk_cod_cli) VALUES (10, 10);

-- Populando a tabela (Locacao)
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-01', 0, 0, 15.99, 1);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-02', 0, 0, 12.99, 2);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-03', 0, 0, 18.99, 3);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-04', 0, 0, 9.99, 4);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-05', 0, 0, 14.99, 5);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-06', 0, 0, 11.99, 6);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-07', 0, 0, 13.99, 7);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-08', 0, 0, 17.99, 8);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-09', 0, 0, 16.99, 9);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-10', 0, 0, 10.99, 10);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-14', 0, 0, 20.99, 11);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-15', 0, 0, 18.99, 12);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-16', 0, 0, 15.99, 13);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-17', 0, 0, 22.99, 14);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-18', 0, 0, 16.99, 15);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-19', 0, 0, 19.99, 16);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-20', 0, 0, 14.99, 17);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-21', 0, 0, 12.99, 18);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-22', 0, 0, 21.99, 19);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-23', 0, 0, 13.99, 20);
-- Locações com multas
INSERT INTO Locacao (fk_cod_cli, multa)
VALUES
    (1, 3.50),
    (2, 6.00),
    (4, 8.20),
    (11, 5.50),
    (12, 7.80),
    (14, 4.30);

-- Populando a tabela (Locacao)
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-01', 0, 0, 15.99, 1);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-02', 0, 0, 12.99, 2);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-03', 0, 0, 18.99, 3);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-04', 0, 0, 9.99, 4);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-05', 0, 0, 14.99, 5);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-06', 0, 0, 11.99, 6);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-07', 0, 0, 13.99, 7);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-08', 0, 0, 17.99, 8);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-09', 0, 0, 16.99, 9);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-10', 0, 0, 10.99, 10);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-14', 0, 0, 20.99, 11);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-15', 0, 0, 18.99, 12);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-16', 0, 0, 15.99, 13);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-17', 0, 0, 22.99, 14);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-18', 0, 0, 16.99, 15);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-19', 0, 0, 19.99, 16);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-20', 0, 0, 14.99, 17);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-21', 0, 0, 12.99, 18);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-22', 0, 0, 21.99, 19);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli) VALUES ('2024-06-23', 0, 0, 13.99, 20);
INSERT INTO Locacao (data_loc, desconto, multa, sub_total, fk_cod_cli)
VALUES
    ('2024-06-20', 2.00, 0.00, 12.00, 1),
    ('2024-06-21', 1.50, 1.00, 10.50, 2),
    ('2024-06-22', 0.00, 0.50, 7.50, 3);
-- Populando a tabela (locacaofilme)
-- Cliente 1
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (3.99, 14, '2024-06-01', 1, 1),
    (2.99, 7, '2024-06-20', 21, 3),
    (2.50, 3, '2024-06-20', 22, 5);

-- Cliente 2
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (4.99, 14, '2024-06-02', 2, 2),
    (3.50, 7, '2024-06-21', 23, 4),
    (3.00, 3, '2024-06-21', 24, 6);

-- Cliente 3
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (5.99, 14, '2024-06-03', 3, 3),
    (4.50, 7, '2024-06-22', 25, 5),
    (4.00, 3, '2024-06-22', 26, 7);

-- Cliente 4
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (3.99, 14, '2024-06-04', 4, 4),
    (2.50, 7, '2024-06-20', 27, 6),
    (2.00, 3, '2024-06-20', 28, 8);

-- Cliente 5
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (4.99, 14, '2024-06-05', 5, 5),
    (3.50, 7, '2024-06-21', 29, 7),
    (3.00, 3, '2024-06-21', 30, 9);

-- Cliente 6
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (3.99, 14, '2024-06-06', 6, 6),
    (2.50, 7, '2024-06-22', 31, 8),
    (2.00, 3, '2024-06-22', 32, 10);

-- Cliente 7
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (4.99, 14, '2024-06-07', 7, 7),
    (3.50, 7, '2024-06-20', 33, 9),
    (3.00, 3, '2024-06-20', 34, 11);

-- Cliente 8
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (5.99, 14, '2024-06-08', 8, 8),
    (4.50, 7, '2024-06-21', 35, 10),
    (4.00, 3, '2024-06-21', 36, 12);

-- Cliente 9
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (3.99, 14, '2024-06-09', 9, 9),
    (2.50, 7, '2024-06-22', 37, 11),
    (2.00, 3, '2024-06-22', 38, 13);

-- Cliente 10
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (4.99, 14, '2024-06-10', 10, 10),
    (3.50, 7, '2024-06-20', 39, 12),
    (3.00, 3, '2024-06-20', 40, 14);

-- Cliente 1 (novas locações)
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (3.00, 3, '2024-06-21', 41, 15),
    (2.50, 7, '2024-06-21', 42, 16),
    (2.00, 14, '2024-06-22', 43, 17);

-- Cliente 1 (clientes com multas)
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (4.00, 14, '2024-06-20', 44, 18),
    (3.50, 7, '2024-06-21', 45, 19),
    (3.00, 3, '2024-06-21', 46, 20);
-- Cliente 1
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (3.99, 14, '2024-06-01', 1, 1),
    (2.50, 7, '2024-06-20', 21, 3),
    (2.00, 3, '2024-06-20', 22, 5),
    (3.00, 3, '2024-06-21', 41, 15),
    (2.50, 7, '2024-06-21', 42, 16),
    (3.00, 14, '2024-06-22', 43, 17),
    (4.00, 14, '2024-06-20', 44, 18),
    (3.50, 7, '2024-06-21', 45, 19),
    (3.00, 3, '2024-06-21', 46, 20);

-- Cliente 2
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (4.99, 14, '2024-06-02', 2, 2),
    (3.50, 7, '2024-06-21', 23, 4),
    (3.00, 3, '2024-06-21', 24, 6);

-- Cliente 3
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (5.99, 14, '2024-06-03', 3, 3),
    (4.50, 7, '2024-06-22', 25, 5),
    (4.00, 3, '2024-06-22', 26, 7);

-- Cliente 4
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (3.99, 14, '2024-06-04', 4, 4),
    (2.50, 7, '2024-06-20', 27, 6),
    (2.00, 3, '2024-06-20', 28, 8);

-- Cliente 5
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (4.99, 14, '2024-06-05', 5, 5),
    (3.50, 7, '2024-06-21', 29, 7),
    (3.00, 3, '2024-06-21', 30, 9);

-- Cliente 6
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (3.99, 14, '2024-06-06', 6, 6),
    (2.50, 7, '2024-06-22', 31, 8),
    (2.00, 3, '2024-06-22', 32, 10);

-- Cliente 7
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (4.99, 14, '2024-06-07', 7, 7),
    (3.50, 7, '2024-06-20', 33, 9),
    (3.00, 3, '2024-06-20', 34, 11);

-- Cliente 8
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (5.99, 14, '2024-06-08', 8, 8),
    (4.50, 7, '2024-06-21', 35, 10),
    (4.00, 3, '2024-06-21', 36, 12);

-- Cliente 9
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (3.99, 14, '2024-06-09', 9, 9),
    (2.50, 7, '2024-06-22', 37, 11),
    (2.00, 3, '2024-06-22', 38, 13);

-- Cliente 10
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (4.99, 14, '2024-06-10', 10, 10),
    (3.50, 7, '2024-06-20', 39, 12),
    (3.00, 3, '2024-06-20', 40, 14);
-- Adicionais
INSERT INTO LocacaoFilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film)
VALUES
    (15.99, 14, NULL, 1, 1),
    (18.99, 14, NULL, 3, 3),
    (9.99, 14, NULL, 4, 4),
    (16.99, 14, NULL, 9, 9),
    (20.99, 14, NULL, 11, 11),
    (15.99, 14, NULL, 13, 13),
    (16.99, 14, NULL, 15, 15),
    (14.99, 14, NULL, 17, 17),
    (21.99, 14, NULL, 19, 19),
    (13.99, 14, NULL, 20, 20),
    (12.99, 14, NULL, 2, 2),
    (10.99, 14, NULL, 10, 10),
    (18.99, 14, NULL, 12, 12),
    (22.99, 14, NULL, 14, 14),
    (12.99, 14, NULL, 18, 18),
    (15.99, 14, NULL, 1, 1),
    (18.99, 14, NULL, 3, 3),
    (9.99, 14, NULL, 4, 4),
    (16.99, 14, NULL, 9, 9),
    (20.99, 14, NULL, 11, 11);
