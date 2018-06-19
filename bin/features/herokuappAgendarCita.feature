#Author: juansanchez8408@gmail.com
#Comentarios: Para agendar la ciata el paciente y el dotor deben estar registrados 
#esto se puede realizar desde las opciones agregar paciente, agregar Doctor

Feature: schedule appointment
   As a herokuapp user
  I want to schedule appointment in the Sistema de administración de hospitales platform

	@CasoExitoso
  Scenario Outline: Title of your scenario outline
    Given that user want open the herokuapp platform http://automatizacion.herokuapp.com/pperez/
    And  he want to open the page Agendar cita
    When he schedules an appointment with the data
    |<date>|<patientDocument>|<doctorDocument>|<observations>|
    Then he verifies that the appointment was scheduled
    |<Mensaje>| 

    Examples: 
      |date				 |patientDocument		|doctorDocument	 |observations					|Mensaje|
      | 07/08/2018 |78906453					|68906453				 |Quiero agendarla cita |Datos guardados correctamente|
      | 05/05/2018 |78906453					|68906453 			 |		o									|Datos guardados correctamente|
      
      
   @CasoAlterno
  Scenario Outline: Title of your scenario outline
    Given that user want open the herokuapp platform http://automatizacion.herokuapp.com/pperez/
    And  he want to open the page Agendar cita
    When he schedules an appointment with the data
    |<date>|<patientDocument>|<doctorDocument>|<observations>|
    Then verify that the appointment was not scheduled 
    |<Mensaje>|

    Examples: 
      |date				 |patientDocument		|doctorDocument	 |observations					|Mensaje																																								|
      | 07/08/2018 |78906453					|68906452				 |Quiero agendarla cita |El campo 'Documento de identidades' no se encuentra entre nuestros doctores							|
      | 08/08/2018 |78906454					|68906453 			 |		o									|El campo 'Documento de identidad' no se encuentra entre nuestros pacientes registrados.|
      