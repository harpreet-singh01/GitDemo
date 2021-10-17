package StepDefinitionFile;

import org.openqa.selenium.WebDriver;
import PageObject.CartPage;
import PageObject.HomePage;
import Utility.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class stepDef1 extends Base
{
	public HomePage hp = new HomePage(driver);
	public CartPage cp = new CartPage(driver);

	
	@Given("^User searches \"([^\"]*)\"$")
	public void user_searches(String string) throws InterruptedException 
	{
		hp.getSearch().sendKeys(string);
		Thread.sleep(2000);    
	}

	@And("^Added items to cart$")
	public void added_items_to_carts() throws InterruptedException
	{
		cp.increment().click();
		Thread.sleep(2000);
		cp.addTocart().click();
		Thread.sleep(2000);
	}
	
	@And("^User proceeded to Chekout page for purchase$")
	public void proceed_checkout_page() throws InterruptedException
	{
		cp.clickOnCart().click();
		Thread.sleep(2000);
		cp.proToCheckOut().click();;
	}
	

	
}
