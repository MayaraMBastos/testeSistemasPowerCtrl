#language: pt
Funcionalidade: Tela de ajuda

  Cenario: Pagina de Ajuda campo em branco
    Dado O usuario esta na pagina do dispositivo "http://localhost:8080/"
    E O usuario seleciona no menu a opcao Ajuda "http://localhost:8080/ajuda"
    E O usuario preenche o campo nome completo "Mayara M B"
    Quando O usuario deixa os outros campos em branco
    E Clica no botao enviar
    Entao A mensagem nao e enviada
    E Os campos em branco ficam destacados

#  Cenario: Pagina de Ajuda preenchida corretamente
#    Dado O usuario esta na pagina do dispositivo
#    E O usuario seleciona no menu a opcao Ajuda
#    E O formulario para preencher aparece na tela
#    E O usuario preenche os dados
#    Quando O usuario preenche um dado corretos
#    E Clica no botao enviar
#    Entao A mensagem e enviada