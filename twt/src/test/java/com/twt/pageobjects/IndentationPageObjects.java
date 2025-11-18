package com.twt.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndentationPageObjects {
	
	@FindBy(xpath = "//div[@class= 'menu-icon  closed']")
	private WebElement sideMenu;
	
	@FindBy(xpath = "//span[text() = 'Indentation Management']")
	private WebElement indentationManagement;

	@FindBy(xpath = "//span[text() = 'Cycle Dates']")
	private WebElement cycleDays;
	
	@FindBy(xpath = "//span[text() = 'Darkstore Indentation']")
	private WebElement dsIndents;
	
	@FindBy(xpath = "//span[text() = 'Warehouse Indentation']")
	private WebElement whIndents;
	
	
	

	public WebElement getSideMenu() {
		return sideMenu;
	}

	public void setSideMenu(WebElement sideMenu) {
		this.sideMenu = sideMenu;
	}

	public WebElement getIndentationManagement() {
		return indentationManagement;
	}

	public void setIndentationManagement(WebElement indentationManagement) {
		this.indentationManagement = indentationManagement;
	}

	public WebElement getCycleDays() {
		return cycleDays;
	}

	public void setCycleDays(WebElement cycleDays) {
		this.cycleDays = cycleDays;
	}

	public WebElement getDsIndents() {
		return dsIndents;
	}

	public void setDsIndents(WebElement dsIndents) {
		this.dsIndents = dsIndents;
	}

	public WebElement getWhIndents() {
		return whIndents;
	}

	public void setWhIndents(WebElement whIndents) {
		this.whIndents = whIndents;
	}
	
	
}
