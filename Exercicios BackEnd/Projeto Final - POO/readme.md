# Projeto Final Java - POO
## Objetivo
Implementar um sistema de vendas de produtos utilizando conceitos de programação orientada a objetos: métodos, encapsulamento, construtores, herança, interfaces, classes abstratas e tratamento de exceções.
## Descrição
Você deverá criar um sistema para gerenciar diferentes tipos de produtos. O sistema deve ser capaz de gerenciar informações sobre eletrônicos, roupas e alimentos, exibindo detalhes específicos para cada tipo de produto. Além disso, o sistema deve permitir a adição, remoção e listagem de produtos, bem como a emissão de um pequeno relatório em arquivo de texto.

## Criação de Classes e Interfaces
### Interface (Produto)
**Métodos**:
~~~java
public String getTipo();
public String getNome();
public double getPreco();
public void setNome(String nome);
public void setPreco(double preco);
public void setQuantidade(int quantidade);
public int getQuantidade();
public String exibirDetalhes();
~~~
### Classe abstrata (ProdutoBase)
- Implementa a interface (Produto)
- **Atributos**:
  ~~~java
  private String nome;
  private double preco;
  private int quantidade;
  ~~~
- Implementar todos os métodos da interface (Produto)
- **Métodos concretros**:
  ~~~java
  public ProdutoBase(String nome, double preco, int quantidade);
  public ProdutoBase();
  ~~~
- **Métodos abstratos**:
  ~~~java
  public abstract String exibirDetalhes();
  ~~~
### Classe Eletronico
- Herda de (ProdutoBase)
- **Atributos adicionais**:
  ~~~java
  private int garantiaMeses;
  ~~~
- **Métodos**:
  - Construtores:
  ~~~java
  public Eletronico(String nome, double preco, int garantiaMeses, int quantidade);
  public Eletronico();
  ~~~
~~~java
public int getGarantiaMeses();
public void setGarantiaMeses(int garantiaMeses);
~~~
- Implementar o método _java exibirDetalhes()_, exibindo e retornando todas as informações do eletrônico.
- E _public String getTipo()_, deve retornar "Eletrônico".

### Classe Alimento
- Herda de (ProdutoBase)
- **Atributos adicionais**:
  ~~~java
  private String dataValidade;
  ~~~
- **Métodos**:
  - Construtores:
    ~~~java
    public Alimento(String nome, double preco, String dataValidade, int qualidade);
    public Alimento();
    ~~~
  ~~~java
  public String getDataValidade();
  public void setDataValidade(String dataValidade);
  ~~~
- Implementar o método _exibirDetalhes()_, exibir todas as informações do alimento
- public String getTipo(), deve retornar "Alimento".
### Classe CarrinhoDeCompras
**Atributos**:
~~~java
private List<Produto> itens;
//demais atributos para escrita de arquivo de texto
~~~
**Métodos**:
- Construtor:
  ~~~java
  public CarrinhoDeCompras();
  ~~~
  Inicializando a lista de itens.
  ~~~java
  public void adicionarItem(Produto produto);
  ~~~
  Para adicionar um produto do carrinho.
  ~~~java
  public void list removerItem(Produto produto);
  ~~~
  Para remover um produto do carrinho.
  ~~~java
  public void listarItens();
  ~~~
  Para exibir os detalhes de todos os produtos do carrinho.
  ~~~java
  public List <Produto> exportarListaProdutos();
  ~~~
  Para devolver a lista de produtos do carrinho.
  ~~~java
  public double calcularTotal();
  ~~~
  Para calcular o valor total dos produtos.

  > Observação: Para excluir um item da lista de produtos do carrinho, talvez seja necessário buscar pelo seu nome e quantidade, visto que não temos um identificador único para esse caso.

  ~~~java
  public void gerarArquivoTexto(String nomeArquivo);
  ~~~
  Esse método deverá gravar um arquivo de texto com o formato similar ao exemplo abaixo:
  
  | Item | Quantidade | Nome       | Preço   | Subtotal | Total   |
  |------|------------|------------|---------|----------|---------|
  | 1    | 3          | Smartphone | 2999.90 | 8997.00  |         |
  | 2    | 6          | T-shirt    | 89.99   | 539.94   |         |
  | 3    | 4          | Arroz      | 9.99    | 39.96    |         |
  |      |            |            |         |          | 9576.90 |


Essa classe, deverá ter suas potenciais exceções tratadas.
### Classe Principal
**Método _main_**:
- Criar duas instâncias de _CarrinhoDeCompras_
  - Na primeira adicionar um _Eletrônico_, uma _Roupa_, e um _Alimento_.
  - Na segunda instância adicionar um ou mais itens quaisquer.
- Listar os produtos e o total de ambos os _CarrinhoDeCompras_.
- Gravar os arquivos referentes a cada carrinho de compras.

## Requisitos Adicionais:
- Utilize encapsulamento para proteger os atributos das classes.
- Utilize herança para compartilhar a lógica comum entre as classes _Eletrônico_, _Roupa_ e _Alimento_.
- Utilize métodos sobrecarregados (opcional) para fornecer diferentes maneiras de criar instâncias de produtos.
- A implementação deve ser modular e seguir boas práticas de programação orientada a objetos.
- O arquivo de saída (.txt) será gerado na raiz do projeto, caso outro local não seja especificado.


Criado por _Gabriel André._

