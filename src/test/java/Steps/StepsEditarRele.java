package Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsEditarRele {
    private WebDriver driver;
    @Dado("que o usuario esta logado e esta na tela Editar Rele")
    public void queOUsuarioEstaLogadoEEstaNaTelaEditarRele() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayba\\Desktop\\trabalhoTesteSistemas\\chromedriver-win64\\chromedriver.exe");

        driver.get("http://localhost:8080/gerenciar");
        driver.manage().window().maximize();
    }

    @E("o usuario clica no botao Editar de um dos reles")
    public void oUsuarioClicaNoBotaoEditarDeUmDosReles() {
        driver.findElement(By.xpath("//*[@id=\"btnEditarRele\"]")).click();
    }

    @E("o formulario para editar o rele e apresentado na tela")
    public void oFormularioParaEditarOReleEApresentadoNaTela() {
    }

    @E("o usuario altera o nome do setor para {string}")
    public void oUsuarioAlteraONomeDoSetorPara(String nomeSetor) {
        driver.findElement(By.id("nomeSetor")).sendKeys(nomeSetor);
    }

    @Quando(": o usuario clicar no botao editar.")
    public void oUsuarioClicarNoBotaoEditar() {
        driver.findElement(By.id("editarRele")).click();
    }

    @Entao("os dados do rele nao sao atualizados.")
    public void osDadosDoReleNaoSaoAtualizados() {
    }

    @E("o campo nome do setor e destacado em vermelho")
    public void oCampoNomeDoSetorEDestacadoEmVermelho() {
    }
}
