package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoworkshop.qa.TestBase;
public class DemoWorkShop_Digital_Downloads_Page extends TestBase{
	public static final Logger log = Logger.getLogger(DemoWorkShop_Digital_Downloads_Page.class.getName());
	
	//click Digital_Downloads_Link page E1
	@FindBy(xpath= "//ul[@class='top-menu']//a[contains(text(),'Digital downloads')]")
	WebElement Digital_Downloads;
		
	//verify Digital_Downloads_link page E2
	@FindBy(xpath = "//h1[contains(text(),'Digital downloads')]")
	WebElement Verify_Digital_Downloads_Page;
		
	@FindBy(id="products-orderby")//e3
	WebElement Select_Products_Sort_By;
		
	@FindBy(id="products-pagesize")//e4
	WebElement Select_Display_products_PageSize;

	@FindBy(id="products-viewmode")//e5
	WebElement Select_View_As_Products;
		
	@FindBy(xpath = "//a[contains(text(),'3rd Album')]")//e6
	WebElement Click_3rd_Album;
		
	@FindBy(id = "addtocart_53_EnteredQuantity")//e7
	WebElement Add_Quantity_3rd_Album;
		
	@FindBy(id = "add-to-cart-button-53")//e8
	WebElement Add_To_Cart_Botton_3rd_Album;
		
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[1]/a/img")//e9
	WebElement Click_Music2_1st_Release;
		
	@FindBy(id = "addtocart_51_EnteredQuantity")//e10
	WebElement Add_Quantity_Music2_1st_Release;
		
	@FindBy(id = "add-to-cart-button-51")//e11
	WebElement Add_To_Cart_Botton_Music2_1st_Release;
		
	@FindBy(xpath = "//div[@class='product-list']//div[3]//div[1]//div[2]//h2[1]//a[1]")//e12
	WebElement Click_Music2_2st_Release;
		
	@FindBy(id = "addtocart_52_EnteredQuantity")//e13
	WebElement Add_Quantity_Music2_2st_Release;
		
	@FindBy(id = "add-to-cart-button-52")//e14
	WebElement Add_To_Cart_Botton_Music2_2st_Release;
		
			
public DemoWorkShop_Digital_Downloads_Page() {
	PageFactory.initElements(driver, this);
		
}
	
public void Digital_Downloads_page(String strDigitalDownloadsExp) {
		
	log("Cliking on Digital Downloads Page Link");
	Digital_Downloads.click(); //E1
		
	log("Verifying the Digital Downloads Page is displayed");
	String strDigitalDownloadsAct = Verify_Digital_Downloads_Page.getAttribute(strDigitalDownloadsExp);//E2
	if(strDigitalDownloadsExp.equalsIgnoreCase(strDigitalDownloadsAct)){
		log("Digital Downloads Page is displayed with expected :" + strDigitalDownloadsExp + " is matched with Actual value : " + strDigitalDownloadsAct);
	}else {
		log("Digital Downloads Page is not displayed with expected :" + strDigitalDownloadsExp + " is not matched with Actual value : " + strDigitalDownloadsAct);
	}	
		
	System.out.println("***************************************");

	}
	
public void Click_3rd_Album_Img() {
		
	log("Selecting product position by it index value  ");
	Select Products_Sort_By = new Select(Select_Products_Sort_By);//e3
	Products_Sort_By.selectByIndex(1);
				
	log("Selecting display size of product");
	Select Display_products = new Select(Select_Display_products_PageSize);
	Display_products.selectByIndex(2);//e4
				
	log("Selecting view of products ");
	Select View_As_Products = new Select(Select_View_As_Products);
	View_As_Products.selectByVisibleText("List");;//e5
					
	log("Selecting 3rd Album  ");
	Click_3rd_Album.click();	//e6
			
	log("Adding Quantity of 3rd Album Book ");
	Add_Quantity_3rd_Album.clear();	//e7
	Add_Quantity_3rd_Album.sendKeys("10");//e7
	Add_To_Cart_Botton_3rd_Album.click();	//e8
			
	log("Navigating back to Digital Downloads page ");
	driver.navigate().back();
		
	System.out.println("***************************************");
	
}
	
public void Click_Music2_1st_Release_Img() {
		
	log("Selecting Music2_1st_Release  ");
	Click_Music2_1st_Release.click();	//e9
			
	log("Adding Quantity of Music2_1st_Release ");
	Add_Quantity_Music2_1st_Release.clear();	//e10
	Add_Quantity_Music2_1st_Release.sendKeys("10");//e10
	Add_To_Cart_Botton_Music2_1st_Release.click();	//e11
			
	log("Navigating back to Digital Downloads page ");
	driver.navigate().back();
		
	System.out.println("***************************************");

}
	
public void Click_Music2_2st_Release_Img() {
		
		
	log("Selecting Music2_1st_Release  ");
	Click_Music2_2st_Release.click();	//e9
			
	log("Adding Quantity of Music2_1st_Release ");
	Add_Quantity_Music2_2st_Release.clear();	//e10
	Add_Quantity_Music2_2st_Release.sendKeys("10");//e10
	Add_To_Cart_Botton_Music2_2st_Release.click();	//e11
			
	System.out.println("***************************************");
	
}
}
