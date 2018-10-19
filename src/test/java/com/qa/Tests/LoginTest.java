package com.qa.Tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestMvn.Base;

public class LoginTest extends Base {
		
	WebDriver driver;
	
	Logger log = Logger.getLogger(LoginTest.class);
	
	@BeforeMethod()
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\6867\\Downloads\\Browsers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.sqs.com/en/index.php");
	}
	
	@Test(priority=0)
	public void test() {
		
		log.info("The Log4j is up and running.......");
		System.out.println("*************TestNg is perfectly running*********");
	}
	
	@Test(priority=1)
	public void aboutusPageTest() {
		log.debug(" ABout US page is going to be opened........");
		WebElement aboutlement=driver.findElement(By.xpath("//a[text()='About Us']"));
		aboutlement.click();
		
		
	}
	
	@Test(priority=3)
	public void technologiesPageTest() {
			log.info(" Technologies page is going to be opened........");
		driver.findElement(By.xpath("//a[text()='Technologies']")).click();;
	}
	
	
	@Test(priority=4)
	public void sapPageTest() {
			
		WebElement element=driver.findElement(By.xpath("//a[text()='Technologies']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='SAP Expertise']"));
		
		explicitWait(driver, ele, 30);
		ele.click();
		
				
	}
	

	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	

}
