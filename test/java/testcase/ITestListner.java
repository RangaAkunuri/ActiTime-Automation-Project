package testcase;

import org.testng.ITestResult;

public interface ITestListner
{
 default void onTestStart()
 {
	 
 }
 default void onTestSuccess()
 {
	 
 }
 default void onTestFail(ITestResult result)
 {
	 
 }
 default void onTestSkipped()
 {
	 
 }
}
