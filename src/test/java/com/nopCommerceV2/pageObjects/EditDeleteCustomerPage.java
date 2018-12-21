package com.nopCommerceV2.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditDeleteCustomerPage 
{
	public WebDriver ldriver;
	public EditDeleteCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[9]/a[1]")
	@CacheLookup
	public
	WebElement btnEdit2;
	
	@FindBy(xpath = "//span[@id='customer-delete']")
	@CacheLookup
	WebElement btnDelete;
	
	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	@CacheLookup
	WebElement btnDelete1;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissable']")
	@CacheLookup
	public
	WebElement alertMsgDeleted;
	
	@FindBy(xpath = "//input[@id='Company']")
	@CacheLookup
	WebElement txtCompany;
	
	@FindBy(xpath = "//button[@name='save']")
	@CacheLookup
	WebElement btnSave;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissable']")
	@CacheLookup
	public
	WebElement alertMsgSaved;
	
	public void editCustomer(WebElement btnNum)
	{
		btnNum.click();
	}
		
	public void editCompany(String comp)
	{
		txtCompany.sendKeys(comp);
	}
	
	public void saveCutomer()
	{
		btnSave.click();
	}
	
	public void deleteCutomer()
	{
		btnDelete.click();
	}
	
	public void deleteCutomer1()
	{
		btnDelete1.click();
	}
	
	
	
}
