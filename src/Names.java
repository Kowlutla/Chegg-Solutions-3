import java.util.ArrayList;

public class Names {

	public static void main(String[] args) {

		middleInitialYI();
	}

	public static void middleInitialYI() {
		ArrayList<String> na = new ArrayList<>();
		String[] student = { "Amy", "B", "Brown", "Bo", "Wu", "Di", "C", "Ko", "Edward", "C", "Cox", "Fay", "Gray",
				"Greg", "T", "Tu", "Harold", "Gu", "Jack", "Hall", "Kay", "T", "Lewis" };

		for (String each : student) {
			na.add(each);
		}

		System.out.println("Before: " + na);
		// loop and remove names with no middle initials
		int i = 0;
		while (i < na.size() - 1) {
			if (na.get(i + 1).length() == 1) {
				i = i + 3;
			} else {
				na.remove(i);
				na.remove(i);
			}
		}
		System.out.println("After: " + na);

		// loop and print first,middle and last name

		for (i = 0; i < na.size() - 3; i = i + 3) {
			System.out.print("\"" + na.get(i) + " " + na.get(i + 1) + " " + na.get(i + 2) + "\"  ");
		}
		System.out.println(" = Names with middle initials by KOWLUTLA");
	}
}
