package testNGxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class grouping2 {
  @Test(groups="funds")
  public void F() {
	  Reporter.log("test case F is passed", true);
  }
  @Test(groups="login")
  public void G() {
	  Reporter.log("test case G is passed", true);
  }
  @Test
  public void H() {
	  Reporter.log("test case H is passed", true);
  }
  @Test(groups="login")
  public void I() {
	  Reporter.log("test case I is passed", true);
  }
  @Test(groups="homepage")
  public void J() {
	  Reporter.log("test case J is passed", true);
  }
}
