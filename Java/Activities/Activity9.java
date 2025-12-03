package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {

		// ArrayList named myList of type String

		ArrayList<String> myList = new ArrayList<String>();

		// Adding names using add() method
		myList.add("Febina");
		myList.add("Komal");
		myList.add("Deepthi");
		myList.add(1, "Srabasti");
		myList.add(2, "Amrita");

		// Print all the names using for loop
		System.out.println("List of names:");
		for (String name : myList)
			System.out.println(name + " ");

		// get method to get 3rd name in the List
		System.out.println("\nThird name in the List is:" + myList.get(2));

		// checks a given name in the list
		System.out.println("\nIs Kiran present in the List? :" + myList.contains("Kiran"));

		// Prints number of names in the List
		System.out.println("\nNumber of names in the List:" + myList.size());

		System.out.println("\nRemoving Febina from the List..");
		myList.remove("Febina");
		// Prints updated number of names in the List
		System.out.println("\nUpdated Number of names in the List:" + myList.size());
		
		//Prints updated List
		System.out.println("\nUpdated List:");
		for (String name : myList)
			System.out.println(name + " ");

	}

}
