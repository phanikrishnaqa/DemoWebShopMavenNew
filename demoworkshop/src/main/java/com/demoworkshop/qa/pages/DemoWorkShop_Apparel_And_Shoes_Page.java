package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoworkshop.qa.TestBase;

public class DemoWorkShop_Apparel_And_Shoes_Page extends TestBase{
	
	public static final Logger log = Logger.getLogger(DemoWorkShop_Apparel_And_Shoes_Page.class.getName());
	
	
	@FindBy(xpath ="//ul[@class='top-menu']//a[contains(text(),'Apparel & Shoes')]")//e1
	WebElement Apparel_And_Shoes_Link;
	
	@FindBy(xpath ="//h1[contains(text(),'Apparel & Shoes')]")//e2
	WebElement Verify_Apparel_And_Shoes_Page;
	
	@FindBy(id="products-orderby")//e3
	WebElement Select_Products_Sort_By;

	@FindBy(id="products-pagesize")//e4
	WebElement Select_Display_products_PageSize;

	@FindBy(id="products-viewmode")//e5
	WebElement Select_View_As_Products;
	
	@FindBy(xpath ="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/img") //e6
	WebElement Rockabilly_Polka_Dot_Top_JR_Plus_Size;
	
	@FindBy(id = "product_attribute_5_7_1")//e7
	WebElement Rockabilly_Polka_Dot_Top_JR_Plus_Size_By_Size;

	@FindBy(id = "addtocart_5_EnteredQuantity")//e8
	WebElement Add_Quantity_Rockabilly_Polka_Dot_Top_JR_Plus_Size;
	
	@FindBy(id = "add-to-cart-button-5")//e9
	WebElement Add_To_Cart_Botton_Rockabilly_Polka_Dot_Top_JR_Plus_Size;

	@FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Blue and green Sneaker')]")//e10
	WebElement Blue_and_green_Sneaker;
	
	@FindBy(id = "product_attribute_28_7_10")//e11
	WebElement Blue_and_green_Sneaker_By_Size;

	@FindBy(id = "addtocart_28_EnteredQuantity")//e12
	WebElement Add_Quantity_Blue_and_green_Sneaker;

	@FindBy(id = "add-to-cart-button-28")//e13
	WebElement Add_To_Cart_Botton_Blue_and_green_Sneaker;
	
	@FindBy(xpath ="//div[@class='product-list']//div[3]//div[1]//div[1]//a[1]//img[1]")//e14
	WebElement Blue_Jeans;

	@FindBy(id = "addtocart_36_EnteredQuantity")//e15
	WebElement Add_Quantity_Blue_Jeans;

	@FindBy(id = "add-to-cart-button-36")//e16
	WebElement Add_To_Cart_Botton_Blue_Jeans;
	
	@FindBy(xpath ="//div[@class='master-wrapper-main']//div[4]//div[1]//div[1]//a[1]//img[1]")//e17
	WebElement Casual_Golf_Belt;

	@FindBy(id = "addtocart_40_EnteredQuantity")//e18
	WebElement Add_Quantity_Casual_Golf_Belt;

	@FindBy(id = "add-to-cart-button-40")//e19
	WebElement Add_To_Cart_Botton_Casual_Golf_Belt;
	
	@FindBy(xpath ="//div[5]//div[1]//div[1]//a[1]//img[1]")//e20
	WebElement Custom_TShirt;
	
	@FindBy(id = "product_attribute_24_2_9")//e21
	WebElement Enter_your_text_Custom_TShirt;

	@FindBy(id = "addtocart_24_EnteredQuantity")//e22
	WebElement Add_Quantity_Custom_TShirt;

	@FindBy(id = "add-to-cart-button-24")//e23
	WebElement Add_To_Cart_Botton_Custom_TShirt;
	
	@FindBy(xpath ="//div[6]//div[1]//div[1]//a[1]//img[1]")//e24
	WebElement Genuine_Leather_Handbag_with_Cell_Phone_Holder_Many_Pockets;

	@FindBy(id = "addtocart_29_EnteredQuantity")//e25
	WebElement Add_Quantity_Genuine_Leather_Handbag_with_Cell_Phone_Holder_Many_Pockets;

	@FindBy(id = "add-to-cart-button-29")//e26
	WebElement Add_To_Cart_Botton_Genuine_Leather_Handbag_with_Cell_Phone_Holder_Many_Pockets;
	
	@FindBy(xpath ="//div[8]//div[1]//div[1]//a[1]//img[1]")//e27
	WebElement Mens_Wrinkle_Free_Long_Sleeve;

	@FindBy(id = "product_attribute_10_7_36")//e28
	WebElement Mens_Wrinkle_Free_Long_Sleeve_By_Size;
	
	@FindBy(id = "addtocart_10_EnteredQuantity")//e29
	WebElement Add_Quantity_Mens_Wrinkle_Free_Long_Sleeve;

	@FindBy(id = "add-to-cart-button-10")//e30
	WebElement Add_To_Cart_Botton_Mens_Wrinkle_Free_Long_Sleeve;
	
	@FindBy(xpath ="//a[contains(text(),'Sunglasses')]")//e31
	WebElement Sunglasses;

	@FindBy(id = "addtocart_42_EnteredQuantity")//e32
	WebElement Add_Quantity_Sunglasses;

	@FindBy(id = "add-to-cart-button-42")//e33
	WebElement Add_To_Cart_Sunglasses;
	
	@FindBy(xpath ="//a[contains(text(),\"V-Blue Old Persons' Cuffed Denim Short with Rhines\")]")//e34
	WebElement VBlue_Old_Persons_Cuffed_Denim_Short_with_Rhines;

	@FindBy(id = "addtocart_47_EnteredQuantity")//e35
	WebElement Add_Quantity_VBlue_Old_Persons_Cuffed_Denim_Short_with_Rhines;

	@FindBy(id = "add-to-cart-button-47")//e36
	WebElement Add_To_Cart_Botton_VBlue_Old_Persons_Cuffed_Denim_Short_with_Rhines;
	
	@FindBy(xpath ="//a[contains(text(),\"Women's Running Shoe\")]")//e37
	WebElement Womens_Running_Shoe;
	
	@FindBy(id = "product_attribute_7_7_2")//e38
	WebElement Womens_Running_Shoe_By_Size;
	
	@FindBy(id = "product_attribute_7_1_3")//e39
	WebElement Womens_Running_Shoe_By_Color;

	@FindBy(id = "addtocart_7_EnteredQuantity")//e40
	WebElement Add_Quantity_Womens_Running_Shoe;

	@FindBy(id = "add-to-cart-button-7")//e41
	WebElement Add_To_Cart_Botton_Womens_Running_Shoe;
	
	@FindBy(xpath ="//a[contains(text(),'Wool Hat')]")//e42
	WebElement Wool_Hat;
	
	@FindBy(id = "product_attribute_34_7_12")//e43
	WebElement Wool_Hat_By_Size;

	@FindBy(id = "addtocart_34_EnteredQuantity")//e44
	WebElement Add_Quantity_Wool_Hat;

	@FindBy(id = "add-to-cart-button-34")//e45
	WebElement Add_To_Cart_Botton_Wool_Hat;
	
		
public DemoWorkShop_Apparel_And_Shoes_Page() {
	
	PageFactory.initElements(driver, this);
}

public void Click_Apparel_And_Shoes_Link(String strApparelAndShoesExp) {
	
	log("Clicking on Apparel_And_Shoes_Link");
	Apparel_And_Shoes_Link.click();	//e1  

	log("Verifying the Apparel_And_Shoes_Page is displayed");
	String strApparelAndShoesAct = Verify_Apparel_And_Shoes_Page.getText();	//E2
	System.out.println(strApparelAndShoesAct);
	if(strApparelAndShoesExp.equalsIgnoreCase(strApparelAndShoesAct)){
		log("Apparel And Shoes page is displayed with expected :" + strApparelAndShoesExp + " is matched with Actual value : " + strApparelAndShoesAct);
	}else {
		log("Apparel And Shoes page is not displayed with expected :" + strApparelAndShoesExp + " is not matched with Actual value : " + strApparelAndShoesAct);
	}	
	System.out.println("***************************************************");		
}

public void Click_Rockabilly_Polka_Dot_Top_JR_Plus_Size_Link() {
		
	log("Selecting product position by it index value  ");
	Select Products_Sort_By = new Select(Select_Products_Sort_By);//e3
	Products_Sort_By.selectByIndex(1);
		
	log("Selecting display size of product");
	Select Display_products = new Select(Select_Display_products_PageSize);
	Display_products.selectByIndex(2);//e4
		
	log("Selecting view of products ");
	Select View_As_Products = new Select(Select_View_As_Products);
	View_As_Products.selectByVisibleText("List");;//e5

	log("Selecting Rockabilly_Polka_Dot_Top_JR_Plus_Size ");
	Rockabilly_Polka_Dot_Top_JR_Plus_Size.click();	//e6
	
	log("Adding Quantity of Rockabilly_Polka_Dot_Top_JR_Plus_Size ");
	Select By_Size = new Select(Rockabilly_Polka_Dot_Top_JR_Plus_Size_By_Size);
	By_Size.selectByVisibleText("5X");//E7
	Add_Quantity_Rockabilly_Polka_Dot_Top_JR_Plus_Size.clear();	//e8
	Add_Quantity_Rockabilly_Polka_Dot_Top_JR_Plus_Size.sendKeys("10");//e8
	Add_To_Cart_Botton_Rockabilly_Polka_Dot_Top_JR_Plus_Size.click();	//e9
	
	log("Navigating back to Apparel and Shoes page ");
	driver.navigate().back();
	System.out.println("***************************************");
	
}

public void Click_Blue_and_green_Sneaker_Link() {
	
	log("Selecting Blue_and_green_Sneaker ");
	Blue_and_green_Sneaker.click();	//e10
	
	log("Adding Quantity of Blue_and_green_Sneaker ");
	Select By_Size = new Select(Blue_and_green_Sneaker_By_Size);
	By_Size.selectByVisibleText("10");//E11
	Add_Quantity_Blue_and_green_Sneaker.clear();	//e12
	Add_Quantity_Blue_and_green_Sneaker.sendKeys("10");//e12
	Add_To_Cart_Botton_Blue_and_green_Sneaker.click();	//e13
	
	log("Navigating back to Apparel and Shoes page ");
	driver.navigate().back();
	System.out.println("***************************************");
	
}

public void Click_Blue_Jeans_Link() {
	
	log("Selecting Blue_Jeans ");
	Blue_Jeans.click();	//e14
	
	log("Adding Quantity of Blue_Jeans ");
	Add_Quantity_Blue_Jeans.clear();	//e15
	Add_Quantity_Blue_Jeans.sendKeys("10");//e15
	Add_To_Cart_Botton_Blue_Jeans.click();	//e16
	
	log("Navigating back to Apparel and Shoes page ");
	driver.navigate().back();
	System.out.println("***************************************");
	
}

public void Click_Casual_Golf_Belt_Link() {
	
	log("Selecting Casual_Golf_Belt ");
	Casual_Golf_Belt.click();	//e17
	
	log("Adding Quantity of Casual_Golf_Belt ");
	Add_Quantity_Casual_Golf_Belt.clear();	//e18
	Add_Quantity_Casual_Golf_Belt.sendKeys("10");//e18
	Add_To_Cart_Botton_Casual_Golf_Belt.click();	//e19
	
	log("Navigating back to Apparel and Shoes page ");
	driver.navigate().back();
	System.out.println("***************************************");
	
}

public void Click_Custom_TShirt_Link() {
	
	log("Selecting Custom_TShirt_Link ");
	Custom_TShirt.click();	//e20
	
	log("Adding Quantity ofCustom_TShirt ");
	Enter_your_text_Custom_TShirt.sendKeys("Lets Do IT");;//E21
	Add_Quantity_Custom_TShirt.clear();	//e22
	Add_Quantity_Custom_TShirt.sendKeys("10");//e22
	Add_To_Cart_Botton_Custom_TShirt.click();	//e23
	
	log("Navigating back to Apparel and Shoes page ");
	driver.navigate().back();
	System.out.println("***************************************");
	
}

public void Click_Genuine_Leather_Handbag_with_Cell_Phone_Holder_Many_Pockets_Link() {
	
	log("Selecting Genuine_Leather_Handbag_with_Cell_Phone_Holder_Many_Pockets_Link ");
	Genuine_Leather_Handbag_with_Cell_Phone_Holder_Many_Pockets.click();	//e24
	
	log("Adding Quantity of Genuine_Leather_Handbag_with_Cell_Phone_Holder_Many_Pockets ");
	Add_Quantity_Genuine_Leather_Handbag_with_Cell_Phone_Holder_Many_Pockets.clear();	//e25
	Add_Quantity_Genuine_Leather_Handbag_with_Cell_Phone_Holder_Many_Pockets.sendKeys("10");//e25
	Add_To_Cart_Botton_Genuine_Leather_Handbag_with_Cell_Phone_Holder_Many_Pockets.click();	//e26
	
	log("Navigating back to Apparel and Shoes page ");
	driver.navigate().back();
	System.out.println("***************************************");
	
}

public void Click_Mens_Wrinkle_Free_Long_Sleeve_Link() {
	
	log("Selecting Mens_Wrinkle_Free_Long_Sleeve_Link ");
	Mens_Wrinkle_Free_Long_Sleeve.click();	//e27
	
	log("Adding Quantity of Mens_Wrinkle_Free_Long_Sleeve ");
	Select By_Size = new Select(Mens_Wrinkle_Free_Long_Sleeve_By_Size);
	By_Size.selectByVisibleText("Large");//E28
	Add_Quantity_Mens_Wrinkle_Free_Long_Sleeve.clear();	//e29
	Add_Quantity_Mens_Wrinkle_Free_Long_Sleeve.sendKeys("10");//e29
	Add_To_Cart_Botton_Mens_Wrinkle_Free_Long_Sleeve.click();	//e30
	
	log("Navigating back to Apparel and Shoes page ");
	driver.navigate().back();
	System.out.println("***************************************");
	
}

public void Click_Sunglasses_Link() {
	
	log("Selecting Sunglasses_Link ");
	Sunglasses.click();	//e31
	
	log("Adding Quantity of Sunglasses ");
	Add_Quantity_Sunglasses.clear();	//e32
	Add_Quantity_Sunglasses.sendKeys("10");//e32
	Add_To_Cart_Sunglasses.click();	//e33
	
	log("Navigating back to Apparel and Shoes page  ");
	driver.navigate().back();
	System.out.println("***************************************");
	
}

public void Click_VBlue_Old_Persons_Cuffed_Denim_Short_with_Rhines_Link() {
	
	log("Selecting VBlue_Old_Persons_Cuffed_Denim_Short_with_Rhines ");
	VBlue_Old_Persons_Cuffed_Denim_Short_with_Rhines.click();	//e34
	
	log("Adding Quantity of VBlue_Old_Persons_Cuffed_Denim_Short_with_Rhines ");
	Add_Quantity_VBlue_Old_Persons_Cuffed_Denim_Short_with_Rhines.clear();	//e35
	Add_Quantity_VBlue_Old_Persons_Cuffed_Denim_Short_with_Rhines.sendKeys("10");//e35
	Add_To_Cart_Botton_VBlue_Old_Persons_Cuffed_Denim_Short_with_Rhines.click();	//e36
	
	log("Navigating back to Apparel and Shoes page ");
	driver.navigate().back();
	System.out.println("***************************************");
	
}

public void Click_Womens_Running_Shoe_Link() {
	
	log("Selecting Womens_Running_Shoe");
	Womens_Running_Shoe.click();	//e37
	
	log("Adding Quantity of Womens_Running_Shoe ");
	Select By_Size = new Select(Womens_Running_Shoe_By_Size);
	By_Size.selectByVisibleText("10");//E38
	
	Select By_Color = new Select(Womens_Running_Shoe_By_Color);
	By_Color.selectByVisibleText("White/Black");//E39
	
	Add_Quantity_Womens_Running_Shoe.clear();	//e40
	Add_Quantity_Womens_Running_Shoe.sendKeys("10");//e40
	Add_To_Cart_Botton_Womens_Running_Shoe.click();	//e41
	
	log("Navigating back to Apparel and Shoes page ");
	driver.navigate().back();
	System.out.println("***************************************");
	
}

public void Click_Wool_Hat_Link() {
	
	log("Selecting Wool_Hat_Link ");
	Wool_Hat.click();	//e42
	
	log("Adding Quantity of Wool_Hat ");
	Select By_Size = new Select(Wool_Hat_By_Size);
	By_Size.selectByVisibleText("Large");//E43
	Add_Quantity_Wool_Hat.clear();	//e44
	Add_Quantity_Wool_Hat.sendKeys("10");//e44
	Add_To_Cart_Botton_Wool_Hat.click();	//e45
	
	System.out.println("***************************************");
	
}
}
