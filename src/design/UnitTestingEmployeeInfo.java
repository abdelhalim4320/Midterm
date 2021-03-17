package design;

import org.junit.Test;
import org.testng.Assert;

public class UnitTestingEmployeeInfo {

          //Write Unit Test for all the methods has been implemented in this package.

          // we don't need main method to test
          // create object for EmployeeInfoClass
          EmployeeInfo em=new EmployeeInfo();

    @Test
    public void testCalculatorSalaryNet(){
        //int salary=120000;
       // int taxes=10000;
        //int salaryNet=salary-taxes;
        int expectedResult=110000;
        int actualResult=em.calculatorSalaryNet();
        Assert.assertEquals(actualResult,expectedResult,"Test Pass");

    }









}
