package com.twt.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.twt.config.BrowserDriver;
import com.twt.config.PropertyLoader;
import com.twt.data.LoginData;
import com.twt.data.TWTDataConfig;
import com.twt.services.LoginService;
import com.twt.services.MastersServices;

import util.BaseListener;

public class MastersTestScripts extends BaseListener{
	
	LoginData logindata = null;
	LoginService loginservice = null;
	MastersServices mastersservice = null;
	
	@BeforeClass
	public void init() {
		logindata = new TWTDataConfig().getLoginData();
		loginservice = new LoginService();
		mastersservice = new MastersServices();
		InitializeViews.init();
		Logger = extent.createTest("Masters Screen");
		BrowserDriver.getCurrentDriver().navigate().to(PropertyLoader.getTWTURL());
		loginservice.loginToTwt(logindata.getUsername(), logindata.getPassword());
	}
	
	@Test(description="Masters Screen Test")
	public void mastersTest() {
		mastersservice.mastersActions();
	}
}
