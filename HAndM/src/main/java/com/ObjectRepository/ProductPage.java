package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.GestureUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ProductPage {
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Product Image\"]")
	private WebElement productImage;
	
	@FindBy(id = "com.hm.goe:id/stickyAtbButton")
	private WebElement addBtn;
	
	@FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.hm.goe:id/pdp_color_selected\"])[4]")
	private WebElement shirt;
	
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id=\"com.hm.goe:id/brokenOutSizeSelector\"]/android.view.View/android.view.View[2]//android.view.ViewGroup[@resource-id=\\\"com.hm.goe:id/brokenOutSizeSelector\\\"]/android.view.View/android.view.View[2]")
	private WebElement smallSize;
	
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id=\"com.hm.goe:id/brokenOutSizeSelector\"]/android.view.View/android.view.View[3]")
	private WebElement mediumSize;
	
	@FindBy(xpath = "//android.view.ViewGroup[@resource-id=\"com.hm.goe:id/brokenOutSizeSelector\"]/android.view.View/android.view.View[4]")
	private WebElement largeSize;
	
	@FindBy(className = "android.widget.Button")
	private WebElement addButtn;
	
	@FindBy(id =  "com.hm.goe:id/hm_shoppingbag_count")
	private WebElement productcount;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.hm.goe:id/heartButtonContainer\"]/android.widget.ImageView")
	private WebElement like;
	
	public WebElement getLike() {
		return like;
	}

	public void clickLike() {
		like.click();
	}

	public ProductPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductImage() {
		return productImage;
	}

	public void clickProductImage() {
		productImage.click();
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public void clickAddBtn() {
		addBtn.click();
	}

	public WebElement getShirt() {
		return shirt;
	}

	public void clickShirt() {
		shirt.click();
	}

	public WebElement getSmallSize() {
		return smallSize;
	}

	public void clickSmallSize() {
		smallSize.click();
	}

	public WebElement getMediumSize() {
		return mediumSize;
	}

	public void clickMediumSize() {
		mediumSize.click();
	}

	public WebElement getLargeSize() {
		return largeSize;
	}

	public void clickLargeSize() {
		largeSize.click();
	}

	public WebElement getAddButtn() {
		return addButtn;
	}

	public void clickAddButtn() {
		addButtn.click();
	}

	public WebElement getProductcount() {
		return productcount;
	}

	public void clickProductcount() {
		productcount.click();
	}
	
	public void zoomInOut(GestureUtility gutil,AndroidDriver driver)
	{
		productImage = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Product Image\"]"));
		gutil.pinchOpen(productImage, 0.75);
		gutil.pinchClose(productImage, 0.75);
		gutil.swipeUsingId(productImage, "left", 0.75);
	}
	
}

