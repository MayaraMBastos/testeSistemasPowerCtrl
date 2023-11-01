package Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsCadastro {
    private WebDriver driver;
    @Dado("O usuario esta na pagina de cadastro de usuario {string}")
    public void oUsuarioEstaNaPaginaDeCadastroDeUsuario(String url) {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayba\\Desktop\\trabalhoTesteSistemas\\chromedriver-win64\\chromedriver.exe");

        driver.get(url);
        driver.manage().window().maximize();
    }

    @E("O usuario preenche os dados nome completo {string}")
    public void oUsuarioPreencheOsDadosNomeCompleto(String nomeCompleto) {
        driver.findElement(By.id("nomecompleto")).sendKeys(nomeCompleto);

    }

    @E("O usuario preenche o campo email {string}")
    public void oUsuarioPreencheOCampoEmail(String email) {

        driver.findElement(By.id("email")).sendKeys(email);
    }

    @Quando("O usuario deixa os demais campos em branco")
    public void oUsuarioDeixaOsDemaisCamposEmBranco() {
    }

    @E("Clica no botão cadastrar")
    public void clicaNoBotãoCadastrar() {
        driver.findElement(By.id("btnCadastrar")).click();
    }

    @Entao("O cadastro não é realizado")
    public void oCadastroNãoÉRealizado() {
    }

    @E("Os campos em branco ficam destacados em vermelho")
    public void osCamposEmBrancoFicamDestacadosEmVermelho() {
    }
}
