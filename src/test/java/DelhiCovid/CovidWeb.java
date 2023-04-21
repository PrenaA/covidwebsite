package DelhiCovid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import day_8.covid_website;

public class CovidWeb {

	public void printCoronaDashboard() {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://coronabeds.jantasamvad.org/ ");
		String numberOfBeds = driver.findElement(By.xpath("//div/p[@id='beds_total']")).getText();
		System.out.println("Number of Beds : " + numberOfBeds);
		driver.findElement(By.xpath("//div/p[@id='beds_total']")).click();	
		driver.findElement(By.xpath("//a[text()=' Indira Gandhi Hospital, Dwarka']")).click();
		
//		final int HOSPITAL_COLUMN_INDEX = 2;
//		
//		for (int rowIndex=1; rowIndex<20; rowIndex++) {
//			String HospName = driver.findElement(By.xpath("//tbody/tr["+ rowIndex + "]/td[" + HOSPITAL_COLUMN_INDEX + "]/span[1]")).getText();
//			System.out.println("Name of the hospital : "+HospName);
//		}

		
		for (int i = 1; i < 20; i++) {
			
		String hospitalName = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[@id='hospitals_list']")).getText();
		System.out.println("Hospital List");

		//driver.findElement(By.xpath("//span[@id='badge badge-sm badge-dark' ]['1']")).click();
		//System.out.println("Hospital Name");




		
		}
	}

	public static void main(String[] args) {

		CovidWeb cw = new CovidWeb();

		cw.printCoronaDashboard();
	}

}
