$('#btnCadastrar').click(cadastrarUsuario);


function campoVazio(campo) {
  if (campo == '') {
    return true;
  } else {
    return false;
  }
}



function cadastrarUsuario() {
  let envio = true;
  let nomecompleto = $('#nomecompleto').val();
  let cpf = $('#cpf').val();
  let cidade = $('#cidade').val();
  let estado = $('#estado').val();
  let endereco = $('#endereco').val();
  let cep = $('#cep').val();
  let email = $('#email').val();
  let telefone = $('#telefone').val();
  let usuario = $('#usuario').val();
  let senha = $('#senha').val();
  let senhaRepeticao = $('#senhaRepeticao').val();

  //validacoes
  $('#errorMessage').text('');
  if (campoVazio(nomecompleto)) {
    envio = false;
    alertaCampos("nomecompleto");
    $('#errorMessage').append('O nome precisa ser preenchido!<br>');
  }

  if(!validarCPF(cpf)){
    envio = false;
    alertaCampos("cpf");
    $('#errorMessage').append('CPF Inválido!<br>');
}

if (campoVazio(cidade)) {
    envio = false;
     alertaCampos("cidade");
    $('#errorMessage').append('A cidade precisa ser preenchida!<br>');
  }

  if (campoVazio(estado)) {
    envio = false;
     alertaCampos("estado");
    $('#errorMessage').append('O estado precisa ser preenchido!<br>');
  }

  if (campoVazio(endereco)) {
    envio = false;
     alertaCampos("endereco");
    $('#errorMessage').append('O endereco precisa ser preenchido!<br>');
  }

  // validar CEP existente
  if (campoVazio(cep)) {
    envio = false;
     alertaCampos("cep");
    $('#errorMessage').append('O CEP precisa ser preenchido!<br>');
  }
// validar email 
  if (campoVazio(email)) {
    envio = false;
     alertaCampos("email");
    $('#errorMessage').append('O e-mail precisa ser preenchido!<br>');
  }

  // validar para numeros usar mascaras

  if (campoVazio(usuario)) {
    envio = false;
     alertaCampos("usuario");
    $('#errorMessage').append('O usúario precisa ser preenchido!<br>');
  }

  if(campoVazio(senha) || senha != senhaRepeticao){
    envio = false;
 alertaCampos("senha");
  alertaCampos("senhaRepeticao");
    $('#errorMessage').append('A senha precisa ser preenchida e igual a confirmação de senha!<br>');
}

  if (envio) {
    $.ajax({
      type: 'POST', // Tipo da requisição
      url: '/Cadastro', // Caminho para envio da requisição
      data: {
        nomecompleto: nomecompleto,
        cpf: cpf,
        cidade: cidade,
        estado: estado,
        endereco: endereco,
        cep: cep,
        email: email,
        telefone: telefone,
        usuario: usuario,
        senha: senha,
        senhaRepeticao: senhaRepeticao,
      },
      success: function (data) {
        if (data.salvar == false) {
          alert(data);
        } else {
          alert('Cadastro realizado com sucesso!');
          window.location = "/";
        }
      },
      error: function () {
        alert('Falha na comunicação com o servidor');
      },
    });
  }
}

function editarUsuario() {
  let envio = true;
  let nomecompleto = $('#nomecompleto').val();
  let cpf = $('#cpf').val();
  let cidade = $('#cidade').val();
  let estado = $('#estado').val();
  let endereco = $('#endereco').val();
  let cep = $('#cep').val();
  let email = $('#email').val();
  let telefone = $('#telefone').val();
  let usuario = $('#usuario').val();
  let senhaAtual = $('#senhaAtual').val();
  let novaSenha = $('#novaSenha').val();
  let senhaRepeticao = $('#senhaRepeticao').val();

  //validacoes
  $('#errorMessage').text('');
  if (campoVazio(nomecompleto)) {
    envio = false;
    alertaCampos("nomecompleto");
    $('#errorMessage').append('O nome precisa ser preenchido!<br>');
  }

  if(!validarCPF(cpf)){
    envio = false;
    alertaCampos("cpf");
    $('#errorMessage').append('CPF Inválido!<br>');
}

if (campoVazio(cidade)) {
    envio = false;
    alertaCampos("cidade");
    $('#errorMessage').append('A cidade precisa ser preenchida!<br>');
  }

  if (campoVazio(estado)) {
    envio = false;
    alertaCampos("estado");
    $('#errorMessage').append('O estado precisa ser preenchido!<br>');
  }

  if (campoVazio(endereco)) {
    envio = false;
    alertaCampos("endereco");
    $('#errorMessage').append('O endereco precisa ser preenchido!<br>');
  }

  // validar CEP existente
  if (campoVazio(cep)) {
    envio = false;
    alertaCampos("cep");
    $('#errorMessage').append('O CEP precisa ser preenchido!<br>');
  }
// validar email
  if (campoVazio(email)) {
    envio = false;
    alertaCampos("email");
    $('#errorMessage').append('O e-mail precisa ser preenchido!<br>');
  }

  // validar para numeros usar mascaras
  /*if (campoVazio(telefone)) {
    envio = false;
    alertaCampos("nomecompleto");
    $('#errorMessage').append('O telefone precisa ser valido!<br>');
  }*/

  if (campoVazio(usuario)) {
    envio = false;
    alertaCampos("usuario");
    $('#errorMessage').append('O usúario precisa ser preenchido!<br>');
  }

  if (campoVazio(senhaAtual)) {
      envio = false;
      alertaCampos("senhaAtual");
      $('#errorMessage').append('Informe a senha atual para atualizar seus dados!<br>');
    }

  if(novaSenha != senhaRepeticao){
    envio = false;
    alertaCampos("novaSenha");
    alertaCampos("senhaRepeticao");
    $('#errorMessage').append('A senha precisa ser preenchida e igual a confirmação de senha!<br>');
}

  if (envio) {
    $.ajax({
      type: 'POST', // Tipo da requisição
      url: '/editarUsuario', // Caminho para envio da requisição
      data: {
        nomecompleto: nomecompleto,
        cpf: cpf,
        cidade: cidade,
        estado: estado,
        endereco: endereco,
        cep: cep,
        email: email,
        telefone: telefone,
        usuario: usuario,
        senhaAtual: senhaAtual,
        novaSenha: novaSenha,
        senhaRepeticao: senhaRepeticao,
      },
      success: function (data) {
        if (data.salvar == false) {
          alert(data.mensagem);
        } else {
          alert('Cadastro realizado com sucesso!');
          window.location = "/";
        }
      },
      error: function () {
        alert('Falha na comunicação com o servidor');
      },
    });
  }
}
