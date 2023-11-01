package com.vega.PowerCtrl.Service;

import com.vega.PowerCtrl.Model.M_Usuario;
import com.vega.PowerCtrl.Repository.R_Cadastro;

import org.springframework.stereotype.Service;

@Service
public class S_Usuario {

    private static R_Cadastro usuario;

    public S_Usuario(R_Cadastro usuario){
        this.usuario = usuario;
    }

    public static M_Usuario checarLogin(String nome, String senha) { // trocar para MCadastro

        return usuario.findByUsuarioESenha(nome, senha);
    }




}
