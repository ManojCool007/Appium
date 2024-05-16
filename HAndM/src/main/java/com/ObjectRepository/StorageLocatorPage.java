package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class StorageLocatorPage {

	@FindBy(id = "com.hm.goe:id/storeLocatorActionButton")
	private WebElement mapicon;
	
	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement allowBtn;
	
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.hm.goe:id/store_list_store_arrow\"])[1]")
	private WebElement drop;
	
	@FindBy(id = "com.hm.goe:id/store_list_expand_directions_button")
	private WebElement viewDirection;
	
	public StorageLocatorPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getMapicon() {
		return mapicon;
	}

	public void clickOnMapicon() {
		mapicon.click();
	}

	public WebElement getAlloBtn() {
		return allowBtn;
	}

	public void clickOnAllowBtn() {
		allowBtn.click();
	}

	public WebElement getDrop() {
		return drop;
	}

	public WebElement getViewDirection() {
		return viewDirection;
	}
	
	public void viewStorageLocation()
	{
		mapicon.click();
		allowBtn.click();
		drop.click();
		viewDirection.click();
	}
	
	
		
}
