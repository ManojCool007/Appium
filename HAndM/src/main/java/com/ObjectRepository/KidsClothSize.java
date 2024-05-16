package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class KidsClothSize {

	@FindBy(xpath = "//android.widget.CheckBox[@content-desc=\"plp_filters_size_checkbox\" and @text=\"7y\"]")
	private WebElement seven_year;
	
	@FindBy(xpath = "//android.widget.CheckBox[@content-desc=\"plp_filters_size_checkbox\" and @text=\"8y\"]")
	private WebElement eight_year;
	
	@FindBy(id = "com.hm.goe:id/applyFilters")
	private WebElement applyFilters;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.hm.goe:id/totItems\"]")
	private WebElement count;
	
	public KidsClothSize(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSeven_year() {
		return seven_year;
	}

	public void selectSeven_year() {
		seven_year.click();
	}

	public WebElement getEight_year() {
		return eight_year;
	}

	public void selectEight_year() {
		eight_year.click();
	}

	public WebElement getApplyFilters() {
		return applyFilters;
	}

	public void clickOnApplyFilters() {
		applyFilters.click();
	}

	public WebElement getFilterted_Count() {
		return count;
	}

	public String fetchFilterted_Count() {
		String filterted_Count = count.getText();
		return filterted_Count;
	}
	
	
	
}
