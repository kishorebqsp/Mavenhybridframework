package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresspage {
	@FindBy(xpath = "(//img[@alt='Printed Summer Dress'])[1]")
	private WebElement dress;
	
	public Dresspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void dressselected()
	{
		dress.click();
	}

}
