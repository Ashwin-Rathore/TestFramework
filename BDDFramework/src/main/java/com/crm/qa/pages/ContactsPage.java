package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath = "//button[@class='ui linkedin button'][contains(text(),'New')]")
	WebElement createNewContactButton;

	public ContactsPage() throws IOException {
		PageFactory.initElements(driver, this);

	}

	public CreateNewContactPage createNewContact() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
		createNewContactButton.click();
		System.out.println("Contact button clicked successfully");
		Thread.sleep(3000);
		return new CreateNewContactPage();
	}

}
