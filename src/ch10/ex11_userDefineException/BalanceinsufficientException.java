package ch10.ex11_userDefineException;

public class BalanceinsufficientException extends RuntimeException {
	 BalanceinsufficientException() { }

	public BalanceinsufficientException(String message) {
		super(message);
		
	}

}
