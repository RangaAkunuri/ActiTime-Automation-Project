package testcase;

import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1 
{
	WebDriver dr ;
	
	@Parameters({"url" , "browserName" , "sleep"})
	@BeforeSuite(groups = "Smoke")
	public void LaunchActiTime(String url , String browserName , Long sleep) throws Throwable
	{
	 
		
		
		if (browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 dr = new ChromeDriver();	
		}
		if (browserName.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			 dr = new EdgeDriver();	
		}
		if (browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 dr = new FirefoxDriver();	
		}
		
    dr.get(url);
    Thread.sleep(sleep);
    dr.manage().window().maximize();
    dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	
	@Parameters({"userName" , "passWord"})
	@Test(groups = {"Smoke"  , "Sanity"})
	public void LogActiTime(String userName , String passWord)

	{
		dr.findElement(By.id("username")).sendKeys(userName , Keys.TAB , passWord , Keys.ENTER);
	}
	
	@AfterSuite (groups = "Smoke")
	public void Logout()
	{
	
		dr.findElement(By.xpath("//div[text()='Login ']")).click();
    }
}
