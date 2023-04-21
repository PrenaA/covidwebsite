package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;



public class UserInfo {

   WebDriver driver;
	
	By userName = By.xpath("//input[@placeholder='Username']");
	By password = By.xpath("//input[@placeholder='Password']");
	By loginButton = By.xpath("//button[normalize-space()='Login']");
	
	
	public UserInfo(WebDriver driver) {
		this.driver = driver;
		
	}
	public void userInfo() {
		driver.findElement(userName).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
	    driver.findElement(loginButton).click();
		
	}
	
}

