package verificayionUsingTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfail {
  @Test
  public void AssertFailuse() {
	  String s="pune";
	  Assert.assertNotNull(s,"s is empty tc is failed");
	  Assert.fail();
  }
}
