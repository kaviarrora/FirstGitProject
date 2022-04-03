package pageobject.customerhub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerHubLogInPage {
	
	
	private String CustomerHubPPDURL="https://ppd-customerhub.veolia.co.uk/";
	private WebDriver driver;
	
	@FindBy (id="edit-name")
	private WebElement Email;
	
	@FindBy (id="edit-pass")
	private WebElement password;
	
	@FindBy (id="edit-submit")
	private WebElement submit;
	
	@FindBy (className="logo")
	private WebElement logo;
		
	public CustomerHubLogInPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement Email()
	{
		return Email;
	}
	
	public WebElement password()
	{
		return password;
	}
	public WebElement submit()
	{
		return submit;
	}
	public CustomerHubHomePage clickveolialogo()
	{
		logo.click();
		return new CustomerHubHomePage(driver);
	}
	
	public void opencustomerhubPPD()
	{
		driver.get(CustomerHubPPDURL);
	}

}
