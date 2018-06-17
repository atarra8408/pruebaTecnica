package co.com.bancolombia.automatizacion.herokuap.model;

public enum Option {
	AGENDAR_CITA(new OptionMenu("appointmentScheduling")),
	AGREGAR_DOCTOR(new OptionMenu("addDoctor"))	;
	
	private OptionMenu optionMenu;
	
	Option(OptionMenu optionMenu) {
		this.optionMenu = optionMenu;
	}
	
	public OptionMenu menu() {
		return optionMenu;
	}

}
