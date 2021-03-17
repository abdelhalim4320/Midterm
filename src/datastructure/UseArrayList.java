package datastructure;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */



		// create Array lis
		ArrayList<String> phones = new ArrayList<>();
		// add value
		phones.add("Iphone");
		phones.add("Samsung");
		phones.add("LG");
		phones.add("Motorola");
		phones.add("ZTE Blade");

		// Print all elements
		System.out.println(phones);


		//retrieve all value
		System.out.println("***************** retrieve all value by using For each *****************");
		for (String st : phones) {
			System.out.println("phone is " + st);
		}

		// peek method we cannot because its an arrayList\
		//*****************************************************************

		// remove a value by index
		phones.remove(2); // Lg is deleted in this level


		System.out.println("***********  retrieve value after removing  by using Iterator **********************");
		// retrieve all value by using iterator
		Iterator it = phones.iterator();
		while (it.hasNext()) {

			System.out.println("phone : " + it.next());
		}

		// Store the Arraylist in MySql database
		ConnectToSqlDB.insertDataFromArrayListToSqlTable(phones, "newPhone", "phone_name");

		}

	}




