package testSuite1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;



public class AfterSuitMethod {

	
	  
		  AfterSuitMethod messageUtil = new AfterSuitMethod();
	    @AfterSuite
	    public void afterSuite(){
	      System.out.println("Hello I am executing After Test Suite");
	    }
	    @Test
	    public void testMethod(){
	      Assert.assertEquals("Test method", messageUtil.printMessage());
	    }

	  

	public String printMessage() {
		// TODO Auto-generated method stub
		return null;
	}
}
