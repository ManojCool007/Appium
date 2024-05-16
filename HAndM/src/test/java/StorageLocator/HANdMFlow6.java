package StorageLocator;

import org.testng.annotations.Test;

import com.ObjectRepository.HomePage;
import com.ObjectRepository.StorageLocatorPage;

import GenericUtilities.BaseClass;

public class HANdMFlow6 extends BaseClass{

	@Test
	public void script() throws Throwable
	{
		
		gutil.scroll("India/English");
		
		HomePage homepage = new HomePage(driver);
		homepage.clickNothanksBtn();
		homepage.clickHamburgerBtn();
		
		gutil.scroll("Store Locator");
		
		StorageLocatorPage storageLocatorPage = new StorageLocatorPage(driver);
		storageLocatorPage.viewStorageLocation();
		
		
		
	}
}
