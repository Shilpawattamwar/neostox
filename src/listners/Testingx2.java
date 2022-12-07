package listners;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listners.Listner.class)
public class Testingx2 {
  @Test
  public void mytest4() 
  {
	  
	  Reporter.log("mytest4 is executing",true);
	  
  }
  @Test
  public void mytest5() 
  {
	  
	  Reporter.log("mytest5 is executing",true);
	  Assert.fail();
  }
  
  @Test(dependsOnMethods="mytest5")
  public void mytest6() 
  {
	  
	  Reporter.log("mytest6 is executing",true);
	  
  }
  
}
