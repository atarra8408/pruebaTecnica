package co.com.bancolombia.automatizacion.herokuap.user_interface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ScheduleAppointmentPage {
	public static final Target DAY_APPINTMENT = Target.the("Dia de la cita").located(By.id("datepicker"));
}
