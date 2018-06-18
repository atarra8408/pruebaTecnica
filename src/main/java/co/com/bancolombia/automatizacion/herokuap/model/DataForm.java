package co.com.bancolombia.automatizacion.herokuap.model;

public class DataForm {
	
	private String date;
	private String patientDocument;
	private String doctorDocument;
	private String observations;

	public DataForm (String date,String patientDocument,String doctorDocument,String observations) {
		this.date = date;
		this.patientDocument = patientDocument;
		this.doctorDocument = doctorDocument;
		this.observations = observations;
	}
	
	public String getDate() {
		return date;
	}

	public String getPatientDocument() {
		return patientDocument;
	}

	public String getDoctorDocument() {
		return doctorDocument;
	}

	public String getObservations() {
		return observations;
	}


}
