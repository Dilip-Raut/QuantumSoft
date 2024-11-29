package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePageQuantumSoft;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_001_HomePageQuantumSoftTestDDT extends BaseClass
{

	//Soft assertions
	SoftAssert myassert=new SoftAssert();
	
	
	@Test(priority = 1)
	public void verify_getQuoteLink() throws InterruptedException {
		logger.info("**** Starting verify_getQuoteLink *****");
		// Home page
		HomePageQuantumSoft hp = new HomePageQuantumSoft(driver);
		hp.clickOnFirstGetQuote();
		Thread.sleep(2000);
		myassert.assertNotEquals(hp.getUrl(), "https://www.quantumsofttechnologies.com/",
				"Get quote Link is Not Working as we are in Same Page ");
		myassert.assertAll(); //conclusion
		logger.info("**** Finished verify_getQuoteLink *****");

	}
	 
	 
	
	@Test(priority = 2,dataProvider="GetQuoteData",dataProviderClass=DataProviders.class)
	public void verify_fillFormDetailsDDT(String yourName, String YourEmail, String Date,String idea) throws InterruptedException
	{
		try {
	
			logger.info("**** Starting verify_fillFormDetailsDDT *****");
			//Home page
			HomePageQuantumSoft hp=new HomePageQuantumSoft(driver);

			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].scrollIntoView();", hp.lnkReadMore);
				
			//Login page
			hp.clickYourEmail(YourEmail);
			hp.clickYourName(yourName);
			hp.clickDate(Date);
			hp.clickMessage(idea);
			Thread.sleep(5000);
			hp.clickOnGetQuote();	
			Thread.sleep(5000);
			
			myassert.assertNotEquals(hp.getUrl(),"https://www.quantumsofttechnologies.com/?", "Get quote Link is Not Working After Filling the Form as we are in Same Page ");
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}
			
		logger.info("**** Finished verify_fillFormDetailsDDT *****");
		myassert.assertAll(); //conclusion
	}
	
	
	@Test(priority = 3)
	public void verify_FooterAboutUsLink() throws InterruptedException {
		logger.info("**** Starting verify_FooterAboutUsLink *****");
		// Home page
		HomePageQuantumSoft hp = new HomePageQuantumSoft(driver);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	      Thread.sleep(2000);
		hp.clickOnFooterAboutus();
		Thread.sleep(2000);
		myassert.assertNotEquals(hp.getUrl(), "https://www.quantumsofttechnologies.com/",
				"AboutUs Link is Not Working as we are in Same Page ");
		myassert.assertAll(); //conclusion
		logger.info("**** Finished verify_FooterAboutUsLink *****");

	}
	@Test(priority = 4)
	public void verify_FooterServicesLink() throws InterruptedException {
		logger.info("**** Starting verify_FooterServicesLink *****");
		// Home page
		HomePageQuantumSoft hp = new HomePageQuantumSoft(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		hp.clickOnFooterServices();;
		Thread.sleep(2000);
		myassert.assertNotEquals(hp.getUrl(), "https://www.quantumsofttechnologies.com/",
				"FooterServices Link is Not Working as we are in Same Page ");
		myassert.assertAll(); //conclusion
		logger.info("**** Finished verify_FooterServicesLink *****");

	}
	@Test(priority = 5)
	public void verify_FooterContactUsLink() throws InterruptedException {
		logger.info("**** Starting verify_FooterContactUsLink *****");
		// Home page
		HomePageQuantumSoft hp = new HomePageQuantumSoft(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    Thread.sleep(2000);
		hp.clickOnFooterContactUs();
		Thread.sleep(2000);
		myassert.assertNotEquals(hp.getUrl(), "https://www.quantumsofttechnologies.com/",
				"ContactUs Link is Not Working as we are in Same Page ");
		myassert.assertAll(); //conclusion
		logger.info("**** Finished verify_FooterContactUsLink *****");

	}
}








