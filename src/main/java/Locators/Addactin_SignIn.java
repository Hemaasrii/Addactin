package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base_Class;

public class Addactin_SignIn extends Base_Class{
	
	public Addactin_SignIn(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
		
	}

	


	public WebElement getRegistrClick() {
		return registrClick;
	}


	public WebElement getRegistrPageCheck() {
		return registrPageCheck;
	}


	public WebElement getUserName() {
		return userName;
	}


	public WebElement getPassWord() {
		return passWord;
	}


	public WebElement getCnfmPassWord() {
		return cnfmPassWord;
	}


	public WebElement getFullName() {
		return fullName;
	}


	public WebElement getEmailAddress() {
		return emailAddress;
	}


	public WebElement getCaptchaTxt() {
		return captchaTxt;
	}


	public WebElement getTermCndBx() {
		return termCndBx;
	}


	public WebElement getRegstrBox() {
		return regstrBox;
	}

	@FindBy(xpath = "//img[@class='logo']")
	private WebElement addactinLogo;
	
	
	@FindBy(xpath = "//a[text()='New User Register Here']")
	private WebElement registrClick;
	
	@FindBy(xpath = "//td[text()='New User Registration Form ']")
	private WebElement registrPageCheck;
	
	@FindBy(name = "username")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement passWord;
	
	@FindBy(id = "re_password")
	private WebElement cnfmPassWord;
	
	@FindBy(id = "full_name")
	private WebElement fullName;
	
	@FindBy(id = "email_add")
	private WebElement emailAddress;
	
	@FindBy(id = "captcha-form")
	private WebElement captchaTxt;
	
	@FindBy(id = "tnc_box")
	private WebElement termCndBx;
	
	
	@FindBy(id = "Submit")
	private WebElement regstrBox;


	public WebElement getAddactinLogo() {
		return addactinLogo;
	}
	
	
	
}
