package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject {

	
	private String pageUrl = "http://the-internet.herokuapp.com/";
	
	private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
	private By dropdownLinkLocator = By.linkText("Dropdown");
	private By javascriptAlertsLinkLocator = By.linkText("JavaScript Alerts");
	private By multipleWindowsLinkLocator = By.linkText("Multiple Windows");
	private By editorLinkLocator = By.linkText("WYSIWYG Editor");



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

	/** open DropdownPage by clicking on Dropdown link */
	public DropdownPage clickDropdownLink() {
		log.info("Clicking Dropdown");
		click(dropdownLinkLocator);
		return new DropdownPage(driver, log);
	}
	
	/** open JavaScriptAlertsPage by clicking on JavaScript Alerts link */
	public JavaScriptAlertsPage clickJavaScriptAlertsLink() {
		log.info("Clicking JavaScript Alerts");
		click(javascriptAlertsLinkLocator);
		return new JavaScriptAlertsPage(driver, log);
	}
	
	public WindowsPage clickMultipleWindowsLink() {
		log.info("Clicking Multiple Windows link on Welcome Page");
		click(multipleWindowsLinkLocator);
		return new WindowsPage(driver, log);
	}
	
	public EditorPage clickWYSIWYGEditorLink() {
		log.info("Clicking WYSIWYG Editor link on Welcome Page");
		click(editorLinkLocator);
		return new EditorPage(driver, log);
	}
}
