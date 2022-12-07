package testNGxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class grouping1 {
	 @Test(groups={"homepage","funds"})
	  public void A() {
		  Reporter.log("test case A is passed", true);
	  }
	  @Test(groups = "homepage")
	  public void B() {
		  Reporter.log("test case B is passed", true);
	  }
	  @Test(groups="funds")
	  public void C() {
		  Reporter.log("test case C is passed", true);
	  }
	  @Test(groups="homepage")
	  public void D() {
		  Reporter.log("test case D is passed", true);
	  }
	  @Test(groups="funds")
	  public void E() {
		  Reporter.log("test case E is passed", true);
	  }
}
