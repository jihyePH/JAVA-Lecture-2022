package ch10.ex12_member;

/*
 * NotExistIdException : ID가 틀린 경우 발생시키는 예외
 */
public class NotExistidException extends RuntimeExceptionn{
	 NotExistidException() {
	}
	 NotExistidException(String message) {
		 super(message);
}
}