package com.twt.services;

import org.assertj.core.error.ShouldBeOdd;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.twt.config.BrowserDriver;
import com.twt.pageobjects.IndentationPageObjects;

public class IndentationServices {
	
	public static IndentationPageObjects indentobjects;
	private static Logger log = Logger.getLogger(IndentationServices.class);
	
	public static void init() {
		indentobjects = PageFactory.initElements(BrowserDriver.getCurrentDriver(), IndentationPageObjects.class);
	}
	
	public IndentationServices indentsActions() {
		BrowserDriver.waitForPageToLoad();
		BrowserDriver.clickElement(indentobjects.getSideMenu());
		BrowserDriver.clickElement(indentobjects.getIndentationManagement());
		BrowserDriver.clickElement(indentobjects.getCycleDays());
		BrowserDriver.clickElement(indentobjects.getDsIndents());
		BrowserDriver.clickElement(indentobjects.getWhIndents());
		return this;
	}
}
