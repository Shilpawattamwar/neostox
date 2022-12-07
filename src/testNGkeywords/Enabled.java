package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
  
  @Test
  public void A() {
	  Reporter.log("Test case A is done", true);
  }
  @Test
  public void C() {
	  Reporter.log("Test case C is done", true);
  }
  @Test(enabled=false)
  public void B() {
	  Reporter.log("Test case B is done", true);
  }
  @Test
  public void D() {
	  Reporter.log("Test case D is done", true);
  }
}
