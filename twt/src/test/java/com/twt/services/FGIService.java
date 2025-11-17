package com.twt.services;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.twt.config.BrowserDriver;
import com.twt.pageobjects.FGIPageObjects;

public class FGIService {
	
	public static FGIPageObjects fgiobjects;
	private static Logger log = Logger.getLogger(FGIService.class);
	
	public static void init() {
		fgiobjects = PageFactory.initElements(BrowserDriver.getCurrentDriver(), FGIPageObjects.class);
	}
	
	public FGIService fgiActions() {
		BrowserDriver.waitForPageToLoad();
		fgiobjects.getFgiButton().click();
		return this;
	}
}
