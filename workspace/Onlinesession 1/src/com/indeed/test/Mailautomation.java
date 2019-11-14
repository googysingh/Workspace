package com.indeed.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Mailautomation {

	public static void main(String[] args) throws InterruptedException {
		
		//Create firefox driver to drive the browser
		System.setProperty("webdriver.gecko.driver", "C:\\My Auto\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		//Create Chrome driver to drive the browser
		//System.setProperty("webdriver.chrome.driver", "C:\\My Auto\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
				
		//Open Hotmail
		driver.get("https://www.hotmail.com");
		
		//Enter username and next
		Thread.sleep(2000);
		driver.findElement(By.name("loginfmt")).sendKeys("googy_singh@hotmail.com");
		driver.findElement(By.id("idSIButton9")).click();		
		
		//Enter password and signin
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='passwd' and @type='password']")).sendKeys("*9828335200#");
		driver.findElement(By.id("idSIButton9")).click();	
		
		//Click on new mail 
		Thread.sleep(20000);
		driver.findElement(By.id("_ariaId_103")).click();
		
		//Enter To 
		Thread.sleep(20000);
		//driver.findElement(By.xpath("//input[@class='_fp_G ms-fwt-r ms-font-color-neutralSecondary allowTextSelection ms-bgc-nl textbox ms-font-s ms-fwt-sl ms-fcl-np ms-bcl-nta ms-bcl-nsa-h hideClearButton ms-fcl-ns' and @role='textbox']")).sendKeys("googysingh@gmail.com");

		driver.findElement(By.xpath("//input[@class='_fp_G ms-fwt-r ms-font-color-neutralSecondary allowTextSelection ms-bgc-nl textbox ms-font-s ms-fwt-sl ms-fcl-np ms-bcl-nta ms-bcl-nsa-h hideClearButton ms-fcl-ns' and @role='textbox']")).sendKeys("googysingh@gmail.com");
		// id('primaryContainer')/x:div[5]/x:div/x:div[1]/x:div/x:div[4]/x:div[3]/x:div/x:div[4]/x:div[1]/x:div/x:div[3]/x:div[5]/x:div/x:div[1]/x:div[2]/x:div[2]/x:div[1]/x:div[1]/x:div[2]/x:div[2]/x:div[1]/x:div/x:div/x:div/x:span/x:div[1]/x:form/x:input
		//Enter Subject
		driver.findElement(By.xpath("//input[@class='_mcp_I1 _mcp_J1 ms-font-weight-regular ms-bg-color-white-hover ms-font-color-neutralPrimary allowTextSelection _mcp_G1 textbox ms-font-s ms-fwt-sl ms-fcl-np ms-bcl-nta ms-bcl-nsa-h' and @placeholder='Add a subject']")).sendKeys("Automation Test");

		//Enter Message
		driver.findElement(By.xpath("//input[@class='allowTextSelection ConsumerCED _mcp_V1 customScrollBar ms-bg-color-white ms-font-color-black owa-font-compose' and @aria-label='Message body']")).sendKeys("Do not pray for an easy life, pray for the strength to endure a difficult one.");

		
		//Send the mail
		
		//Signout
		
	}	
	
}
