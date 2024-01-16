package testcase;

import static org.testng.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook
{
    @Test
	public void verifyFacebook()
	
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver dr = new ChromeDriver();
	    
	    dr.get("https://www.facebook.com/");
	    dr.manage().window().maximize();
	    dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    dr.findElement(By.name("email")).sendKeys("RamRajuRehman", Keys.TAB, "Ramesh123", Keys.ENTER);
	    
	    
	    //Title Assertion
	    String Title = dr.getTitle();
	    String aTitle = "Log in to Facebook";
	    SoftAssert sa = new SoftAssert();
	 // assertEquals(aTitle, eTitle);   -------> This is for Hard Assert
	   sa.assertEquals(aTitle, Title, "Title is not matched");
	    
	   
	  
	   // URL Asseertion
	  String URL = dr.getCurrentUrl();
	  String aURL=  "https://www.facebook.com/";
	  sa.assertEquals(URL, aURL, "URL is not matched");
	// assertEquals(aURL, URL, "URL is not matched");   -------> This is for Hard Assert
	  
	 System.out.println(URL);
	  // Text (username) Assertion
	  dr.findElement(By.id("email")).getAttribute("Value");
	  
	  String aText = dr.findElement(By.id("email")).getAttribute("value");
	  String eText  = "";
	  sa.assertEquals(aText, eText , "Text is Mis Matched");
	  //assertEquals(aText, eText , "Text is Mis Matched");
	  
	  
	  
	  //Error Message Assertion 
	String aEmsg = dr.findElement(By.xpath("//div[@class='_9ay7']")).getText();
	String eEMsg = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
	sa.assertEquals(aEmsg, eEMsg, "Error Message is Mis Matched");
	  //assertEquals(aText, eText , "Text is Mis Matched");
	  
	  /*Border Assertion
	  dr.findElement(By.name("email")).getCssValue("border");
	  String eBorder = "1px solid #dddfe2"
		*/
	dr.quit();
	sa.assertAll();
	
	
	}
	
	
}
