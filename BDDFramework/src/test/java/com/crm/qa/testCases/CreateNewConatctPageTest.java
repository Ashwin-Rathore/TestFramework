package com.crm.qa.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.CreateNewContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class CreateNewConatctPageTest extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	ContactsPage contactPage;
	CreateNewContactPage createNewContactPage;

	public CreateNewConatctPageTest() throws IOException {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {
		initialization();
		loginPage = new LoginPage();
	}

	@Test (priority = 0 )
	public void loginPageTitle() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "CRM", "Title is not same");
	}

	@Test(priority = 1)
	public void loginTest() throws IOException {
		homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		System.out.println("Login Successfull");
	}

	@Test(priority = 2)
	public void createNewContactTest() throws IOException, InterruptedException {
		contactPage=homePage.clickOnContactTab();
		createNewContactPage = contactPage.createNewContact();
		createNewContactPage.createNewContact();

		
		
	}

}
