package KidsDress;

import org.testng.annotations.Test;

import com.ObjectRepository.CategoriesPage;
import com.ObjectRepository.FilterAndSortPage;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.KidsClothSize;
import com.ObjectRepository.KidsProducts;

import GenericUtilities.BaseClass;

public class HAndMFlow3 extends BaseClass{

	@Test
	public void script() throws Throwable
	{
		
		gutil.scroll("India/English");
		
		HomePage homepage = new HomePage(driver);
		homepage.clickNothanksBtn();
		homepage.clickHamburgerBtn();
		
		CategoriesPage categoriespage = new CategoriesPage(driver);
		categoriespage.clickKids();
		
		KidsProducts kidsproducts = new KidsProducts(driver);
		kidsproducts.clickOnOptions();
		kidsproducts.selectJackets();
		kidsproducts.clickOnFilterBtn();
		
		FilterAndSortPage filterAndSortPage = new FilterAndSortPage(driver);
		filterAndSortPage.clickOnSize();
		
		KidsClothSize kidsClothSize = new KidsClothSize(driver);
		kidsClothSize.selectSeven_year();
		kidsClothSize.selectEight_year();
		kidsClothSize.clickOnApplyFilters();
		System.out.println(kidsClothSize.fetchFilterted_Count());
	
	}
}
