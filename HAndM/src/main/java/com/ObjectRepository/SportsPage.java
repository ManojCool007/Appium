package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SportsPage {

	@FindBy(xpath = "//android.widget.ExpandableListView/android.view.ViewGroup[8]")
	private WebElement outwear;
	
	@FindBy(xpath = "//android.widget.ExpandableListView/android.view.ViewGroup[9]")
	private WebElement accessories;
	
	public SportsPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOutwear() {
		return outwear;
	}

	public void clickOutwear() {
		outwear.click();
	}

	public WebElement getAccessories() {
		return accessories;
	}

	public void clickAccessories() {
		accessories.click();
	}
	
	
}
