package verificayionUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEquals {
  @Test
  public void AssertNotEqulsuse() {
	  
	  //my tc should be passed when two strings are not equals
	  
	  String s3="Maharashtra";
	  String s4="Goa";
	  Assert.assertNotEquals(s3,s4,"s3 and s4 are equal then tc is failed");
	  Reporter.log("s3 and s4 are not equal testcase passed", true);
	  
	  
	  //in hard assert if line15 is failed then compiler not go to line16 it is disadvantage of hard assert
  }
}
