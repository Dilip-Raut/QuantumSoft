package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageQuantumSoft extends BasePage{

	public HomePageQuantumSoft(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//a[text()='Get Quote']") 
WebElement lnkGetQuote;

@FindBy(xpath="//a[text()='Read More']") 
public WebElement lnkReadMore;

@FindBy(xpath="//input[@placeholder='Your email']") 
WebElement txtFilledEmail;

@FindBy(xpath="//button[normalize-space()='SignUp']")  
WebElement txtSignUp;



@FindBy(xpath="//a[normalize-space()='About']") 
WebElement lnkAboutUs;


@FindBy(xpath="//input[@id='name']") 
WebElement txtYourName;

@FindBy(xpath="//input[@id='email']") 
WebElement txtEmail;

@FindBy(xpath="//input[@id='datetime']") 
WebElement txtDate;

@FindBy(xpath="//textarea[@id='message']") 
WebElement txtMessage;


@FindBy(xpath="//button[@type='submit']")
public  WebElement btnGetQuote;

@FindBy(xpath="//a[normalize-space()='Get Quote']")
public  WebElement btnFirstGetQuote;


@FindBy(xpath="//input[@placeholder='Your email']")
public  WebElement txtYourMail;


@FindBy(xpath="//button[normalize-space()='SignUp']")
public  WebElement btnsignUp;


@FindBy(xpath="//a[normalize-space()='About Us']")
public  WebElement btnFooterAboutUs;

@FindBy(xpath="//a[normalize-space()='Contact Us']")
public  WebElement btnFooterContactUs;

@FindBy(xpath="(//a[normalize-space()='Services'])[2]")
public  WebElement btnFooterServicesUs;

@FindBy(xpath="//a[normalize-space()='Contact']") 
public WebElement lnkContactPage;

public void clickOnAbotUs()
{
	lnkAboutUs.click();
}

public void clickYourName(String yourName)
{
	txtYourName.sendKeys(yourName);
}
public void clickYourEmail(String yourEmail)
{
	txtEmail.sendKeys(yourEmail);
}
public void clickDate(String date)
{
	txtDate.sendKeys(date);
}
public void clickMessage(String Message)
{
	txtMessage.sendKeys(Message);
}

public void enterEmail(String email)   
{
	txtYourMail.sendKeys(email);
}

public void clickOnSignup()  
{
	btnsignUp.click();
}

public void clickOnGetQuote()  
{
	btnGetQuote.click();
}

public void clickOnFirstGetQuote()  
{
	btnFirstGetQuote.click();
}
public String GetTitle()  
{
  return driver.getTitle();
}

public String getUrl()  
{
  return driver.getCurrentUrl();
}

public void clickOnFooterAboutus()  
{
	btnFooterAboutUs.click();
}

public void clickOnFooterServices()  
{
	btnFooterServicesUs.click();
}

public void clickOnFooterContactUs()  
{
	btnFooterContactUs.click();
}
public void clickOnlnkContactPage()    
{
	lnkContactPage.click();
}
}
