package testcase;

import org.testng.ITestResult;

import base.BaseTest;

public class ITestClass extends BaseTest implements ITestListner 
{

	
	@Override
	public void onTestFail(ITestResult result) 
	{
	captureScreenShot(result.getMethod().getMethodName()+".jpg");
	
	
	}


}
