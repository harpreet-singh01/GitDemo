package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search = By.xpath("//input[@type='search']");
	By match = By.cssSelector("h4.product-name");
	
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}
	public WebElement searchVerify()
	{
		return driver.findElement(match);
	}
	

}
