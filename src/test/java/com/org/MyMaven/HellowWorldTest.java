package com.org.MyMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class HellowWorldTest {
	private WebDriver driver;
	private String baseUrl;
	public String Email;
	public String Password;
	
	@BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		  driver= new ChromeDriver();
		 // baseUrl = "http://packagingsuppliesbymail.com/staging";
		 baseUrl = "http://b2b.wraptite.com/";
		  //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  }
	  
	public void Test() throws InterruptedException
	{ 
		driver.navigate().to(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Login")).click();
		
		//Array for multiple login inputs
		String arr[][]=  {{"vvaidya","vvaidya@tiuconsulting.com", "vvaidya@tiuconsulting.com"}};
		String app[][]= {{"123456","Test@123", "tiu@12345"}};
		for (int i=0; i<arr.length; i++)
		{
			driver.findElement(By.id("email")).click();
			driver.findElement(By.xpath("//input[@title='Email']")).clear();
			driver.findElement(By.xpath("//input[@title='Email']")).sendKeys(arr[i]);	
			driver.findElement(By.id("pass")).click(); 
			driver.findElement(By.id("pass")).clear();
		    driver.findElement(By.id("pass")).sendKeys(app[i]);
		    driver.findElement(By.cssSelector(".primary:nth-child(1) > #send2 > span")).click();
		    Thread.sleep(2000);
		}
	
		

	
		
		//driver.findElement(By.xpath(".//*[html/body/div[1]/header/div[1]/div/div/div[2]/div/ul[2]/li[2]/a]")).click();
		// /html/body/div[1]/header/div[1]/div/div/div[2]/div/ul[2]/li[2]/a
	 
		/*driver.findElement(By.id("email")).click();

	    driver.findElement(By.id("pass")).sendKeys("tiu123");
	   if 
	    {
	        WebElement element = driver.findElement(By.cssSelector(".primary:nth-child(1) > #send2 > span"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).perform();
	      }
	    {
	        WebElement element = driver.findElement(By.tagName("body"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element, 0, 0).perform();
	      }
	   	    */
	   
		//Thread.sleep(2000);
		//driver.close();
		//driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='REVIEWS'])[1]/following::img[4]")).click();
		/*driver.findElement(By.xpath("//div[@class='clearfix']//ul[2]//li[1]")).click();	
		driver.findElement(By.xpath("//input[@title='Email']")).sendKeys("vvaidya@tiuconsulting.com");	
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("tiu@12345");
		driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")).click();	*/
	    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stretch Wrap'])[3]/following::img[1]")).click();
	    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cast Stretch Wrap'])[2]/following::img[1]")).click();
	}
}

