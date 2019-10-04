package com.org.MyMaven;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HellowWorldTest {
	private WebDriver driver;
	private String baseUrl;
	
	@BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		  //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		  //WebDriver driver= new ChromeDriver();
		  //System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\lib\\geckodriver.exe");
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		  driver= new ChromeDriver();
		 // baseUrl = "http://packagingsuppliesbymail.com/staging";
		 baseUrl = "http://b2b.wraptite.com/";
		  //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  }
	  
	@Test (enabled=true)
	public void Test() throws InterruptedException
	{ 
		/*System.out.println("Hello World");
		System.out.println(System.getProperty("user.dir"));*/
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vrushali Vaidya\\eclipse-workspace\\MyMavenTest\\lib\\geckodriver.exe");
		
		driver.navigate().to(baseUrl);
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(1536, 824));
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("vvaidya@tiuconsulting.com");
	    driver.findElement(By.id("pass")).sendKeys("tiu@12345");
	    //driver.findElement(By.cssSelector(".primary:nth-child(1) > #send2 > span")).click();
	  //  driver.findElement(By.linkText("Sign Out")).click();
	    driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")).click();
	   /* {
	      WebElement element = driver.findElement(By.linkText("Sign Out"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.linkText("Sign Out"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.linkText("Sign Out"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }*/
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