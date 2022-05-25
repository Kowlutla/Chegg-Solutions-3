
public class SoftDrink {
	
	//Attributes Of SoftDrinks
	String name;
	String color;
	int volume;
	
	//Constructor
	public SoftDrink(String name, String color, int volume) {
		this.name = name;
		this.color = color;
		this.volume = volume;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}



	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}



	//toString method to return String representation of SoftDrink
	public String toString() {
		return this.name+"\t"+this.color+"\t"+this.volume;
	}
	
}
