package com.twt.services;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.twt.config.BrowserDriver;
import com.twt.pageobjects.MastersPageObjects;

public class MastersServices {
	
	public static MastersPageObjects mastersobjects;
	private static Logger log = Logger.getLogger(MastersServices.class);
	
	public static void init() {
		mastersobjects = PageFactory.initElements(BrowserDriver.getCurrentDriver(), MastersPageObjects.class);
	}
	
	public MastersServices mastersActions() {
		BrowserDriver.waitForPageToLoad();
		mastersobjects.getSideMenu().click();
		mastersobjects.getMasterButton().click();
		mastersobjects.getFgMasterButton().click();
		mastersobjects.getSkuMaster().click();
		BrowserDriver.wait(1);
		mastersobjects.getSourceMaster().click();
		BrowserDriver.wait(1);
		mastersobjects.getDestinationStoreMaster().click();
		BrowserDriver.wait(1);
		mastersobjects.getSourceDestinationMapping().click();
		BrowserDriver.wait(1);
		mastersobjects.getMastersDemandPlan().click();
		BrowserDriver.wait(1);
		mastersobjects.getCalendarMaster().click();
		BrowserDriver.wait(1);
		mastersobjects.getBatchMaster().click();
		BrowserDriver.wait(1);
		mastersobjects.getPincodeMapping().click();
		BrowserDriver.wait(1);
		mastersobjects.getFgMasterButton().click();
		BrowserDriver.wait(1);
		mastersobjects.getPmMasterButton().click();
		mastersobjects.getPmSkuMaster().click();
		mastersobjects.getConversionMetric().click();
		mastersobjects.getPmFgMapping().click();
		mastersobjects.getPmMasterButton().click();
		mastersobjects.getMasterButton().click();
		return this;
	}
}
