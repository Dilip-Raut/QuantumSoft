package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPageQuantumSoft extends BasePage{

	public ContactPageQuantumSoft(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//input[@id='name']") 
public WebElement txtYourName;

@FindBy(xpath="//input[@id='email']") 
public WebElement txtYourEmail;

@FindBy(xpath="//input[@id='subject']") 
public WebElement txtYourSubject;

@FindBy(xpath="//textarea[@id='message']") 
public WebElement txtYourMsg;

@FindBy(xpath="//button[normalize-space()='Send Message']") 
public WebElement txtSendMessage;




@FindBy(xpath="//p[contains(text(),'We at QuantumSoft Technologies offers a complete p')]") 
public WebElement lnkPara;



public String getUrl()  
{
  return driver.getCurrentUrl();
}

public void fillYourName(String Name )    
{
	txtYourName.sendKeys(Name);
}

public void fillEmail(String Email )    
{
	txtYourEmail.sendKeys(Email);
}

public void fillSubject(String Subject )    
{
	txtYourSubject.sendKeys(Subject);
}

public void fillMsg(String Msg )    
{
	txtYourMsg.sendKeys(Msg);
}


public void clickOnSendMessage( )    
{
	txtSendMessage.click();
}

}
