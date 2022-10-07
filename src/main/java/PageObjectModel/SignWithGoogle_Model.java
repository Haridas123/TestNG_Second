package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignWithGoogle_Model {
	public WebDriver driver;
	
	By userEmail=By.xpath("//input[@id='identifierId']");
	By nextBtn=By.xpath("(//span[@jsname='V67aGc'])[2]");
	By forgotEmail=By.xpath("//button[@jsname='Cuz2Ue']");
	By createAccount= By.xpath("(//span[@class='VfPpkd-vQzf8d'])[3]");
	By  message= By.xpath("//*[@id=\"headingText\"]/span");
	By text=By.xpath("(//div[@class='PrDSKc'])[1]");
	By text2=By.xpath("(//div[@class='PrDSKc'])[2]");
	By tryAgainBtn=By.xpath("//span[@jsname='V67aGc']");
	By continueWith= By.xpath("//button[@name='google-register']");
	
	
	public SignWithGoogle_Model(WebDriver driver) {
		this.driver=driver;	 
	}

	
	public WebElement userEmail()
	{
		return driver.findElement(userEmail);
	}
	public WebElement nextBtn()
	{
		return driver.findElement(nextBtn);
	}
	
	public WebElement forgotEmail()
	{
		return driver.findElement(forgotEmail);
	}
	
	public WebElement createAccount()
	{
		return driver.findElement(createAccount);
	}
	
	public WebElement message()
	{
		return driver.findElement(message);
	}
	
	public WebElement text()
	{
		return driver.findElement(text);
	}
	
	public WebElement text2()
	{
		return driver.findElement(text2);
	}
	
	public WebElement tryAgainBtn()
	{
		return driver.findElement(tryAgainBtn);
	}
	public WebElement continueWith() {
		return driver.findElement(continueWith);
 	}
}
