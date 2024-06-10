# Aplicativo Cálculo de Imposto de Renda
## Objetivo
Desenvolver um aplicativo capaz de calcular o imposto de renda.
## Descrição
Cansado de conferir os descontos em sua folha de pagamento manualmente, João da Silva lhe contratou apra escrever um aplicativo que faça o cálculo do valor do imposto de renda a ser recolhido de seu salário. 
A tabela de descontos do IRPF 2024 é a seguinte:
| Faixas do IR          | Parcela salarial em cada faixa |  Alíquota |
|-----------------------|:------------------------------:|----------:|
| Faixa 1               |          Até R$ 2.112          |  isento   | 
| Faixa 2               |     De 2.112,01 até 2.826,66   |  7,5%     | 
| Faixa 3               |     De 2.826,67 até 3.751,06   |    15%    | 
| Faixa 4               |     De 3.751,07 até 4.664,68   |  22,5%    | 
| Faixa 5               |     Acima de R$ 4.664,68       |  27,5%    | 

_Tabela-1 Faixa IRPF 2024_

A tabela abaixo mostra um exemplo de cálculo para um salário de R$ 4.000,00:
| Faixas do IR          | Parcela salarial em cada faixa |  Alíquota | Imposto pago sobre a parcela   |
|-----------------------|:------------------------------:|----------:| ------------------------------:|
|    1                  |          Até R$ 2.112          |  isento   |              zero              |
|    2                  |     R$ 714,65                  |  7,5%     |            R$53,59             |
|    3                  |     R$ 924,39                  |    15%    |            R$138,66            |
|    4                  |     R$ 248,93                  |  22,5%    |            R$56,01             |
|  Total                |     Salário: R$4.000      |  Alíquota efetiva: 6,2%  |  Total pago: R$248,26|


Sabendo disso escreva um classe _Pessoa_ deve receber via construtor os atributos nome (String) e salário (double);

Em seguida crie uma classe _FaixaImpostoDeRenda_. Essa classe retorna um inteiro conforme a faixa da tabela-1. Crie outra classe _ImpostoDeRenda_ que receberá como parâmetro um objeto da classe _Pessoa_, em seu construtor. A classe _ImpostoDeRenda_ deverá ter um método _calcular()_, CALCULANDO IR a pagar e definindo a faixa de IR da pessoa e também o método imprimir(), que deverá imprimir as informações na tela.

Após na classe principal crie alguns objetos do tipo _Pessoa_ e _ImpostoDeRenda_ e imprima no console.
### Exemplo
> Lucas seu salário é R$ 5700,00 sua faixa de imposto é 5 e o valor do imposto de renda a ser pago é: R$ 682,54.

## Bônus
Adquira as informações de nome e salário da classe _Pessoa_ via console, utilizando a classe Scanner;
~~~java
Scanner scanner = new Scanner(System.in);
var salario = scanner.nextLine().toString();
var nome = scanner.nextDouble();
scanner.close();
~~~
### Mais informações
[Imposto de Renda 2024 - Tabela de alíquotas e cálculo](https://g1.globo.com/economia/imposto-de-renda/noticia/2024/05/08/imposto-de-renda-2024-veja-a-tabela-de-aliquotas-e-saiba-como-fazer-o-calculo.ghtml)


# UML Desenvolvido
![image](https://github.com/gabrielandre-math/AcademiaJavaAtos/assets/60861872/3882fa8f-3fad-4f72-b090-504067c026b5)


## O que foi aplicado?
### Relacionamento de Database com Person
![image](https://github.com/gabrielandre-math/AcademiaJavaAtos/assets/60861872/966d73c3-1639-41cc-9751-9b1b2e307368)

### Composição
Há uma relação de composição, o que implica uma dependência de Person em relação a Database. Isso significa que, se um objeto criado por Database for destruído, o objeto associado (criado por Person) também será.

### Relacionamento de Person, IncomeTaxBand e IncomeTax
![image](https://github.com/gabrielandre-math/AcademiaJavaAtos/assets/60861872/35bd342d-14fd-4221-b2dd-1ce787a31150)


Há uma relação entre Person, IncomeTaxBand e IncomeTax. Essa conexão significa que uma Person está associada a uma IncomeTaxBand específica e ao cálculo do IncomeTax.


Criado por _Gabriel André._
