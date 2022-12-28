package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject {
	
	private By errorMessageLocator = By.id("flash");
	
	public LoginPage(WebDriver driver, Logger log) {
		super(driver, log);
		
	}
	
	/** Execute log in */
	public SecureAreaPage logIn(String username, String password) {
		defaultLogin(username, password);
		return new SecureAreaPage(driver, log);
	}
	
	/** Execute negative log in 
	 * @return */
	public void negativeLogIn(String username, String password) {
		defaultLogin(username, password);
	}
	
	/** Wait for error message to be visible on the page */
	public void waitForErrorMessage() {
		waitForVisibilityOf(errorMessageLocator, 5);
	}

	public String getErrorMessageText() {
		return find(errorMessageLocator).getText();
	}
}
