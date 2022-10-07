package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationForm_POM 
{
	
	public WebDriver driver;
	 
	
//	By fullName= By.xpath("(//label[@class='labelClass'])[1]");
	By userName=By.xpath("//input[@id='name']");
	By userEmail= By.xpath("//input[@id='email']");
	By userPassword=By.xpath("//input[@id='password']");
	By userMobile=By.xpath("//input[@id='mobile']");
	By userFresher=By.xpath("(//h2[@class='main-3'])[2]");
	By userExperienced=By.xpath("(//h2[@class='main-3'])[1]");
	By userCity = By.xpath("//input[@id='currentCity']");
	
	By upLoadResume= By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']");
	By continueWith= By.xpath("(//button[@type='button'])[2]");
	By registerNow=By.xpath("//button[@type='submit']");
	By checkWhatsUp= By.xpath("//i[@class='ico-tick resman-icon resman-icon-check-box-checked']");
	By currentState= By.xpath("//input[@name='currentState']");
	By allLinks= By.xpath("//a");
	
	 
 
	public RegistrationForm_POM(WebDriver driver2) {
		 
		this.driver=driver2;
	}

	public WebElement userName() {
		
		//System.out.println(driver.findElement(userName);
		return driver.findElement(userName);
		 
	}
	
	public WebElement userEmail() {
		return driver.findElement(userEmail);
 	}
	public WebElement userPassword() {
		return driver.findElement(userPassword);
 	}
	public WebElement userMobile() {
		return driver.findElement(userMobile);
 	}
	public WebElement userFresher() {
		return driver.findElement(userFresher);
 	}
	public WebElement userExperienced() {
		return driver.findElement(userExperienced);
 	}
	public WebElement upLoadResume() {
		return driver.findElement(upLoadResume);
 	}
	public WebElement continueWith() {
		return driver.findElement(continueWith);
 	}
	public WebElement registerNow() {
		return driver.findElement(registerNow);
 	}
	public WebElement checkWhatsUp() {
		return driver.findElement(checkWhatsUp);
 	}
	public WebElement userCity() {
		return driver.findElement(userCity);
 	}
	
	public WebElement currentState() {
		return driver.findElement(currentState);
		 
	}
	public List<WebElement> allLinks() {
		return driver.findElements(allLinks);
		 
	}
}
