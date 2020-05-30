package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import utils.DriverSingleton;

public class BasePage {

	public static WebDriver driver;
	public static DriverSingleton instance = DriverSingleton.getInstanceOfSingletonBrowserClass();
	
	public static void initialize() {

		
		driver = instance.getDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get("https://app.hubspot.com/login");
	}
}
