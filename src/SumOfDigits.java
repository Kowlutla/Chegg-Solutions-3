import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer less than 2147483000: ");
		int number=sc.nextInt();
		
		if(number>2147483000) {
			System.out.println("The integer you entered is greater than 2147483000");
		}
		else {
			int sumOfDigits=getSum(number);
			if(sumOfDigits%2==0) {
				System.out.println("The sum of the digits of "+number+" is even");	
			}
			else {
				System.out.println("The sum of the digits of "+number+" is Odd");	
			}
		}
		sc.close();
	}

	public static int getSum(int number) {
		
		int temp=number;
		int sum=0;
		while(temp!=0) {
			sum+=temp%10;
			temp=temp/10;
		}
		return sum;
	}

}
