package Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StepsProgramarRele {
    private WebDriver driver;
    @Dado("que o usuario esta logado e esta na tela Programar")
    public void queOUsuarioEstaLogadoEEstaNaTelaProgramar() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayba\\Desktop\\trabalhoTesteSistemas\\chromedriver-win64\\chromedriver.exe");

        driver.get("http://localhost:8080/gerenciar");
        driver.manage().window().maximize();
    }

    @E("o usuario escolhe um rele da lista e clica em programar")
    public void oUsuarioEscolheUmReleDaListaEClicaEmProgramar() {
        driver.findElement(By.xpath("//*[@id=\"btnEditarRele\"]")).click();
    }

    @E("o formulario para programacao do rele e apresentado na tela")
    public void oFormularioParaProgramacaoDoReleEApresentadoNaTela() {
    }

    @E("o usuario seleciona o tipo de programacao para Intervalo de datas")
    public void oUsuarioSelecionaOTipoDeProgramacaoParaIntervaloDeDatas() {
        Select ano = new Select(driver.findElement(By.id("selecionarOpc")));
        ano.selectByVisibleText("Intervalo de Datas");
    }

    @E("o usuario nao insere a Data Inicial")
    public void oUsuarioNaoInsereADataInicial() {
        driver.findElement(By.id("dataInicial")).sendKeys("");
    }

    @E("o usuario insere a  Data Final")
    public void oUsuarioInsereADataFinal() {
        driver.findElement(By.id("dataFinal")).sendKeys("");
    }

    @E("o usuario insere {string} em horario Ligar")
    public void oUsuarioInsereEmHorarioLigar(String horaLiga) {
        driver.findElement(By.id("horarioInicial")).sendKeys(horaLiga);
    }

    @E("o usuario insere {string} em horario Desligar")
    public void oUsuarioInsereEmHorarioDesligar(String horaDesliga) {
        driver.findElement(By.id("horarioFinal")).sendKeys(horaDesliga);
    }

    @Quando("o usuario clicar no botao Programar.")
    public void oUsuarioClicarNoBotaoProgramar() {
        driver.findElement(By.xpath("//*[@id=\"formularioProg\"]/a")).click();

    }

    @Entao(": os horarios do dispositivo nao serao programados com sucesso.")
    public void osHorariosDoDispositivoNaoSeraoProgramadosComSucesso() {
    }

    @E("os campos data inicial e final ficaram destacados em vermelho")
    public void osCamposDataInicialEFinalFicaramDestacadosEmVermelho() {
    }
}
