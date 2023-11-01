package com.vega.PowerCtrl.Controller;

import com.vega.PowerCtrl.Model.M_Mensagens;
import com.vega.PowerCtrl.Service.S_Cadastro;
import com.vega.PowerCtrl.Service.S_Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class C_Cadastro {

    @GetMapping("/Cadastro")
    public String pagCadastro() {
        return "Cadastro/cadastro";
    }


    @PostMapping("/Cadastro")
    @ResponseBody
    public String postCadastro(@RequestParam("nomecompleto") String nomecompleto,
                               @RequestParam("cpf") String cpf,
                               @RequestParam("cidade") String cidade,
                               @RequestParam("estado") String estado,
                               @RequestParam("endereco") String endereco,
                               @RequestParam("cep") String cep,
                               @RequestParam("email") String email,
                               @RequestParam("telefone") String telefone,
                               @RequestParam("usuario") String usuario,
                               @RequestParam("senha") String senha,
                               @RequestParam("senhaRepeticao") String senhaRepeticao,
                               RedirectAttributes redirectAttributes) { // substituido o model


        M_Mensagens m_resposta = S_Cadastro.setCadastro(nomecompleto, cpf, cidade, estado, endereco, cep, email, telefone, usuario, senha, senhaRepeticao);
        if (m_resposta.getSalvar()) {
            redirectAttributes.addFlashAttribute("errorMessage", m_resposta.getMensagem());
            return "redirect:/";
        } else {
            redirectAttributes.addFlashAttribute("errorMessage", m_resposta.getMensagem());
            return "redirect:/Cadastro";
        }
    }
}
