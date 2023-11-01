#language: pt
Funcionalidade: teste programar reles

#  Cenário: Programar um dispositivo horario diario com sucesso
#    Dado que o usuario esta logado e esta na tela Programar
#    E o usuario escolhe um rele da lista e clica em programar
#    E o formulario para programacao do rele e apresentado na tela
#    E o usuario seleciona o tipo de programacao para Diario
#    E o usuario insere "02:00" em horario Ligar
#    E o usuario insere "19:00" em horario Desligar
#    Quando  o usuario clicar no botao Programar.
#    Entao : os horarios do dispositivo serao programados com sucesso.
#
#  Cenário: Programar um dispositivo horario diario sem sucesso
#    Dado que o usuario esta logado e esta na tela Programar
#    E o usuario escolhe um rele da lista e clica em programar
#    E o formulario para programacao do rele e apresentado na tela
#    E o usuario seleciona o tipo de programacao para Diario
#    E o usuario nao insere 0 horario Ligar
#    E o usuario insere "19:00" em horario Desligar
#    Quando  o usuario clicar no botao Programar.
#    Entao : o rele nao sera programado com sucesso.
#    E o campo Horario Ligar ficara destacado em vermelho
#
#  Cenário: Programar um dispositivo Intervalo de datas com sucesso
#    Dado que o usuario esta logado e esta na tela Programar
#    E o usuario escolhe um rele da lista e clica em programar
#    E o formulario para programacao do rele e apresentado na tela
#    E o usuario seleciona o tipo de programacao para Intervalo de datas
#    E o usuario insere "26/11/2023" em Data Inicial
#    E o usuario insere "28/11/2023" em Data Final
#    E o usuario insere "02:00" em horario Ligar
#    E o usuario insere "19:00" em horario Desligar
#    Quando  o usuario clicar no botao Programar.
#    Entao : os horarios do dispositivo serao programados com sucesso.

  Cenário: Programar um dispositivo Intervalo de datas sem sucesso
    Dado que o usuario esta logado e esta na tela Programar
    E o usuario escolhe um rele da lista e clica em programar
    E o formulario para programacao do rele e apresentado na tela
    E o usuario seleciona o tipo de programacao para Intervalo de datas
    E o usuario nao insere a Data Inicial
    E o usuario insere a  Data Final
    E o usuario insere "02:00" em horario Ligar
    E o usuario insere "19:00" em horario Desligar
    Quando  o usuario clicar no botao Programar.
    Entao : os horarios do dispositivo nao serao programados com sucesso.
    E os campos data inicial e final ficaram destacados em vermelho





