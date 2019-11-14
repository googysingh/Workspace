package com.indeed.test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Indeedjobsearch {

	public static void main(String[] args) throws InterruptedException {
				
		//Create firefox driver to drive the browser
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\My Auto\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		//Create Chrome driver to drive the browser
		//System.setProperty("webdriver.chrome.driver", "C:\\My Auto\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
				
		//Open Indeed home page
		driver.get("https://www.indeed.co.uk");
		//Find what field enter Selenium
		Thread.sleep(2000);
		driver.findElement(By.id("what")).sendKeys("Selenium");
		
		//Find location field and enter London
		driver.findElement(By.id("where")).sendKeys("London");
		
		//Find Findjobs button and click on it
		Thread.sleep(2000);
		driver.findElement(By.id("fj")).click();
					
		//Closing pop over
		Thread.sleep(2000);
		driver.findElement(By.id("prime-popover-div")).sendKeys(Keys.chord(Keys.ALT, Keys.F4));
		//driver.findElement(By.id("prime-popover-close-button")/strong).click();
		
		//Form job search results page, get page title and jobs count message 
		Thread.sleep(2000);
		driver.getTitle();
		driver.findElement(By.id("searchCount")).getText();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("searchCount")).getText());
		//close browser
		     
		driver.close();
	}

}
