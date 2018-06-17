package co.com.bancolombia.automatizacion.herokuap.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static co.com.bancolombia.automatizacion.herokuap.user_interface.HeroHomePage.LINK_INICIAL;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoTo implements Task{
	
	private final String strUrl;
	
	public GoTo (String strUrl) {
		this.strUrl = strUrl;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(LINK_INICIAL.of(strUrl)));
	}
	
	public static GoTo to(String strUrl) {
		return instrumented(GoTo.class, strUrl);
	}

}
