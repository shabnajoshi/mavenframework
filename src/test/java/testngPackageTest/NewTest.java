package testngPackageTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
 
	@Test
	public void reportTest1() {
		// TODO Auto-generated method stub
		Reporter.log("inside 1***********");
		System.out.println("inside 1");
	}
	
	@Test
	public void reportTest2() {
		// TODO Auto-generated method stub
		Reporter.log("inside 2***********");
		System.out.println("inside 2");

	}
	
}
