# Exercícios de JavaScript

1 - Crie um formulário com 4 botões que, ao clicar em cada um, altere a cor do plano de fundo da página para vermelho, 
verde, azul e amarelo, respectivamente. 
```html
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Exercício 1</title>
</head>
<body>
<button onclick="document.body.style.backgroundColor = 'red';">Vermelho</button>
<button onclick="document.body.style.backgroundColor = 'green';">Verde</button>
<button onclick="document.body.style.backgroundColor = 'blue';">Azul</button>
<button onclick="document.body.style.backgroundColor = 'yellow';">Amarelo</button>
</body>
</html>
 
```
2 - Crie uma página com 4 links (tag <a>), cada um representando o nome de uma cor, que, utilizando o evento 
onmouseover altere a cor do plano de fundo para cor correspondente. 
```html
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Exercício 2</title>
<script>
function mudaCor(color) {
    document.body.style.backgroundColor = color;
}
</script>
</head>
<body>
<a href="#" onclick="mudaCor('red'); return false;">Vermelho</a>
<a href="#" onclick="mudaCor('green'); return false;">Verde</a>
<a href="#" onclick="mudaCor('blue'); return false;">Azul</a>
<a href="#" onclick="mudaCor('yellow'); return false;">Amarelo</a>
</body>
</html>

```
3 - Crie uma página com uma lista (select - RadioButton) com 4 opções de cores. Ao selecionar uma opção de cor, 
altere o plano de fundo da página para a cor específica. 
```html
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Exercício 3</title>
<script>
function mudaFundo() {
    var color = document.getElementById("colorSelect").value;
    document.body.style.backgroundColor = color;
}
</script>
</head>
<body>
<select id="colorSelect" onchange="mudaFundo()">
    <option value="red">Vermelho</option>
    <option value="green">Verde</option>
    <option value="blue">Azul</option>
    <option value="yellow">Amarelo</option>
</select>
</body>
</html>

```
4 – Crie um parágrafo p com um texto como conteúdo. Adicione um botão que, ao ser clicado, oculte ou mostre o 
texto do parágrafo. 
```html
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Exercício 4</title>
<script>
function toggleParagrafo() {
    var p = document.getElementById("myParagraph");
    p.style.display = p.style.display === 'none' ? 'block' : 'none';
}
</script>
</head>
<body>
<p id="myParagraph">Texto a ser toggladokkkk.</p>
<button onclick="toggleParagrafo()">Mostrar/Ocultar Texto</button>
</body>
</html>

```
5 – Crie um formulário de seleção de itens com checkbox. O formulário deve possuir um botão desabilitado. O botão 
só se torna clicável quando tiver pelo menos 2 checkboxs marcado. 
```html
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Exercício 5</title>
<script>
function atualizaBotao() {
    var checkboxes = document.querySelectorAll('input[type="checkbox"]:checked');
    document.getElementById("submitBtn").disabled = checkboxes.length < 2;
}
</script>
</head>
<body>
<form>
    <input type="checkbox" onchange="atualizaBotao()">Item 1<br>
    <input type="checkbox" onchange="atualizaBotao()">Item 2<br>
    <input type="checkbox" onchange="atualizaBotao()">Item 3<br>
    <button id="submitBtn" disabled>Enviar</button>
</form>
</body>
</html>

```
6 – Crie um parágrafo com um texto como conteúdo. Crie 4 botões. Dois para trocar a cor da fonte, de branco para 
preto e vice-versa e outros dois para fazer o mesmo com o fundo do parágrafo. Use divs se julgar necessário. 
```html
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Exercício 6</title>
<script>
function mudaCorDaFonte(color) {
    document.getElementById("myParagraph").style.color = color;
}
function mudaCorFundo(color) {
    document.getElementById("myParagraph").style.backgroundColor = color;
}
</script>
</head>
<body>
<div>
    <p id="myParagraph">Texto do parágrafo.</p>
    <button onclick="mudaCorDaFonte('white')">Branco</button>
    <button onclick="mudaCorDaFonte('black')">Preto</button>
    <button onclick="mudaCorFundo('black')">Fundo Preto</button>
    <button onclick="mudaCorFundo('white')">Fundo Branco</button>
</div>
</body>
</html>
```
7 – Crie um botão + (mais) e outro – (menos) na mesma página do exercício anterior. Esses botões aumentam e 
diminuem o tamanho da fonte, respectivamente. 
```html
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Exercício 7</title>
<script>
var atualFonteTamanho = 16;

function mudaFonteTamanho(increment) {
    atualFonteTamanho += increment;
    document.getElementById("myParagraph").style.fontSize = atualFonteTamanho + "px";
}
</script>
</head>
<body>
<div>
    <p id="myParagraph" style="font-size: 16px;">Fonte que vai mudar.</p>
    <button onclick="mudaFonteTamanho(1)">+</button>
    <button onclick="mudaFonteTamanho(-1)">-</button>
</div>
</body>
</html>
```
8 – Ainda continuando no exercício 6, faça um botão que transforme todo o texto do parágrafo em maiúscula, e outro 
em minúscula. 
```html
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Exercício 8</title>
<script>
function mudaTexto(toUpper) {
    var p = document.getElementById("myParagraph");
    p.textContent = toUpper ? p.textContent.toUpperCase() : p.textContent.toLowerCase();
}
</script>
</head>
<body>
<div>
    <p id="myParagraph">Texto que vai mudar.</p>
    <button onclick="mudaTexto(true)">MAIÚSCULA</button>
    <button onclick="mudaTexto(false)">minúscula</button>
</div>
</body>
</html>
```
9 - Crie um formulário com os campos para cadastrar o usuário de um sistema (login, senha e confirmar senha). Permita 
que a página seja submetida apenas se todos os campos estiverem preenchidos, se os campos senha e confirma senha 
forem iguais e a senha possuir entre 6 e 10 caracteres. 
```html
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Exercício 9</title>
<script>
function validaFormulario() {
    var login = document.getElementById("login").value;
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;

    if (!login || !password || !confirmPassword) {
        alert("Todos os campos precisam ser preenchidos.");
        return false;
    }

    if (password !== confirmPassword) {
        alert("As senhas não batem.");
        return false;
    }

    if (password.length < 6 || password.length > 10) {
        alert("A senha precisa ter entre 6 e 10 caracteres.");
        return false;
    }

    return true;
}
</script>
</head>
<body>
<form onsubmit="return validaFormulario()">
    Login: <input type="text" id="login"><br>
    Senha: <input type="password" id="password"><br>
    Confirmar Senha: <input type="password" id="confirmPassword"><br>
    <button type="submit">Registrar</button>
</form>
</body>
</html>
```
10 - Crie um formulário de cadastro de cliente. O formulário deve conter os campos Nome (text), Pessoa (Física/Jurídica – radio), CPF (text), CNPJ (text), data de nascimento, endereço (text), cep (text), telefone (text), email. O formulário 
deve ativar o campo CPF apenas se o RadioButton de pessoa física estiver ativo e o campo de CNPJ no caso de pessoa 
jurídica. O campo data de nascimento também só deve estar ativo no caso de pessoa física ser selecionado e deve aceitar 
que somente números sejam digitados. O campo CEP também só deve aceitar número.
```html
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Exercício 10</title>
<script>
function CampoToggle() {
    var pessoaFisica = document.getElementById("pessoaFisica").checked;
    document.getElementById("cpf").disabled = !pessoaFisica;
    document.getElementById("cnpj").disabled = pessoaFisica;
    document.getElementById("birthdate").disabled = !pessoaFisica;
}

function ValidaComRegex(event) {
    if (!/[0-9]/.test(event.key)) { //Apelei pra Regex 
        event.preventDefault();
    }
}
</script>
</head>
<body>
<form>
    Nome: <input type="text" id="name"><br>
    <input type="radio" id="pessoaFisica" name="tipoPessoa" value="fisica" onclick="CampoToggle()">Pessoa Física
    <input type="radio" id="pessoaJuridica" name="tipoPessoa" value="juridica" onclick="CampoToggle()">Pessoa Jurídica<br>
    CPF: <input type="text" id="cpf" disabled onkeypress="ValidaComRegex(event)"><br>
    CNPJ: <input type="text" id="cnpj" disabled onkeypress="ValidaComRegex(event)"><br>
    Data de Nascimento: <input type="text" id="birthdate" disabled onkeypress="ValidaComRegex(event)"><br>
    Endereço: <input type="text" id="address"><br>
    CEP: <input type="text" id="zipcode" onkeypress="ValidaComRegex(event)"><br>
    Telefone: <input type="text" id="phone" onkeypress="ValidaComRegex(event)"><br>
    Email: <input type="text" id="email"><br>
    <button type="submit">Registrar</button>
</form>
</body>
</html> 
```
Criado por _Gabriel André de Lima Silva_.
