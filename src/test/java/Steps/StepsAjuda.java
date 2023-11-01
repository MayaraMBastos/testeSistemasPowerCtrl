package Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsAjuda {

    private WebDriver driver;
    @Dado("O usuario esta na pagina do dispositivo {string}")
    public void oUsuarioEstaNaPaginaDoDispositivo(String urlHome) {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayba\\Desktop\\trabalhoTesteSistemas\\chromedriver-win64\\chromedriver.exe");

        driver.get(urlHome);
        driver.manage().window().maximize();
    }

    @E("O usuario seleciona no menu a opcao Ajuda {string}")
    public void oUsuarioSelecionaNoMenuAOpcaoAjuda(String url) {
        driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[5]/a")).click();
    }

    @E("O usuario preenche o campo nome completo {string}")
    public void oUsuarioPreencheOCampoNomeCompleto(String nomeCompleto) {
        driver.findElement(By.id("nome")).sendKeys(nomeCompleto);
    }

    @Quando("O usuario deixa os outros campos em branco")
    public void oUsuarioDeixaOsOutrosCamposEmBranco() {
    }

    @E("Clica no botao enviar")
    public void clicaNoBotaoEnviar() {
        driver.findElement(By.id("envirEmail")).click();
    }

    @Entao("A mensagem nao e enviada")
    public void aMensagemNaoEEnviada() {
    }

    @E("Os campos em branco ficam destacados")
    public void osCamposEmBrancoFicamDestacados() {
    }
}
