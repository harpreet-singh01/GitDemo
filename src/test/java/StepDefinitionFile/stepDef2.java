package StepDefinitionFile;

import org.junit.Assert;

import PageObject.CartPage;
import PageObject.HomePage;
import Utility.Base;
import io.cucumber.java.en.Then;

public class stepDef2 extends Base
{
	public HomePage hp = new HomePage(driver);
	public CartPage cp = new CartPage(driver);
	
	@Then("^Search result should get displayed \"([^\"]*)\"$")
	public void search_result_should_get_displayed(String string) 
	{
		Assert.assertTrue(hp.searchVerify().getText().contains(string));
	}
	
	@Then("^verify selected \"([^\"]*)\" items are displayed in check out page$")
	public void checkout_page_displayed(String string)
	{
		Assert.assertTrue(cp.placeOrder().getText().contains(string));
	}

}
