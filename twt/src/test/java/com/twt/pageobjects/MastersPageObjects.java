package com.twt.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MastersPageObjects {
	
	@FindBy(xpath = "//div[@class= 'menu-icon  closed']")
	private WebElement sideMenu;
	
	@FindBy(xpath = "//span[text() = 'Masters']")
	private WebElement masterButton;
	
	@FindBy(xpath = "//span[text() = 'FG Master']")
	private WebElement fgMasterButton;
	
	@FindBy(xpath = "//span[text() = 'SKU Master']")
	private WebElement skuMaster;
	
	@FindBy(xpath = "//span[text() = 'Source Master']")
	private WebElement sourceMaster;
	
	@FindBy(xpath = "//span[text() = 'Destination Store Master']")
	private WebElement destinationStoreMaster;
	
	@FindBy(xpath = "//span[text() = 'Source Destination Mapping']")
	private WebElement sourceDestinationMapping;
	
	@FindBy(xpath = "//span[text() = 'Masters & Demand Plan']")
	private WebElement mastersDemandPlan;
	
	@FindBy(xpath = "//span[text() = 'Calendar Master']")
	private WebElement calendarMaster;
	
	@FindBy(xpath = "//span[text() = 'Batch Master']")
	private WebElement batchMaster;
	
	@FindBy(xpath = "//span[text() = 'Pincode Mapping']")
	private WebElement pincodeMapping;
	
	@FindBy(xpath = "//span[text() = 'PM Master']")
	private WebElement pmMasterButton;
	
	@FindBy(xpath = "//span[text() = 'PM Sku Master']")
	private WebElement pmSkuMaster;
	
	@FindBy(xpath = "//span[text() = 'Conversion Metric']")
	private WebElement conversionMetric;
	
	@FindBy(xpath = "//span[text() = 'PM FG Mapping']")
	private WebElement pmFgMapping;

	public WebElement getSideMenu() {
		return sideMenu;
	}

	public void setSideMenu(WebElement sideMenu) {
		this.sideMenu = sideMenu;
	}

	public WebElement getMasterButton() {
		return masterButton;
	}

	public void setMasterButton(WebElement masterButton) {
		this.masterButton = masterButton;
	}

	public WebElement getFgMasterButton() {
		return fgMasterButton;
	}

	public void setFgMasterButton(WebElement fgMasterButton) {
		this.fgMasterButton = fgMasterButton;
	}

	public WebElement getSkuMaster() {
		return skuMaster;
	}

	public void setSkuMaster(WebElement skuMaster) {
		this.skuMaster = skuMaster;
	}

	public WebElement getSourceMaster() {
		return sourceMaster;
	}

	public void setSourceMaster(WebElement sourceMaster) {
		this.sourceMaster = sourceMaster;
	}

	public WebElement getDestinationStoreMaster() {
		return destinationStoreMaster;
	}

	public void setDestinationStoreMaster(WebElement destinationStoreMaster) {
		this.destinationStoreMaster = destinationStoreMaster;
	}

	public WebElement getSourceDestinationMapping() {
		return sourceDestinationMapping;
	}

	public void setSourceDestinationMapping(WebElement sourceDestinationMapping) {
		this.sourceDestinationMapping = sourceDestinationMapping;
	}

	public WebElement getMastersDemandPlan() {
		return mastersDemandPlan;
	}

	public void setMastersDemandPlan(WebElement mastersDemandPlan) {
		this.mastersDemandPlan = mastersDemandPlan;
	}

	public WebElement getCalendarMaster() {
		return calendarMaster;
	}

	public void setCalendarMaster(WebElement calendarMaster) {
		this.calendarMaster = calendarMaster;
	}

	public WebElement getBatchMaster() {
		return batchMaster;
	}

	public void setBatchMaster(WebElement batchMaster) {
		this.batchMaster = batchMaster;
	}

	public WebElement getPincodeMapping() {
		return pincodeMapping;
	}

	public void setPincodeMapping(WebElement pincodeMapping) {
		this.pincodeMapping = pincodeMapping;
	}

	public WebElement getPmMasterButton() {
		return pmMasterButton;
	}

	public void setPmMasterButton(WebElement pmMasterButton) {
		this.pmMasterButton = pmMasterButton;
	}

	public WebElement getPmSkuMaster() {
		return pmSkuMaster;
	}

	public void setPmSkuMaster(WebElement pmSkuMaster) {
		this.pmSkuMaster = pmSkuMaster;
	}

	public WebElement getConversionMetric() {
		return conversionMetric;
	}

	public void setConversionMetric(WebElement conversionMetric) {
		this.conversionMetric = conversionMetric;
	}

	public WebElement getPmFgMapping() {
		return pmFgMapping;
	}

	public void setPmFgMapping(WebElement pmFgMapping) {
		this.pmFgMapping = pmFgMapping;
	}
	
	
}
