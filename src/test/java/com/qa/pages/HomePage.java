package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//*[text()='Sales Dashboard']")
	WebElement SalesDashboard;
	
	public HomePage(WebDriver driver){
		BasePage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean SalesDashboardvisible() {
		return SalesDashboard.isDisplayed();
	}
	

}
