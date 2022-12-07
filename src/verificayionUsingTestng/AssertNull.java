package verificayionUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void AssertNullUse() {
	  
	  String s="ABC";
	  
	  //if  s is empty then AssertNull is passed otherwise failed
	  
	  Assert.assertNull(s, "s is not null tc is failed");
	  Reporter.log("s is not null tc failed", true);
	  
	  
	  //if line15 is failed then line16 is not executing
	  
  }
}
