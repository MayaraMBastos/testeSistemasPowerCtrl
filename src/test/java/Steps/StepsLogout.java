package Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsLogout {
    private WebDriver driver;
    @Dado("que o usuario esta logado e esta na tela Dashboard")
    public void queOUsuarioEstaLogadoEEstaNaTelaDashboard() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayba\\Desktop\\trabalhoTesteSistemas\\chromedriver-win64\\chromedriver.exe");

        driver.get("http://localhost:8080/");
        driver.manage().window().maximize();
    }

    @E("o usuario seleciona no menu a opcao Sair")
    public void oUsuarioSelecionaNoMenuAOpcaoSair() {
        driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[7]/a")).click();
    }

    @E("um pop-up e apresentado na tela")
    public void umPopUpEApresentadoNaTela() {
    }

    @Quando("o usuario clica no botao Sim")
    public void oUsuarioClicaNoBotaoSim() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
    }

    @Entao("o logout e efetuado com sucesso.")
    public void oLogoutEEfetuadoComSucesso() {
    }

    @E("a tela de login é apresentada na tela")
    public void aTelaDeLoginÉApresentadaNaTela() {
    }
}
