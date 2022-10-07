package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public WebDriver driver;
public Properties prop;


public WebDriver driverInit() throws IOException
{
	//	data.properties path--> C:\Users\Admin\eclipse-workspace\NaukriProject\src\main\java\resource\data.properties
	//FileInputStream fisObj= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resource\\data.properties\"");
	FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\NaukriProject\\src\\main\\java\\resource\\data.properties");
	prop= new Properties();
	prop.load(fis);
	
	String browserName=prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
	}
	else {
		{
			System.out.println("please enter valid browser");
		}
		
	}
	
	return driver;
	}
	
@BeforeMethod
public void browserLaunch() throws IOException {
	//this driver has scope
			driver = driverInit();
			driver.get(prop.getProperty("url"));
}

@AfterMethod
public void browserClose() throws IOException {
	//driver.quit();
	//driver.close();
	
}
	
	

}
