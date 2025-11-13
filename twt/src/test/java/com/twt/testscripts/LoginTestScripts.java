package com.twt.testscripts;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.twt.config.BrowserDriver;
import com.twt.config.PropertyLoader;
import com.twt.data.LoginData;
import com.twt.data.TWTDataConfig;
import com.twt.services.LoginService;

import util.BaseListener;

public class LoginTestScripts extends BaseListener{
	
	LoginData logindata = null;
	LoginService loginservice = null;
	
	@BeforeClass
	public void init() {
		logindata = new TWTDataConfig().getLoginData();
		loginservice = new LoginService();
		InitializeViews.init();
		Logger = extent.createTest("WMS Login Screen");
		BrowserDriver.getCurrentDriver().navigate().to(PropertyLoader.getTWTURL());
		
	}
	
	@Test(description="WMS Login Test",priority=0)
	public void loginTest() {
		loginservice.loginToTwt(logindata.getUsername(), logindata.getPassword());
	}
}
