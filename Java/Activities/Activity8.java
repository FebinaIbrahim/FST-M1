package activities;

class CustomException extends Exception {
	private String message=null;

//constructor initializes the variable message with a custom value	
	public CustomException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}

public class Activity8 {

	public static void main(String[] args) {

		try {
			// Method call with correct input
			Activity8.exceptionTest("Will print to console");
			// Method call with incorrect input
			Activity8.exceptionTest(null);
			Activity8.exceptionTest("Won't execute");
		} catch (CustomException e) {
			System.out.println("Inside catch block: " + e.getMessage());
		}

	}

	// exceptionTest Method-static method-can be called without an instance or
	// object
	static void exceptionTest(String message) throws CustomException {
		if (message == null) {
			throw new CustomException("String is null.");

		} else {
			System.out.println("String:" + message);
		}
	}

}
