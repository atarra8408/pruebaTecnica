package co.com.bancolombia.automatizacion.herokuap.step_definitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.automatizacion.herokuap.model.Option;
import co.com.bancolombia.automatizacion.herokuap.tasks.CompleteDoctor;
import co.com.bancolombia.automatizacion.herokuap.tasks.CompletePointment;
import co.com.bancolombia.automatizacion.herokuap.tasks.Enter;
import co.com.bancolombia.automatizacion.herokuap.tasks.GoTo;
import co.com.bancolombia.automatizacion.herokuap.tasks.OpenTheBrowser;
import co.com.bancolombia.automatizacion.herokuap.user_interface.HeroHomePage;
import co.com.bancolombia.automatizacion.herokuap.util.FormDoctor;
import co.com.bancolombia.automatizacion.herokuap.util.FormPointment;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class HerokuappStepDefinitions {
	@Managed(driver="chrome")
	private WebDriver hisDriver;
	private HeroHomePage heroHomePage;
	private Actor heroUser = Actor.named("heroUser");
	
	@Before
	public void setUp() throws Exception {	   
		heroUser.can(BrowseTheWeb.with(hisDriver));
	}

	@Given("^that user want open the herokuapp platform$")
	public void that_user_want_open_the_herokuapp_platform() throws Exception {
	    heroUser.wasAbleTo(OpenTheBrowser.at(heroHomePage));
	    heroUser.wasAbleTo(GoTo.to("http://automatizacion.herokuapp.com/pperez/"));
	}


	@And("^he want to open the page (.*)$")
	public void he_want_to_open_the_page_agendar_citas(String strOption) throws Exception {
	    heroUser.wasAbleTo(Enter.to(Option.valueOf(strOption.toUpperCase().replace(" ", "_")).menu()));
	}

	@When("^he schedules an appointment with the data$")
	public void he_schedules_an_appointment_with_the_data(DataTable data) throws Exception {
		List<List<String>> listData=data.raw();
		heroUser.wasAbleTo(CompletePointment.the(FormPointment.with(listData)));
	}
	@When("^he add an doctor with the data$")
	public void he_add_an_doctor_with_the_data(DataTable data) throws Exception {
		List<List<String>> listData=data.raw();
		heroUser.wasAbleTo(CompleteDoctor.the(FormDoctor.with(listData)));
	}

	@Then("^he verifies that the appointment was scheduled$")
	public void he_verifies_that_the_appointment_was_scheduled() throws Exception {
	    
	}
}
