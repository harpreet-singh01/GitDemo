package StepDefinitionFile;

import java.io.IOException;
import Utility.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base
{
	@After("@test")
	public void closeBrowser() throws IOException
	{
		bandBrowser();
	}
	
	@Before("@test")
	public void startBrowser() throws IOException
	{
		openBrowser();
	}
}
