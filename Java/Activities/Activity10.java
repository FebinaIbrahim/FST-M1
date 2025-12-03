package activities;

import java.util.HashSet;

public class Activity10 {
	public static void main(String[] args) {
		// Creating Hash set
		HashSet<String> hs = new HashSet<String>();

		// Adding element to HashSet
		hs.add("Ball");
		hs.add("Bat");
		hs.add("Cap");
		hs.add("Shoe");
		hs.add("Gloves");
		hs.add("Helmet");

		// Print HashSet
		System.out.println("Original HashSet: " + hs);
		// Print size of HashSet
		System.out.println("\nSize of HashSet: " + hs.size());

		// Removing element
		System.out.println("\nRemoving Shoe from HashSet.." + hs.remove("Shoe"));
		// Remove element that is not present
		if (hs.remove("Book")) {
			System.out.println("\nBook removed from the Set");
		} else {
			System.out.println("\nBook is not present in the Set");
		}

		// Search for element
		System.out.println("\nChecking if Kite is present: " + hs.contains("Kite"));
		// Print updated HashSet
		System.out.println("\nUpdated HashSet: " + hs);
	}
}