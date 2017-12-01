package automationtestproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoTraderSignInSignUpPage {
	
	@FindBy(id = "js-social__signup-tab")
	private WebElement signUpButton;
	
	public void clickSignUp() {
		signUpButton.click();
	}
	
	@FindBy(id = "email")
	private WebElement emailTextbox;
	
	public void enterTextIntoEmail(String text) {
		emailTextbox.sendKeys(text);
	}
	
	@FindBy(id = "password")
	private WebElement passwordTextbox;
	
	public void enterTextIntoPassword(String text) {
		emailTextbox.sendKeys(text);
	}
	
	@FindBy(id = "social--signup--submit")
	private WebElement signUpNowButton;
	
	public void clickSignUpNow() {
		signUpNowButton.click();
	}
	
	@FindBy(id = "js-social__signin-tab")
	private WebElement signInButton;
	
	public void clickSignIn() {
		signInButton.click();
	}
	
	@FindBy(id = "signin-email")
	private WebElement signInEemailTextbox;
	
	public void enterTextIntoSignInEmail(String text) {
		emailTextbox.sendKeys(text);
	}
	
	@FindBy(id = "signin-password")
	private WebElement signInPasswordTextbox;
	
	public void enterTextIntoSignInPassword(String text) {
		emailTextbox.sendKeys(text);
	}
	
	@FindBy(id = "signInSubmit")
	private WebElement signInSubmitButton;
	
	public void clickSignInNow() {
		signInSubmitButton.click();
	}

}
