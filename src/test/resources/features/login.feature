#language: pt
  Funcionalidade: teste de login
    Cenario: Realizar login com dados validos
      Dado o usuario esta na pagina de Login "http://localhost:8080/"
      Quando ele preenche os campos de usuario "Mayara" e senha "12345"
      E clica no botao Logar
      Entao o login e realizado com sucesso
      E o navegador e redirecionado para a pagina Home

#    Cenario: Realizar login com dados invalidos
#      Dado o usuario esta na pagina de Login "http://localhost:8080/"
#      Quando ele preenche os campos de usuario "Mayara" e senha "123"
#      E clica no botao Logar
#      Entao o login não e realizado com sucesso
#      E o navegador e redirecionado para a pagina Cadastro

