package Wishlist;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ObjectRepository.CategoriesPage;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.MyFavouritesPage;
import com.ObjectRepository.ProductPage;
import com.ObjectRepository.SportsPage;

import GenericUtilities.BaseClass;

public class HAndMFlow2 extends BaseClass {

	@Test
	public void script() throws Throwable
	{
		
		gutil.scroll("India/English");
		
		HomePage homepage = new HomePage(driver);
		homepage.clickNothanksBtn();
		homepage.clickHamburgerBtn();
		
		CategoriesPage categoriespage = new CategoriesPage(driver);
		categoriespage.clickSport();
		
		gutil.scrollToElement("Sale");
		gutil.scroll("Men");
		
		SportsPage sportspage = new SportsPage(driver);
		sportspage.clickOutwear();
		
		WebElement jacket = gutil.scrollToElement("DryMove™ Mid layer jacket");
		String expJacketName = jacket.getText();
		System.out.println("Jacket Name is : "+expJacketName);
		jacket.click();
		
		ProductPage productpage = new ProductPage(driver);
		productpage.clickLike();
		
		driver.navigate().back();
		
		homepage.clickmyFavourites();
		
		MyFavouritesPage myfavouritespage = new MyFavouritesPage(driver);
		
		String actJacketName = myfavouritespage.getWish_shirt().getText();
		assertEquals(expJacketName, actJacketName);
		System.out.println("Jacket is successfully added to Wishlist : "+actJacketName);
		
		server.close();
	}
}
