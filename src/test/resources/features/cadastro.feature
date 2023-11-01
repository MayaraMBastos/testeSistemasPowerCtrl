#language: pt
Funcionalidade: cadastro de usuario

  Cenario: Tela de cadastro campos em branco
    Dado O usuario esta na pagina de cadastro de usuario "http://localhost:8080/cadastro"
    E O usuario preenche os dados nome completo "Paulo Henrique"
    E O usuario preenche o campo email "email@email.com"
    Quando O usuario deixa os demais campos em branco
    E Clica no botão cadastrar
    Entao O cadastro não é realizado
    E Os campos em branco ficam destacados em vermelho

#  Cenario: Tela de cadastro preenchida corretamente
#    Dado O usuario esta na pagina de cadastro
#    E O usuario preenche os dados de cadastro
#    Quando O usuario preenche os dados corretamente
#    E clica no botão cadastrar
#    Então O cadastro é realizado
#    E A tela de Login é aberta