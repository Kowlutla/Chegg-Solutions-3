import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AssertionsTest2 {
	
	int var1=1;
	int var2=2;
	
	@Before
	public void setUp()
	{
		var1=100;
		System.out.print("AB");
	}

	@Test
	public void test1() {
		System.out.print("5");
		assertTrue(var1+var2==3);
	}
	
	@Test
	public void test2() {
		System.out.print("9");
		assertTrue(var1==100);
	}
}
