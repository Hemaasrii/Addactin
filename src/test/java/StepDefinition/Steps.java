package StepDefinition;

import org.junit.Assert;

import BaseClass.Base_Class;
import PageObjectManager.PageObject;
import io.cucumber.java.en.Given;


public class Steps extends Base_Class {
	
	PageObject pom=new PageObject(driver);
	
	
	@Given("user have to launch browser")
	public void user_have_to_launch_browser() {
	   launchBrowser();
	    
	}
	@Given("user have to navigate the url {string}")
	public void user_have_to_navigate_the_url(String string) {
	    
	    getUrl(string);
	}
	@Given("user have to validate land on Login Page")
	public void user_have_to_validate_land_on_login_page() {
	    Assert.assertTrue(elementDisplay(pom.getSignIn().getAddactinLogo()));
	    
	}
	@Given("user have to click the New User Register Here")
	public void user_have_to_click_the_new_user_register_here() {
	    elementOnClick(pom.getSignIn().getRegistrClick());
	    
	}
	@Given("user have to verify land on new user Registration Page")
	public void user_have_to_verify_land_on_new_user_registration_page() {
		 Assert.assertTrue(elementDisplay(pom.getSignIn().getRegistrPageCheck()));
	    
	}
	@Given("user have to enter username {string}")
	public void user_have_to_enter_username(String string) {
	    elementSendKeys(pom.getSignIn().getUserName(), string);
	    
	}
	@Given("user have to enter password {string}")
	public void user_have_to_enter_password(String string) {
		elementSendKeys(pom.getSignIn().getPassWord(), string);
	    
	}
	@Given("user have to Re-enter confirm password {string}")
	public void user_have_to_re_enter_confirm_password(String string) {
		elementSendKeys(pom.getSignIn().getCnfmPassWord(), string);
	    
	}
	@Given("user have to enter fullname {string}")
	public void user_have_to_enter_fullname(String string) {
		elementSendKeys(pom.getSignIn().getFullName(), string);
	    
	}
	@Given("user have to enter Email Address {string}")
	public void user_have_to_enter_email_address(String string) throws InterruptedException {
		elementSendKeys(pom.getSignIn().getEmailAddress(), string);
		threadSleep();
	    
	}
	@Given("user have to enter Captcha Text")
	public void user_have_to_enter_captcha_text(String string ) throws InterruptedException {
		
	    scannerInput(string);
	    
	}
	@Given("user click Terms and Condition Button")
	public void user_click_terms_and_condition_button() {
	    elementOnClick(pom.getSignIn().getTermCndBx());
	    
	}
	@Given("user click Register Button")
	public void user_click_register_button() {
	    
	    
	}


}
