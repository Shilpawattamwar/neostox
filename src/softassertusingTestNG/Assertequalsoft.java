package softassertusingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertequalsoft {
	SoftAssert soft=new SoftAssert();
  @Test
  public void verifyassertequals() {
	  String a="Pune";
	  String b="Pune";
	  soft.assertEquals(a,b,"a and b are not equal then tc is failed ");
	  Reporter.log("a and b are equal then test case is passed", true);
	  System.out.println("============================================");
	  String s1="Pune";
	  String s2="Goa";
	  soft.assertEquals(s1,s2,"s1 and s2 are not equal then tc is failed "); //here testcase is failed but here due to soft assert next line also executed 
	  Reporter.log("s1 and s2 are notequal then test case is failed", true);
  }
}
