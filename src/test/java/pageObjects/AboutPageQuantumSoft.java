package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutPageQuantumSoft extends BasePage{

	public AboutPageQuantumSoft(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//a[normalize-space()='Read More']") 
public WebElement lnkReadMore;

@FindBy(xpath="//a[@class='btn btn-outline-light btn-social']//i[@class='fab fa-twitter']") 
WebElement lnkTwitter;


@FindBy(xpath="//p[contains(text(),'We at QuantumSoft Technologies offers a complete p')]") 
public WebElement lnkPara;

public void clickOnReadMore()    
{
	lnkReadMore.click();
}

public String isGetQuotesLinkExists()   // GetQuotesLink display status
{
	String getQuotes = driver.getTitle();
	return getQuotes;
}

public String getUrl()  
{
  return driver.getCurrentUrl();
}

}
