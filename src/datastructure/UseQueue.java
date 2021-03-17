package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		// create Queue
		Queue <Integer>employeeSalary=new LinkedList<>();
		// add element
		employeeSalary.add(20000);
		employeeSalary.add(489415);
		employeeSalary.add(45454);
		employeeSalary.add(140000);
		employeeSalary.add(80000);
		employeeSalary.add(30000);
		employeeSalary.add(120000);

		// print all element
		System.out.println(employeeSalary);

		// remove an element
		employeeSalary.remove(2);

		// retrieve all element by using for each loop
		for(Integer i:employeeSalary){
			System.out.println("salary : "+i);
		}

		System.out.println("********* element method :variableName.element();");

		// VariableName.element(); ===> peek the first element (value)in the list
		System.out.println(employeeSalary.element());

		System.out.println("********* peek method *** variableName.peek(); ");

		// VariableName.peek(); ===> peek the first element (value)in the list
		System.out.println(employeeSalary.peek());


		System.out.println("************* Poll() Method ********************************");

		// variableName.poll(); ++> pole method select(peek) the value  and remove it at the same time
		System.out.println(employeeSalary.poll());   // peak and remove

		System.out.println("***************  retrieve all value after poll *******************************");

		Iterator iterator=employeeSalary.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		for (Object obj : employeeSalary) {
			System.out.println("Salary after poll is : "+obj);
		}


	}

}
