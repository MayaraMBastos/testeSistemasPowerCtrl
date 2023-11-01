package com.vega.PowerCtrl.Controller;

import com.vega.PowerCtrl.Model.M_Mensagens;
import com.vega.PowerCtrl.Model.M_Usuario;
import com.vega.PowerCtrl.Service.S_Cadastro;
import jakarta.persistence.PostUpdate;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class C_Configuracoes {

    @GetMapping("/configuracoes")
    public String pagConfiguracoes(HttpServletRequest request,
                                   HttpSession session,
                                   Model model){
        if(request.getHeader("Referer") != null){
            M_Usuario usuario = (M_Usuario) session.getAttribute("usuario");
            model.addAttribute("usuario",usuario);
            return "Configuracoes/configuracoes";
        }else{
            return null;
        }
    }

    @PostMapping("/editarUsuario") // deve ser feito com id
    @ResponseBody
    public M_Mensagens postEditarUsuario(HttpServletRequest request,
                                         HttpSession session,
                                         @RequestParam("nomecompleto") String nomecompleto,
                                         @RequestParam("cpf") String cpf,
                                         @RequestParam("cidade") String cidade,
                                         @RequestParam("estado") String estado,
                                         @RequestParam("endereco") String endereco,
                                         @RequestParam("cep") String cep,
                                         @RequestParam("email") String email,
                                         @RequestParam("telefone") String telefone,
                                         @RequestParam("usuario") String usuario,
                                         @RequestParam("senhaAtual") String senhaAtual,
                                         @RequestParam("novaSenha") String novaSenha,
                                         @RequestParam("senhaRepeticao") String senhaRepeticao){
        Object objusuario = session.getAttribute("usuario"); // passar o obj para o service
        return  S_Cadastro.editCadastro(nomecompleto,cpf,cidade,estado,endereco,cep,email,telefone,usuario,senhaAtual,novaSenha,senhaRepeticao, (M_Usuario) objusuario);

    }

}
