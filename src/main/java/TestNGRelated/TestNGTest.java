package TestNGRelated;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Practice\\chromedriver.exe");

		  //Initializing the browser driver
		  driver = new ChromeDriver();

		  //Navigating through a particular website
		  driver.get("https://www.google.com");
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 
	}
	
	@Test(invocationCount = 2)
	public void actualTest() throws InterruptedException
	{
	
		 WebElement ele = driver.findElement(By.xpath("//input[@title='Search']"));
		  ele.sendKeys("Nilesh Patharkar");
		  Thread.sleep(1000);
		  System.out.println("Selenium WebdriverScript in Chrome");
		 
	}
	
	@AfterMethod
	public void tearDown()
	{
		 driver.close();
	}
	

}
