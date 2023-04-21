package day_8;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class covid_website {
	
	public void printHospName() {
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://westbengal.covidsafe.in/");
		
		for(int i=1; i<=20; i++) {
			
		String HospName = driver.findElement(By.xpath("//tbody/tr["+ i +"]//strong")).getText();
		System.out.println("Name of the hospital : "+HospName);
		
		String HospAdress= driver.findElement(By.xpath("//tbody/tr["+ i +"]//strong")).getText();
		System.out.println("Name of the hospital : "+HospAdress);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		covid_website cw = new covid_website();
		
		cw.printHospName();
	}

}



