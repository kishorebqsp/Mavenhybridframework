package scripts;

import org.testng.annotations.Test;

import generic.Basetest;
import generic.Property;
import pom.Cartpage;
import pom.Homepage;
import pom.Loginpage;
import pom.Whislist;

public class Wishlistproduct extends Basetest {
	@Test
	public void whishlist()
	{
		Loginpage l=new Loginpage(driver);
		l.signinbtton();
		String name = Property.getpropertydata(propertyfilepath,"USERNAME");
		l.emailaddresstxtbox(name);
		String pass= Property.getpropertydata(propertyfilepath,"PASSWORD");
		l.passwordtxtbox(pass);
		l.loginbtn();
		
		Homepage h=new Homepage(driver);
		h.whislistbtn();
		
		Whislist w=new Whislist(driver);
		String namea=Property.getpropertydata(propertyfilepath,"NAME");
		w.nametxtbox(namea);
		w.savebtn();
		
		Cartpage c=new Cartpage(driver);
		c.logoutbtn();
	}

}
