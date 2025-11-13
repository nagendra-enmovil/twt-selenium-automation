package com.twt.testscripts;

import org.junit.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.twt.config.BrowserDriver;
import com.twt.config.PropertyLoader;
import com.twt.data.LoginData;
import com.twt.data.TWTDataConfig;
import com.twt.services.FGIService;
import com.twt.services.LoginService;

import util.BaseListener;

public class FGITestScripts extends BaseListener{
	
	LoginData logindata = null;
	LoginService loginservice = null;
	FGIService fgiservice = null;
	
	@BeforeClass
	public void init() {
		logindata = new TWTDataConfig().getLoginData();
		loginservice = new LoginService();
		fgiservice = new FGIService();
		InitializeViews.init();
		Logger = extent.createTest("Finished Goods Inventory Screen");
		BrowserDriver.getCurrentDriver().navigate().to(PropertyLoader.getTWTURL());
	}
	
	@Test(description="Finished Goods Inventory Test")
	public void fgiTest() {
		loginservice.loginToTwt(logindata.getUsername(), logindata.getPassword());
		fgiservice.fgiActions();
	}
}
