package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
	@Test
	  public void A() {
		  Reporter.log("Test case A is done", true);
	  }
	@Test
	  public void C() {
		  Reporter.log("Test case C is done", true);
	  }
	@Test(timeOut=1000)
	  public void B() throws InterruptedException {
		  Thread.sleep(5000);	
		  Reporter.log("Test case B is done", true);
		  
	  }
	@Test
	  public void D() {
		  Reporter.log("Test case D is done", true);
	  }
  
}
