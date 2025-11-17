package com.twt.testscripts;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.twt.config.BrowserDriver;
import com.twt.config.PropertyLoader;
import com.twt.data.LoginData;
import com.twt.data.TWTDataConfig;
import com.twt.services.IMService;
import com.twt.services.LoginService;

import util.BaseListener;

public class IMTestScripts extends BaseListener{
	
	LoginData logindata = null;
	LoginService loginservice = null;
	IMService imservice = null;
	
	@BeforeClass
	public void init() {
		logindata = new TWTDataConfig().getLoginData();
		loginservice = new LoginService();
		imservice = new IMService();
		InitializeViews.init();
		Logger = extent.createTest("Inventoy Management Screen");
		BrowserDriver.getCurrentDriver().navigate().to(PropertyLoader.getTWTURL());
		loginservice.loginToTwt(logindata.getUsername(), logindata.getPassword());
	}
	
	@Test(description="Inventory Management Screen Test")
	public void IMTest() {
		imservice.ImActions();
	}
}
