package com.nopCommerceV2.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nopCommerceV2.pageObjects.loginPage;

public class TC_LoginTest_001 extends BaseClass
{
	
	@Test
	public void loginTest() throws InterruptedException, IOException {
		driver.get(baseURL);
		loginPage lp = new loginPage(driver);
		logger.info("User provided"); //logger msg
		lp.setUserName(username);
		logger.info("Password provided");//logger msg
		lp.setPassword(password);
		logger.info("Login in Clicked");//logger msg
		lp.clickLogin();

		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			Thread.sleep(5000);
			lp.clickLogout();
			Assert.assertTrue(true);
			logger.info("Login Passed");//logger msg
		} else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Failed");//logger msg
		}

	}
	
	
}
