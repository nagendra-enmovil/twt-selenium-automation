package com.twt.testscripts;

import org.openqa.selenium.WebDriver;

import com.twt.config.BrowserDriver;
import com.twt.services.FGIService;
import com.twt.services.IMService;
import com.twt.services.IndentationServices;
import com.twt.services.LoginService;
import com.twt.services.MastersServices;

public class InitializeViews {
	
	protected static WebDriver uiDriver = null;
	public static void init() {
		if(uiDriver == null) {
			uiDriver = BrowserDriver.getCurrentDriver();
		}
		LoginService.init();
		FGIService.init();
		MastersServices.init();
		IMService.init();
		IndentationServices.init();
	 }
}
