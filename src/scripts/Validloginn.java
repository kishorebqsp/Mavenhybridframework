package scripts;

import org.testng.annotations.Test;

import generic.Basetest;
import generic.Property;
import pom.Cartpage;
import pom.Dresspage;
import pom.Homepage;
import pom.Loginpage;

public class Validloginn extends Basetest {
	@Test
	public void login() throws InterruptedException
	{
	Loginpage l=new Loginpage(driver);
	l.signinbtton();
	String name = Property.getpropertydata(propertyfilepath,"USERNAME");
	l.emailaddresstxtbox(name);
	String pass= Property.getpropertydata(propertyfilepath,"PASSWORD");
	l.passwordtxtbox(pass);
	l.loginbtn();
	
	Homepage h=new Homepage(driver);
	String pname = Property.getpropertydata(propertyfilepath,"SEARCH");
	h.serachtxtbox(pname);
	h.serachbutton();
	
	Dresspage d=new Dresspage(driver);
	d.dressselected();
	
	Cartpage c=new Cartpage(driver);
	c.listboxitem(driver);
	c.addtocart();
	
	Thread.sleep(3000);
c.proceedd();
c.logoutbtn();

}

}