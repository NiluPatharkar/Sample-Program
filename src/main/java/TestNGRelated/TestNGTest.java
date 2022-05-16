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
	
	
	
	@BeforeMethod
	public void setup()
	{
		
		System.out.println("Starting Setup Method");
		 //why merge happend 
		//Initializing the browser driver
		 
		 
	}
	
	@Test
	public void actualTest1() throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Practice\\chromedriver.exe");
		driver = new ChromeDriver();

		  //Navigating through a particular website
		  driver.get("https://www.google.com");
	          //my line number is 36
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("The thread ID for @Test1 Chrome is "+ Thread.currentThread().getId()); 
		WebElement ele = driver.findElement(By.xpath("//input[@title='Search']"));
		  ele.sendKeys("Nilesh Patharkar");
		  Thread.sleep(1000);
		  System.out.println("Selenium WebdriverScript in Chrome - Test1");
		  driver.close();
	}
	@Test
	public void actualTest2() throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Practice\\chromedriver.exe");
		driver = new ChromeDriver();

		  //Navigating through a particular website
		  driver.get("https://www.google.com");
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("The thread ID for @Test2 Chrome is "+ Thread.currentThread().getId());
		WebElement ele = driver.findElement(By.xpath("//input[@title='Search']"));
		  ele.sendKeys("Romit Patharkar");
		  Thread.sleep(1000);
		  System.out.println("Selenium WebdriverScript in Chrome - Test2");
		  driver.close();
	}
	@Test
	public void actualTest3() throws InterruptedException
	{	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Practice\\chromedriver.exe");
		driver = new ChromeDriver();

		  //Navigating through a particular website
		  driver.get("https://www.google.com");
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("The thread ID for @Test3 Chrome is "+ Thread.currentThread().getId());
		WebElement ele = driver.findElement(By.xpath("//input[@title='Search']"));
		  ele.sendKeys("Manjari Patharkar");
		  Thread.sleep(1000);
		  System.out.println("Selenium WebdriverScript in Chrome  - Test3");
		  driver.close();
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Ending Setup Method");

	}
	

}
