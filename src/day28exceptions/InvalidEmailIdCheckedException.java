package day28exceptions;

/*
 * How to create checked Exception:
  1) Name the class by using by "Exception" word at the end.
     Using "Exception" word is not must but it is "Naming Convention"
  2)To create a "checked exception" , you should extend to "Exception" class
  3)Create constructor with a "String" parameter, and inside the Constructor use "super()"
 */

public class InvalidEmailIdCheckedException extends Exception{
	
	
	private static final long serialVersionUID = 1L;

	public InvalidEmailIdCheckedException(String message) {
		super(message);
	}

}
