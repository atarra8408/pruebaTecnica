package co.com.bancolombia.automatizacion.herokuap.tasks;

import static co.com.bancolombia.automatizacion.herokuap.user_interface.HeroHomePage.DESKTOP_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.automatizacion.herokuap.model.OptionMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Enter implements Task {
	
	private final OptionMenu optionMenu;
	
	public Enter(OptionMenu optionMenu) {
		this.optionMenu = optionMenu;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(DESKTOP_MENU.of(optionMenu.getOption())));
	}

	public static Enter to(OptionMenu optionMenu) {
		return instrumented(Enter.class, optionMenu);
	}

}
