package com.crm.qa.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() throws IOException {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 0)
	public void loginPageTitle() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "CRM", "Title is not same");
	}

	@Test(priority = 1)
	public void loginTest() throws IOException {
		homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		System.out.println("Login Successfull");

	}
	/*
	 * @AfterMethod public void tearDown(){ driver.quit(); }
	 */
}
