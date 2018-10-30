package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Property {
	public static String  getpropertydata(String filepath,String key)
	{
		String k="";
		try {
		
		Properties p=new Properties();
		p.load(new FileInputStream(filepath));
		 k = p.getProperty(key);
		}
		catch(Exception e)
		{
			
		}
		return k;
	}

}
