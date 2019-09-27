package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Base;

public class LoginPage {
	WebDriver driver;

	@FindBy (xpath="//input[@name='username']") private WebElement username;
	@FindBy (name="pwd") private WebElement password;
	@FindBy (id="loginButton") private WebElement Loginbtn;
	@FindBy (xpath="(//span[@class='errormsg'])[1]") private WebElement Errormsg;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginDtls(String usrname,String pwd)
	{
		username.sendKeys(usrname);
		password.sendKeys(pwd);
		Loginbtn.click();
		
	}
	
}
