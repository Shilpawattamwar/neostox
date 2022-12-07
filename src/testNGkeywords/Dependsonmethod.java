package testNGkeywords;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Dependsonmethod {
	@Test
	  public void A() {
		  Assert.fail();
		  Reporter.log("Test case A is done", true);
	  }
	@Test
	  public void C() {
		  Reporter.log("Test case C is done", true);
	  }
	@Test(dependsOnMethods= {"A","C","D"})
	  public void B() {
		  Reporter.log("Test case B is done", true);
	  }
	@Test
	  public void D() {
		  Reporter.log("Test case D is done", true);
	  }
}
