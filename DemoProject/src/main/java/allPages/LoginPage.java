package allPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="Email")
	private WebElement email;

	@FindBy(id="Password")
	private WebElement password;

	@FindBy(xpath="//input[contains(@class,'login-button')]")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail() {
		email.sendKeys("Itest@test.com");
	}
	
	public void enterPassword() {
		password.sendKeys("Itest@test");
	}
	public void clickLoginBtn() {
		loginbtn.click();
	}

}
