package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base 
{
	public static WebDriver driver =null;
	public static Properties prop;
	public void openBrowser() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("H:\\JavaWorkspace\\Cucumber\\src\\test\\java\\Utility\\common.properties");
		prop.load(fis);
		String url = prop.getProperty("url");
		System.setProperty("webdriver.edge.driver","msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	public void bandBrowser() throws IOException
	{
		driver.close();
		driver.quit();
		//---
	}
	
	
}
