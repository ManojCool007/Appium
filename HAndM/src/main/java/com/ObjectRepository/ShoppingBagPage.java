package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ShoppingBagPage {
	
	@FindBy(xpath = "(//android.widget.TextView[@text=\"Rs. 399.00\"])[1]")
	private WebElement shirtcost;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Quantity1\"]")
	private WebElement quantitydrop;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"4\"]")
	private WebElement quantity;
	
	@FindBy(xpath = "(//android.widget.TextView[@text=\"Rs. 1,596.00\"])[1]")
	private WebElement cost;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"DryMove™ Mid layer jacket\"]")
	private WebElement jacket_name;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Remove\"]")
	private WebElement remove;
	
	public ShoppingBagPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getQuantitydrop() {
		return quantitydrop;
	}

	public void clickQuantitydrop() {
		quantitydrop.click();
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public void clickQuantity() {
		quantity.click();
		
	}

	public WebElement getCost() {
		return cost;
	}

	public String Cost() {
		String Act_cost = cost.getText();
		return Act_cost;
	}

	public WebElement getShirtcost() {
		return shirtcost;
	}
	
	public String fetchShirtCost()
	{
		String shcost = shirtcost.getText();
		return shcost;
	}

	public WebElement getJacket_name() {
		return jacket_name;
	}

	public String fetchJacket_name() {
		String JacketName = jacket_name.getText();
		return JacketName;
	}

	public WebElement getRemove() {
		return remove;
	}

	public void clickOnRemove() {
		remove.click();
	}
	
	
}
