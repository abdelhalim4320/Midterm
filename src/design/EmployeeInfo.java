package design;

import java.util.Scanner;

public class EmployeeInfo extends EmployeeVacation {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	private String firstName;
	public String name;
	private int phoneNumber;
	private static final String emailAddress="Jersey city,NJ";
	public static int employeeId=450;

	public EmployeeInfo() {

	}

	// getter and setter
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static String getEmailAddress() {
		return emailAddress;
	}



	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/**
	 * this method will help us to calculate salary net
	 * @return
	 */
	public int calculatorSalaryNet(){
		int salary=120000;
		int taxes=10000;
		int salaryNet=salary-taxes;
		System.out.println("salary net is "+salaryNet);
		return salaryNet;
	}

	/**
	 * this method will help us to calculate the taxes employee
	 * @param salaryNet
	 * @param totalSalary
	 * @return
	 */
	public  int calculateTaxesEmployee(int salaryNet,int totalSalary){
		System.out.println("taxes :" +(totalSalary-salaryNet));
		return totalSalary-salaryNet;

	}



	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		this.employeeId = employeeId;
	}
    public EmployeeInfo(String name, int employeeId){
		this.name = name;
		this.employeeId = employeeId;
		
	}

	public EmployeeInfo(String name) {
		this.name = name;
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany,int performance, int salary){
		int total=0;
		if(performance >= 80 && performance < 100){
			total = (int)salary * 10 * numberOfYearsWithCompany / 100;
		} else if(performance >= 60 && performance <= 90) {
			total = (int) salary * 8 * numberOfYearsWithCompany / 100;
		} else if(performance >= 40 && performance <=70) {
			total = (int) salary * 5 * numberOfYearsWithCompany / 100;
		} else {
			total = (int) salary * 2 * numberOfYearsWithCompany / 100;
		}
		System.out.println( total);


		return total;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		//Calculate pension



		return total;
	}

	@Override
	public int employeeId() {
		return 0;
	}

	@Override
	public String employeeName() {
		return null;
	}

	@Override
	public void assignDepartment() {

	}

	@Override
	public int calculateSalary() {
		return 0;
	}

	@Override
	public void benefitLayout() {

	}

	@Override
	public String employeeWorkExperience() {
		return null;
	}

	@Override
	public int employeeAge() {
		return 0;
	}

	@Override
	public void hireDate() {

	}

	@Override
	public void outOfWork() {

	}

	@Override
	public void returnToWork() {

	}

	private static class DateConversion {

		public DateConversion(Months months){

		}
		public static String convertDate(String date) {
			String[] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 7;
					break;
				case August:
					date = 8;
					break;
				case September:
					date = 9;
					break;
				case October:
					date = 10;
					break;
				case November:
					date = 11;
					break;
				case December:
					date = 12;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
