package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {


	@FindBy(name = "email")
	@CacheLookup  // this element will store in cache
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
}

	public String validateLoginPageTitle(){
		return driver.getTitle();
		
	}
	
	public HomePage  login(String UserName, String Psk) throws IOException {
		username.sendKeys(UserName);
		password.sendKeys(Psk);
		loginBtn.click();
		return new HomePage();
		
	}
	
	
	
}
