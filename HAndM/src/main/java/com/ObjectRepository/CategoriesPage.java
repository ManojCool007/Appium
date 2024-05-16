package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CategoriesPage {

	@FindBy(xpath = "//android.widget.TextView[@text=\"Ladies\"]")
	private WebElement ladies;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Men\"]")
	private WebElement men;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Baby\"]")
	private WebElement baby;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Kids\"]")
	private WebElement kids;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"H&M HOME\"]")
	private WebElement hmHome;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Sport\"]")
	private WebElement sport;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Sale\"]")
	private WebElement sale;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Sustainability\"]")
	private WebElement sustainability;
	
	@FindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[9]/android.widget.Button")
	private WebElement inbox;
	
	public CategoriesPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLadies() {
		return ladies;
	}

	public void clickLadies() {
		ladies.click();
	}

	public WebElement getMen() {
		return men;
	}

	public void clickMen() {
		men.click();
	}

	public WebElement getBaby() {
		return baby;
	}

	public void clickBaby() {
		baby.click();
	}

	public WebElement getKids() {
		return kids;
	}

	public void clickKids() {
		kids.click();
	}

	public WebElement getHmHome() {
		return hmHome;
	}

	public void clickHmHome() {
		hmHome.click();
	}

	public WebElement getSport() {
		return sport;
	}

	public void clickSport() {
		sport.click();
	}

	public WebElement getSale() {
		return sale;
	}

	public void clickSale() {
		sale.click();
	}

	public WebElement getSustainability() {
		return sustainability;
	}

	public void clickSustainability() {
		sustainability.click();
	}

	public WebElement getInbox() {
		return inbox;
	}

	public void clickInbox() {
		inbox.click();;
	}

	
	
}
