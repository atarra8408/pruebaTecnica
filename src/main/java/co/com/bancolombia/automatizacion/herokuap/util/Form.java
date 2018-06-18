package co.com.bancolombia.automatizacion.herokuap.util;

import java.util.List;

import co.com.bancolombia.automatizacion.herokuap.model.DataForm;

public class Form {
	
	private static String date;
	private static String patientDocument;
	private static String doctorDocument;
	private static String observations;
	private static DataForm dataForm;
	
	public Form(List<List<String>> listData) {
		Form.date=listData.get(0).get(0);
		Form.patientDocument=listData.get(0).get(1);
		Form.doctorDocument= listData.get(0).get(2);
		Form.observations = listData.get(0).get(3);
	}


	private static DataForm gForm() {
		dataForm = new DataForm(date,patientDocument,doctorDocument,observations);
		return dataForm;
	}
	

	public static DataForm with(List<List<String>> listData) {
		new Form(listData);
		return gForm();
				
	}

}
