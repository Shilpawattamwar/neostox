package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

  @Test
  public void A() {
	  Reporter.log("test case A is passed", true);
  }
  @Test
  public void B() {
	  Reporter.log("test case B is passed", true);
  }
  @Test
  public void C() {
	  Reporter.log("test case C is passed", true);
  }
  @Test
  public void D() {
	  Reporter.log("test case D is passed", true);
  }
  @Test
  public void E() {
	  Reporter.log("test case E is passed", true);
  }
}
