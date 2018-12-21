package com.nopCommerceV2.testCases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.nopCommerceV2.pageObjects.SearchCustomerPage;
import com.nopCommerceV2.pageObjects.loginPage;

import junit.framework.Assert;

public class TC_Search_004 extends BaseClass
{
	
	@Test(priority = 1)
	public void searchTest1() throws IOException, InterruptedException
	{
		//getting page and login
		driver.get(baseURL);
		SearchCustomerPage scp = new SearchCustomerPage(driver);
		loginPage lp = new loginPage(driver);
		logger.info("User provided");
		lp.setUserName(username);
		logger.info("password provided");
		lp.setPassword(password);
		logger.info("login clicked");
		lp.clickLogin();
		
		//login complete
		
		//getting into customers page
		
		scp.clickCustomers();
		scp.clickCustomers1();
		scp.searchEmail("victoria");
		scp.clickSearch();
		//searching for victoria
		
		String name = driver.findElement(By.xpath("//td[contains(text(),'Victoria Terces')]")).getText();
		//capturing if victoria is in the searched results in variable name
		
		if(name.contains("Victoria Terces"))
		{
			Assert.assertTrue(true);
			logger.info("passed");
			//checking that it contains her name that we actually found victoria
		} 
		else
		{
			captureScreen(driver,"searchTest1");
			Assert.assertTrue(false);
			logger.info("failed");
		}
		Thread.sleep(3000);
		lp.clickLogout();
		//logout to refresh page to allow new search
	}
	
	@Test(priority = 2)
	public void searchTest2() throws IOException, InterruptedException
	{
		//getting page and login
		SearchCustomerPage scp = new SearchCustomerPage(driver);
		loginPage lp = new loginPage(driver);
		logger.info("User provided");
		lp.setUserName(username);
		logger.info("password provided");
		lp.setPassword(password);
		logger.info("login clicked");
		lp.clickLogin();
		
		//login complete
		
		//getting into customers page
		
		scp.clickCustomers();
		scp.clickCustomers1();
		scp.searchFirst("victoria");
		scp.clickSearch();
		//searching for victoria
		
		String name = driver.findElement(By.xpath("//td[contains(text(),'Victoria Terces')]")).getText();
		//capturing if victoria is in the searched results in variable name
		
		if(name.contains("Victoria Terces"))
		{
			Assert.assertTrue(true);
			logger.info("passed");
			//checking that it contains her name that we actually found victoria
		} 
		else
		{
			captureScreen(driver,"searchTest2");
			Assert.assertTrue(false);
			logger.info("failed");
		}
		Thread.sleep(3000);
		lp.clickLogout();
		//logout to refresh page to allow new search
	}
	
	@Test(priority = 3)
	public void searchTest3() throws IOException, InterruptedException
	{
		//getting page and login
		
		SearchCustomerPage scp = new SearchCustomerPage(driver);
		loginPage lp = new loginPage(driver);
		logger.info("User provided");
		lp.setUserName(username);
		logger.info("password provided");
		lp.setPassword(password);
		logger.info("login clicked");
		lp.clickLogin();
		
		//login complete
		
		//getting into customers page
		
		scp.clickCustomers();
		scp.clickCustomers1();
		scp.searchLast("Terces");
		scp.clickSearch();
		//searching for victoria
		
		String name = driver.findElement(By.xpath("//td[contains(text(),'Victoria Terces')]")).getText();
		//capturing if victoria is in the searched results in variable name
		
		if(name.contains("Victoria Terces"))
		{
			Assert.assertTrue(true);
			logger.info("passed");
			//checking that it contains her name that we actually found victoria
		} 
		else
		{
			captureScreen(driver,"searchTest3");
			Assert.assertTrue(false);
			logger.info("failed");
		}
		Thread.sleep(3000);
		lp.clickLogout();
		//logout to refresh page to allow new search
	}
	
	
	
	
	
	
	
	
	
}
