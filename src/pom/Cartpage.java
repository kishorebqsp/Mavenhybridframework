package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Listbox;

public class Cartpage {
	@FindBy(xpath = "//span[.='Add to cart']")
	private WebElement cart;
	
	@FindBy(id="group_1")
	private WebElement dropdown;
	
	@FindBy(linkText="Sign out")
	private WebElement logout;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;
	
	public Cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	public void addtocart()
	{
		cart.click();
	}

public void listboxitem(WebDriver driver)
{
	Listbox.dropdown(dropdown,"M");
}
public void logoutbtn()
{
	logout.click();
}
public void proceedd()
{
	proceed.click();
}
}
