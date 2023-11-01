package com.vega.PowerCtrl.Controller;

import com.vega.PowerCtrl.Service.S_Usuario;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("usuario")
public class C_Login {

    @GetMapping("/")
    public String login() {
        return "Login/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.setAttribute("usuario", null);
        return "redirect:/";
    }

    @PostMapping("/")
    public String processLogin(@RequestParam("usuario") String nome, @RequestParam("senha") String senha, HttpSession session, HttpServletRequest request) {

        session.setAttribute("usuario", S_Usuario.checarLogin(nome, senha));
        if (session.getAttribute("usuario") != null) {
            request.setAttribute("usuario", session.getAttribute("usuario"));
            // get do id de usuario logado

            return "redirect:/Home"; // Redirecionar para a página home em caso de sucesso
        } else {
            return "redirect:/Cadastro"; // Redirecionar de volta para a página de login com um parâmetro de erro em caso de falha
        }
    }
}