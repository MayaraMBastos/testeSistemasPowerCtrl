#language: pt
Funcionalidade: teste edicao de reles

#  Cenario: : Editar dados de dispositivos com sucesso
#    Dado que o usuario esta logado e esta na tela Editar Rele
#    E o usuario clica no botao Editar de um dos reles
#    E o formulario para editar o rele e apresentado na tela
#    E o usuario altera o nome do setor para "Setor 10"
#    Quando : o usuario clicar no botao editar.
#    Entao os dados do rele sao atualizados com sucesso.

  Cenario: : Editar dados de dispositivos sem sucesso
    Dado que o usuario esta logado e esta na tela Editar Rele
    E o usuario clica no botao Editar de um dos reles
    E o formulario para editar o rele e apresentado na tela
    E o usuario altera o nome do setor para ""
    Quando : o usuario clicar no botao editar.
    Entao os dados do rele nao sao atualizados.
    E o campo nome do setor e destacado em vermelho
