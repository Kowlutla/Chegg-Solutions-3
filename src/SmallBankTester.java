import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SmallBankTester {

	public static void main(String[] args) throws IOException {
		byte[]data;
		FileInputStream stream=null;
		File file=new File("example.txt");
		try {
			stream=new FileInputStream(file);
			int d=stream.read();
			
		}
		catch(java.io.IOException e) {
			
		}
		finally {
			System.out.println("File is closed");
			stream.close();
		}

	}
	
	public static void testSmallBank() {
		//creating SmallBank object
		SmallBank bank=new SmallBank("Small Bank1", 10000);
		//printing details
		bank.printBankDetails();
		System.out.println("-------------------------------");
		//adding second account
		bank.addSecondAccount("Small Bank2", 20000);
		//printing details
		bank.printBankDetails();
	}

}
