package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {


		// create object for EmployeeInfo class
		EmployeeInfo em= new EmployeeInfo();

		//call calculateTaxesEmployee method
		em.calculateTaxesEmployee(150000,125000);

		// set a value to private variable
		em.setFirstName("halim");

		// call vacation method from abstract class
		em.vacationStart();

		// call hireDate method from interface
		em.hireDate();

		em.returnToWork();



		


	}

}
