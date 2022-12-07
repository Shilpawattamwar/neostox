package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void display() {
	  
	  Reporter.log("hi, good night", true);
  }
}
