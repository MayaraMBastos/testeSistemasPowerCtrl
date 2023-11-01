package com.vega.PowerCtrl.Controller;

import com.vega.PowerCtrl.Model.M_Dispositivos;
import com.vega.PowerCtrl.Model.M_Mensagens;
import com.vega.PowerCtrl.Model.M_Usuario;
import com.vega.PowerCtrl.Repository.R_Dispositivos;
import com.vega.PowerCtrl.Service.S_Dispositivos;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class C_GerenciarDispositivos {

    @Autowired
    private R_Dispositivos r_dispositivos;

    @GetMapping("/gerenciar")
    public String pagGerenciar(Model model) {
        List<M_Dispositivos> dispositivos = r_dispositivos.findAll();
        model.addAttribute("dispositivos", dispositivos);
        return "Gerenciar/gerenciarLista";
    }

    //post para envio de eventos on off

    @GetMapping("/gerenciarAdd")
    public String pagGerenciarAdd() {
        return "Gerenciar/gerenciarAdd";
    }

    @PostMapping("/adicionarRele")
    @ResponseBody
    public M_Mensagens postCadastroRele(@RequestParam("nomeSetor") String nomeSetor,
                                        @RequestParam("codigoDispositivo") String codigoDispositivo,
                                        HttpSession session) {
        Object objusuario = session.getAttribute("usuario");
        M_Mensagens m_mensagens = S_Dispositivos.setCadastroRele(nomeSetor, codigoDispositivo, (M_Usuario) objusuario);

        if (m_mensagens.getSalvar()) {
            return  m_mensagens; // retorna mensagem de sucesso

        } else {
            return m_mensagens; // retorna mensagens de erro
        }
    }

//    @GetMapping("/editarRele")
//    public String pagEditar(@PathVariable Long id_dispositivo, Model model,  HttpSession session) {
//        Object objusuario = session.getAttribute("usuario"); //adicionado
//        M_Dispositivos dispositivos = r_dispositivos.findById(id_dispositivo).orElse(null);
//        model.addAttribute("dispositivos", dispositivos);
//        model.addAttribute("usuario", objusuario);
//        return "Gerenciar/gerenciarEditar";
//    }

    @GetMapping("/editarRele/{id_dispositivo}")
    public String pagGerenciarEditar(@PathVariable Long id_dispositivo, Model model,  HttpSession session) {
        Object objusuario = session.getAttribute("usuario"); //adicionado
        M_Dispositivos dispositivos = r_dispositivos.findById(id_dispositivo).orElse(null);
        model.addAttribute("dispositivos", dispositivos);
        model.addAttribute("usuario", objusuario);
        return "Gerenciar/gerenciarEditar";
    }


    @PutMapping("/editarRele/{id_dispositivo}")
    @ResponseBody
    public M_Mensagens postEditarRele(@RequestParam("nomeSetor") String nomeSetor,
                                      @RequestParam("codigoDispositivo") String codigoDispositivo,
                                      @PathVariable Long id_dispositivo,
                                      HttpSession session) {

        Object objusuario = session.getAttribute("usuario");
        Long id_rele = r_dispositivos.findByIdDispositivo(id_dispositivo);
// model para o thymelief
        M_Mensagens m_mensagens = S_Dispositivos.editarCadastroRele(nomeSetor, codigoDispositivo, id_rele, (M_Usuario) objusuario);

        return m_mensagens;

    }

    @GetMapping("/deletar/{id_dispositivo}")
    public String excluirRele(@PathVariable Long id_dispositivo) {
        r_dispositivos.deleteById(id_dispositivo);
        return "redirect:/gerenciarLista";
    }

    @GetMapping("/programarRele/{id_dispositivo}")
    public String pagGerenciarProgramar(@PathVariable Long id_dispositivo, Model model) {
        M_Dispositivos dispositivos = r_dispositivos.findById(id_dispositivo).orElse(null);
        model.addAttribute("dispositivos", dispositivos);
        return "Gerenciar/gerenciarProgramar";
    }

    //post para programar rele
}
