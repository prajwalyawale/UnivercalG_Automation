package com.qa.UGweb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	//page locators:
	//By CookiesAccept=By.className("v-btn__content");
	By loginButtonHome = By.cssSelector("#header-login-button-text");
	By emailId = By.name("username");
	By password = By.id("password");
	By loginButton = By.xpath("//input[@class=\"bt-login btn bt-submit   \"]");


	
	//page actions:
	public String getLoginPageTitle(){
		return driver.getTitle();
		
	}
	
	
	public void doLogin(String username, String pwd) throws InterruptedException
	{	
		//doClick(CookiesAccept);
		try {
			Thread.sleep(3000);
			doClick(loginButtonHome);
			
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		doSendKeys(emailId, username);
		Thread.sleep(3000);
		doSendKeys(password, pwd);
		Thread.sleep(3000);
		doClick(loginButton);
		
	}
	
	
	
	
	
	

}
