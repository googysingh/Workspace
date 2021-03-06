package selenium;


import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazonproblem {
	static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		String[] itemsNeeded= {"Cucumber","Brocolli"};
		
        List<WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0;i<product.size();i++) {
        	String[] name=product.get(i).getText().split("-");
        	String actname=name[0].trim();
        	List<String> itemsNeededList= Arrays.asList(itemsNeeded);
        	if(itemsNeededList.contains(actname)) {
        		driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
        	}
        }
		Thread.sleep(5000);
		driver.close();
	}

}