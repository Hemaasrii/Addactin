package PageObjectManager;

import org.openqa.selenium.WebDriver;

import BaseClass.Base_Class;
import Locators.Addactin_SignIn;

public class PageObject extends Base_Class {
	public PageObject(WebDriver xdriver) {
		this.driver = xdriver;
	}

	private Addactin_SignIn SignIn;

	public Addactin_SignIn getSignIn() {
		if (SignIn == null) {
			SignIn = new Addactin_SignIn(driver);
		}
		return SignIn;
	}

}
