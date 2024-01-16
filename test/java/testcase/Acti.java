package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import base.BaseTest;

public class Acti extends BaseTest
{
	WebDriver dr ; 
	LoginPage lp = new LoginPage(dr);
	
	
@Test
 public void Login_LogOut() throws Throwable
 {
	
	
	
	lp.getUser().sendKeys(user);
	lp.getPassword().sendKeys(password);
	
	lp.getLogin().click();
	
	Thread.sleep(3000);
	;
 }



}
