function campoVazio(campo) {
  if (campo == "") {
    return true;
  } else {
    return false;
  }
}

function cadastroRele() {
  let enviar = true;
  let nomeSetor = $("#nomeSetor").val();
  let codigoDispositivo = $("#codigoDispositivo").val();

  $("#errorMessage").text("");
  if (campoVazio(nomeSetor)) {
    enviar = false;
    alertaCampos("nomeSetor")
    $("#errorMessage").append("O nome do setor deve ser preenchido!"); // substituir por texto no placeholder
  }

  if (campoVazio(codigoDispositivo)) {
    enviar = false;
    alertaCampos("codigoDispositivo")
    $("#errorMessage").append(
      "O codigo do dispositivo deve ser preenchido!"
    );
  }
  if (enviar) {
    $.ajax({
      type: "POST",
      url: "/adicionarRele",
      data: {
        nomeSetor: nomeSetor,
        codigoDispositivo: codigoDispositivo
      },
      success: function (data) {
              if (data.salvar == false) {
                alert(data.mensagem);
              } else {
                alert(data.mensagem);
                window.location = "/Home";
              }
      },
      error: function () {
        alert("Falha ao cadastrar o dispositivo.");
      },
    });
  }
}

function editarRele(urlBtn) {
  let enviar = true;
  let nomeSetor = $("#nomeSetor").val();
  let codigoDispositivo = $("#codigoDispositivo").val();

  $("#errorMessage").text("");
  if (campoVazio(nomeSetor)) {
    enviar = false;
    alertaCampos("nomeSetor")
    $("#errorMessage").append("O nome do setor deve ser preenchido!");
  }

  if (campoVazio(codigoDispositivo)) {
    enviar = false;
    alertaCampos("codigoDispositivo")
    $("#errorMessage").append(
      "O codigo do dispositivo deve ser preenchido!"
    );
  }
  if (enviar) {
    $.ajax({
      type: "POST",
      url: urlBtn,
      data: {
        nomeSetor: nomeSetor,
        codigoDispositivo: codigoDispositivo
      },
      success: function (data) {
              if (data.salvar == false) {
                alert(data.mensagem);
              } else {
                alert(data.mensagem);
                window.location = "/Home";
              }
      },
      error: function () {
        alert("Falha ao atualizar o dispositivo.");
      },
    });
  }
}
