import java.util.Arrays;
import java.util.Scanner;

public class TechMahenra {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		
		int result;
		if(!(A>B) && !(A>C))
		{
			result=A;
		}
		else
		{
			if(!(B>A) && !(B>C))
			{
				
			}
		}
	}
	
	public static void arrange(int array[])
	{
		int k=0;
		for(int i:array)
		{
			if(i!=0)
			{
				array[k++]=i;
			}
		}
		
			
	}
	

}
