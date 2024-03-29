package com.mcgg.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mcgg.qa.base.TestBase;

public class LoginPage extends TestBase{
	//Login Page factory or Object Repository
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(test),='Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
		
	}
	}
