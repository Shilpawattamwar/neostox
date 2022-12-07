//Listner study

package listners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener

{
	@Override
public void onTestFailure(ITestResult result)
    {
	
	Reporter.log("test is failed take screenshot ",true);
	
	}
@Override
public void onTestSuccess(ITestResult result)
    {
	
	Reporter.log("test passes successful ",true);
	
    }
@Override
public void onTestSkipped(ITestResult result)
    {
	
	Reporter.log("this test is skipped please retry ",true);
	
    }

}
