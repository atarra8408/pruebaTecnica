package co.com.bancolombia.automatizacion.herokuap.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.automatizacion.herokuap.model.DataFormPointment;
import static co.com.bancolombia.automatizacion.herokuap.user_interface.ScheduleAppointmentPage.DAY_APPINTMENT;
import static co.com.bancolombia.automatizacion.herokuap.user_interface.ScheduleAppointmentPage.DOCUMENT;
import static co.com.bancolombia.automatizacion.herokuap.user_interface.ScheduleAppointmentPage.OBSERVATION;
import static co.com.bancolombia.automatizacion.herokuap.user_interface.ScheduleAppointmentPage.BTNSAVE;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompletePointment implements Task{
	
	private final DataFormPointment dataFormPointment;
	
	public CompletePointment(DataFormPointment dataFormPointment) {
		this.dataFormPointment = dataFormPointment;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(dataFormPointment.getDate()).into(DAY_APPINTMENT));
		actor.attemptsTo(Enter.theValue(dataFormPointment.getPatientDocument()).into(DOCUMENT.of("paciente")));
		actor.attemptsTo(Enter.theValue(dataFormPointment.getDoctorDocument()).into(DOCUMENT.of("doctor")));
		actor.attemptsTo(Enter.theValue(dataFormPointment.getObservations()).into(OBSERVATION));
		actor.attemptsTo(Click.on(BTNSAVE));
	}
	
	public static CompletePointment the(DataFormPointment dataFormPointment) {
		return instrumented(CompletePointment.class, dataFormPointment);
	}

}
