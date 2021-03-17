package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		// create map
		Map<String,Integer>studentAge=new HashMap<>();

		//adding key and value
		studentAge.put("Dalal",26);
		studentAge.put("Halim",26);
		studentAge.put("Karim",100);
		studentAge.put("Oussama",27);
		studentAge.put("lamia",28);

		// get element from Map
		System.out.println(studentAge.get("Dalal"));

		// remove element from Map
		studentAge.remove("Halim");

		// retrieve all value by using for each
		for (String st: studentAge.keySet()){
			System.out.println("student age is : "+st);
		}

		//***********************************************************************************

		System.out.println("*************************** Adding Lis string to Map  **********************");
		// adding list into Map
		// create List
		List<String> countriesOfAfrica=new ArrayList<>();
		countriesOfAfrica.add("Algeria");
		countriesOfAfrica.add("Egypt");
		countriesOfAfrica.add("Libya");
		countriesOfAfrica.add("Morocco");
		countriesOfAfrica.add("Tunisia");
		countriesOfAfrica.add("Western Sahara");
		countriesOfAfrica.add("Senegal");
		countriesOfAfrica.add("Togo");


		List<String> countriesOfEurope=new ArrayList<>();
		countriesOfEurope.add("France");
		countriesOfEurope.add("Italy");
		countriesOfEurope.add("Ukraine");
		countriesOfEurope.add("Spain");
		countriesOfEurope.add("Poland");
		countriesOfEurope.add("Sweden");
		countriesOfEurope.add("Portugal");
		countriesOfEurope.add("Albania");


		List<String> countriesOfNorthAmerica=new ArrayList<>();
		countriesOfNorthAmerica.add("Canada");
		countriesOfNorthAmerica.add("Greenland");
		countriesOfNorthAmerica.add("Mexico");
		countriesOfNorthAmerica.add("USA");

		// Add List<String> into a Map ===  Map<String, List<string>> list = new HashMap<String, List<String>>();
		Map<String,List<String>> map=new HashMap<>();
		map.put("AFRICA",countriesOfAfrica);
		map.put("EUROPE",countriesOfEurope);
		map.put("NORTH AMERICA",countriesOfNorthAmerica);

		// retrieve value
		System.out.println("***************** retreive value with Alternative approach ");
		for (Map.Entry<String,List<String>> entry:map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		// retrieve value with for each
		System.out.println("***************** retrieve value with Alternative approach ");
		for (String st:map.keySet()){
			System.out.println(st+" "+map.get(st));
		}

		System.out.println("********** Retrieve value with iterator ********************************");
		// retrieve value with iterator

		Iterator it=map.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Map.Entry) it.next();
			System.out.println(entry.getKey()+"	 "+entry.getValue());

		}




























	}

}
