package com.automation.pages.login;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.pages.base.BasePage;

public class ForgotPasswordPage extends BasePage{
	@FindBy(id="un") WebElement userNameElement;
	@FindBy(id="continue") WebElement continueButtonElement;
	
	
	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterUserName(String data) {
		enterText(userNameElement, data, "Username textbox");
		waitForVisibility(userNameElement, 30,"Username",driver);
	}

	
	public WebDriver clickContinueButton() {
		clickElement(continueButtonElement,"continue button");
		return driver;
	}

	
}