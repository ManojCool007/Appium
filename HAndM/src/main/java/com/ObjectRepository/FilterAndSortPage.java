package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class FilterAndSortPage {

	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.hm.goe:id/sdpFilterName\" and @text=\"Size\"]")
	private WebElement size;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.hm.goe:id/sdpFilterName\" and @text=\"Colour\"]")
	private WebElement colour;
	
	public FilterAndSortPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSize() {
		return size;
	}

	public void clickOnSize() {
		size.click();
	}

	public WebElement getColour() {
		return colour;
	}

	public void clickOnColour() {
		colour.click();
	}
	
	
}
