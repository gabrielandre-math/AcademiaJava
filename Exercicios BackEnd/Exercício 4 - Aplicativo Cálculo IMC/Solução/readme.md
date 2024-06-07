# Aplicativo Cálculo IMC
## Objetivo
Desenvolver um aplicativo que permita o cálculo de IMC (Índice de Massa Corporal) de um paciente.
## Descrição
Você foi contratado para desenvolver um aplicativo Java para uma empresa chamada HealthCare. Esse software deverá ter uma classe chamada _Paciente_ que possui um construtor que recebe seu peso em quilos e sua altura em metras, ambos utilizando o tipo double. Crie um método chamado _calcularIMC()_ que calcula o índice de Massa Corporal de acordo com a fórmula.
> IMC = peso (quilos) / (altura * altura (metros)).

Crie também um método chamado _diagnostico()_ que utiliza o método _calcularIMC()_ e retorna uma String de acordo com as seguintes faixas de valor:
- Baixo peso muito grave = IMC abaixo de 16 kg/m²
- Baixo peso grave = IMC entre 16 e 16,99 kg/m²
- Baixo peso = IMC entre 17 e 18,49 kg/m²
- Peso normal = IMC entre 18,50 e 24,99 kg/m²
- Sobrepeso = IMC entre 25 e 29,99 kg/m²
- Obesidade grau I = IMC entre 30 e 34,99 kg/m²
- Obesidade grau II = IMC entre 35 e 39,99 kg/m²
- Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²

Escreva uma classe chamada _Principal_ em que se criam 3 instâncias da classe _Paciente_ com valores diferentes e se imprime no console o resultado dos dois métodos criados.

## Bônus
Crie um atributo nome, para a classe paciente, e um método _setNome()_, para dar nome aos pacientes. Após, escreva no console a mensagem configurada anteriormente junto ao nome do paciente.
Exemplo:
~~~
  O diagnóstico do paciente Lucas é Peso normal = IMC entre 18,50 e 24,99 kg/m²
~~~

Criado por _Gabriel André._
