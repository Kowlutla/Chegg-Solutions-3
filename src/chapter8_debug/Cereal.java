package chapter8_debug;

public class Cereal {

	// DEFINITIONS
	private String name;
	private String type;
	private int calories;
	private int protein;
	private int fat;
	private int sodium;
	private double fiber;
	private double carbs;
	private int sugar;
	private int potassium;
	private int vitamins;
	private int shelf;
	private double weight;
	private double cups;
	private double rating;

	public Cereal(String initName, String initType, int initCal, int initProtein, int initFat, int initSodium,
			double initFiber, double initCarbs, int initSugar, int initPotassium, int initVit, int initShelf,
			double initWeight, double initCups, double initRating) {
		name = initName;
		type = initType;
		calories = initCal;
		protein = initProtein;
		fat = initFat;
		sodium = initSodium;
		fiber = initFiber;
		carbs = initCarbs;
		sugar = initSugar;
		potassium = initPotassium;
		vitamins = initVit;
		shelf = initShelf;
		weight = initWeight;
		cups = initCups;
		rating = initRating;

	}

	public Cereal() {
		name = "";
		type = "C";
		calories = 0;
		protein = 0;
		fat = 0;
		sodium = 0;
		fiber = 0;
		carbs = 0;
		sugar = 0;
		potassium = 0;
		vitamins = 0;
		shelf = 0;
		weight = 0;
		cups = 0;
		rating = 0;

	}

	// AND KEEP GOING AND FINISH YOUR CODE FROM HERE

	// TASK #1
	public Cereal(String initName, int initCal, int initProtein, double initWeight, double initCups,
			double initRating) {
		// YOUR CODE HERE
		this.name = initName;
		this.calories = initCal;
		this.protein = initProtein;
		this.weight = initWeight;
		this.cups = initCups;
		this.rating = initRating;
		this.type = "C";
		this.fat = 0;
		this.sodium = 0;
		this.fiber = 0;
		this.carbs = 0;
		this.sugar = 0;
		this.potassium = 0;
		this.vitamins = 0;
		this.shelf = 0;

	}

	// TASK #2
	public Cereal(String initName, int initCal, double initRating) {
		// YOUR CODE HERE
		this.name = initName;
		this.calories = initCal;
		this.rating = initRating;
		this.type = "C";
		this.protein = 0;
		this.fat = 0;
		this.sodium = 0;
		this.fiber = 0;
		this.carbs = 0;
		this.sugar = 0;
		this.potassium = 0;
		this.vitamins = 0;
		this.shelf = 0;
		this.weight = 0;
		this.cups = 0;
	}

	// TASK #3
	// Write your getter (Accessor) Methods
	// Follow Ms. Dana's instructions

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * @return the protein
	 */
	public int getProtein() {
		return protein;
	}

	/**
	 * @return the fat
	 */
	public int getFat() {
		return fat;
	}

	/**
	 * @return the sodium
	 */
	public int getSodium() {
		return sodium;
	}

	/**
	 * @return the fiber
	 */
	public double getFiber() {
		return fiber;
	}

	/**
	 * @return the carbs
	 */
	public double getCarbs() {
		return carbs;
	}

	/**
	 * @return the sugar
	 */
	public int getSugar() {
		return sugar;
	}

	/**
	 * @return the potassium
	 */
	public int getPotassium() {
		return potassium;
	}

	/**
	 * @return the vitamins
	 */
	public int getVitamins() {
		return vitamins;
	}

	/**
	 * @return the shelf
	 */
	public int getShelf() {
		return shelf;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @return the cups
	 */
	public double getCups() {
		return cups;
	}

	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}

	// TASK #4
	// Copy public String toString() Here

	@Override
	public String toString() {
		return "Cereal [name=" + name + ", type=" + type + ", calories=" + calories + ", protein=" + protein + ", fat="
				+ fat + ", sodium=" + sodium + ", fiber=" + fiber + ", carbs=" + carbs + ", sugar=" + sugar
				+ ", potassium=" + potassium + ", vitamins=" + vitamins + ", shelf=" + shelf + ", weight=" + weight
				+ ", cups=" + cups + ", rating=" + rating + "]";
	}

	// MAIN METHOD (Function)
	// given on your worksheet

	public static void main(String[] args) {
		Cereal c1 = new Cereal("Cocoa Puffs", "C", 110, 1, 1, 180, 0, 12, 13, 55, 25, 2, 1, 1, 22.73645);
		System.out.println(c1.toString());

		Cereal c2 = new Cereal("Cocoa Puffs", 110, 22.73645);
		System.out.println(c2.toString());

		Cereal c3 = new Cereal();
		System.out.println(c3);
	}

}