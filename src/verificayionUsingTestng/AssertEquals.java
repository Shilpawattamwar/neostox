package verificayionUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals {
  @Test
  public void TC1() {
	  String s1="Pune";
	  String s2="Pune";
	  
	  //i need to verify s1 and s2 are equal or not?
	  //if s1 and s2 are equal then tc passed or tc is failed
	  
//	  if(s1.equals(s2)) 
		  
//	  {
//		  Reporter.log("s1 and s2 are matching tc is passed", true);
		  
//	  }
//	  else 
//	  {
//		  Reporter.log("s1 and s2 are not matching tc is failed", true);
//	  }
	  
	  //using hard assert using static methods of Assert class 1)assertEquals()
	  
	  Assert.assertEquals(s1, s2,"s1 and s2 are not matching tc is failed");
	  Reporter.log("s1 and s2 are matching tc is passed", true);
	  
  }
}
