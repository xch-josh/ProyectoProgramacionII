package CustomExceptions;

public class UnexistUserException extends Exception {
	public UnexistUserException(String message){
		super(message);
	}
}
