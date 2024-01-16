package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver dr ;
	
@FindBy(className = "textField")
private WebElement user;

@FindBy(name="pwd")
private WebElement password;

@FindBy(xpath="//div[text()='Login ']")
private WebElement login ;

@FindBy(xpath = "//a[text()='Logout']")
private WebElement logout;


public LoginPage(WebDriver dr)
{
         
	PageFactory.initElements(dr, this);
}


public WebElement getUser()
{
	
	return user;
}



public WebElement getPassword() 
{
	return password;
}



public WebElement getLogin() 
{
	return login;
}


public WebElement getLogout()
{
	return logout;
}




}
