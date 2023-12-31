function gerarSwal(url){

    Swal.fire({
      title: 'SAIR?',
      icon: 'warning',
      html:
        'Voce realmente deseja sair da aplicação?',
      confirmButtonColor: '#28a745',
       cancelButtonColor: '#d33',
      showCloseButton: true,
      showCancelButton: true,
      focusConfirm: false,
      confirmButtonText:
        '<i class="fa fa-thumbs-up"></i> Sim',
      confirmButtonAriaLabel: 'Thumbs up, great!',
      cancelButtonText:
        '<i class="fa fa-thumbs-down"></i> Não',
      cancelButtonAriaLabel: 'Thumbs down'
    }).then((result) => {
        if(result.isConfirmed){
           window.location = "/logout"
    }
    });
}

function alertaCampos(campo){
  var elemento = $('#'+campo);
  elemento.css('border', '2px solid red');
}