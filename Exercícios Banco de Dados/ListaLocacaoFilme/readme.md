# Lista de Exercício da Locação de Filme
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/379edada-3877-4f48-8e7e-eb87125efcd8)
## Descrição
1. Listar todos os filmes alugados por um cliente específico, incluindo a data de locação e a data de devolução.
2. Obter uma lista de clientes e seus dependentes.
3. Listar todos os filmes de um determinado gênero.
4. Exibir todos os clientes que têm uma profissão específica.
5. Encontrar todos os filmes em uma categoria específica com quantidade disponível maior que 5.
6. Listar todos os atores que participaram de filmes com um determinado título.
7. Obter o endereço completo de um cliente específico.
8. Listar todos os filmes e seus respectivos gêneros e categorias.
9. Mostrar todos os clientes que alugaram um filme específico e a data de locação.
10. Exibir a lista de clientes com multas superiores a um valor específico.
11. Listar todas as locações feitas em um período específico.
12. Obter a quantidade total de filmes alugados por cada cliente. (DESAFIO)
13. Listar os clientes e os filmes que eles alugaram, ordenados por data de locação.
14. Mostrar todos os clientes que moram em uma cidade específica e que alugaram filmes de uma categoria específica.
15. Encontrar todos os atores que participaram de pelo menos 5 filmes, listando o nome do ator e o número de filmes em que atuou. (DESAFIO)
16. Exibir a quantidade total de filmes alugados por categoria e gênero, incluindo apenas as categorias e gêneros que têm mais de 50 filmes alugados no total (DESAFIO)

# Solução
### 1. Listar todos os filmes alugados por um cliente específico, incluindo a data de locação e a data de devolução.
~~~sql
SELECT
    f.titulo_original AS "Título original",
    f.titulo AS "Título",
    l.data_loc AS "Data de Locação",
    lf.data_devol AS "Data de Devolução"
FROM
    LocacaoFilme lf
    JOIN Locacao l ON lf.fk_cod_loc = l.cod_loc
    JOIN Filme f ON lf.fk_cod_film = f.cod_filme
WHERE
    l.fk_cod_cli = 9;
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/62b291a8-9e70-49f3-99f3-80e2c9d91023)


### 2. Obter uma lista de clientes e seus dependentes.
~~~sql
SELECT c.nome AS cliente, d.parentesco, d2.nome AS dependente
FROM Cliente c
LEFT JOIN Dependente d ON c.cod_cli = d.fk_cod_cli
LEFT JOIN Cliente d2 ON d.fk_cod_dep = d2.cod_cli
ORDER BY c.nome, d.parentesco;
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/8abc8a19-9c36-4041-a98e-d228f705f3c6)
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/1cf92c70-219d-4cad-8257-e50f53378185)
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/bd1d9fc8-bfd5-422d-b6ab-e378334d7804)

### 3. Listar todos os filmes de um determinado gênero.
~~~sql
SELECT f.titulo_original AS titulo_original, f.titulo AS titulo
FROM Filme f
JOIN Genero g ON f.fk_cod_gen = g.cod_gen
WHERE g.nome = 'Ação';
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/93e1d610-60ab-4496-bd72-a29a0ca846d2)


### 4. Exibir todos os clientes que têm uma profissão específica. 
~~~sql
SELECT c.nome AS cliente, p.nome AS profissao
FROM Cliente c
JOIN Profissao p ON c.fk_cod_prof = p.cod_prof
WHERE p.nome = 'Engenheiro Civil';
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/ae54bfa9-d7e0-465d-8f02-2207e6de9a53)


### 5. Encontrar todos os filmes em uma categoria específica com quantidade disponível maior que 5.
~~~sql
SELECT f.titulo_original AS titulo_original, f.titulo AS titulo, f.quantidade AS quantidade_disponivel
FROM Filme f
JOIN Categoria c ON f.fk_cod_cat = c.cod_cat
WHERE c.nome = 'Ação' AND f.quantidade > 5;
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/cb237d2f-7b12-4d27-b89f-12e963f91a74)
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/f4365e3a-9c33-48df-a381-e14d572178bd)

### 6. Listar todos os atores que participaram de filmes com um determinado título.
~~~sql
SELECT DISTINCT a.nome AS nome_ator
FROM Ator a
JOIN FilmeAtor fa ON a.cod_ator = fa.fk_cod_ator
JOIN Filme f ON fa.fk_cod_filme = f.cod_filme
WHERE f.titulo = 'A Origem';
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/6a817607-3f0e-4d15-8a1d-46666d55e0d4)

### 7. Obter o endereço completo de um cliente específico.
~~~sql
SELECT e.logradouro, e.tipo_log, e.complemento, e.numero, e.bairro, e.cidade, e.uf, e.cep
FROM Cliente c
JOIN ClieEndereco ce ON c.cod_cli = ce.fk_cod_cli
JOIN Endereco e ON ce.fk_cod_end = e.cod_end
WHERE c.cod_cli = 5;
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/0d7befe1-0618-426a-beb3-419f9271c2f6)

### 8. Listar todos os filmes e seus respectivos gêneros e categorias.
~~~sql
SELECT
    f.titulo_original AS "Título original",
    f.titulo AS "Título",
    g.nome AS "Gênero",
    c.nome AS "Categoria",
    c.valor AS "valor"
FROM
    Filme f
    INNER JOIN Genero g ON f.fk_cod_gen = g.cod_gen
    INNER JOIN Categoria c ON f.fk_cod_cat = c.cod_cat;
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/9ca05835-8452-42ce-bb25-5c8cc3635085)
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/09893756-d28e-49c0-806e-44d28349ba6a)
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/c337ed87-d414-4b92-b3ae-e4df8a4eecfb)
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/83ed47b3-bc50-4dac-9826-94665ac37464)
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/0006b20d-5af4-4975-a9e4-81b821b65fa9)


### 9. Mostrar todos os clientes que alugaram um filme específico e a data de locação.
~~~sql
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
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/46835df4-644b-43c5-8fb9-fd7880ec17d4)

### 10. Exibir a lista de clientes com multas superiores a um valor específico.
~~~sql
SELECT c.nome AS cliente, l.multa
FROM Cliente c
JOIN Locacao l ON c.cod_cli = l.fk_cod_cli
WHERE l.multa > 5;
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/c54d9e0e-89e8-49c0-825c-2e1807293a62)

### 11. Listar todas as locações feitas em um período específico.
~~~sql
SELECT *
FROM Locacao
WHERE data_loc BETWEEN '2024-06-01' AND '2024-06-08';
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/033e641f-23d0-4d59-aad8-ac2cf11492e0)

### 12. Obter a quantidade total de filmes alugados por cada cliente. (DESAFIO)
~~~sql
SELECT c.nome AS cliente, COUNT(lf.fk_cod_loc) AS quantidade_filmes_alugados
FROM Cliente c
LEFT JOIN Locacao l ON c.cod_cli = l.fk_cod_cli
LEFT JOIN LocacaoFilme lf ON l.cod_loc = lf.fk_cod_loc
GROUP BY c.nome
ORDER BY quantidade_filmes_alugados DESC;
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/edbef020-f0e4-4c6e-a6d3-d66af1af1be5)
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/db16e898-ecd9-4a94-b633-5dd21cb8e878)

### 13. Listar os clientes e os filmes que eles alugaram, ordenados por data de locação.
~~~sql
SELECT c.nome AS cliente, f.titulo AS filme, lf.data_devol
FROM Cliente c
JOIN Locacao l ON c.cod_cli = l.fk_cod_cli
JOIN LocacaoFilme lf ON l.cod_loc = lf.fk_cod_loc
JOIN Filme f ON lf.fk_cod_film = f.cod_filme
ORDER BY lf.data_devol;
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/e8f94a09-72f9-46f1-810b-4737bfcaebb2)
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/bdde1ce9-0fbe-4b25-93f7-2b9f10bd72e7)
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/95cf9a6a-1a95-473a-ac77-e9baa51d2910)


### 14. Mostrar todos os clientes que moram em uma cidade específica e que alugaram filmes de uma categoria específica.
~~~sql
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
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/9a0e365d-92e8-4c0e-8f1c-62ad0406be1f)


### 15. Encontrar todos os atores que participaram de pelo menos 5 filmes, listando o nome do ator e o número de filmes em que atuou. (DESAFIO)
~~~sql
SELECT A.nome AS nome_ator, COUNT(FA.fk_cod_filme) AS num_filmes
FROM Ator A
JOIN FilmeAtor FA ON A.cod_ator = FA.fk_cod_ator
GROUP BY A.cod_ator, A.nome
HAVING COUNT(FA.fk_cod_filme) >= 5
ORDER BY num_filmes DESC;
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/2e6533dc-0f07-46fb-b2da-efbed186be5d)

### 16. Exibir a quantidade total de filmes alugados por categoria e gênero, incluindo apenas as categorias e gêneros que têm mais de 50 filmes alugados no total (DESAFIO)
~~~sql
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
~~~
**Saída**:

![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/865fe105-e1f0-48a3-9e54-93e96f4198f1)


Criado por _Gabriel André._
