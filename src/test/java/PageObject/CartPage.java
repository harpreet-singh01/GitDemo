package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage 
{
	public WebDriver driver;

	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}

	By increment = By.cssSelector("a.increment");
	By addToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By clickOnCart = By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");
	By proToCheckOut = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button");
	By placeOrder = By.cssSelector("p.product-name");

	public WebElement increment()
	{
		return driver.findElement(increment);
	}
	public WebElement addTocart()
	{
		return driver.findElement(addToCart);
	}
	public WebElement clickOnCart()
	{
		return driver.findElement(clickOnCart);
	}
	public WebElement proToCheckOut()
	{
		return driver.findElement(proToCheckOut);
	}
	public WebElement placeOrder()
	{
		return driver.findElement(placeOrder);
	}
}
