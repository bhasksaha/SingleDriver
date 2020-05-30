package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.BasePage;
import com.qa.pages.HomePage;
import com.qa.pages.loginPage;

public class homeTest extends BasePage{
	
	public loginPage loginpage;
	public HomePage homepage;

	@BeforeMethod
	public void setUp() {
		initialize();
		loginpage=new loginPage(driver);
		homepage=loginpage.loginDetails("bhasksaha1@gmail.com", "Selenium@1");
	}
	
	@Test
	public void verifydashbord() {
		
		Assert.assertEquals(homepage.SalesDashboardvisible(), true);
		
		
	}
	
	@Test
	public void verifydashbord1() {
		
		Assert.assertEquals(homepage.SalesDashboardvisible(), true);
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}
}
