package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Whislist {
	@FindBy(id = "name")
	private WebElement name;

	@FindBy(id = "submitWishlist")
	private WebElement save;
	
	public Whislist(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void nametxtbox(String namea)
	{
		name.sendKeys(namea);
	}
	
	public void savebtn()
	{
		save.click();
	}
	

}
