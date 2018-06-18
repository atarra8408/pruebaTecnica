package co.com.bancolombia.automatizacion.herokuap.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.automatizacion.herokuap.model.DataForm;
import static co.com.bancolombia.automatizacion.herokuap.user_interface.ScheduleAppointmentPage.DAY_APPINTMENT;
import static co.com.bancolombia.automatizacion.herokuap.user_interface.ScheduleAppointmentPage.DOCUMENT;
import static co.com.bancolombia.automatizacion.herokuap.user_interface.ScheduleAppointmentPage.OBSERVATION;
import static co.com.bancolombia.automatizacion.herokuap.user_interface.ScheduleAppointmentPage.BTNSAVE;
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
		actor.attemptsTo(Enter.theValue(dataForm.getDate()).into(DAY_APPINTMENT));
		actor.attemptsTo(Enter.theValue(dataForm.getPatientDocument()).into(DOCUMENT.of("paciente")));
		actor.attemptsTo(Enter.theValue(dataForm.getDoctorDocument()).into(DOCUMENT.of("doctor")));
		actor.attemptsTo(Enter.theValue(dataForm.getObservations()).into(OBSERVATION));
		actor.attemptsTo(Click.on(BTNSAVE));
	}
	
	public static Complete the(DataForm dataForm) {
		return instrumented(Complete.class, dataForm);
	}

}
