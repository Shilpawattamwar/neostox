package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationcount {
  @Test(invocationCount=5)
  public void Logintoapplicaion() {
	  Reporter.log("login to application is done", true);
  }
}
