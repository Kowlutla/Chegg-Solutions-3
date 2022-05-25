
public class BirthDayCard {

	// Attributes Of Cards
	String name;
	String gender;
	int age;
	String[] array;

	//Constructor to initializes all variables 
	public BirthDayCard(String name, String gender, int age, String[] array) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.array = array;
	}

	//toString method to return String representation of Birthday card
	public String toString() {
		
		//Create a StringBuffer Object
		StringBuffer result = new StringBuffer();
		
		//add 'hello'
		result.append("Hello ");
		
		//based on gender append salutation
		if (gender.equalsIgnoreCase("male")) {
			result.append("Mr.");
		} else if(gender.equalsIgnoreCase("female")) {
			result.append("Mrs.");
		}

		//append name after salutation
		result.append(name).append(".");
		String deli = "";
		
		//print names on cards
		for (int i = 0; i < array.length - 1; i++) {
			result.append(deli);
			result.append(array[i]);
			deli = ",";
		}
		
		//if at least one name in card
		if(array.length!=0)
		{
			//to print 'and' before last name
			if(array.length!=1)
				result.append(" and ");
			result.append(array[array.length - 1]);
		}
		
		//add 'wish you a happy' to result
		result.append(" wish you a happy ");
		
		//if age between 11-19
		if(age>=11 && age<=19) {
			//add age and 'th' as suffix
			result.append(age).append("th ");
		}
		//if age is like 1,21,31....
		else if (age%10 == 1) {
			//add age and 'st' as suffix
			result.append(age).append("st ");
		}
		//if age is like 2,22,32....
		else if (age%10 == 2) {
			//add age and 'nd' as suffix
			result.append(age).append("nd ");
		}
		//if age is like 3,23,33....
		else if (age%10 == 3) {
			//add age and 'rd' as suffix
			result.append(age).append("rd ");
		} 
		//remaining ages
		else {
			//add age and 'th' as suffix
			result.append(age).append("th ");
		}

		//add 'birthday'
		result.append("birthday.");
		
		// return result by converting into String
		return result.toString();
	}

}
