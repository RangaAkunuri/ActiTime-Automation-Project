package testcase;

import static org.testng.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.RandomNumber;




public class LogintoactiTime 
{
	WebDriver dr ;

	
	
@Parameters()
@BeforeTest

public void Launch_Browser() throws Throwable

{
	WebDriverManager.chromedriver().setup();
	WebDriver dr = new ChromeDriver();
	dr.get("https://online.actitime.com/teksoftware/login.do");
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	dr.manage().window().maximize();
	
}


@Test
     public void Login() throws Throwable
{
	
	
	dr.findElement(By.xpath("//input[@name='username']")).sendKeys("rammanesh11@gmail.com");
	dr.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Umadevi@1976");
	
	dr.findElement(By.xpath("//div[text()='Login ']")).click();
	
	
	Thread.sleep(2000);
	
	/*System.out.println(dr.getTitle());
	
	String actualTitle   =  dr.getTitle();k
	String expectedTitle = "actiTIME - Enter Time-Track";
	
	
	assertEquals(actualTitle, expectedTitle , "Title is Mis Matchded" );
	
	System.out.println("Title Verified");*/
	
}
/*
public void addUser()
{
	RandomNumber rn = new RandomNumber();
	
	int  J =  rn.getRandomNumber();
	
	dr.findElement(By.xpath("//div[text()='Users']")).click();
	dr.findElement(By.xpath("//div[text()='New User']")).click();
	dr.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys("Jhansi"+J);
	dr.findElement(By.xpath("(//input[@placeholder='Last Name'])[3]")).sendKeys("Pasham");
	
	dr.findElement(By.xpath("(//input[@placeholder='Email'])[3]")).sendKeys("jhansipasham@gmail.com");
	
	dr.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
	
	dr.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
}*/



@AfterTest


     public void Logout()

   {
	
          dr.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();

   }


}
