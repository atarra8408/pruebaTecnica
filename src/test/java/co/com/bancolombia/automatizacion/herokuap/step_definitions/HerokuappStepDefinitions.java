package co.com.bancolombia.automatizacion.herokuap.step_definitions;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.automatizacion.herokuap.model.Option;
import co.com.bancolombia.automatizacion.herokuap.questions.TheMessage;
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
	@Managed
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

	@Then("^verify that it was successfully added$")
	public void verifyThatItWasSuccessfullyAdded(DataTable data) throws Exception {
		List<List<String>> listData=data.raw();
		heroUser.should(seeThat(TheMessage.is(), containsString(listData.get(0).get(0))));
	}
	
	@Then("^verify that it has not been added correctly$")
	public void heVerifyThatItHasNotBeenAddedCorrectly(DataTable data) throws Exception {
		List<List<String>> listData=data.raw();
		heroUser.should(seeThat(TheMessage.is(), containsString(listData.get(0).get(0))));
	}
	
}
