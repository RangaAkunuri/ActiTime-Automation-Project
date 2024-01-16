package base ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.internal.ConfigurationGroupMethods;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.C_Data;
import utilities.ReadDataFromExcel;
import utilities.WaitStatements;


public class BaseTest 
{
	
public  WebDriver   dr  ;
public  String SSfolderName   ; 


 
public  String      browser ="chrome";
public  String      url="https://online.actitime.com/teksoftware/login.do" ; 
public  String      user="rammanesh11@gmail.com";
public  String	    password="Umadevi@1976";



@BeforeTest

     public void setUp() throws Throwable
     {
	
	
	
	if (browser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		dr = new ChromeDriver();
	    dr.get(url);
	    
	}
	
	else if (browser.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		 dr = new FirefoxDriver();
		dr.get(url);
	}
	

	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	dr.manage().window().maximize();
	
	System.out.println("Succesfully Logged in");
	
	Thread.sleep(3000);
	
}
	

public void captureScreenShot(String fileName)
{
	if(SSfolderName == null)
	{
		
	LocalDateTime ldt =LocalDateTime.now();
	DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-mm-yyyy  HH:mm:ss");
	SSfolderName = ldt.format(dft);
	}
	TakesScreenshot ts = (TakesScreenshot) dr ; 
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        File dest = new File("./ScreenShots/"+SSfolderName+"/"+fileName);
	        try {
				Files.copy(src, dest);
			}
	        catch (IOException e)
	        {
				e.printStackTrace();
			}
	        
}



@AfterTest

public void tearDown()
{
	
dr.close();	
System.out.println("Succesfully Logged Out");

}
}
