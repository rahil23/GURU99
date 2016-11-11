package Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverInstance {
	 WebDriver driver;
  @BeforeTest
  public void pre() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\JavaSelenium practice\\GURU99\\drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	 
	  driver.get("http://www.demo.guru99.com/V4/");
	  driver.manage().timeouts().implicitlyWait(33, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
  }
  @AfterTest
  public void post()
  {
	 // driver.close();
  }
}
