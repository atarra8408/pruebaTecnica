package co.com.bancolombia.automatizacion.herokuap.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task{
	
	private final PageObject page;

	public OpenTheBrowser (PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {		
		actor.attemptsTo(Open.browserOn(page));
	}
	
	public static OpenTheBrowser at(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);
	}

}
