package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POM {
	
	
	
	@FindBy(name="uid")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="btnLogin")
	private WebElement loginbtn;
	
	public LoginPage_POM(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	
	public void login()
	{
		username.sendKeys("mngr53426");
		password.sendKeys("qymAveq");
		loginbtn.click();
	}
	
	

}
