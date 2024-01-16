package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WaitStatements 
{
	WebDriver dr ;
	public void implicitWait()
	{
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public   void maximise()
	{
		
		dr.manage().window().maximize();
	}

	
	
	
}
