package com.qa.UGweb.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.UGweb.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest() throws InterruptedException{
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("login page title is: "+ title);
		Assert.assertEquals(title, "Home Page - ug-web");
		
	}
	
	@Test(priority=2)
	public void loginTest() throws InterruptedException{
		
		page.getInstance(LoginPage.class).doLogin("prajwal.yawale@cognologix.com", "Py@#$0812");
	}
	

}
