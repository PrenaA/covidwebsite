package PageObjectModel;

import static org.testng.Assert.assertTrue;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MyInfoTab {

	WebDriver Driver;
	
	public MyInfoTab(WebDriver Driver) {
		
	}
	public void myInfo() {
		
		By clickmyInfo = By.xpath("//div[1]/aside/nav/div[2]/ul/li[6]/a");
		Driver.findElement(clickmyInfo).click();
		By contactdetails = By.xpath("\"//a[text()='Contact Details']\"");
		Driver.findElement(contactdetails).click();
		
		
	}
		public void myAddress() {
			
			Boolean verifyTitle = Driver.getTitle().equalsIgnoreCase("oxd-text oxd-text--h6 orangehrm-main-title");
			assertTrue(verifyTitle);
			By clickmyAddress = By.className("oxd-input-group__label-wrapper");
			Driver.findElement(clickmyAddress).click();
			
		} 
			
		
}

	
	


