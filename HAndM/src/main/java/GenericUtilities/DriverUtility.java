package GenericUtilities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.ScreenOrientation;

import io.appium.java_client.android.AndroidDriver;

public class DriverUtility {

	public AndroidDriver driver;
	
	public  DriverUtility(AndroidDriver driver)
	{
		this.driver = driver;
	}
	
	public void deviceLocked()
	{
		driver.isDeviceLocked();
	}
	
	public void installApp(String path)
	{
		driver.installApp(path);
	}
	
	public void verifyApp(String packageName)
	{
		driver.isAppInstalled(packageName);
	}
	
	public void openNotification()
	{
		driver.openNotifications();
	}
	
	public void activateApp(String packageName)
	{
		driver.activateApp(packageName);
	}
	
	public void runInBackground(int sec)
	{
		driver.runAppInBackground(Duration.ofSeconds(sec));
	}
	
	public void appState(String packageName)
	{
		driver.queryAppState(packageName);
	}
	
	public void hideKeyBoard()
	{
		driver.hideKeyboard();
	}
	
	public void appCurrentActivity()
	{
		driver.currentActivity();
	}
	
	public void orientationLandscape()
	{
		ScreenOrientation screen = driver.getOrientation();
		driver.rotate(screen.LANDSCAPE);
	}
	
	public void orientationPortrait()
	{
		ScreenOrientation screen = driver.getOrientation();
		driver.rotate(screen.PORTRAIT);
	}
	
	public void contextHandles(String packageName)
	{
		Set<String> context = driver.getContextHandles();
		System.out.println(context.size());
		for(String ch : context)
		{
			driver.context("WEBVIEW_"+packageName+"");
		}
	}
	
	public void uninstallApp(String packageName)
	{
		driver.removeApp(packageName);
	}
}
