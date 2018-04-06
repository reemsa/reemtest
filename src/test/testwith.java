package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testwith {
	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
		//driver=new FirefoxDriver();
		//driver.get("http:\\www.facebook.com");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		 //String expath = "D:\\Eclipse\\chromedriver_win32\\chromedriver.exe";

		        
		    	driver=new FirefoxDriver();
				
		        driver.get("http:\\www.facebook.com");


		        WebElement element1 = driver.findElement(By.id("email"));
		        element1.sendKeys("reemyousef59@yahoo.com");
		        
		        
		        WebElement element2 = driver.findElement(By.id("pass"));
		        element2.sendKeys("Reem@681997");
		        
			    driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
			    System.out.println("Login");
	}

}
