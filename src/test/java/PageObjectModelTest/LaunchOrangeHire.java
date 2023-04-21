package PageObjectModelTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModel.MyInfoTab;
import PageObjectModel.UserInfo;

import io.netty.util.internal.SystemPropertyUtil;

public class LaunchOrangeHire {
	ChromeDriver driver;
	String driverPath= "/Users/prernaaher/eclipse-workspace/SDET_108_Selenium/src/test/resources/Drivers/chromedriver.exe";
	@BeforeTest
	public void launchHireApplication() throws InterruptedException {
		
    String URL ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		System.setProperty("WebDriver.Chrome.driver",
				"/Users/prernaaher/eclipse-workspace/SDET_108_Selenium/src/test/resources/Drivers/chromedriver.exe");
		
		ChromeOptions chrom = new ChromeOptions();
		chrom.addArguments("--remote-allow-origins=*");
		
	    driver = new ChromeDriver(chrom);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	    driver.get(URL);
		Thread.sleep(2000);
		
		}
	@Test
	public void launchUserInfo() {
		
		UserInfo objectuserInfo = new UserInfo(driver);
		objectuserInfo.userInfo();
		
	}
	public void MyInfoTab() {
		MyInfoTab objectMyInfoTab = new MyInfoTab(driver);
		objectMyInfoTab.myInfo();
		
	}

}
