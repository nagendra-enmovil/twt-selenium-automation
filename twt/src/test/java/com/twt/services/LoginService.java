package com.twt.services;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.twt.config.BrowserDriver;
import com.twt.pageobjects.LoginPageObjects;

public class LoginService {
	
	public static LoginPageObjects loginobjects;
	private static Logger log = Logger.getLogger(LoginService.class);
	
	public static void init() {
		loginobjects = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPageObjects.class);
	}
	
	public LoginService loginToTwt(String username, String password) {
		try {
			BrowserDriver.waitForPageToLoad();
			loginobjects.getUsername().sendKeys(username);
			loginobjects.getPassword().sendKeys(password);
			loginobjects.getLoginButton().click();
			BrowserDriver.wait(2);
			log.info("User Logged Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
