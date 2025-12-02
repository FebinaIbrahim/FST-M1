package activities;

//Abstract class
abstract class Book {
	String title;

	// Abstract method
	abstract void setTitle(String s);

	// Concrete method
	String getTitle() {
		return title;
	}
}

class MyBook extends Book {
	// Define abstract method assign title value
	public void setTitle(String s) {
		title = s;
	}
}

public class Activity5 {

	public static void main(String[] args) {
		// Initialize title with the value
		String title = "Lord of the Flies";
		// Create new object for MyBook
		Book newNovel = new MyBook();
		// Set title
		newNovel.setTitle(title);

		// Print result
		System.out.println("The title is: " + newNovel.getTitle());
	}
}