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
import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class FirebaseAutomationScript extends BaseTest {

	@Test
	public static void login_to_firebase() throws InterruptedException {
		
		myLog.info("******login_to_firebase automation script started***********");
		String expected="Student Registration Form";
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
		//String actual=homePage.getTextFromStudentRegistrationFormText();
		//Assert.assertEquals(actual, expected);
		
	}
	

}
