# Sistema de Biblioteca
## Objetivo
Desenvolver um software básico de biblioteca que permita gerenciar livros, adicionando-os e listando-os.
## Descrição
Você foi contratado para desenvolver um sistema básico para um biblioteca. O sistema deve ser capaz de gerenciar informações sobre livros e permitir que novos livros sejam adicionados à biblioteca e que todos os livros presentes na biblioteca sejam listados. As informações a serem mantidas sobre livros são: 
 ~~~  
    título
    autor
    ano de publicação
 ~~~
O bibliotecário deseja obter as informações de todos os livros cadastrados na biblioteca.
> Dica: Utilize a classe List, e seus métodos add e get para manipular a lista de livros.
~~~java
    List<Livro> livros = new ArrayList<>();
 ~~~
## Exemplo de uso
Implemente um programa principal (classe Solução.Main) que:
1. Crie pelo menos 3 objetos da classe Livro diferentes
2. Crie um objeto Biblioteca e adicione os livros criados a ela.
3. Utilize o método listarLivros() da classe Biblioteca para exibir todos os livros presentes na biblioteca no console.

________________________
# UML Desenvolvido
![image](https://github.com/gabrielandre-math/AcademiaJavaAtos/assets/60861872/e08aaee6-ee9f-499d-a6d6-52d3bdd4ade0)
### O que foi aplicado
Utilizei agregação, pois uma biblioteca pode conter vários livros, mas cada livro pode não depender de uma biblioteca para existir.
- Agregação:
 Uma Library (biblioteca) pode conter múltiplos Books (livros).
- A existência de Books não depende diretamente da Library, ou seja, um Book pode existir independentemente de uma Library.
- A relação é do tipo "tem um", onde a Library "tem" livros, mas os livros não necessariamente precisam da biblioteca para existir.

Criado por _Gabriel André._
