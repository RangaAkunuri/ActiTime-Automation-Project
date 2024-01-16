package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitime_login extends BaseTest 
{
	@Test(priority = 1)
	public void LoginTest() throws Throwable
	
	
	{
		
	
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	dr.manage().window().maximize();
	
	LoginPage lp = new LoginPage(dr);
	
	lp.getUser().sendKeys(user);
	lp.getPassword().sendKeys(password);
	lp.getLogin().click();
	
	

    Thread.sleep(5000);

	
     
    /*   WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10)) ;
	     wait.until(ExpectedConditions.visibilityOf(""));   */
	    
       
    
        lp.getLogout().click();
	    
	    
	    
	}
}
