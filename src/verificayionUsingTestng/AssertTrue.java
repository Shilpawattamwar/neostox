package verificayionUsingTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void AssertTrueUse() {
	  
	  boolean a=true;
	  Assert.assertTrue(a,"a is false so tc is failed");     //""-->error message
  }
}
