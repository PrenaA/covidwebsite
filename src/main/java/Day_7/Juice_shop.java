package Day_7;



	import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class Juice_shop {
	
		
		
		String url = "https://juiceshop.myspreadshop.com/";
		
		public void launchTestApplication() {
			
				System.setProperty("webdriver.chrome.driver","/Users/prernaaher/eclipse-workspace/SDET_108_Selenium/src/test/resources/Drivers/chromedriver");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				
				ChromeDriver Driver = new ChromeDriver(options);
				Driver.manage().window().maximize();
				Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				Driver.get(url);
				
				Driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler")).click();
				
				//Driver.findElement(By.className("color: rgb(0, 0, 0);")).click();
				//Driver.findElement(By.xpath("(//img[@alt=\"OWASP Juice Shop Bot (Corona edition) - Men's Hoodie\"])[1]")).click();
				
				//Set<String> handles=Driver.getWindowHandles(); //parentid, childid
				
				//Iterator it=handles.iterator();
			  
				//String parentid=(String) it.next();
				//String childid=(String) it.next();
				//Driver.switchTo().window(childid);
				
				//Driver.findElement(By.id("//img[@alt=\'OWASP Juice Shop Bot (Corona edition) - Men's Hoodie\']")).click();
				//Driver.findElement(By.id("//img[@alt=\'OWASP Juice Shop Bot (Corona edition) - Men's Hoodie\']")).click();
				//Driver.switchTo().frame(Driver.findElement(By.id("sprd-img-spinner__image")));
				
				//selecting hoodie image
				WebElement mensHoodie = Driver.findElement(By.xpath("//a[1][@href=\"/owasp+juice+shop+bot+corona+edition-A5eb10c80f9376468c55631ce?productType=111&sellable=yrDOoL239aFmv79R5DYE-111-22&appearance=2\"]"));
				
				//verify hoodieimage
				if(mensHoodie.isSelected()) {
					System.out.println("men's hoodie Selected");
					
					//get the hoodieimage
					System.out.println("select hoodie image"+mensHoodie.getAttribute("alt"));
				}
				else {
					System.out.println("mensHoodie is not selected");
				}
	}		 
				
		
		
		private void timeouts() {
			// TODO Auto-generated method stub
			return;
		}



		public static void main(String[] args) {
			
			Juice_shop  test = new Juice_shop();
			test.launchTestApplication();
			
		}
	}
	  
	 
	 


