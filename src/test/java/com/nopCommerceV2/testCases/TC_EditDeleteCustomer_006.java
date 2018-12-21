package com.nopCommerceV2.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopCommerceV2.pageObjects.EditDeleteCustomerPage;
import com.nopCommerceV2.pageObjects.SearchCustomerPage;
import com.nopCommerceV2.pageObjects.loginPage;

public class TC_EditDeleteCustomer_006 extends BaseClass
{
	@Test(priority = 1)
	public void editTest() throws IOException, InterruptedException
	{
		//getting page & login
		driver.get(baseURL);
		loginPage lp = new loginPage(driver);
		SearchCustomerPage scp = new SearchCustomerPage(driver);
		EditDeleteCustomerPage edcp = new EditDeleteCustomerPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		logger.info("login passed");
		
		//getting cutsomers page
		scp.clickCustomers();
		scp.clickCustomers1();
		logger.info("customers page ");
		
		//choosing a customer to edit and editing them
		edcp.editCustomer(edcp.btnEdit2);
		logger.info("edit customer clicked");
		
		//editing company
		edcp.editCompany("busy QA");
		logger.info("edited company info");
		
		//saving
		edcp.saveCutomer();
		logger.info("customer saved");
		
		String s = edcp.alertMsgSaved.getText();
		
		//checking if true
		if(s.contains("The customer has been updated successfully."))
		{
			Assert.assertTrue(true);
			logger.info("passed");
		}
		else
		{
			captureScreen(driver, "editTest");
			Assert.assertTrue(false);
			logger.info("failed");
		}
		Thread.sleep(2000);
		lp.clickLogout();
	}
	
	@Test(priority = 2)
	public void deleteTest() throws IOException, InterruptedException
	{
		//getting page & login
		driver.get(baseURL);
		loginPage lp = new loginPage(driver);
		SearchCustomerPage scp = new SearchCustomerPage(driver);
		EditDeleteCustomerPage edcp = new EditDeleteCustomerPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		logger.info("login passed");
		
		//getting cutsomers page
		scp.clickCustomers();
		scp.clickCustomers1();
		logger.info("customers page ");
		
		//choosing a customer to edit and editing them
		edcp.editCustomer(edcp.btnEdit2);
		logger.info("edit customer clicked");
		
		edcp.deleteCutomer();
		logger.info("deleting");
		edcp.deleteCutomer1();
		logger.info("confirm delete");
		
		String s = edcp.alertMsgDeleted.getText();
		
		//checking if true
		if(s.contains("The customer has been deleted successfully."))
		{
			Assert.assertTrue(true);
			logger.info("passed");
		}
		else
		{
			captureScreen(driver, "deleteTest");
			Assert.assertTrue(false);
			logger.info("failed");
		}
		Thread.sleep(2000);
		lp.clickLogout();
	}
	
	
	
}
