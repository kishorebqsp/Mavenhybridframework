package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(linkText = "Sign in")
	private WebElement signin;

	@FindBy(id = "email")
	private WebElement emailaddress;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(id = "SubmitLogin")
	private WebElement login;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void signinbtton()
	{
		signin.click();
	}
	
	public void emailaddresstxtbox(String name)
	{
		emailaddress.sendKeys(name);
	}
	
	public void passwordtxtbox(String pass)
	{
		password.sendKeys(pass);
	}
	public void loginbtn()
	{
		login.click();
	}
}
