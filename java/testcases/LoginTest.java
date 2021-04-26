package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;


public class LoginTest extends BaseClass {

	@Test
	public void loginUsingValidCredsTest() {
		
		new LoginPage()
		.enterUsername("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLoginButton()
		.verifyWelcomeMessage();
	}
	
}
