package day_05;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hello_Selenium {

	String url = "https://www.numpyninja.com/";
	
	public void launchTestApplication() {
		
		System.setProperty("webdriver.chrome.driver","/Users/prernaaher/eclipse-workspace/SDET_108_Selenium/src/test/resources/Drivers/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver Driver = new ChromeDriver(options);
		
		Driver.get(url);
	}
	
	public static void main(String[] args) {
		
		Hello_Selenium test = new Hello_Selenium();
		test.launchTestApplication();
		
	}
}
