package com.qa.UGweb.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.qa.UGweb.pages.Page;

public class BaseTest {

	// public WebDriver driver;
	public WebDriverWait wait;
	public Page page;
	public static WebDriver driver;
	public static Properties prop;

  @BeforeMethod public void setUp() {
  System.setProperty("webdriver.chrome.driver","/home/pyawale/eclipse-workspace/PageObjectModelWithJavaGenerics-UG/Drivers/chromedriver");
  driver = new ChromeDriver();
  
  wait = new WebDriverWait(driver, 15);
  driver.manage().window().maximize();
  driver.get("https://ugweb.ugdevops.com/");
  try {
	  Thread.sleep(6000); 
	  } catch(InterruptedException e) 
  {
		  e.printStackTrace();
		  }
  
  // create the object of page class: Instantiate Page Class 
  page = new Page(driver, wait); 
  }
  
  @AfterMethod 
  public void tearDown()
   {
    driver.quit();
     }
}