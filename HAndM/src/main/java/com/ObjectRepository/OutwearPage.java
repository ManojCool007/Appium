package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class OutwearPage {

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Saved as favourite\"]")
	private WebElement favourite_shirt;
	
	public OutwearPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFavourite_shirt() {
		return favourite_shirt;
	}

	public void clickFavourite_shirt() {
		favourite_shirt.click();
	}
	
	
}
