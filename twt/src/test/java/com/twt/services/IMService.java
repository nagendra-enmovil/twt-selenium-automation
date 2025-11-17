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
		imobjects.getSideMenu().click();
		BrowserDriver.wait(1);
		imobjects.getFgStockStatus().click();
		BrowserDriver.wait(1);
		imobjects.getFinishedGoodsInv().click();
		BrowserDriver.wait(5);
		imobjects.getInventoryDashboard().click();
		BrowserDriver.wait(1);
		imobjects.getHistoricSales().click();
		imobjects.getiMButton().click();
		return this;
	}
}
