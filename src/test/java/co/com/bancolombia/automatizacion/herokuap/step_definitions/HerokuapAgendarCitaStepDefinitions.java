package co.com.bancolombia.automatizacion.herokuap.step_definitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.automatizacion.herokuap.tasks.OpenTheBrowser;
import co.com.bancolombia.automatizacion.herokuap.user_interface.HeroHomePage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class HerokuapAgendarCitaStepDefinitions {
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
	}


	@And("^he want to open the page agendar citas$")
	public void he_want_to_open_the_page_agendar_citas() throws Exception {
	    
	}

	@When("^he schedules an appointment with the data$")
	public void he_schedules_an_appointment_with_the_data(DataTable arg1) throws Exception {
	    
	}

	@Then("^he verifies that the appointment was scheduled$")
	public void he_verifies_that_the_appointment_was_scheduled() throws Exception {
	    
	}
}
