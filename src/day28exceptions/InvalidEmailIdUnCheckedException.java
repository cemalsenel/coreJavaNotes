package day28exceptions;

/*
  To create unchecked Exception:
  1) Extend to "RuntimeException" Class
  others are same as "unchecked exception" steps
 */
public class InvalidEmailIdUnCheckedException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public InvalidEmailIdUnCheckedException(String message) {
		super(message);
	}

}
