package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;


public class HomePage extends BaseClass {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how=How.ID, using="form") WebElement eleWelcomeMessage;
	
	public HomePage verifyWelcomeMessage() {
		
		String welcomeMessage = eleWelcomeMessage.getText();
		if(welcomeMessage.contains("Demo Sales Manager")) {
			System.out.println("Welcome Message is as expected - "+welcomeMessage);
		}
		else {
			System.out.println("Welcome Message is incorrect - "+welcomeMessage);
		}
		return this;
	}
}
