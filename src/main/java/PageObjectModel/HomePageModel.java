package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageModel {
	
	public WebDriver driver;
	
	
	By RegistBtn = By.xpath("//a[@id='register_Layer']");
	By enterUserId=By.xpath("//a[@id='login_Layer']");
	
	public HomePageModel(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement loginInAccount() {
		return driver.findElement(enterUserId);
	}
	
	public WebElement userRegistration() {
		return driver.findElement(RegistBtn);
 	}

}
