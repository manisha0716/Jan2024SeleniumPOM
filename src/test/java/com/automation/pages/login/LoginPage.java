package com.automation.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.pages.base.BasePage;

public class LoginPage extends BasePage{
	@FindBy(id="username") WebElement userNameElement;
	@FindBy(id="password") WebElement passwordElement;
	@FindBy(id="Login") WebElement loginButtonElement;
	@FindBy(id="rememberUn") WebElement remChkElement;
	@FindBy(id="forgot_password_link") WebElement forgotPwdElement;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterUserName(String data) {
		enterText(userNameElement, data, "Username textbox");
	}
	
	public void enterPassword(String data) {
		enterText(passwordElement, data, "password field");
	}
	
	public WebDriver clickLoginButton() {
		clickElement(loginButtonElement,"login button");
		waitForVisibility(loginButtonElement, 30,"Username",driver);
		return driver;
	}
	
	
	public void clickCheckBox() {
		clickElement(remChkElement,"CheckBox");
	}
	
	public String getTitleOfThePAge() {
		return getPageTitle();
	}
	
	public WebDriver clickForgotPwdLink() {
		clickElement(forgotPwdElement,"forgot link");
		return driver;
	}

	
}