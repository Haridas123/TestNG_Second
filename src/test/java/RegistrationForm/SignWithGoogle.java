package RegistrationForm;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjectModel.CreateAccount_Model;
import PageObjectModel.HomePageModel;
import PageObjectModel.SignWithGoogle_Model;
import resource.BaseClass;
import resource.Constants;

public class SignWithGoogle extends BaseClass {
	
	public SignWithGoogle_Model google;
	public HomePageModel home;
	public CreateAccount_Model account;
	 
	
	@Test
	public void signGoogle() {
		
		
		home=new HomePageModel(driver);
		 
		google= new SignWithGoogle_Model(driver);
		account= new CreateAccount_Model(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		home.userRegistration().click();
		System.out.println("parent window url will peint---->"+driver.getCurrentUrl());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		google.continueWith().click();
		
		loginWithgoogle();
		
	}

	public void loginWithgoogle()   {
		
		Set<String> windosID =driver.getWindowHandles(); // obj contains parentID and childID
				
		System.out.println("parent window size---->"+windosID.size());
		System.out.println("parent window url will peint---->"+driver.getCurrentUrl());
		Iterator<String> winIds= windosID.iterator();
		System.out.println("child window url will peint---->"+driver.getCurrentUrl());
		String parentID = winIds.next(); 
		String childID = winIds.next();
		 driver.switchTo().window(childID);
		 
		 createAccount();
	//	google.userEmail().sendKeys(Contstants.userEmail);
		//google.nextBtn().click();
	}

	public void createAccount()    {
		 
		account.createBtn().click();
		account.userFirstname().sendKeys(Constants.userName);
		account.userLastname().sendKeys(Constants.lastName);
		account.typeEmail().sendKeys(Constants.newEmailId);
		account.password().sendKeys(Constants.newPassword);
		account.confirmPass().sendKeys(Constants.conirfPass);
		account.nxtBtn().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		account.mobile().sendKeys(Constants.userMobile);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		account.nxtBtn2().click();
		
		
		
	}
	

}
