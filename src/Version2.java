
/**
 * Version2 that extends Version1
 */
public class Version2 extends Version1 {

	/**
	 * implement chessmoves()
	 */
	public void chessmoves() {

		System.out.println("Chess Moves Implemented");
		
	}
	
	
	//Create main method in Version2 Class
	public static void main(String[] args) {
		
		//Create Object of Version2 
		Version2 version2=new Version2();
		
		//call chessboarddisplay method
		version2.chessboarddisplay();
		
		//call chessmoves method
		version2.chessmoves();
		
	}

}
