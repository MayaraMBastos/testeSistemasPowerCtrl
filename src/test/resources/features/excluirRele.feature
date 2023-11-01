#language: pt
Funcionalidade: teste exclusao de rele caadastrado

  Cenario Deletar rele corretamente
    Dado O usuario esta na pagina de lista de dispositivos
    E usuario escolhe um rele e clica no botao excluir
    Quando Aparece pop-up alertando se quer mesmo deletar o rele
    E O usuario clica em Deletar
    Entao O rele e deletado

#  Cenario: Na deletar o rele cadastrado
#    Dado O usuario esta na pagina de lista de dispositivos
#    E usuario escolhe um rele e clica no botao excluir
#    Quando Aparece pop-up alertando se quer mesmo deletar o rele
#    E O usuario clica em Nao deletar
#    Entao O rele nao e deletado
