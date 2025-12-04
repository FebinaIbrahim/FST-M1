package activities;

interface Addable {
	int add(int num1, int num2);
}

public class Activity12 {

	public static void main(String[] args) {

		// Expression lambda (no body): concise, returns the expression result
		Addable ad1 = (num1, num2) -> num1 + num2;
		System.out.println("Sum1: "+ad1.add(345, 543));

		// Block lambda (has a body): can contain multiple statements
		Addable ad2 = (int a, int b) -> {
		    return (a + b);
		};
		System.out.println("Sum2: "+ad2.add(222, 333));

	}

}
