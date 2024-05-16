package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class MyFavouritesPage {
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.hm.goe:id/articleName\"]")
	private WebElement wish_shirt;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Add this product to your cart and remove it from favorites.\"]")
	private WebElement AddBtn;
	
	@FindBy(xpath = "(//android.widget.LinearLayout[@resource-id=\"com.hm.goe:id/product_size_root\"])[4]")
	private WebElement large_size;
	
	public MyFavouritesPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getWish_shirt() {
		return wish_shirt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}

	public void clickOnAddBtn() {
		AddBtn.click();
	}

	public WebElement getLarge_size() {
		return large_size;
	}

	public void selectLarge_size() {
		large_size.click();
	}

	
	
	
}

