package GenericUtilities;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	
	public AppiumDriverLocalService server;
	public FileUtility futil = new FileUtility();
	public AndroidDriver driver;
	public DriverUtility dutil;
	public GestureUtility gutil;
	
	@BeforeSuite
	public void launchServer()
	{
		File f = new File("C:\\Users\\Dell\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		
		server = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).
		withTimeout(Duration.ofSeconds(300)).build();
		
		server.start();
	}
	
	@BeforeClass
	public void launchAppAndLogin() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		String platform = futil.file("platformName");
		String automation = futil.file("automationName");
		String device = futil.file("deviceName");
		String UDID = futil.file("UDID");
		String UnlockType = futil.file("unlockType");
		String UnlockKey = futil.file("unlockKey");
		
		String appPackage = futil.file("appPackage");
		String appActivity = futil.file("appActivity");
		
		dc.setCapability("platformName", platform);
		dc.setCapability("automationName", automation);
		dc.setCapability("deviceName", device);
		dc.setCapability("UDID", UDID);
		dc.setCapability("unlockType", UnlockType);
		dc.setCapability("unlockKey", UnlockKey);
		
		dc.setCapability("appPackage", appPackage);
		dc.setCapability("appActivity", appActivity);
		
		URL u = new URL(futil.file("localHost"));
		driver = new AndroidDriver(u, dc);
		
		dutil = new DriverUtility(driver);
		gutil = new GestureUtility(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	@AfterClass
	public void closeApp()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void stopServer()
	{
		server.close();
	}
	
	
}
