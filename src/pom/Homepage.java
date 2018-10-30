package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(id = "search_query_top")
	private WebElement serachtb;

	@FindBy(name= "submit_search")
	private WebElement serachbtn;

	@FindBy(xpath = "//span[.='My wishlists']")
	private WebElement wishlist;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void serachtxtbox(String pname)
	{
		serachtb.sendKeys(pname);
	}

	public void serachbutton()
	{
		serachbtn.click();
	}
	public void whislistbtn()
	{
		wishlist.click();
	}
}
