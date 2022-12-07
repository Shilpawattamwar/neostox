package verificayionUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFalse {
  @Test
  public void AssertFalseUse() {
	  
	  boolean a=false;
	  Assert.assertFalse(a, "a is true then tc is failed");
	  
	  Reporter.log("a is false then tc is passed ", true);
  }
}
