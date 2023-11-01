package com.vega.PowerCtrl.Controller;

import com.vega.PowerCtrl.Model.M_Dispositivos;
import com.vega.PowerCtrl.Repository.R_Dispositivos;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("usuario")
public class C_Home {

    @Autowired
    private R_Dispositivos r_dispositivos;

    @GetMapping("/Home")
    public String getHome(HttpSession session,
                          Model model){
        if(session.getAttribute("usuario") != null){
            model.addAttribute("usuario",session.getAttribute("usuario"));
            return "Home/home";
        }else{
            return "redirect:/";
        }
    }

    @GetMapping("/home")
    public String getPartialHome(HttpServletRequest request, Model model){
        if(request.getHeader("Referer") != null){
            List<M_Dispositivos> dispositivos = r_dispositivos.findAll();
            model.addAttribute("dispositivos", dispositivos);
            return "Home/listaHome";
        }else{
            return "redirect:/";
        }
    }



}
