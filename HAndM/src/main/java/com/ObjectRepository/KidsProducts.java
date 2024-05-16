package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class KidsProducts {

	@FindBy(id = "com.hm.goe:id/banner_container_icon")
	private WebElement options;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.hm.goe:id/simple_row_text\" and @text=\"Jackets\"]")
	private WebElement jackets;
	
	@FindBy(id = "com.hm.goe:id/filterSortButton")
	private WebElement filterBtn;
	
	public KidsProducts(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOptions() {
		return options;
	}

	public void clickOnOptions() {
		options.click();
	}

	public WebElement getJackets() {
		return jackets;
	}

	public void selectJackets() {
		jackets.click();
	}

	public WebElement getFilterBtn() {
		return filterBtn;
	}

	public void clickOnFilterBtn() {
		filterBtn.click();
	}
	
}
