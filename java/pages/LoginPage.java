package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	//Constructor to initialize the FindBy elements
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//FindBy Element Locators
	@FindBy(how=How.ID, using="username") WebElement eleUsername;	
	@FindBy(how=How.ID, using="password") WebElement elePassword;	
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLoginButton;
	
	//Page level element actions
	public LoginPage enterUsername(String username) {
		eleUsername.sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		elePassword.sendKeys(password);
		return this;
	}
	
	public HomePage clickLoginButton() {
		eleLoginButton.click();
		return new HomePage();
	}
}
