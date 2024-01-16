package testcase;

import java.time.Duration;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogintoActiTimeusingParametersfromXML 


{

	public class LogintoactiTime 
	{
		WebDriver dr ;
		
    @Parameters("browserName")
	@BeforeSuite	
	

	public void Launch_Browser(String browserName) throws Throwable 

	{
    	switch(browserName.toLowerCase())
    			{
    		case "chrome" :
    			WebDriverManager.chromedriver().setup();
    			 dr = new ChromeDriver();
    			break ; 
    			
    		case "firefox"  :	
    			WebDriverManager.edgedriver().setup();
    			 dr = new ChromeDriver();
    			break ;
    			
    			
    		case "edge"  :	
    			WebDriverManager.firefoxdriver().setup();
    			 dr = new FirefoxDriver();
    			break ;
    		
    			default :
    				System.err.println("Browser is inavalid");
    			break;
    			}
    	
	 /*	WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();  */ 
    	
   }
    
      @Parameters("url")
      @Test
      public void currentLRL(String url)
    {
    	dr.get(url);
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.manage().window().maximize();
    }

   
      @Parameters({"userName" , "passWord", "Sleep"})
	  @Test
	     public void Login(String UserName , String passWord , Long Sleep) throws Throwable
	{
		
    	  WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10))  ;
    	  wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		
		// dr.findElement(By.xpath("//input[@name='username']")).sendKeys(UserName);
		dr.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(passWord);
		
		dr.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(Sleep);
	}
	
	
	
	@AfterSuite
	 public void Logout()

	   {
		
	          dr.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();

	   }

	
}
}