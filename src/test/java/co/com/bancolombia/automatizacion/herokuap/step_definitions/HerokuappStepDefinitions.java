package co.com.bancolombia.automatizacion.herokuap.step_definitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.automatizacion.herokuap.model.Option;
import co.com.bancolombia.automatizacion.herokuap.tasks.Complete;
import co.com.bancolombia.automatizacion.herokuap.tasks.CompletePointment;
import co.com.bancolombia.automatizacion.herokuap.tasks.Enter;
import co.com.bancolombia.automatizacion.herokuap.tasks.GoTo;
import co.com.bancolombia.automatizacion.herokuap.tasks.OpenTheBrowser;
import co.com.bancolombia.automatizacion.herokuap.user_interface.HeroHomePage;
import co.com.bancolombia.automatizacion.herokuap.util.Form;
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

	@Given("^that user want open the herokuapp platform (.*)$")
	public void thatUserWantOpenTheHerokuappPlatform(String url) throws Exception {
	    heroUser.wasAbleTo(OpenTheBrowser.at(heroHomePage));
	    heroUser.wasAbleTo(GoTo.to(url));
	}

	@And("^he want to open the page (.*)$")
	public void heWantToOpenThePage(String strOption) throws Exception {
	    heroUser.wasAbleTo(Enter.to(Option.valueOf(strOption.toUpperCase().replace(" ", "_")).menu()));
	}

	@When("^he schedules an appointment with the data$")
	public void heSchedulesAnAppointmentWithTheData(DataTable data) throws Exception {
		List<List<String>> listData=data.raw();
		heroUser.wasAbleTo(CompletePointment.the(FormPointment.with(listData)));
	}
	@When("^he add an people with the data$")
	public void heAddAnPeopleWithTheData(DataTable data) throws Exception {
		List<List<String>> listData=data.raw();
		heroUser.wasAbleTo(Complete.the(Form.with(listData)));
	}

	@Then("^he verifies that the appointment was scheduled$")
	public void heVerifiesThatTheAppointmentWasScheduled(DataTable data) throws Exception {
	    
	}
	
	@Then("^he verifies that the appointment was not scheduled$")
	public void heVerifiesThatTheAppointmentWasNotScheduled(DataTable data) throws Exception {
	    
	}
}
