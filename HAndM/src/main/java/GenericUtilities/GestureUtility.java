package GenericUtilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class GestureUtility {

	public AndroidDriver driver;
	public  GestureUtility(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickUsingId(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId()));
	}
	
	public void clickUsingCoordinate(int x, int y)
	{
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
				"x", x, "y", y));
	}
	
	public void longClick(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId(),
				"duration", 2000));
	}
	
	public void doubleClick(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId()));
	}
	
	public void pinchOpen(WebElement element, Double percent)
	{
		((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),
				 "percent", percent));
	}
	
	public void pinchClose(WebElement element, Double percent)
	{
		((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),
				 "percent", percent));
	}
	
	public void scroll(String text)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));")).click();
	}
	
	public WebElement scrollToElement(String text)
	{
		WebElement ele = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
		return ele;
	}
	
	public void swipeUsingCoordinate(int left, int top, int width, int height, String direction, Double percent)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"left", left, "top", top, "width", width, "height", height,
				"direction", direction,
				"percent", percent));
	}
	
	public void swipeUsingId(WebElement element, String direction, Double percent)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),
				"direction", direction, "percent", percent));
	}
	
	public void dragAndDrop(WebElement element, int endX, int endY)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId",  ((RemoteWebElement) element).getId(),
				"endX", endX,
				"endY", endY));
	}
	
}
