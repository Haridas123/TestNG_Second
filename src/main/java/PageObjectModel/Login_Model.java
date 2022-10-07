package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Model {
	
	public WebDriver driver;
	By loginBtn=By.xpath("//a[@id='login_Layer']");
	By txtEmailId=By.xpath("(//label[@class='label'])[1]");
	By txtPassword=By.xpath("(//label[@class='label'])[2]");
	By enterEmailId=By.xpath("//input[@placeholder='Enter your active Email ID / Username']");
	By enterPass=By.xpath("//input[@type='password']");
	By forgotPass=By.xpath("//div[@class='forgot-pass']");
	By submitBtn=By.xpath("//button[@type='submit']");
	By freeRegister=By.xpath("//a[contains(text(),'Register for free')]");
	By otpLogin=By.xpath("//div[@class='orSec']");
	By mobileId=By.xpath("//input[@class='mobileInputt  ']");
	By getOtpBtn= By.xpath("//button[contains(text(),'Get OTP')]");
	By resendOtp=By.xpath("//a[contains(text(),' RESEND OTP ')] ");
	By loginBtn2=By.xpath("//button[contains(text(),'Login')]");
	By enterOtp=By.xpath("//input[@class='mobileInput ']");





	public Login_Model(WebDriver driver) {
	 this.driver=driver;
}

	public WebElement loginBtn() {
		return driver.findElement(loginBtn);
	}
	
	public WebElement txtEmailId() {
		return driver.findElement(txtEmailId);
	}
	public WebElement txtPassword() {
		return driver.findElement(txtPassword);
	}
	public WebElement enterEmailId() {
		return driver.findElement(enterEmailId);
	}
	public WebElement enterPass() {
		return driver.findElement(enterPass);
	}
	public WebElement submitBtn() {
		return driver.findElement(submitBtn);
	}
	public WebElement otpLogin() {
		return driver.findElement(otpLogin);
	}
	public WebElement mobileId() {
		return driver.findElement(mobileId);
	}
	public WebElement getOtpBtn() {
		return driver.findElement(getOtpBtn);
	}
	public WebElement resendOtp() {
		return driver.findElement(resendOtp);
	}
	public WebElement loginBtn2() {
		return driver.findElement(loginBtn2);
	}
	public WebElement enterOtp() {
		return driver.findElement(enterOtp);
	}

}
