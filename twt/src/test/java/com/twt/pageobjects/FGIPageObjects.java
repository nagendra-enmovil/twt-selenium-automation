package com.twt.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FGIPageObjects {
	
	@FindBy(xpath = "//button[text() = 'Finished Goods Inventory']")
	private WebElement fgiButton;
	

	public WebElement getFgiButton() {
		return fgiButton;
	}

	public void setFgiButton(WebElement fgiButton) {
		this.fgiButton = fgiButton;
	}
	
}
