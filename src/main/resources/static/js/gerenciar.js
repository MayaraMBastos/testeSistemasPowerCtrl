// selecionada opcao de programacao com datas
function mostraDivDatas() {
    // Esconder a div inicialmente
    $('#datas').hide();
    var opcao = $("#selecionarOpc option:selected").val();

        if (opcao === '3') {
            // Mostrar a div se a opção com value 2 for selecionada
            $('#datas').show();
        } else {
            // Caso contrário, esconder a div
            $('#datas').hide();
        }
}

function dataAtualProgramacao(){
var dataAtual = new Date().toISOString().split("T")[0];

            // Define a data mínima no campo de data para a data atual
            $("#dataInicial").attr("min", dataAtual);
            $("#dataFinal").attr("min", dataAtual);
}


