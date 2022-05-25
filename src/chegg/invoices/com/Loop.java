package chegg.invoices.com;

public class Loop {

	public static void main(String[] args) {
		
		int counter=0;//counter variable
		
		//loop to check condtion it iterates 101 times
		while(counter<=100) {
			
			//if counter is even
			if(counter%2==0) {
				//do nothing just increment counter
				counter++;
			}
			else {
				//otherwise print counter followed by your name
				System.out.println(counter+". Kowlutla");
				//increment counter
				counter++;
			}
		}
		
	}

}
