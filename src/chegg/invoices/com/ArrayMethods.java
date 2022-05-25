package chegg.invoices.com;

public class ArrayMethods {
	
	static int sfold(String s, int M) {

		  long sum = 0, mul = 1;

		  for (int i = 0; i < s.length(); i++) {

		    mul = (i % 4 == 0) ? 1 : mul * 256;

		    sum += s.charAt(i) * mul;

		  }

		  return (int)(Math.abs(sum) % M);

		}
	
	static int sascii(String x, int M) {

	     char ch[];

	     ch = x.toCharArray();

	     int xlength = x.length();

	     int i, sum;

	     for (sum=0, i=0; i < x.length(); i++) {

	       sum += ch[i];

	     }

	     return sum % M;

	   }
	
	public static void main(String[] args) {
		
		System.out.println(sfold("CSUDH", 100));
		System.out.println(sascii("CSUDH", 100));
	}

}
