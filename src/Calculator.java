
public class Calculator {
	
	/**
	 * Method that takes
	 * @param value1
	 * @param value2 and 
	 * @return addition of value1 and value2
	 */
	public double add(double value1,double value2)
	{
		return value1+value2;
	}
	
	/**
	 * Method that takes
	 * @param value1
	 * @param value2 and 
	 * @return substraction of value1 and value2
	 */
	public double substraction(double value1,double value2)
	{
		return value1-value2;
	}
	
	/**
	 * Method that takes
	 * @param value1
	 * @param value2 and 
	 * @return multiplication of value1 and value2
	 */
	public double multiplication(double value1,double value2)
	{
		return value1*value2;
	}
	
	/**
	 * Method that takes
	 * @param value1
	 * @param value2 and 
	 * @return division of value1 and value2
	 */
	public double division(double value1,double value2)
	{
		return value1/value2;
	}

	//global variables 
	static double value1=50,value2=10;
	//main method
	public static void main(String[] args) {
		
		//create Object of Calculator
		Calculator calculator=new Calculator();
		
		//call add method to add two global values and print result
		double additionResult=calculator.add(value1, value2);
		System.out.println("Addition Of "+value1+" and "+value2+" is: "+additionResult);
		System.out.println();
		
		//call substraction method to add two global values and print result
		double substractionResult=calculator.substraction(value1, value2);
		System.out.println("Substraction Of "+value1+" and "+value2+" is: "+substractionResult);
		System.out.println();
		
		//call multiply method to add two global values and print result
		double multiplicationResult=calculator.multiplication(value1, value2);
		System.out.println("Multiplication Of "+value1+" and "+value2+" is: "+multiplicationResult);
		System.out.println();
		
		//call division method to add two global values and print result
		double divisionResult=calculator.division(value1, value2);
		System.out.println("Division Of "+value1+" and "+value2+" is: "+divisionResult);
		System.out.println();
	}
}
