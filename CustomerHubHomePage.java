package pageobject.customerhub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerHubHomePage {
	
	
	private String CustomerHubPPDURL="https://ppd-customerhub.veolia.co.uk/";
	private WebDriver driver;
	
	@FindBy (className="signIn")
	private WebElement SignIn;
	
	public CustomerHubHomePage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement signin()
	{
		
				return SignIn;
	}
	
	public void opencustomerhubPPD()
	{
		driver.get(CustomerHubPPDURL);
	}

}
