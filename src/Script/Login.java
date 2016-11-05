package Script;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.LoginPage_POM;

public class Login extends DriverInstance {
  @Test
  public void login() {
	  
	  LoginPage_POM obj = new LoginPage_POM(driver);
	  obj.login();
	  
	  Assert.assertEquals("Guru99 Bank Manager HomePage", "Guru99 Bank Manager HomePage");
	  
	  System.out.println("Test case is passed");
	  
	  
	  
	  
  }
}
