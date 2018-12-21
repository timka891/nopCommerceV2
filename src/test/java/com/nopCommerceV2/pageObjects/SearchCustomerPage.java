package com.nopCommerceV2.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage 
{
	public WebDriver ldriver;
	public SearchCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	@CacheLookup
	WebElement btnCustomers;
	
	@FindBy(xpath = "//span[@class='menu-item-title'][contains(text(),'Customers')]")
	@CacheLookup
	WebElement btnCustomers1;
	
	@FindBy(name="SearchEmail")
	@CacheLookup
	WebElement txtEmailSearch;
	
	@FindBy(name="SearchLastName")
	@CacheLookup
	WebElement txtLastSearch;
	
	@FindBy(name="SearchFirstName")
	@CacheLookup
	WebElement txtFirstSearch;
	
	@FindBy(id="search-customers")
	@CacheLookup
	WebElement btnSearch;
	
	public void searchEmail(String email)
	{
		txtEmailSearch.sendKeys(email);
	}
	
	public void searchFirst(String first)
	{
		txtFirstSearch.sendKeys(first);
	}
	
	public void searchLast(String last)
	{
		txtLastSearch.sendKeys(last);
	}
	
	public void clickCustomers()
	{
		btnCustomers.click();
	}
	public void clickCustomers1()
	{
		btnCustomers1.click();
	}
	
	public void clickSearch()
	{
		btnSearch.click();
	}
	
}
