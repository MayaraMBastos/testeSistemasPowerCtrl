#language: pt
Funcionalidade: Tela de graficos

  Cenario: Tela de Grafico de armazenamento de dados incorreta
    Dado O usuario esta na pagina do grafico
    E O usuario seleciona no menu a opção Graficos
    E Na pagina de graficos estao os dados armazenados ate o momento
    Quando O usuario clica em um periodo futuro
    Entao Os dados deste periodo nao aparecem na tela

#  Cenario: Tela de Grafico de armazenamento de dados corretamente
#    Dado O usuario esta na pagina do grafico
#    E O usuario seleciona no menu a opcao Graficos
#    E Na pagina de graficos estao os dados armazenados ate o momento
#    Quando O usuario clica em um periodo atual
#    Entao Os dados deste periodo aparecem na tela
