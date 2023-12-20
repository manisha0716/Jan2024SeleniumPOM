package com.automation.tests.scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.pages.home.HomePage;
import com.automation.pages.login.LoginPage;
import com.automation.pages.login.ForgotPasswordPage;
import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class SaleforceAutomationScripts extends BaseTest {

	@Test
	public static void login_testcase1() throws InterruptedException {
			
			myLog.info("******login_to_salesforce automation script started***********");
			//String expected="Please enter your password.";
			PropertiesUtility pro=new PropertiesUtility();
			Properties p=pro.createPropertyObject();
			pro.loadFile("applicationDataProperties",p);
			String username=pro.getPropertyValue("login.valid.userid",p);
			String password=pro.getPropertyValue("login.valid.password",p);
			
			LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserName(username);
			loginPage.enterPassword(password);
			driver=loginPage.clickLoginButton();
			
		}
	
	@Test
	public static void login_testcase2() throws InterruptedException {
		
		myLog.info("******login_to_salesforce automation script started***********");
		//String expected="Home Page ~ Salesforce - Developer Edition";
		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		pro.loadFile("applicationDataProperties",p);
		String username=pro.getPropertyValue("login.valid.userid",p);
		String password=pro.getPropertyValue("login.valid.password",p);
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		driver=loginPage.clickLoginButton();
		
		HomePage homePage=new HomePage(driver);
//		String actual=homePage.getTextFromSalesforceHomePage();
//		System.out.println("Salesforce Home Page= "+actual);
//		Assert.assertEquals(actual, expected);
		
	}
	
	
	@Test
	public static void login_testcase3() throws InterruptedException {
		
		myLog.info("******login_to_salesforce automation script started***********");
		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		pro.loadFile("applicationDataProperties",p);
		String username=pro.getPropertyValue("login.valid.userid",p);
		String password=pro.getPropertyValue("login.valid.password",p);
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		loginPage.clickCheckBox();
		driver=loginPage.clickLoginButton();
		
		HomePage homePage=new HomePage(driver);
		homePage.clickUserMenu();
		driver=homePage.clickLogoutButton();
		
		loginPage=new LoginPage(driver);
	}
	
	@Test
	public static void login_testcase4a() throws InterruptedException {
			
			myLog.info("******login_to_salesforce automation script started***********");
			PropertiesUtility pro=new PropertiesUtility();
			Properties p=pro.createPropertyObject();
			pro.loadFile("applicationDataProperties",p);
			String username=pro.getPropertyValue("login.valid.userid",p);
			
			LoginPage loginPage=new LoginPage(driver);
			driver=loginPage.clickForgotPwdLink();
			
			ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
			forgotPasswordPage.enterUserName(username);
			forgotPasswordPage.clickContinueButton();
		}
	
	
	@Test
	public static void login_testcase4b() throws InterruptedException {
			
			myLog.info("******login_to_salesforce automation script started***********");
			PropertiesUtility pro=new PropertiesUtility();
			Properties p=pro.createPropertyObject();
			pro.loadFile("applicationDataProperties",p);
			String username=pro.getPropertyValue("login.invalid.userid",p);
			String password=pro.getPropertyValue("login.invalid.password",p);
			
			LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserName(username);
			loginPage.enterPassword(password);
			driver=loginPage.clickLoginButton();
			
		}

}
