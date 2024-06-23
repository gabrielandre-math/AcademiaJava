-- Populando a tabela (Endereco)
INSERT INTO Endereco (logradouro, tipo_log, complemento, cidade, uf, cep, numero) VALUES
('Rua das Acácias', 'Rua', 'Apto 101', 'Rio de Janeiro', 'RJ', '20000000', '123'),
('Avenida Brasil', 'Avenida', 'Bloco B', 'São Paulo', 'SP', '01000000', '456'),
('Praça da Liberdade', 'Praça', 'Sala 2', 'Belo Horizonte', 'MG', '30140010', '789'),
('Travessa dos Pioneiros', 'Travessa', 'Casa 3', 'Curitiba', 'PR', '80000000', '321'),
('Alameda Santos', 'Alameda', 'Conjunto 4', 'São Paulo', 'SP', '01418200', '654'),
('Estrada do Coco', 'Estrada', 'Galpão 5', 'Salvador', 'BA', '40100000', '987'),
('Rodovia dos Bandeirantes', 'Rodovia', 'Km 72', 'Campinas', 'SP', '13000000', '258'),
('Vila Nova Conceição', 'Vila', 'Casa 8', 'São Paulo', 'SP', '04547002', '369'),
('Parque dos Patins', 'Parque', 'Quadra 10', 'Rio de Janeiro', 'RJ', '22470050', '147'),
('Largo do Machado', 'Largo', 'Prédio 2', 'Rio de Janeiro', 'RJ', '22221020', '258');
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
-- Populando a tabela (Categoria)
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
('The Lord of the Rings: The Fellowship of the Ring', 'O Senhor dos Anéis: A Sociedade do Anel', 7, 10, 10);
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
-- Populando a tabela (Cliente)
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('12345678900', 'João da Silva', '999999999', 1);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('98765432100', 'Maria Souza', '888888888', 2);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('11122233344', 'Carlos Oliveira', '777777777', 3);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('55544433322', 'Ana Pereira', '666666666', 4);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('99988877766', 'Pedro Santos', '555555555', 5);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('33322211100', 'Mariana Costa', '444444444', 6);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('77766655588', 'Lucas Oliveira', '333333333', 7);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('44455566699', 'Camila Almeida', '222222222', 8);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('88899900011', 'Fernanda Silva', '111111111', 9);
INSERT INTO Cliente (cpf, nome, telefone, fk_cod_prof) VALUES ('22233344455', 'Rodrigo Santos', '000000000', 10);
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
-- Populando a tabela (CliEndereco)
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
-- Populando a tabela (LocacaoFilme )
INSERT INTO locacaofilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film) VALUES (5.99, 3, '2024-06-04', 1, 1);
INSERT INTO locacaofilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film) VALUES (4.99, 2, '2024-06-05', 2, 2);
INSERT INTO locacaofilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film) VALUES (6.99, 5, '2024-06-06', 3, 3);
INSERT INTO locacaofilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film) VALUES (3.99, 1, '2024-06-07', 4, 4);
INSERT INTO locacaofilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film) VALUES (7.99, 4, '2024-06-08', 5, 5);
INSERT INTO locacaofilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film) VALUES (5.99, 3, '2024-06-09', 6, 6);
INSERT INTO locacaofilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film) VALUES (6.99, 2, '2024-06-10', 7, 7);
INSERT INTO locacaofilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film) VALUES (8.99, 6, '2024-06-11', 8, 8);
INSERT INTO locacaofilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film) VALUES (7.99, 3, '2024-06-12', 9, 9);
INSERT INTO locacaofilme (valor, num_dias, data_devol, fk_cod_loc, fk_cod_film) VALUES (4.99, 4, '2024-06-13', 10, 10);
