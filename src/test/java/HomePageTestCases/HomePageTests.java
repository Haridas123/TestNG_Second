package HomePageTestCases;

 
 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.Login_Model;
import resource.BaseClass;

public class HomePageTests extends BaseClass {
	@Test 
	public void login() {
		driver.manage().window().maximize();
		Login_Model login= new Login_Model(driver);
		Actions actions2 = new Actions(driver);
		
		//By forEmployer=By.xpath("//a[@class='nI-gNb-menuItems__anchorDropdown']");
		WebElement target = driver.findElement(By.xpath("//li[@class='nI-gNb-foremp nI-gNb-menuItems']"));
		
		List<WebElement> item=driver.findElements(By.xpath("//a[@class='nI-gNb-menuItems__anchorDropdown']"));
		
		String name="";
		for(int i=0;i<item.size();i++)
		{
			name=item.get(i).getText();
			actions2.moveToElement(item.get(i));
			actions2.build().perform();
			System.out.println("Item list name----->"+item.get(i).getText());
		}
		
		List<WebElement> subItem=driver.findElements(By.xpath("//div/li/div/ul/li[@class='nI-gNb-menuItems']"));
		actions2.moveToElement(target);
		for(int i=0;i<subItem.size();i++)
		{
			
		
			actions2.moveToElement(subItem.get(i));
			System.out.println("subItem name--->"+subItem.get(i).getText());
			actions2.build().perform();
		}
		//System.out.println("subItem name--->"+subItem.getAttribute("title"));
		//Instantiating Actions class
		//Hovering on main menu
		
		//actions2.moveToElement(subItem); 
		//System.out.println("subItem name--->"+subItem.getAttribute("title"));
		//actions2.click().build().perform();
		 
	}

}
