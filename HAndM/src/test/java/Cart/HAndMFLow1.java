package Cart;


import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ObjectRepository.HomePage;
import com.ObjectRepository.ProductPage;
import com.ObjectRepository.ShoppingBagPage;
import GenericUtilities.BaseClass;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class HAndMFLow1 extends BaseClass {

	
	@Test
	public void script() throws Throwable
	{	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		gutil.scroll("India/English");
		
		HomePage homepage = new HomePage(driver);
		homepage.clickNothanksBtn();
		homepage.clicksearch();
		
		gutil.clickUsingCoordinate(500, 400);
		
		driver.pressKey(new KeyEvent(AndroidKey.S));
		driver.pressKey(new KeyEvent(AndroidKey.H));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.R));
		driver.pressKey(new KeyEvent(AndroidKey.T));
		driver.pressKey(new KeyEvent(AndroidKey.S));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
		
		String expshirt_name = "Regular Fit T-shirt";
		WebElement shirt_Name = gutil.scrollToElement("Regular Fit T-shirt");
		String actshirt_name = shirt_Name.getText();
		shirt_Name.click();
		assertEquals(expshirt_name, actshirt_name);
		System.out.println("Assertion Successful both shirts name are Same  "+actshirt_name);
		
		ProductPage productpage = new ProductPage(driver);
		productpage.clickProductImage();
		Thread.sleep(1000);
		
		productpage.zoomInOut(gutil, driver);
		
//		WebElement productImage = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Product Image\"]"));
//		gutil.pinchOpen(productImage, 0.75);
//		gutil.pinchClose(productImage, 0.75);
//		gutil.swipeUsingId(productImage, "left", 0.75);
		/*
		WebElement shirts = productpage.getProductImage();
	
		gutil.pinchOpen(shirts, 0.75);
		Thread.sleep(2000);
		
		gutil.pinchClose(shirts, 0.75);
		Thread.sleep(2000);
		
		gutil.swipeUsingId(shirts, "left", 0.75);
		Thread.sleep(1000);
		*/
		
		driver.navigate().back();
		
		productpage.clickAddBtn();
		
		productpage.clickShirt();
		
		if(productpage.getLargeSize().isDisplayed())
		{
			productpage.clickLargeSize();
		}
		
		else if (productpage.getMediumSize().isDisplayed()) 
		{
			productpage.clickMediumSize();
		}
		else 
		{
			productpage.clickSmallSize();
		}
		
		productpage.clickAddButtn();
		Thread.sleep(2000);
		productpage.clickProductcount();
		
		ShoppingBagPage shoppingBagpage = new ShoppingBagPage(driver);
		String cost = shoppingBagpage.fetchShirtCost();
		
		String amount = cost;
		String[] splitted = amount.split(" ");
		String price = null;
		for(int i = 1; i < splitted.length;i++)
		{
			price = splitted[i];
			
		}
		
		shoppingBagpage.clickQuantitydrop();
		String quantity_count = shoppingBagpage.getQuantity().getText();
		Thread.sleep(2000);
		shoppingBagpage.clickQuantity();
		
		double act_price = Double.parseDouble(price);
		System.out.println("actual price of shirt : "+act_price);
		double quan_count = Double.parseDouble(quantity_count);
		System.out.println("Quantity : " +quan_count);
		
		double finalprice = act_price * quan_count;
		System.out.println("Final Price :"+finalprice);
		
		String total_price = shoppingBagpage.getCost().getText();
	
		System.out.println("Total Price of all Shirts: "+total_price);
		String[] spl = total_price.split(" ");
		String start_price = null;
		for(int j = 1; j < spl.length; j++)
		{
			String tot_price = spl[j];
			start_price = tot_price.replace(",", "");
		}
		
		double expprice = Double.parseDouble(start_price);
		assertEquals(expprice, finalprice);
		System.out.println("Assertion of both expected and actual final prices is Successful "+finalprice);	
	}
}
