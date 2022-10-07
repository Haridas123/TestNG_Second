package RegistrationForm;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjectModel.HomePageModel;
import PageObjectModel.RegistrationForm_POM;
 
import resource.BaseClass;
import resource.Constants;
 

public class RegistrationFormTestCases extends BaseClass {
	
	public WebDriver driver;
	
	RegistrationForm_POM obj;
	
	 

	@Test
	public void registrationForm( ) throws InterruptedException {
	 
		driver.manage().window().maximize();
 
		HomePageModel home= new HomePageModel(driver);
		home.userRegistration().click();
		
		obj= new  RegistrationForm_POM(driver );
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		obj.userName().sendKeys(Constants.userName);
		obj.userEmail().sendKeys(Constants.userEmail);
		//obj.userPassword().sendKeys(Contstants.userPassword);
		//obj.userMobile().sendKeys(Contstants.userMobile);
	//	obj.userFresher().click();
		
		 
		//obj.userCity().click();
		//obj.userCity().sendKeys((Contstants.userCity));
		
		//WebElement a= driver.findElement(By.xpath("//input[@id='currentCity']"));
		//a.sendKeys(Contstants.userCity);
		//a.sendKeys(Keys.ARROW_DOWN);
		//a.sendKeys(Keys.ENTER);
		//	obj.userCity().sendKeys(Contstants.userCity);
		
	 
		//obj.currentState().sendKeys(Contstants.userState);
		
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']")));
		
		WebElement w= driver.findElement(By.xpath("//div/p[contains(text(),'DOC, DOCx, PDF, RTF | Max: 2 MB')] "));// //div[@class='narrowFormats']
		
		//w.sendKeys("C:\\Users\\Admin\\Desktop\\Experience_my_resume\\Experience_Haridas_Resume.pdf");
		Thread.sleep(5000);
		obj.upLoadResume().click();
		//obj.checkWhatsUp().click();
		
		Thread.sleep(5000);
		//continueWithGoogle();
		//checkAllLinks();
	}

	private void checkAllLinks() {
		
		String url="";
		int responseCode=200;
		HttpURLConnection httpConnection=null;
		 
		List<WebElement> links=obj.allLinks();
		
		System.out.println(links.size()+"<---size AND value --->"+links.get(1).getText());
		System.out.println(links.size()+"<---size AND value --->"+links.get(1).getAttribute("href"));
	
		Iterator<WebElement> list= links.iterator();
		
		while(list.hasNext())
		{
			url= list.next().getAttribute("href");
			
			list.next().click();
			System.out.println(list.next().getAttribute("href"));
			System.out.println("All URl --> "+url);
			
			if(url==null || url.isEmpty())
			{
				System.out.println("URl is not configured");
				continue;
			}
			
			
			try {
				httpConnection =  (HttpURLConnection)(new URL(url).openConnection());
				
			//	httpConnection.setRequestMethod("head");
				httpConnection.connect();
				
				responseCode=httpConnection.getResponseCode();
				
				if(responseCode>=400)
				{
					System.out.println("Link is Broken ");
					
				}
				else {
					System.out.println("Link is not Broken");
				}
				
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

	private void continueWithGoogle() {
		
		obj.continueWith().click();
		 
		
	}

}
