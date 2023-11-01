package com.vega.PowerCtrl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Ajuda {

    @GetMapping("/ajuda")
    public String pagAjuda(){
        return "Ajuda/ajuda";
    }
}
