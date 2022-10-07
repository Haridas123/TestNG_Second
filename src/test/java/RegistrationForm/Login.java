package RegistrationForm;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjectModel.Login_Model;
import resource.BaseClass;
import resource.Constants;

public class Login extends BaseClass{
	public Login_Model login;
	
	@Test 
	public void login() {
		driver.manage().window().maximize();
		login= new Login_Model(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		login.loginBtn().click();
		//driver.navigate().refresh();
		//loginForm();
		otpLoginForm();
	}

	private void otpLoginForm() {
		 
		login.otpLogin().click();
		login.mobileId().sendKeys(Constants.userMobile);
		login.getOtpBtn().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		login.enterOtp().sendKeys("184652");
		
		login.loginBtn2().click();
		String expectedURL="https://www.naukri.com/mnjuser/homepage";
		String actualURL=driver.getCurrentUrl();
		  
		 
		/* Hard Assert */
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        System.out.println("AssertEquals Test Passed\n");
		
		
	}

	private void loginForm() {
	
		 
		System.out.println(login.txtEmailId().getText());
		System.out.println(login.txtPassword().getText());
		
		login.enterEmailId().sendKeys(Constants.userEmail);
		login.enterPass().sendKeys(Constants.userPassword);
		login.submitBtn().click();
		
		
	}
	
	

}
