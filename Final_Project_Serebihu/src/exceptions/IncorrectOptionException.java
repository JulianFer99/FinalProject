package exceptions;

public class IncorrectOptionException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectOptionException() {
		super("La opcion ingresada no es correcta");
	}
}
