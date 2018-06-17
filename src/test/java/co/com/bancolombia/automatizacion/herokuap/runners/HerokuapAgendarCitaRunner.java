package co.com.bancolombia.automatizacion.herokuap.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/herokuappAgendarCita.feature",
		glue = {"co.com.bancolombia.automatizacion.herokuap.step_definitions"}
)

public class HerokuapAgendarCitaRunner {

}
