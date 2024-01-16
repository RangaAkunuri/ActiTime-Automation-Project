package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{

	@FindBy(xpath = "(//div[text()='Users'])[1]")
	private WebElement users;
	
	@FindBy(xpath = "//div[text()='New User']")
	private WebElement newuser;
	
	public HomePage(WebDriver dr)
	{
		PageFactory.initElements(dr , this);
	}
	
	public WebElement getUsers()
	{
		return users;
	}

	public WebElement getNewuser() {
		return newuser;
	}
	
	
}
