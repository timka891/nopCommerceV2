package com.nopCommerceV2.testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import com.nopCommerceV2.pageObjects.ExportCustomersPage;
import com.nopCommerceV2.pageObjects.SearchCustomerPage;
import com.nopCommerceV2.pageObjects.loginPage;

import junit.framework.Assert;

public class TC_ExportTest_005 extends BaseClass
{
	@Test(priority = 1)
	public void exportTest1() throws IOException, InterruptedException
	{
		//getting page and login
		driver.get(baseURL);
		SearchCustomerPage scp = new SearchCustomerPage(driver);
		loginPage lp = new loginPage(driver);
		ExportCustomersPage ecp = new ExportCustomersPage(driver);
		lp.setUserName(username);
		logger.info("user provided");
		lp.setPassword(password);
		logger.info("password passed");
		lp.clickLogin();
		logger.info("login clicked");
		
		//login complete
		
		//getting into customers page
		
		scp.clickCustomers();
		scp.clickCustomers1();
		
		//selecting a customer (checkbox 6)
		//aka victoria
		
		ecp.selectCustomer(ecp.chkBox6);
		logger.info("check box selected");
		
		Thread.sleep(2000);
		ecp.clickDrp();
		logger.info("export dropdown ting clicked");
		Thread.sleep(2000);
		//export selected for XML
		ecp.clickXMLselected();
		//export selected for excel
		ecp.clickXLSXselected();
		
		//check if both files exist in the download folder
		if(isFileExist("C://Users//admin//Downloads/customers.xml") == true && isFileExist("C://Users//admin//Downloads/customers.xlsx") == true )
		{
			Assert.assertTrue(true);
			logger.info("passed");
		}else
		{
			Assert.assertTrue(false);
			logger.info("failed");
			captureScreen(driver, "exportTest1");
		}
		Thread.sleep(2000);
		lp.clickLogout();
		
	}
	
	@Test(priority = 2)
	public void exportTest2() throws IOException, InterruptedException
	{
		//to give time for you to delete the files from download folder to create next test
		Thread.sleep(4000);
		//getting page and login
		driver.get(baseURL);
		SearchCustomerPage scp = new SearchCustomerPage(driver);
		loginPage lp = new loginPage(driver);
		ExportCustomersPage ecp = new ExportCustomersPage(driver);
		lp.setUserName(username);
		logger.info("user provided");
		lp.setPassword(password);
		logger.info("password passed");
		lp.clickLogin();
		logger.info("login clicked");
		
		//login complete
		
		//getting into customers page
		Thread.sleep(20000);
		scp.clickCustomers();
		scp.clickCustomers1();
		
		//selecting a customer (checkbox 6)
		//aka victoria
		
		ecp.selectCustomer(ecp.chkBox6);
		
		//export ALL for XML
		ecp.clickXMLall();
		//export ALL for excel
		ecp.clickXLSXall();
		
		//check if both files exist in the download folder
		if(isFileExist("C://Users//admin//Downloads/customers.xml") == true && isFileExist("C://Users//admin//Downloads/customers.xlsx") == true )
		{
			Assert.assertTrue(true);
			logger.info("passed");
		}else
		{
			Assert.assertTrue(false);
			logger.info("failed");
			captureScreen(driver, "exportTest2");
		}
		Thread.sleep(2000);
		lp.clickLogout();

	}
	
	
}
