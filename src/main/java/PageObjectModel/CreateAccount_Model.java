package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount_Model {
	
	public WebDriver driver;
	
	By getText=By.xpath("(//*[contains(text(),'Create your Google Account')])[2]");
	By getText2=By.xpath("(//div[@class='ovnfwe Is7Fhb'])[3]");
	By userFirstname=By.xpath("//input[@id='firstName']");
	By userLastname=By.xpath("//input[@id='lastName']");
	By typeEmail=By.xpath("//input[@type='email']");
	By userName=By.xpath("//input[@id='username']");
	By useCurrentEmail=By.xpath("(//span[@jsname='V67aGc'])[1]");
	By password=By.xpath("(//input[@type='password'])[1]");
	By confirmPass=By.xpath("(//input[@type='password'])[2]");
	By passLengthMsg=By.xpath("//*[contains(text(),'Use 8 or more characters with a mix of letters, numbers & symbols')]");
	By checkBox=By.xpath("//input[@type='checkbox']");
	By signInsteadBtn= By.xpath("//*[contains(text(),'Sign in instead')]");
	By nxtBtn=By.xpath("(//span[@jsname='V67aGc'])[2]");
	By createBtn=By.xpath("(//span[@jsname='V67aGc'])[3]");
	By languageChoos=By.xpath("//div[@id='lang-chooser']");
	By commanPathOfItem=By.xpath("//div[@jsname='wQNmvb']");
	By links=By.xpath("//a[@target='_blank']");
	By mobile=By.xpath("//input[@id='phoneNumberId']");
	By nxtBtn2=By.xpath("(//span[@jsname='V67aGc'])[2]");
	By backBtn=By.xpath("(//span[@jsname='V67aGc'])[3]");
	
	
	
	public CreateAccount_Model(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement getTExt()
	{
		return driver.findElement(getText);
	}
	
	public WebElement getText2()
	{
		return driver.findElement(getText2);
	}
	public WebElement userFirstname()
	{
		return driver.findElement(userFirstname);
	}
	public WebElement userLastname()
	{
		return driver.findElement(userLastname);
	}
	public WebElement typeEmail()
	{
		return driver.findElement(typeEmail);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement createBtn()
	{
		return driver.findElement(createBtn);
	}
	public WebElement userName()
	{
		return driver.findElement(userName);
	}
	public WebElement useCurrentEmail()
	{
		return driver.findElement(useCurrentEmail);
	}
	public WebElement passLengthMsg()
	{
		return driver.findElement(passLengthMsg);
	}
	public WebElement confirmPass()
	{
		return driver.findElement(confirmPass);
	}
	public WebElement checkBox()
	{
		return driver.findElement(checkBox);
	}
	public WebElement signInsteadBtn()
	{
		return driver.findElement(signInsteadBtn);
	}
	public WebElement nxtBtn()
	{
		return driver.findElement(nxtBtn);
	}
	public WebElement languageChoos()
	{
		return driver.findElement(languageChoos);
	}
	public WebElement commanPathOfItem()
	{
		return driver.findElement(commanPathOfItem);
	}
	public WebElement links()
	{
		return driver.findElement(links);
	}
	public WebElement mobile()
	{
		return driver.findElement(mobile);
	}
	public WebElement nxtBtn2()
	{
		return driver.findElement(nxtBtn2);
	}
	public WebElement backBtn()
	{
		return driver.findElement(backBtn);
	}
	
	
}
