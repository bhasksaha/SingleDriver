package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.BasePage;
import com.qa.pages.HomePage;
import com.qa.pages.loginPage;

public class loginTest extends BasePage {

	public loginPage loginpage;
	public HomePage homepage;

	@BeforeMethod
	public void setUp() {
		initialize();
		loginpage = new loginPage(driver);
	}

	@Test
	public void verifyLogin() {

		Assert.assertEquals(loginpage.donthavacctvisible(), true);

	}
	
	@Test
	public void verifyLogin1() {

		Assert.assertEquals(loginpage.donthavacctvisible(), true);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();

	}

}
