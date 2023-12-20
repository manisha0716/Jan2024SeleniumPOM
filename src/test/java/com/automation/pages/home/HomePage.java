package com.automation.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.pages.base.BasePage;

public class HomePage extends BasePage {
	@FindBy(xpath ="/html/head/title") WebElement salesforceHomepage;
	@FindBy(id="userNav") WebElement userMenu;
	@FindBy(xpath ="//a[contains(text(),'Logout')]") WebElement logoutButtonElement;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public String getTextFromSalesforceHomePage(WebDriver driver) {
		waitForVisibility(salesforceHomepage, 30,"Salesforce Home Page",driver);
		String data= getTextFromElement(salesforceHomepage, "Salesforce Home Page");
		System.out.println("Salesforce Home Page= "+data);
		return data;
	}
	
	public WebDriver clickLogoutButton() {
		clickElement(logoutButtonElement,"logout button");
		return driver;
	}
	
	public void clickUserMenu() {
		clickElement(userMenu,"logout button");
		waitForVisibility(userMenu, 30,"user menu",driver);
	}
}