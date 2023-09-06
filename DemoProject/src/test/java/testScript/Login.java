package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import allPages.HomePage;
import allPages.LoginPage;

public class Login {
	WebDriver driver;
  @Test
  public void loginTest() {
	  
	 //open Application and get the link
	  driver=new ChromeDriver();
	  driver.get("https://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	 
	  HomePage homepage=new HomePage(driver);
	  homepage.clickLogin();
	  
	  //Enter login details 
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterEmail();
	  loginpage.enterPassword();
	  loginpage.clickLoginBtn();
	  
  }
}
