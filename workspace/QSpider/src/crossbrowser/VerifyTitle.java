package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {

	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifyTitle(String browserName)
	{
		if(browserName.equalsIgnoreCase("browser"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Automation\\My Auto\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\My Auto\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver","D:\\Automation\\My Auto\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();			
		}
		
		driver.manage().window().maximize();
		driver.get("http://www.learn-automation.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	
	
	
	
}
