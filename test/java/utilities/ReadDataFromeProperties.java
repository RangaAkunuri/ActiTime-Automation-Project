package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromeProperties {

	//public static void main(String[] args) throws Throwable 
	
	public void getDataFromproperties() throws Throwable
	{
    
  FileInputStream fis= new   FileInputStream(C_Data.Pdata);

  Properties p =new Properties();
  
  p.load(fis);
  
 String BROWSER = p.getProperty("browser");
 String URL = p.getProperty("url");
 String USER=  p.getProperty("user");
 String PWD =  p.getProperty("password");
 
 System.out.println(BROWSER);

	}

}
