package testCases;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.AboutPageQuantumSoft;
import pageObjects.ContactPageQuantumSoft;
import pageObjects.HomePageQuantumSoft;
import testBase.BaseClass;

public class TC_003_ContactTest extends BaseClass
{

	@Test
	public void verify_Contact()
	{
		//Soft assertions
		SoftAssert myassert=new SoftAssert();
		try
		{
		//Home page
		HomePageQuantumSoft hp=new HomePageQuantumSoft(driver);
		hp.clickOnlnkContactPage();
		
		ContactPageQuantumSoft cp=new ContactPageQuantumSoft(driver);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView();", cp.txtYourName);
		Thread.sleep(2000);
		cp.fillYourName("Dilip Raut");
		Thread.sleep(2000);
		cp.fillEmail("DilipRaut@gmail.com");
		Thread.sleep(2000);
		cp.fillSubject("DemoTest");
		Thread.sleep(2000);
		cp.fillMsg("Perfroming Demo Test");
		Thread.sleep(2000);
		cp.clickOnSendMessage();
		Thread.sleep(2000);
		
		String ActualMsg="Successfully Send Message";
		myassert.assertEquals("No ConfirmationMsg", ActualMsg,"Not Getting Any Confirmation Message" );
		myassert.assertAll(); //conclusion		
		
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}
		
	}
}
