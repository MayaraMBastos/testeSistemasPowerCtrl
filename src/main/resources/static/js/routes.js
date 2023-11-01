
$("a").click(function (event) {
  event.preventDefault();
  const url = $(this).attr("href");
    controleRotasGet(url);
});

$("#btnEditarRele").click(function (event) {
  event.preventDefault();
    const urlId = $(this).attr("href");
    rotasBotoesEditar(urlId);

});

$("#editarRele").click(function (event) {
  event.preventDefault();
    editarRele();
});
//$("#editarRele").click(function (event) {
//  event.preventDefault();
//  const urlbtn = $(this).attr("href");
//    editarRele(urlbtn);
//});


function rotasBotoesEditar(urlId){
  $.get(urlId, function(data) {
    $(".container").html(data);

  });
}

function controleRotasGet(url) {

  switch (url) {
    case "/Home":
      $.get(url, function(data) {
        $(".container").html(data);
      });
      break;

    case "/gerenciar":
      $.get(url, function(data) {
        $(".container").html(data);
      });
      break;
    case "/gerenciarAdd":
      $.get(url, function(data) {
        $(".container").html(data);
        $("#cadastrarRele").click(cadastroRele);

      });
      break;
      
      case "/gerenciarEditar":
      $.get(url, function(data) {
        $(".container").html(data);
        //$("#cadastrarRele").click(cadastroRele);

      });
      break;

    case "/programar":
      $.get(url, function(data) {
        $(".container").html(data);
        $("#selecionarOpc").change(mostraDivDatas);
        $("#dataInicial").click(dataAtualProgramacao);
        $("#dataFinal").click(dataAtualProgramacao);
      });
      break;
    case "/graficos":
      $.get(url, function(data) {
        $(".container").html(data);
        $("#enviar").click(cadastrarUsuario);
      });
      break;
    case "/ajuda":
      $.get(url, function(data) {
        $(".container").html(data);
        $("#enviar").click(enviarCadastroSoftware);
      });
      break;
    case "/configuracoes":
      $.get(url, function(data) {
        $(".container").html(data);
        $("#btnEditarCadastro").click(editarUsuario);
      });
      break;
    case "/logout":
      gerarSwal(url);

      break;
    default:
      $.get(url, function(data) {
        $(".container").html(data);
      });
  }
}
