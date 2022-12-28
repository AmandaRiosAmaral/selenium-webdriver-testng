package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject {

	
	private String pageUrl = "http://the-internet.herokuapp.com/";
	
	private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
	private By dropdownLinkLocator = By.linkText("Dropdown");

	public WelcomePageObject(WebDriver driver, Logger log) {
		super(driver, log);
	}
	
	/** Open WelcomePage with it's url */
	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened.");
	}
	
	/** open LoginPage by clicking on Form Authentication link */
	public LoginPage clickFormAuthentication() {
		log.info("Clicking Form Authentication");
		click(formAuthenticationLinkLocator);
		return new LoginPage(driver, log);
	}

	/** open Dropdown Page by clicking on Dropdown link */
	public DropdownPage clickDropdownLink() {
		log.info("Clicking Dropdown");
		click(dropdownLinkLocator);
		return new DropdownPage(driver, log);
	}
}
