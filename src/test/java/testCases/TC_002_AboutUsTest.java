package testCases;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.AboutPageQuantumSoft;
import pageObjects.HomePageQuantumSoft;
import testBase.BaseClass;

public class TC_002_AboutUsTest extends BaseClass
{

	@Test
	public void verify_AboutUs()
	{
		//Soft assertions
		SoftAssert myassert=new SoftAssert();
		try
		{
		//Home page
		HomePageQuantumSoft hp=new HomePageQuantumSoft(driver);
		hp.clickOnAbotUs();
				
		String currentUrl=driver.getTitle();
		
		AboutPageQuantumSoft as=new AboutPageQuantumSoft(driver);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView();", as.lnkPara);
		Thread.sleep(2000);
		as.clickOnReadMore();
		Thread.sleep(2000);
		myassert.assertNotEquals(hp.getUrl(), "https://www.quantumsofttechnologies.com/about.html",
				"Read More Link is Not Working as we are in Same Page ");
		myassert.assertAll(); //conclusion		
		
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}
		
	}
}
