package scripts;

import org.testng.annotations.Test;

import generic.Basetest;
import generic.Excel;
import pom.Loginpage;

public class Invalidlogin extends Basetest{
	@Test
	public void invalid()
	{
		Loginpage l=new Loginpage(driver);
		l.signinbtton();
		String name = Excel.getdata(excelpath,"Sheet1",1,0);
		l.emailaddresstxtbox(name);
		String pass = Excel.getdata(excelpath,"Sheet1",1,1);
		l.passwordtxtbox(pass);
		l.loginbtn();
	}

}
