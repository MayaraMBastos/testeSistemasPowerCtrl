package Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsExcluirRele {
    private WebDriver driver;
    @Dado("O usuario esta na pagina de lista de dispositivos")
    public void oUsuarioEstaNaPaginaDeListaDeDispositivos() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayba\\Desktop\\trabalhoTesteSistemas\\chromedriver-win64\\chromedriver.exe");

        driver.get("http://localhost:8080/gerenciar");
        driver.manage().window().maximize();
    }

    @E("usuario escolhe um rele e clica no botao excluir")
    public void usuarioEscolheUmReleEClicaNoBotaoExcluir() {
        driver.findElement(By.xpath("//*[@id=\"listaGerenciar\"]/div/table/tbody/tr[7]/td[2]/a")).click();

    }

    @Quando("Aparece pop-up alertando se quer mesmo deletar o rele")
    public void aparecePopUpAlertandoSeQuerMesmoDeletarORele() {
    }

    @E("O usuario clica em Deletar")
    public void oUsuarioClicaEmDeletar() {
    }

    @Entao("O rele e deletado")
    public void oReleEDeletado() {
    }
}
