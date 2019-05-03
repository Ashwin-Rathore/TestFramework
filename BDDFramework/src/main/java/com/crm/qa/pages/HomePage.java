package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[@class='user-display']")
	WebElement accountHolderName;

	@FindBy(xpath = "//span[@class='trial-indicator']/a")
	WebElement trialIndicator;

	@FindBy(xpath = "//span[@class='item-text'][contains(text(),'Home')]")
	WebElement homeTab;

	@FindBy(xpath = "//span[@class='item-text'][contains(text(),'Calendar')]")
	WebElement calenderTab;
	
	@FindBy(xpath = "//span[@class='item-text'][contains(text(),'Contacts')]")
	WebElement contactTab;

	@FindBy(xpath ="//span[@class='item-text'][contains(text(),'Companies')]")
	WebElement companiesTab;
	
	@FindBy(xpath = "//span[@class='item-text'][contains(text(),'Deals')]")
	WebElement dealsTab;
	
	@FindBy(xpath = "//span[@class='item-text'][contains(text(),'Tasks')]")
	WebElement  taskTab;
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);

	}

	public String verifyHomePageTile(){
	return driver.getTitle();
	}
	
	public ContactsPage clickOnContactTab() throws IOException, InterruptedException{
		Thread.sleep(5000);
		contactTab.click();
		System.out.println("Clicked on contact tab Successfully");
		Thread.sleep(5000);
		return new ContactsPage();
	}
	
	public CompaniesPage clickOnCompaniesTab() throws IOException{
		companiesTab.click();
		System.out.println("Clicked on Companies tab Successfully");
		return new CompaniesPage();
	}
	
	public DealsPage clickOnDealsTab() throws IOException{
		dealsTab.click();
		System.out.println("Clicked on Deals tab Successfully");
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksTab() throws IOException{
		taskTab.click();
		System.out.println("Clicked on tasks tab Successfully");
		return new TasksPage();
	}
	
	
}




