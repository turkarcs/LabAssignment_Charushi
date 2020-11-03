package ValidateAge;
public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super(); //acquiring the parent class methods
	}

	public InvalidAgeException(String msg) {
		super(msg);
	}
}