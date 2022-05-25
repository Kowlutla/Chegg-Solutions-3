
//NegativeNumberException that extends the IllegalArgumentException 
public class NegativeNumberException extends IllegalArgumentException {
	
	/**
	 * Default serialversionUID
	 */
	private static final long serialVersionUID = 1L;

	//Constructor to create Object of NegativeNumberException
	public NegativeNumberException(String message)
	{
		//pass message to super class i.e IllegalArgumentException class
		super(message);
	}

}
