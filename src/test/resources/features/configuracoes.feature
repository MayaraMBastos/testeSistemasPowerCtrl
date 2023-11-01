#language: pt
Funcionalidade: teste de edicao de dados do cadastro

  Cenario: Pagina de configuracoes campos em branco
    Dado O usuario esta logado e na pagina configuracoes
    E O usuario altera o campo nome para ""
    E O usuario insere a senha no campo senha atual "12345"
    Quando Clicar no botao editar
    Entao Os dados nao sao editados
    E O campo nome em branco fica destacado em vermelho

#  Cenario: Pagina de configuracoes preenchida corretamente
#    Dado : O usuario esta logado e na pagina configuracoes
#    E O usuario altera o campo nome para "Paola A Borgers"
#    E O usuario insere a senha no campo senha atual "12345"
#    Quando Clicar no botao editar
#    Entao Os dados sao atualizados
#
#
#  Cenario: Pagina de configuracoes alteracao de senha
#    Dado : O usuario esta logado e na pagina configuracoes
#    E O usuario insere a senha no campo senha atual "12345"
#    E O usuario insere a nova senha "1234" no campo nova senha
#    E O usuario repete a confirmacao de senha "1234" no campo confirmacao senha
#    Quando Clicar no botao editar
#    Entao A senha e modificada com sucesso
