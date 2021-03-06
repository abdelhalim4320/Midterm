package mathproblems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		//find lowest number from the array



		List<String> lowestValue = new ArrayList<String>();
		try {
			ConnectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = ConnectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}
		// run the method to find the lowest number
		LowestNumber.lowestNumber(array);
	}


	/**
	 * This method will helps us to find the lowest number
	 * @param number
	 */
	public static void lowestNumber(int[] number) {
		int minimum = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] < minimum) {
				minimum = number[i];
			}
		}
		System.out.println("The lowest number = " + minimum);
	}






}
