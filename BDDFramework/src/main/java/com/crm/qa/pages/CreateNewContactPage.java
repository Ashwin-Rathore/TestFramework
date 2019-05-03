package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CreateNewContactPage extends TestBase  {

	
	@FindBy(name="first_name")
	WebElement newContactfirstName;
	
	
	
	@FindBy(name="middle_name")
	WebElement newContactMiddleName;
	
	@FindBy(name="last_name")
	WebElement newContactLastName;
	
	@FindBy(name="company")
	WebElement newContactCompanyName;
	
	@FindBy(xpath = "(//input[@name='value'])[1]AB")
	WebElement newContactemail;
	
	@FindBy (xpath="//button[@class='ui linkedin button']")
	WebElement newContactSaveButton;
	
	
	
	public CreateNewContactPage() throws IOException {
	PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}

 public void createNewContact(){
	 
	 newContactfirstName.sendKeys("Salman");
	 System.out.println("First Name entered successfully");
	 newContactMiddleName.sendKeys("Sing");
	 System.out.println("Middle Name entered successfully");
	 newContactLastName.sendKeys("David"); 
	 System.out.println("Last Name entered successfully");
	 newContactemail.sendKeys("sallau@gmail.com");
	 System.out.println("Email address entered successfully");
	 newContactSaveButton.click();
	 System.out.println("Save button clicked successfully");
 }
	
	
}
