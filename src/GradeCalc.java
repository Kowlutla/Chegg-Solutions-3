import java.util.Scanner;

public class GradeCalc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int total = 0;
		int fail = 0;
		boolean readMore = true;
		while (readMore) {
			total++;
			System.out.print("Enter a letter grade: ");
			char grade = sc.next().toUpperCase().charAt(0);
			switch (grade) {
			case 'A':
			case 'B':
			case 'C':
			case 'D':
				break;
			case 'F':
				fail++;
				break;
			default:
				readMore = false;
				total--;

			}

		}

		double fail_percentage = (fail * 100.0) / total;
		System.out.printf("The percentage of failed students is %.2f", fail_percentage);
		System.out.println("%");
		sc.close();
	}

}
