package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	  public void F() {
		  Reporter.log("test case F is passed", true);
	  }
	  @Test
	  public void G() {
		  Reporter.log("test case G is passed", true);
	  }
	  @Test
	  public void H() {
		  Reporter.log("test case H is passed", true);
	  }
	  @Test
	  public void I() {
		  Reporter.log("test case I is passed", true);
	  }
	  @Test
	  public void J() {
		  Reporter.log("test case J is passed", true);
	  }
}
