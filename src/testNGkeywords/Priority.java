package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test
  public void A() {
	  Reporter.log("Test case A is done", true);
  }
  @Test(priority=-10)
  public void C() {
	  Reporter.log("test case C is done", true);
  }
  @Test
  public void B() {
	  Reporter.log("Test case B is done", true);
  }
  @Test(priority=-1)
  public void D() {
	  Reporter.log("Test case D is done", true);
  }
}
