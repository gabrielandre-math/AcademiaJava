-- 1. Listar todos os filmes alugados por um cliente específico, incluindo a data de locação e a data de devolução.
SELECT
    f.titulo_original AS "Título Original",
    f.titulo AS "Título",
    l.data_loc AS "Data de Locação",
    lf.data_devol AS "Data de Devolução"
FROM
    LocacaoFilme lf
    JOIN Locacao l ON lf.fk_cod_loc = l.cod_loc
    JOIN Filme f ON lf.fk_cod_film = f.cod_filme
WHERE
    l.fk_cod_cli = 9;

-- 2. Obter uma lista de clientes e seus dependentes.
SELECT c.nome AS cliente, d.parentesco, d2.nome AS dependente
FROM Cliente c
LEFT JOIN Dependente d ON c.cod_cli = d.fk_cod_cli
LEFT JOIN Cliente d2 ON d.fk_cod_dep = d2.cod_cli
ORDER BY c.nome, d.parentesco;

-- 3. Listar todos os filmes de um determinado gênero.
SELECT f.titulo_original AS titulo_original, f.titulo AS titulo
FROM Filme f
JOIN Genero g ON f.fk_cod_gen = g.cod_gen
WHERE g.nome = 'Ação';

-- 4. Exibir todos os clientes que têm uma profissão específica.
SELECT c.nome AS cliente, p.nome AS profissao
FROM Cliente c
JOIN Profissao p ON c.fk_cod_prof = p.cod_prof
WHERE p.nome = 'Engenheiro Civil';

-- 5. Encontrar todos os filmes em uma categoria específica com quantidade disponível maior que 5.
SELECT f.titulo_original AS titulo_original, f.titulo AS titulo, f.quantidade AS quantidade_disponivel
FROM Filme f
JOIN Categoria c ON f.fk_cod_cat = c.cod_cat
WHERE c.nome = 'Ação' AND f.quantidade > 5;

-- 6. Listar todos os atores que participaram de filmes com um determinado título.
SELECT DISTINCT a.nome AS nome_ator
FROM Ator a
JOIN FilmeAtor fa ON a.cod_ator = fa.fk_cod_ator
JOIN Filme f ON fa.fk_cod_filme = f.cod_filme
WHERE f.titulo = 'A Origem';

-- 7. Obter o endereço completo de um cliente específico.
SELECT e.logradouro, e.tipo_log, e.complemento, e.numero, e.bairro, e.cidade, e.uf, e.cep
FROM Cliente c
JOIN ClieEndereco ce ON c.cod_cli = ce.fk_cod_cli
JOIN Endereco e ON ce.fk_cod_end = e.cod_end
WHERE c.cod_cli = 5;

-- 8. Listar todos os filmes e seus respectivos gêneros e categorias.
SELECT
    f.titulo_original AS "Título Original",
    f.titulo AS "Título",
    g.nome AS "Gênero",
    c.nome AS "Categoria",
    c.valor AS "Valor"
FROM
    Filme f
    INNER JOIN Genero g ON f.fk_cod_gen = g.cod_gen
    INNER JOIN Categoria c ON f.fk_cod_cat = c.cod_cat;

-- 9. Mostrar todos os clientes que alugaram um filme específico e a data de locação.
SELECT
    c.nome AS "Nome do Cliente",
    l.data_loc AS "Data de Locação"
FROM
    Cliente c
    JOIN Locacao l ON c.cod_cli = l.fk_cod_cli
    JOIN LocacaoFilme lf ON l.cod_loc = lf.fk_cod_loc
    JOIN Filme f ON lf.fk_cod_film = f.cod_filme
WHERE
    f.titulo_original = 'The Dark Knight';

-- 10. Exibir a lista de clientes com multas superiores a um valor específico.
SELECT c.nome AS cliente, l.multa
FROM Cliente c
JOIN Locacao l ON c.cod_cli = l.fk_cod_cli
WHERE l.multa > 5;

-- 11. Listar todas as locações feitas em um período específico.
SELECT *
FROM Locacao
WHERE data_loc BETWEEN '2024-06-01' AND '2024-06-08';

-- 12. Obter a quantidade total de filmes alugados por cada cliente. (DESAFIO)
SELECT c.nome AS cliente, COUNT(lf.fk_cod_loc) AS quantidade_filmes_alugados
FROM Cliente c
LEFT JOIN Locacao l ON c.cod_cli = l.fk_cod_cli
LEFT JOIN LocacaoFilme lf ON l.cod_loc = lf.fk_cod_loc
GROUP BY c.nome
ORDER BY quantidade_filmes_alugados DESC;

-- 13. Listar os clientes e os filmes que eles alugaram, ordenados por data de locação.
SELECT c.nome AS cliente, f.titulo AS filme, lf.data_devol
FROM Cliente c
JOIN Locacao l ON c.cod_cli = l.fk_cod_cli
JOIN LocacaoFilme lf ON l.cod_loc = lf.fk_cod_loc
JOIN Filme f ON lf.fk_cod_film = f.cod_filme
ORDER BY lf.data_devol;

-- 14. Mostrar todos os clientes que moram em uma cidade específica e que alugaram filmes de uma categoria específica.
SELECT DISTINCT c.nome AS cliente, e.cidade, cat.nome AS categoria
FROM Cliente c
JOIN ClieEndereco ce ON c.cod_cli = ce.fk_cod_cli
JOIN Endereco e ON ce.fk_cod_end = e.cod_end
JOIN Locacao l ON c.cod_cli = l.fk_cod_cli
JOIN LocacaoFilme lf ON l.cod_loc = lf.fk_cod_loc
JOIN Filme f ON lf.fk_cod_film = f.cod_filme
JOIN Categoria cat ON f.fk_cod_cat = cat.cod_cat
WHERE e.cidade = 'São Paulo'
AND cat.nome = 'Ação';

-- 15. Encontrar todos os atores que participaram de pelo menos 5 filmes, listando o nome do ator e o número de filmes em que atuou.
SELECT A.nome AS nome_ator, COUNT(FA.fk_cod_filme) AS num_filmes
FROM Ator A
JOIN FilmeAtor FA ON A.cod_ator = FA.fk_cod_ator
GROUP BY A.cod_ator, A.nome
HAVING COUNT(FA.fk_cod_filme) >= 5
ORDER BY num_filmes DESC;

-- 16. Exibir a quantidade total de filmes alugados por categoria e gênero, incluindo apenas as categorias e gêneros que têm mais de 50 filmes alugados no total (DESAFIO)
SELECT
    c.nome AS Categoria,
    g.nome AS Genero,
    COUNT(lf.fk_cod_film) AS Quantidade_Alugados
FROM
    Categoria c
    JOIN Filme f ON c.cod_cat = f.fk_cod_cat
    JOIN LocacaoFilme lf ON f.cod_filme = lf.fk_cod_film
    JOIN Locacao l ON lf.fk_cod_loc = l.cod_loc
    JOIN Genero g ON f.fk_cod_gen = g.cod_gen
GROUP BY
    c.nome, g.nome
HAVING
    COUNT(lf.fk_cod_film) > 50;
