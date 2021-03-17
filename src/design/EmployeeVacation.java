package design;

public abstract class EmployeeVacation implements Employee{

    //declare some variable
    String startDateVacation="10/10/2020";
    String endDateVacation="10/10/2021";

    // create abstract method
    public abstract void outOfWork();
    public abstract void returnToWork();



    // create method with body
    public void vacationStart(){
        System.out.println("vacation start from now ");
    }

    public static void checkPayment(){
        System.out.println("no payment check for you ");
    }



}
