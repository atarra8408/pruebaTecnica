#Author: juansanchez8408@gmail.com
#Comentarios: Para agendar la ciata el paciente y el dotor deben estar registrados 
#esto se puede realizar desde las opciones agregar paciente, agregar Doctor

Feature: schedule appointment
   As a herokuapp user
  I want to schedule appointment in the Sistema de administración de hospitales platform

  Scenario Outline: Title of your scenario outline
    Given that user want open the herokuapp platform
    And  he want to open the page Agendar cita
    When he schedules an appointment with the data
    |<date>|<patientDocument>|<doctorDocument>|<observations>|
    Then he verifies that the appointment was scheduled 

    Examples: 
      |date|patientDocument|doctorDocument|observations|
      | 07/08/2018 |78906453					|68906453				 |Quiero agendarla cita |
      | 08/08/2018 |78906454					|68906453 			 |		o									|