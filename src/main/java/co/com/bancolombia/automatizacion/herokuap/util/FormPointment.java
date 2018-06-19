package co.com.bancolombia.automatizacion.herokuap.util;

import java.util.List;

import co.com.bancolombia.automatizacion.herokuap.model.DataFormPointment;

public class FormPointment {
	
	private static String date;
	private static String patientDocument;
	private static String doctorDocument;
	private static String observations;
	private static DataFormPointment dataFormPointment;
	
	public FormPointment(List<List<String>> listData) {
		FormPointment.date=listData.get(0).get(0);
		FormPointment.patientDocument=listData.get(0).get(1);
		FormPointment.doctorDocument= listData.get(0).get(2);
		FormPointment.observations = listData.get(0).get(3);
	}


	private static DataFormPointment gForm() {
		dataFormPointment = new DataFormPointment(date,patientDocument,doctorDocument,observations);
		return dataFormPointment;
	}
	

	public static DataFormPointment with(List<List<String>> listData) {
		new FormPointment(listData);
		return gForm();
				
	}

}
