package com.twt.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.twt.config.BrowserDriver;
import com.twt.config.PropertyLoader;
import com.twt.data.LoginData;
import com.twt.data.TWTDataConfig;
import com.twt.services.IndentationServices;
import com.twt.services.LoginService;

import util.BaseListener;

public class IndentsTestScripts extends BaseListener{
	
	LoginData logindata = null;
	LoginService loginservice = null;
	IndentationServices indentservice = null;
	
	
	@BeforeClass
	public void init() {
		logindata = new TWTDataConfig().getLoginData();
		loginservice = new LoginService();
		indentservice = new IndentationServices();
		InitializeViews.init();
		Logger = extent.createTest("Indent Screen");
		BrowserDriver.getCurrentDriver().navigate().to(PropertyLoader.getTWTURL());
		loginservice.loginToTwt(logindata.getUsername(), logindata.getPassword());
	}
	
	@Test(description="Indent Screen Test")
	public void indentsTests() {
		indentservice.indentsActions();
	}
}
