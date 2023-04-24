package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccount {

	WebDriver ldriver;

	public myAccount(WebDriver rdriver) {

		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	@FindBy(id = "email_create")
	WebElement createEmailId;

	@FindBy(xpath = "//span[normalize-space()='Create an account']")
	WebElement submitCreate;

	// Already registered users
	@FindBy(id = "email")
	WebElement registeredUsersEmail;

	@FindBy(id = "passwd")
	WebElement registeredUsersPwd;

	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	WebElement submitLogin;

	public void enterCreatedEmailAddress(String emailAdd) {
		createEmailId.sendKeys(emailAdd);
	}

	public void clickSumbitCreate() {
		submitCreate.click();
	}

	// ACTIONS METHODS FOR ALREADY REGISTERED USERS

	public void enterEmailAddress(String emailAdd) {
		registeredUsersEmail.sendKeys(emailAdd);
	}

	public void enterPassword(String pwd) {
		registeredUsersPwd.sendKeys(pwd);
	}

	public void clickSignIn() {
		submitLogin.click();
	}

}
