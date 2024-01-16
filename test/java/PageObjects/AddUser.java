package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser 
{

	WebDriver dr ; 
	
	@FindBy(xpath ="(//div[@class='firstNameInputContainer'])[2]")
    private  WebElement  fn;
	
	
	@FindBy(xpath = "(//input[@name='lastName'])[2]")
	private WebElement mi ;
	
	
	@FindBy(xpath = "(//input[@placeholder='Last Name'])[3]")
	private WebElement ln ;
	 
	
	@FindBy(xpath =  "(//input[@placeholder='Email'])[3]")
	private WebElement email ; 
	
	
	@FindBy(xpath = "(//div[@class='downIcon'])[5]")
	private WebElement downicon;
	
	@FindBy(xpath = "//div[text()='HR & Finance']")
	private WebElement hf;
	
	
	@FindBy(xpath =  "//div[text()='Save & Send Invitation']")
	private WebElement sendandinvite ; 
	
	
	@FindBy(xpath = "//span[text()='Close']")
	private WebElement close ; 
	
	
	
	
	public AddUser(WebDriver dr)
	{
		PageFactory.initElements(dr, this);
	}




	public WebElement getFn() {
		return fn;
	}




	public WebElement getMi() {
		return mi;
	}




	public WebElement getLn() {
		return ln;
	}




	public WebElement getDownicon() {
		return downicon;
	}




	public WebElement getHf() {
		return hf;
	}




	public WebElement getSendandinvite() {
		return sendandinvite;
	}




	public WebElement getClose() {
		return close;
	}




	public WebElement getEmail() {
		return email;
	}
	
	
	
}

