package scripts;

//change done on 3rd April

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","test\\resources\\chromedriver.exe");
		
			
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("www.google.com");

	}

}

