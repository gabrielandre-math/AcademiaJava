# Sistema de Compras
## Objetivo
Desenvolver um sistema de compras que permita adicionar produtos a um carrinho de compras e listar todos os produtos no carrinho.
## Descrição
Você foi contratado para desenvolver um sistema básico de compras. O sistema deve gerenciar informações sobre _produtos_ e permitir que novos produtos sejam adicionados a um _carrinho_ de _compras_ e que todos os produtos sejam listados. O aplicativo também deverá ser capaz de informar o valor total dos pprodutos contidos no carrinho de compras.
> Dica: Para formatar uma String para exibir valores, considere as informações:
~~~
  nome
  preço
  quantidade para os produtos
~~~
## Exemplo de uso
Implemente um programa principal (classe Solução.Main) que:
1. Crie alguns produtos diferentes.
2. Crie e adicione pelo menos 03 produtos ao carrinho de compras.
3. Após, informe no console, os produtos que estão no carrinho e seus sub-totais, bem como o valor total da compra:
   
| Nome          | Valor Unitário | Qtd | Sub-total  |
|---------------|:--------------:|----:|-----------:|
| Mouse Gamer   | R$ 60,00       |2    | R$ 120,00  |
| Total:        |                |     | R$ 120,00  |

# UML Desenvolvido
![image](https://github.com/gabrielandre-math/AcademiaJavaAtos/assets/60861872/0c452cc7-b206-4ee2-8c10-2f79cd07774a)




## O que foi aplicado?
No cenário da minha solução, um carrinho de compras pode conter vários produtos, mas não depende diretamente desses produtos para existir, assim como os produtos não dependem de um carrinho para existir. Nesse sentido, foi utilizada a agregação para implementar a solução.
## Relacionamento de Agregação entre `ShoppingCart` e `Product`

1. **Independência de Existência**:
   - O `ShoppingCart` (carrinho de compras) pode existir independentemente dos `Product` (produtos) que contém.
   - Os `Product` podem existir independentemente de qualquer `ShoppingCart`.

2. **Relação Contida**:
   - O `ShoppingCart` agrega (contém) vários `Product`.
   - Os `Product` são partes do `ShoppingCart`, mas não são destruídos se o `ShoppingCart` for destruído.

3. **Agregação vs. Composição**:
   - Em uma agregação, o `ShoppingCart` e os `Product` têm ciclos de vida independentes.
   - Diferente da composição, onde os componentes dependem do ciclo de vida do todo, na agregação, os `Product` podem ser adicionados ao `ShoppingCart` sem impacto na existência dos `Product`.

4. **Implementação em Código**:
   - O `ShoppingCart` tem uma coleção (por exemplo, uma lista) de `Product`.
   - Métodos no `ShoppingCart` permitem adicionar `Product`.
     
Criado por _Gabriel André._
