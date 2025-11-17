package com.twt.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IMPageObjects {
	
	@FindBy(xpath = "//div[@class= 'menu-icon  closed']")
	private WebElement sideMenu;
	
	@FindBy(xpath = "//span[text() = 'Inventory Management']")
	private WebElement iMButton;
	
	@FindBy(xpath = "//span[text() = 'FG Stock Status']")
	private WebElement fgStockStatus;
	
	@FindBy(xpath = "//span[text() = 'Finished Goods Inventory']")
	private WebElement finishedGoodsInv;
	
	@FindBy(xpath = "//span[text() = 'Inventory Dashboard']")
	private WebElement inventoryDashboard;
	
	@FindBy(xpath = "//span[text() = 'Historic Sales']")
	private WebElement historicSales;

	public WebElement getSideMenu() {
		return sideMenu;
	}

	public void setSideMenu(WebElement sideMenu) {
		this.sideMenu = sideMenu;
	}

	public WebElement getiMButton() {
		return iMButton;
	}

	public void setiMButton(WebElement iMButton) {
		this.iMButton = iMButton;
	}

	public WebElement getFgStockStatus() {
		return fgStockStatus;
	}

	public void setFgStockStatus(WebElement fgStockStatus) {
		this.fgStockStatus = fgStockStatus;
	}

	public WebElement getFinishedGoodsInv() {
		return finishedGoodsInv;
	}

	public void setFinishedGoodsInv(WebElement finishedGoodsInv) {
		this.finishedGoodsInv = finishedGoodsInv;
	}

	public WebElement getInventoryDashboard() {
		return inventoryDashboard;
	}

	public void setInventoryDashboard(WebElement inventoryDashboard) {
		this.inventoryDashboard = inventoryDashboard;
	}

	public WebElement getHistoricSales() {
		return historicSales;
	}

	public void setHistoricSales(WebElement historicSales) {
		this.historicSales = historicSales;
	}
	
	
}
