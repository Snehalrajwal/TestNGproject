 package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;

	public WebDriver initializedriver() throws IOException  {
		
		//to read the properties file---
	FileInputStream fis = new FileInputStream("C:\\Users\\VIRESH\\eclipse-workspace\\E2ETestNGProject\\src\\main\\java\\Resources\\data.properties");	
		
	//to get the access of element data.properties---
		Properties prop = new Properties();
		prop.load(fis);
	String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))   {
		
		     System.setProperty("webdriver.chrome.driver", 
				   "C:\\Users\\VIRESH\\Desktop\\Selenium Jars\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	          driver = new ChromeDriver();
	}
	else if(browserName.equals("firefox")) {
		//firefox code
	}
	else if(browserName.equals("IE")) {
		//IE code
	}
	else  {
		System.out.println("you should choose any one of above browser");
}
		return driver;
	}
	@BeforeMethod
	public void launchBrowser() throws IOException   {
		driver = initializedriver() ;
		  driver.get("https://login.salesforce.com/?locale=in");
		  
}
	@AfterMethod
	public void quitBrowser() throws IOException   {
		driver.quit() ;
}
}

