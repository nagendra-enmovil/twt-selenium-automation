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
		BrowserDriver.clickElement(mastersobjects.getSideMenu());
		BrowserDriver.clickElement(mastersobjects.getMasterButton());
		BrowserDriver.clickElement(mastersobjects.getFgMasterButton());
		BrowserDriver.clickElement(mastersobjects.getSkuMaster());
		BrowserDriver.clickElement(mastersobjects.getSourceMaster());
		BrowserDriver.clickElement(mastersobjects.getDestinationStoreMaster());
		BrowserDriver.clickElement(mastersobjects.getSourceDestinationMapping());
		BrowserDriver.clickElement(mastersobjects.getMastersDemandPlan());
		BrowserDriver.clickElement(mastersobjects.getCalendarMaster());
		BrowserDriver.clickElement(mastersobjects.getBatchMaster());
		BrowserDriver.clickElement(mastersobjects.getPincodeMapping());
		BrowserDriver.clickElement(mastersobjects.getFgMasterButton());
		BrowserDriver.clickElement(mastersobjects.getPmMasterButton());
		BrowserDriver.clickElement(mastersobjects.getPmSkuMaster());
		BrowserDriver.clickElement(mastersobjects.getConversionMetric());
		BrowserDriver.clickElement(mastersobjects.getPmFgMapping());
		BrowserDriver.clickElement(mastersobjects.getPmMasterButton());
		BrowserDriver.clickElement(mastersobjects.getMasterButton());

		return this;
	}
}
