package co.com.bancolombia.automatizacion.herokuap.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.automatizacion.herokuap.model.DataForm;
import static co.com.bancolombia.automatizacion.herokuap.user_interface.ScheduleAppointmentPage.DAY_APPINTMENT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Complete implements Task{
	
	private final DataForm dataForm;
	
	public Complete(DataForm dataForm) {
		this.dataForm = dataForm;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(DAY_APPINTMENT));
		System.out.println(dataForm.getDate());
		actor.attemptsTo(Enter.theValue(dataForm.getDate()).into(DAY_APPINTMENT));
	}
	
	public static Complete the(DataForm dataForm) {
		return instrumented(Complete.class, dataForm);
	}

}
