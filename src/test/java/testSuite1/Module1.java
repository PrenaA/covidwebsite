package testSuite1;

import org.openqa.selenium.devtools.Message;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

public class Module1 {
	
		@BeforeMethod
	    public void befoermethod() {
		System.out.println("I am executing before every methods");
		
	}
	
		@Test
		public void test001() {
		System.out.println("I am executing test case 001");
		Reporter.log("I am executing test case 001");
		
		Assert.assertEquals(false,true);
	
	}
		@Test
		public void test002() {
		System.out.println("I am executing test case 002");
		
		Reporter.log("I am executing test case 002");
	}
		@Test (groups= {"smoke","sanity"})
		
		public void test003() {
		System.out.println("I am executing test case 003");
		
		Reporter.log("I am executing test case 003");
	}
		@AfterMethod
	    public void aftermethod() {
		System.out.println("I am executing after every methods");
		
	}
		
		 @AfterSuite
		    public void afterSuite(){
		      System.out.println("Hello I am executing After Test Suite");
		    }
		    @Test
		    public void testMethod(){
		      Assert.assertEquals("Test method","Hello I am executing After Test Suite");
		    }

		
	@DataProvider
	public Object[][] data001() {
		
		Object[][] data = {{"AAA", "pass001"},{"BBB","pass002"}};
		
		return  data;
		
	}
	
	@Test(dataProvider = "data001")
	public void login(String username, String password ) {
		
		System.out.println(username + "and" + password);
		
	}
	@Test
	public void test004() {
		
	}
		
}


