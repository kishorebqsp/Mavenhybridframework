package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Constant {
	public WebDriver driver;
	static
	{
		System.setProperty(key,value);
	}
	@BeforeMethod
	public void open()
	{
			 driver=new ChromeDriver();
			String url1 = Property.getpropertydata(propertyfilepath,"URL");
			driver.get(url1);
		}
	
	@AfterMethod
	public void cloaseapp(ITestResult r)
	{
		String name = r.getName();
		int status = r.getStatus();
		if(status==2)
		{
			Photo.getphoto(driver,photopath,name);
		}
		
		driver.close();
	}

}
