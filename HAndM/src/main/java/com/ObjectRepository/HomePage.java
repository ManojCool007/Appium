package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {

	@FindBy(id = "android:id/button2")
	private WebElement NothanksBtn;
	
	@FindBy(id = "android:id/button1")
	private WebElement notifyBtn;
	
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id=\"com.hm.goe:id/hm_toolbar\"]/android.widget.ImageButton")
	private WebElement HamburgerBtn;
	
	@FindBy(id = "com.hm.goe:id/action_search_button")
	private WebElement search;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"My Account\"]")
	private WebElement myAccount;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"My Favourites\"]")
	private WebElement myFavourites;

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Your Shopping Bag\"]")
	private WebElement shoppingBagBtn;
	
	public HomePage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getHamburgerBtn() {
		return HamburgerBtn;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getMyFavourites() {
		return myFavourites;
	}

	public WebElement getShoppingBagBtn() {
		return shoppingBagBtn;
	}
	
	public void clickHamburgerBtn()
	{
		HamburgerBtn.click();
	}
	
	public void clicksearch()
	{
		search.click();
	}
	
	public void clickmyFavourites()
	{
		myFavourites.click();
	}
	
	public void clickshoppingBagBtn()
	{
		shoppingBagBtn.click();
	}

	public WebElement getNothanksBtn() {
		return NothanksBtn;
	}

	public void clickNothanksBtn()
	{
		NothanksBtn.click();
	}

	public WebElement getNotifyBtn() {
		return notifyBtn;
	}

	public void clickNotifyBtn() {
		notifyBtn.click();
	}
	
	
	
}
