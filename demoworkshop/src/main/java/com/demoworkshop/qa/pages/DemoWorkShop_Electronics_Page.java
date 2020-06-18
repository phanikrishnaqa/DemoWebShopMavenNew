package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoworkshop.qa.TestBase;
public class DemoWorkShop_Electronics_Page extends TestBase{
	public static final Logger log = Logger.getLogger(DemoWorkShop_Electronics_Page.class.getName());
	
	//click electronics link E1
	@FindBy(xpath= "//ul[@class='top-menu']//a[contains(text(),'Electronics')]")
	WebElement Electronics;
	
	//verify electronics page E2
	@FindBy(xpath = "//h1[contains(text(),'Electronics')]")
	WebElement Verify_Electrons_Page;
	
	//click on camera and photos image E3
	@FindBy(xpath = "// img [@ alt = 'Picture for category Camera, photo']")
	WebElement Camera_photo;
	
	//verify camera and photos page E4
	@FindBy(xpath = "//h1[contains(text(),'Camera, photo')]")
	WebElement Verify_Camera_photo_Page;
	
	@FindBy(id="products-orderby")//e5
	WebElement Select_Products_Sort_By;
	
	@FindBy(id="products-pagesize")//e6
	WebElement Select_Display_products_PageSize;

	@FindBy(id="products-viewmode")//e7
	WebElement Select_View_As_Products;
	
	//getting text of 1mp camera E8
	@FindBy(xpath = "//a[contains(text(),'1MP 60GB Hard Drive Handycam Camcorder')]")
	WebElement ONE_MP_60GB_Hard_DriveHandycam_Camcorder;
	
	//getting text of Camcorder E9
	@FindBy(linkText  = "Camcorder")
	WebElement Camcorder_Camera;	
	
	//getting text of Digital SLR Camera 12.2 MPixel E10
	@FindBy(linkText = "Digital SLR Camera 12.2 Mpixel")
	WebElement Digital_SLR_Camera;
	
	//getting text of High Definition 3D Camcorder E11
	@FindBy(linkText = "High Definition 3D Camcorder")
	WebElement High_Definition_3D_Camcorder_Camera;
	
	//click on Cell phones image E12
	@FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Cell phones')]")
	WebElement Cell_Phones_Img;
			
	//Verify cell phones page E13
	@FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
	WebElement Verify_Cell_Phones_Page;
	
	//click on phone cover image E14
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")
	WebElement Click_Phone_Cover_Img;
	
	//Selecting product manufacturer by visible text E15
	@FindBy(id="product_attribute_80_2_37")
	WebElement Select_product_manufacturer_By;
	
	//Selecting product by visible text E16
	@FindBy(id="product_attribute_80_1_38")
	WebElement Select_product_Color_By;	
	
	//click on used phone cover add to cart button E17
	@FindBy(id = "addtocart_80_EnteredQuantity")
	WebElement Add_Quantity_Phone_Cover;
	
	//click on used phone cover add to cart button E18
	@FindBy(id = "add-to-cart-button-80")
	WebElement Click_Phone_Cover_Add_To_cart_button;
	
	//click on Smartphone image E19
	@FindBy(xpath = "//a[contains(text(),'Smartphone')]")
	WebElement Smartphone_Img;
	
	//Add Quantity Smartphone E20
	@FindBy(id = "addtocart_43_EnteredQuantity")
	WebElement Add_Smartphone_Quantity;

	//click on Smart phone image E21
	@FindBy(id = "add-to-cart-button-43")
	WebElement Click_SmartPhone_Add_To_cart_button;
	
	//click on used phone image E22
	@FindBy(xpath = "//a[contains(text(),'Used phone')]")
	WebElement Used_Phone_Img;
			
	//Add Quantity used phone E23
	@FindBy(id = "addtocart_15_EnteredQuantity")
	WebElement Add_Used_Phone_Quantity;
			
	//click on used phone add to cart button E24
	@FindBy(id = "add-to-cart-button-15")
	WebElement Click_Used_Phone_Add_To_cart_button;

				
public DemoWorkShop_Electronics_Page() {
	PageFactory.initElements(driver, this);
}

public void Click_Electronics_page(String strElectronicsExp) {
	
	log("Cliking on Electronics Link");
	Electronics.click(); //E1
	
	log("Verifying the Electronics page is displayed");
	String strElectronicsAct = Verify_Electrons_Page.getText();//E2
	if(strElectronicsExp.equalsIgnoreCase(strElectronicsAct)){
		log("Electronics page is displayed with expected :" + strElectronicsExp + " is matched with Actual value : " + strElectronicsAct);
	}else {
		log("Electronics page is not displayed with expected :" + strElectronicsExp + " is not matched with Actual value : " + strElectronicsAct);
	}	
	
	log("Cliking on Camera and Photos Link in Electronics");
	
	System.out.println("***************************************");	
}
	
public void Click_Camera_Photo_page(String strCameraPhotosExp) {	
	Camera_photo.click(); //E3
	
	log("Verifying the Camera and Photos page is displayed");
	String strCameraPhotoAct = Verify_Camera_photo_Page.getText(); //E4
	if(strCameraPhotosExp.equalsIgnoreCase(strCameraPhotoAct)){
		log("Camera Phone page is displayed with expected :" + strCameraPhotosExp + " is matched with Actual value : " + strCameraPhotoAct);
	}else {
		log("Camera Phone page is not displayed with expected :" + strCameraPhotosExp + " is not matched with Actual value : " + strCameraPhotoAct);
	}
	
	log("Selecting product position by it index value  ");
	Select Products_Sort_By = new Select(Select_Products_Sort_By);//e5
	Products_Sort_By.selectByIndex(1);
									
	log("Selecting display size of product");
	Select Display_products = new Select(Select_Display_products_PageSize);//6
	Display_products.selectByIndex(2);
									
	log("Selecting view of products ");
	Select View_As_Products = new Select(Select_View_As_Products);//7
	View_As_Products.selectByVisibleText("List");;
	
	log("Clicking on ONE_MP_60GB_Hard_DriveHandycam_Camcorder in Electronics");
	System.out.println(ONE_MP_60GB_Hard_DriveHandycam_Camcorder.getText()); //E8
	
	System.out.println("***************************************");	
	
	log("Clicking on Camcorder_Camera in Electronics");
	System.out.println(Camcorder_Camera.getText()); //E9
	
	System.out.println("***************************************");	
	
	log("Clicking on Digital_SLR_Camera in Electronics");
	System.out.println(Digital_SLR_Camera.getText()); //E10
	
	System.out.println("***************************************");	
	
	log("Clicking on High_Definition_3D_Camcorder_Camera in Electronics");
	System.out.println(High_Definition_3D_Camcorder_Camera.getText());//E11
	
	System.out.println("***************************************");
	
	log("Navigating back to Cell phones page ");
	driver.navigate().back();
	
	System.out.println("***************************************");	
	
}	

public void Click_Cell_Phones_page(String strCellPhonesExp) {	
	
	
	log("Cliking on Electronics Link");
	Electronics.click(); //E1
	
	log("Clicking on Cell Phone Img in Electronics");
	Cell_Phones_Img.click(); //E12
		
	log("Verifying the Cell Phone page is displayed");
	String strCellPhonesAct = Verify_Cell_Phones_Page.getText(); //E13
	if(strCellPhonesExp.equalsIgnoreCase(strCellPhonesAct)){
		log("Cell Phone page is displayed with expected :" + strCellPhonesExp + " is matched with Actual value : " + strCellPhonesAct);
	}else {
		log("Cell Phone page is not displayed with expected :" + strCellPhonesExp + " is not matched with Actual value : " + strCellPhonesAct);
	}
	
	System.out.println("***************************************");	
}

public void Click_Cell_Phones_Cover_Page() {
	
	log("Selecting product position by it index value  ");
	Select Products_Sort_By = new Select(Select_Products_Sort_By);//e5
	Products_Sort_By.selectByIndex(1);
											
	log("Selecting display size of product");
	Select Display_products = new Select(Select_Display_products_PageSize);//6
	Display_products.selectByIndex(2);
											
	log("Selecting view of products ");
	Select View_As_Products = new Select(Select_View_As_Products);//7
	View_As_Products.selectByVisibleText("List");;
			
			
	log("Selecting phone cover ");
	Click_Phone_Cover_Img.click();//E14
	
	log("Selecting product manufacturer by Index  ");
	Select Manufacturer = new Select(Select_product_manufacturer_By);//e15
	Manufacturer.selectByIndex(1);
											
	log("Selecting product color by Index");
	Select Products_Color = new Select(Select_product_Color_By);//e16
	Products_Color.selectByIndex(2);
	
	log("Adding Quantity of Phone Cover");
	Add_Quantity_Phone_Cover.clear();//E17
	Add_Quantity_Phone_Cover.sendKeys("10");//E17
	Click_Phone_Cover_Add_To_cart_button.click();//E18
	
	log("Navigating back to Cell phones page ");
	driver.navigate().back();
	System.out.println("***************************************");
	
}	

public void Click_SmartPhone_Page() {
	
	log("Selecting Smart phone page ");
	Smartphone_Img.click();//E19
			
	log("Adding Quantity of Smart phone ");
	Add_Smartphone_Quantity.clear();//E20
	Add_Smartphone_Quantity.sendKeys("10");//E20
	Click_SmartPhone_Add_To_cart_button.click();//E21
			
	log("Navigating back to Cell phones page ");
	driver.navigate().back();
	
	System.out.println("***************************************");
	
}	
	
public void Used_Phones_Page() {
	
	log("Selecting Smart phone ");
	Used_Phone_Img.click();//E22
			
	log("Adding Quantity of used phone ");
	Add_Used_Phone_Quantity.clear();//E23
	Add_Used_Phone_Quantity.sendKeys("10");//E23
	Click_Used_Phone_Add_To_cart_button.click();//E24
			
	System.out.println("***************************************");
	
}
}
