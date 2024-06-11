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
![image](https://github.com/gabrielandre-math/AcademiaJavaAtos/assets/60861872/14bf6534-12a1-47eb-b496-1e546739ab16)




### O que foi aplicado
Utilizei composição, no meu cenário, pois uma biblioteca pode conter vários livros e cada livro depende diretamente de uma biblioteca para existir.
# Composição

- Uma **Library** (biblioteca) contém múltiplos **Books** (livros).
- A existência de **Books** depende diretamente da **Library**, ou seja, um **Book** não pode existir independentemente de uma **Library**.
- A relação é do tipo "é parte de", onde os **Books** são parte integrante da **Library** e não podem existir sem ela.

## Descrição detalhada

### Relação de Composição
- Uma **Library** (biblioteca) contém múltiplos **Books** (livros).
- Se a **Library** for destruída, todos os **Books** pertencentes a ela também serão destruídos, pois eles fazem parte da estrutura da **Library**.

### Dependência Existencial
- Um **Book** não pode existir sem uma **Library**. A criação de um **Book** requer uma **Library**, e sua destruição acontece juntamente com a destruição da **Library**.

### Relação Hierárquica
- A **Library** é a entidade pai que compõe os **Books**. Os **Books** são componentes internos da **Library** e dependem completamente dela para existirem.


Criado por _Gabriel André._
