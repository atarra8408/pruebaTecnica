package co.com.bancolombia.automatizacion.herokuap.model;

public enum Option {
	AGREGAR_DOCTOR(new OptionMenu("addDoctor")),
	AGREGAR_PACIENTE(new OptionMenu("addPatient")),
	AGREGAR_HABITACION(new OptionMenu("addRoom")),
	AGREGAR_HOSPITAL(new OptionMenu("addHospital")),
	VER_HOSPITALES(new OptionMenu("hospitalList")),
	AGENDAR_CITA(new OptionMenu("appointmentScheduling"));
	
	private OptionMenu optionMenu;
	
	Option(OptionMenu optionMenu) {
		this.optionMenu = optionMenu;
	}
	
	public OptionMenu menu() {
		return optionMenu;
	}

}
