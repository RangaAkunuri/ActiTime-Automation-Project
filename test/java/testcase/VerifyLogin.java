package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLogin 
{
WebDriver dr ; 	
@Test
public void verify()
{
	WebDriverManager.chromedriver().setup();
	 dr = new ChromeDriver();
	 dr.get("https://online.actitime.com/teksoftware/login.do");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("rammanesh11@gmail.com" , Keys.TAB , "Umadevi@1976" , Keys.ENTER);
		
		
	 String Name = 	dr.findElement(By.xpath("//a[@class='userProfileLink username ']")).getText();
	 
	 if(Name.equalsIgnoreCase("Ram Naidu"))
	 {
		 System.out.println("User successfully Verified");
	 }
	 else 
		
	 {
		 System.out.println("User Verification failed");
	 }
	 
	 dr.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
	 
	 
}
}
