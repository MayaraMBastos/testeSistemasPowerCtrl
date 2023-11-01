package Steps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  // O diretório onde estão os arquivos .feature
        glue = "test.java.Steps"               // O pacote com suas classes de steps
)
public class RunCucumberTests {
}