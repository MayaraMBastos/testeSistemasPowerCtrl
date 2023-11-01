#language: pt
Funcionalidade: teste logout

  Cenário:  Fazer o logout do site PowerCtrl
    Dado que o usuario esta logado e esta na tela Dashboard
    E o usuario seleciona no menu a opcao Sair
    E um pop-up e apresentado na tela
    Quando o usuario clica no botao Sim
    Entao o logout e efetuado com sucesso.
    E a tela de login é apresentada na tela

#  Cenário:  Nao fazer o logout do site PowerCtrl
#    Dado que o usuario esta logado e esta na tela Dashboard/ Home
#    E o usuario seleciona no menu a opcao Sair
#    E um pop-up e apresentado na tela
#    Quando o usuario clica no botao Nao
#    Entao o logout não e efetuado com sucesso.
#    E o usuario continuar logado no site
