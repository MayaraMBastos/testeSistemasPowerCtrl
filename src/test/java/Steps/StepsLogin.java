package Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsLogin {

    private WebDriver driver;
    @Dado("o usuario esta na pagina de Login {string}")
    public void o_usuario_esta_na_pagina_de_login(String url) {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayba\\Desktop\\trabalhoTesteSistemas\\chromedriver-win64\\chromedriver.exe");

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        throw new io.cucumber.java.PendingException();
    }
    @Quando("ele preenche os campos de usuario {string} e senha {string}")
    public void ele_preenche_os_campos_de_usuario_e_senha(String usuario, String senha) {
        driver.findElement(By.id("usuario")).sendKeys(usuario);
        driver.findElement(By.id("senha")).sendKeys(senha);
        throw new io.cucumber.java.PendingException();
    }
    @Quando("clica no botao Logar")
    public void clica_no_botao_logar() {
        driver.findElement(By.id("btnLogar")).click();
        throw new io.cucumber.java.PendingException();
    }
    @Entao("o login e realizado com sucesso")
    public void o_login_e_realizado_com_sucesso() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("o navegador e redirecionado para a pagina Home")
    public void o_navegador_e_redirecionado_para_a_pagina_home() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

//

//    @Dado("o usuario esta na pagina de Login {string}")
//    public void o_usuario_esta_na_pagina_de_login(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Quando("ele preenche os campos de usuario {string} e senha {string}")
//    public void ele_preenche_os_campos_de_usuario_e_senha(String string, String string2) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Quando("clica no botao Logar")
//    public void clica_no_botao_logar() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Entao("o login nao e realizado com sucesso")
//    public void o_login_nao_e_realizado_com_sucesso() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Entao("o navegador e redirecionado para a pagina Cadastro")
//    public void o_navegador_e_redirecionado_para_a_pagina_cadastro() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
}
