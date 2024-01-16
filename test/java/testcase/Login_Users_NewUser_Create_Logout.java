package testcase;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjects.AddUser;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import base.BaseTest;
import utilities.ReadDataFromExcel;
import utilities.ReadDataFromeProperties;


public class Login_Users_NewUser_Create_Logout extends BaseTest
{

	
	
		@Test 
	public void Login_Logout() throws Throwable
	
	{
    
				
	ReadDataFromExcel rde = new ReadDataFromExcel();
		
   	String FN = rde.getDataFromExcel("Sheet1", 1, 1);
   	
   	String LN = rde.getDataFromExcel("Sheet1", 1, 2);
   	
    String EMAIL = rde.getDataFromExcel("Sheet1", 1, 3);
    
    String MI = rde.getDataFromExcel("Sheet1", 1, 4);
   	        
   	
		
		
		
	LoginPage lp = new LoginPage(dr);
	lp.getUser().sendKeys(user);
	lp.getPassword().sendKeys(password);
	lp.getLogin().click();
	
	
	
    
     
	HomePage hp = new HomePage(dr);
	hp.getUsers().click();
	hp.getNewuser().click();
	
	
	AddUser au = new AddUser(dr);
	
	au.getFn().sendKeys(FN);
	au.getMi().sendKeys(MI);
	au.getLn().sendKeys(LN);
	au.getEmail().sendKeys(EMAIL);
	au.getDownicon().click();
	au.getHf().click();
	au.getSendandinvite().click();
	au.getClose().click();
	
	
	lp.getLogout().click();
	
	}
	


	
	
	
	
	
	

	
			
	
	
	
}
