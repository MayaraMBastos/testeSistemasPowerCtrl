package Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsConfiguracoes {

    private WebDriver driver;
    @Dado("O usuario esta logado e na pagina configuracoes")
    public void oUsuarioEstaLogadoENaPaginaConfiguracoes() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayba\\Desktop\\trabalhoTesteSistemas\\chromedriver-win64\\chromedriver.exe");

        driver.get("http://localhost:8080/configuracoes");
        driver.manage().window().maximize();
    }

    @E("O usuario altera o campo nome para {string}")
    public void oUsuarioAlteraOCampoNomePara(String nomeCompleto) {
        driver.findElement(By.id("nomeSetor")).sendKeys(nomeCompleto);
    }

    @E("O usuario insere a senha no campo senha atual {string}")
    public void oUsuarioInsereASenhaNoCampoSenhaAtual(String senhaAtual) {
        driver.findElement(By.id("senhaAtual")).sendKeys(senhaAtual);
    }

    @Quando("Clicar no botao editar")
    public void clicarNoBotaoEditar() {
        driver.findElement(By.id("btnEditarCadastro")).click();
    }

    @Entao("Os dados nao sao editados")
    public void osDadosNaoSaoEditados() {
    }

    @E("O campo nome em branco fica destacado em vermelho")
    public void oCampoNomeEmBrancoFicaDestacadoEmVermelho() {
    }
}
