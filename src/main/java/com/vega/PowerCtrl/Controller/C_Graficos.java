package com.vega.PowerCtrl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Graficos {

    @GetMapping("/graficos")
    public String pagGraficos(){
        return "Graficos/graficos";
    }
}
