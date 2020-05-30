package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class loginPage extends BasePage{
	
	HomePage homepage;
	
	
	@FindBy(id ="username")
	WebElement username;
	
	@FindBy(id ="password")
	WebElement password;
	
	@FindBy(id ="loginBtn")
	WebElement login;
	
	@FindBy(xpath = "//*[text()='Write and Earn']")
	WebElement SalesDashboard;
	
	@FindBy(xpath = "//*[text()=\"Don't have an account?\"]")
	WebElement Donthavaccct;
	
	
	public loginPage(WebDriver driver){
		BasePage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public HomePage loginDetails(String usn, String psw) {
		username.sendKeys(usn);
		password.sendKeys(psw);
		login.click();
		return new HomePage(driver); 
	}
	
	public boolean donthavacctvisible() {
		
		return Donthavaccct.isDisplayed(); 
	}
	
	
	
	
	

}
