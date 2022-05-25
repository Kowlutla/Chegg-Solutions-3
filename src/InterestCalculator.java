
public class InterestCalculator {

	public static void main(String[] args) {

		double principle = 10000, rate = 8;

		for(int time=1;time<=10;time++)
		{
			/* Calculate compound interest */
			double CI = principle * (Math.pow((1 + rate / 100), time));
	
			System.out.printf("Amount at end of year %d is %.2f\n",time, CI);
		}

	}

}
