package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSingleton {
	
	// instance of singleton class
	protected static DriverSingleton instanceOfDriverSingleton=null;
	public static WebDriver driver;


	// Constructor
    private DriverSingleton(){
    	//System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
//    	WebDriverManager.chromedriver().setup();
//    	driver= new ChromeDriver();
    }

    // TO create instance of class
    public static DriverSingleton getInstanceOfSingletonBrowserClass(){
        if(instanceOfDriverSingleton==null){
        	instanceOfDriverSingleton = new DriverSingleton();
        	
        	
        }
        return instanceOfDriverSingleton;
    }
    
   
    
    // To get driver
    public WebDriver getDriver()
    {
    	WebDriverManager.chromedriver().setup();
    	driver= new ChromeDriver();
    	return driver;
    }
    


}
