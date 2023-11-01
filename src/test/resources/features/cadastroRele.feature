#language: pt
Funcionalidade: teste cadastro de reles

  Cenário: Cadastrar Rele com sucesso
    Dado que o usuario esta na tela de cadastro de reles
    E o usuario insere o nome do setor "Setor 8"  onde o dispositivo sera instalado
    E o usuario insere um codigo valido "AAA8" do dispositivo
    Quando e clica no botao Cadastrar.
    Entao o rele e cadastrado com sucesso.

#  Cenário: Cadastro de rele com codigo invalido
#    Dado que o usuario esta na tela de cadastro de reles
#    E o usuario insere o nome do setor "Setor 9"  onde o dispositivo será instalado
#    E o usuario insere um codigo vinvalido "AAA8" do dispositivo
#    Quando o usuario clicar no botao cadastrar.
#    Entao o dispositivo nao e cadastrado com sucesso.
#    E o campo de codigo e destacado em vermelho
#
#  Cenário: Cadastro de rele com campos em branco
#    Dado que o usuario esta na tela de cadastro de reles
#    E o usuario nao nome do setor
#    E o usuario nao insere um codigo de dispositivo
#    Quando o usuario clica no botão cadastrar.
#    Entao o dispositivo nao e cadastrado com sucesso.
#    E os campos de nome e codigo ficam destacado em vermelho
