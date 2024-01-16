package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvierClass 
{
	
	@Test
	(dataProvider  = "LoginData")
	public void Login(String username, String password ) throws Throwable

	{
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		dr.get("https://online.actitime.com/teksoftware/login.do");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.manage().window().maximize();
		
	    dr.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		dr.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(password);
		
		dr.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
	
}
	
	@DataProvider( name  = "LoginData")
	public Object [][] DataforLogin()
	
	{
		Object [][] data = new Object[2][2];
		
		data [0] [0] = "rammanesh11@gmail.com";
		data [0] [1] = "Umadevi@1976";
		
	    data [1] [0] = "Admin";
	    data [1] [1] = "test123";
	    
	    return data ;
	    
	    
	}
}