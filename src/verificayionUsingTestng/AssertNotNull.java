package verificayionUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void AssertNotNulluse() {
	  
	  String a="ABC";
	  Assert.assertNotNull(a, "a is null tc is failed");
	  
	  Reporter.log("a is not null tc is passed", true);
  }
}
