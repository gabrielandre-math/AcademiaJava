# Sistema Escolar
## Objetivo
Criar um sistema de gerenciamento de alunos que permita adicionar alunos a uma turma e listar todos os alunos de uma turma.
## Descrição
Você foi solicitado a desenvolver um sistema de gerenciamento para uma escola. O sistema deve gerenciar informações sobre alunos e turmas, permitindo que novos alunos sejam adicionados a uma turma específica e que todos os alunos dessa turma sejam listados. As informações a serem mantidas dos alunos são:
 ~~~  
    nome
    idade
    matrícula
 ~~~
Já para as turmas as informações são:
 ~~~  
    nome
    código
 ~~~
Temos:
 ~~~java
    Aluno("Lucas", 22, 1234);
    Turma("Turma A", 1A);
 ~~~
## Exemplo de uso
Implementeum programa principal (classe Main) que:
1. Crie 05 alunos com diferentes valores para nome, idade e matrícula.
2. Crie 02 turmas com seu nome de turma e adicione os alunos a ambas.
3. Utilize o método listarAlunos() da classe Turma para exibir todos os alunos presentes em cada turma.

# UML Desenvolvido
![image](https://github.com/gabrielandre-math/AcademiaJavaAtos/assets/60861872/218f14c8-27f0-4b47-a95c-f55085ee7bcf)




## O que foi aplicado?
No cenário da minha solução, assumi que um estudante não poderia existir no sistema sem estar associado a uma turma. Nesse sentido, apliquei conceitos de composição. Ou seja, uma turma pode existir sem alunos, mas um aluno não pode existir sem estar associado a uma turma.
1. Um estudante não pode existir sem uma turma (dependência forte, característica da composição).
2. Uma turma pode existir sem ter estudantes (a existência da turma não depende dos estudantes, permitindo a existência independente).


Criado por _Gabriel André._
