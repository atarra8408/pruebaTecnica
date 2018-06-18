package co.com.bancolombia.automatizacion.herokuap.user_interface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ScheduleAppointmentPage {
	public static final Target DAY_APPINTMENT = Target.the("Dia de la cita").located(By.id("datepicker"));
	public static final Target DOCUMENT = Target.the("Documento del paciente o doctor").locatedBy("//input[contains(@placeholder,'{0}')]");
	public static final Target OBSERVATION = Target.the("Observaciones").locatedBy("//textarea[contains(@class,'control')]");
	public static final Target BTNSAVE = Target.the("Boton Guardar").locatedBy("//a[contains(@style,'bottom')]");
}
