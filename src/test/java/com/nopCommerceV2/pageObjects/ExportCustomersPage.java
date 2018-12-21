package com.nopCommerceV2.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ExportCustomersPage 
{
	public WebDriver ldriver;
	public ExportCustomersPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//input[@value='6']")
	@CacheLookup
	public
	WebElement chkBox6;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/button[2]")
	@CacheLookup
	WebElement exportDrp;
	
	@FindBy(xpath = "//button[@name='exportxml-all']")
	@CacheLookup
	WebElement XMLall;
	
	@FindBy(xpath = "//button[@id='exportxml-selected']")
	@CacheLookup
	WebElement XMLselected;
	
	@FindBy(xpath = "//button[@name='exportexcel-all']")
	@CacheLookup
	WebElement XLSXall;
	
	@FindBy(xpath = "//button[@id='exportexcel-selected']")
	@CacheLookup
	WebElement XLSXselected;
	
	public void selectCustomer(WebElement boxNum)
	{
		boxNum.click();
	}
	
	public void clickDrp()
	{
		exportDrp.click();
	}
	
	public void clickXMLall()
	{
		XMLall.click();
	}	
	
	public void clickXMLselected()
	{
		XMLselected.click();
	}
	
	public void clickXLSXall()
	{
		XLSXall.click();
	}
	
	public void clickXLSXselected()
	{
		XLSXselected.click();
	}
	
	
}
