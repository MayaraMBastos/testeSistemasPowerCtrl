package Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsCadastroRele {

    private WebDriver driver;
    @Dado("que o usuario esta na tela de cadastro de reles")
    public void queOUsuarioEstaNaTelaDeCadastroDeReles() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayba\\Desktop\\trabalhoTesteSistemas\\chromedriver-win64\\chromedriver.exe");

        driver.get("http://localhost:8080/gerenciarAdd");
        driver.manage().window().maximize();
    }

    @E("o usuario insere o nome do setor {string}  onde o dispositivo sera instalado")
    public void oUsuarioInsereONomeDoSetorOndeODispositivoSeraInstalado(String nomeSetor) {
        driver.findElement(By.id("nomeSetor")).sendKeys(nomeSetor);

    }

    @E("o usuario insere um codigo valido {string} do dispositivo")
    public void oUsuarioInsereUmCodigoValidoDoDispositivo(String codeRele) {
        driver.findElement(By.id("codigoDispositivo")).sendKeys(codeRele);
    }

    @Quando("e clica no botao Cadastrar.")
    public void eClicaNoBotaoCadastrar() {
        driver.findElement(By.id("cadastrarRele")).click();
    }

    @Entao("o rele e cadastrado com sucesso.")
    public void oReleECadastradoComSucesso() {
    }
}
