package Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsGraficos {
    private WebDriver driver;
    @Dado("O usuario esta na pagina do grafico")
    public void oUsuarioEstaNaPaginaDoGrafico() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayba\\Desktop\\trabalhoTesteSistemas\\chromedriver-win64\\chromedriver.exe");

        driver.get("http://localhost:8080/graficos");
        driver.manage().window().maximize();
    }

    @E("O usuario seleciona no menu a opção Graficos")
    public void oUsuarioSelecionaNoMenuAOpçãoGraficos() {
    }

    @E("Na pagina de graficos estao os dados armazenados ate o momento")
    public void naPaginaDeGraficosEstaoOsDadosArmazenadosAteOMomento() {
    }

    @Quando("O usuario clica em um periodo futuro")
    public void oUsuarioClicaEmUmPeriodoFuturo() {
    }

    @Entao("Os dados deste periodo nao aparecem na tela")
    public void osDadosDestePeriodoNaoAparecemNaTela() {
    }
}
