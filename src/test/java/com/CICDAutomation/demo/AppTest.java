package com.CICDAutomation.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	public static WebDriver driver;
    
	@BeforeMethod
	public void launchDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Project\\Software\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	@Test
    public void test1()
    {
       driver.navigate().to("https://www.google.com");
       System.out.print("test1"+driver.getTitle());
    }
    @Test
    public void test2()
    {
    	  driver.navigate().to("https://www.google.com");
          System.out.print("test2"+driver.getTitle());
    }
    @Test
    public void test3()
    {
    	  driver.navigate().to("https://www.google.com");
          System.out.print("test3"+driver.getTitle());
    }
    @AfterMethod
    public void connectionClose() {
    	driver.quit();
    }
   
}
