
public class ClothingItem {

	private int id;
	private String name;
	private String color;
	private float price;

	/**
	 * Constructor to initialize ClothingItem
	 * 
	 * @param id
	 * @param name
	 * @param color
	 * @param price
	 */
	public ClothingItem(int id, String name, String color, float price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	// Getter methods for variables
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public float getPrice() {
		return price;
	}

	// Setter methods for variables
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * toString method to return String representation of ClothingItem Object
	 */
	public String toString() {
		return this.id + "\t" + this.name + "\t" + this.color + "\t" + this.price;
	}
}
