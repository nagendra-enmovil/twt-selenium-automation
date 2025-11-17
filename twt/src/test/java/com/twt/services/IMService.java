package com.twt.services;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.twt.config.BrowserDriver;
import com.twt.pageobjects.IMPageObjects;

public class IMService {
	
	public static IMPageObjects imobjects;
	private static Logger log = Logger.getLogger(IMService.class);
	
	public static void init() {
		imobjects = PageFactory.initElements(BrowserDriver.getCurrentDriver(), IMPageObjects.class);
	}
	
	public IMService ImActions() {
		BrowserDriver.waitForPageToLoad();
		BrowserDriver.clickElement(imobjects.getSideMenu());
		BrowserDriver.clickElement(imobjects.getFgStockStatus());
		BrowserDriver.clickElement(imobjects.getFinishedGoodsInv());
		BrowserDriver.clickElement(imobjects.getInventoryDashboard());
		BrowserDriver.clickElement(imobjects.getHistoricSales());
		BrowserDriver.clickElement(imobjects.getiMButton());
		return this;
	}
}
