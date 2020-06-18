package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoworkshop.qa.TestBase;
public class DemoWorkShop_Computers_Page extends TestBase{
	
	public static final Logger log = Logger.getLogger(DemoWorkShop_Computers_Page.class.getName());
	
	@FindBy(xpath= "//ul[@class='top-menu']//a[contains(text(),'Computers')]") //e1
	WebElement Computers_Page;

	@FindBy(xpath = "//h1[contains(text(),'Computers')]")//e2
	WebElement Verify_Computers_Page;

	@FindBy(id="products-orderby")//e3
	WebElement Select_Products_Sort_By;

	@FindBy(id="products-pagesize")//e4
	WebElement Select_Display_products_PageSize;

	@FindBy(id="products-viewmode")//e5
	WebElement Select_View_As_Products;

	@FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Desktops')]")//e6
	WebElement Computing_Desktop_Link;
	
	@FindBy(xpath = "//h1[contains(text(),'Computers')]")//e7
	WebElement Verify_Computing_Desktop_Link_Page;

	@FindBy(xpath = "//input [@name ='product_attribute_72_5_18']")//e8
	WebElement Build_your_own_cheap_computer_Processor_RadioButton;
	
	@FindBy(xpath = "//input [@name ='product_attribute_72_6_19']")//e9
	WebElement Build_your_own_cheap_computer_Ram_RadioButton;
	
	@FindBy(xpath = "//input [@name ='product_attribute_72_3_20']")//e10
	WebElement Build_your_own_cheap_computer_HDD_RadioButton;
	
	@FindBy(xpath = "//input [@name ='product_attribute_72_8_30']")//e11
	WebElement Build_your_own_cheap_computer_Processor_CheckBoxButton;
	
	@FindBy(id = "addtocart_72_EnteredQuantity")//e12
	WebElement Add_Quantity_Build_your_own_cheap_computer_Processor;

	@FindBy(id = "add-to-cart-button-72")//e13
	WebElement Add_To_Cart_Botton_Build_your_own_cheap_computer_Processor;

	@FindBy(xpath = "//a[contains(text(),'Build your own computer')]")//e14
	WebElement Build_your_own_computer;

	@FindBy(xpath = "//label[contains(text(),'Processor')]")//e15
	WebElement Build_your_own_cheap_computer_Processor_DropDown;
	
	@FindBy(xpath = "//label[contains(text(),'RAM')]")//e16
	WebElement Build_your_own_computer_Ram_DropDown;
	
	@FindBy(xpath = "//input[@ name=\"product_attribute_16_3_6\"]")//e17
	WebElement Build_your_own_computer_HDD_RadioButton;
	
	@FindBy(xpath = "//input[@name=\"product_attribute_16_4_7\"]")//e18
	WebElement Build_your_own_computer_OS_RadioButton;
	
	@FindBy(xpath = "//input[@name=\"product_attribute_16_8_8\"]")//e19
	WebElement Build_your_own_computer_Processor_CheckBox;
	
	@FindBy(id = "addtocart_16_EnteredQuantity")//e20
	WebElement Add_Quantity_Build_your_own_computer;

	@FindBy(id = "add-to-cart-button-16")//e21
	WebElement Add_To_Cart_Botton_Build_your_own_computer;

	@FindBy(xpath = "//a[contains(text(),'Build your own expensive computer')]")//e22
	WebElement Buildyour_own_expensive_computer_Link;	

	@FindBy(xpath = "//input[@name=\"product_attribute_74_5_26\"]")//e23
	WebElement Buildyour_own_expensive_computer_Processor_RadioButton;
	
	@FindBy(xpath = "//input[@name=\"product_attribute_74_6_27\"]")//e24
	WebElement Buildyour_own_expensive_computer_Ram_RadioButton;
	
	@FindBy(xpath = "//input[@name=\"product_attribute_74_3_28\"]")//e25
	WebElement Buildyour_own_expensive_computer_HDD_RadioButton;
	
	@FindBy(xpath = "//input[@name=\"product_attribute_74_8_29\"]")//e26
	WebElement Buildyour_own_expensive_computer_Software_CheckBoxButton;
	
	@FindBy(id = "addtocart_74_EnteredQuantity")//e27
	WebElement Add_Quantity_Buildyour_own_expensive_computer;

	@FindBy(id = "add-to-cart-button-74")//e28
	WebElement Add_To_Cart_Botton_Buildyour_own_expensive_computer;
	
	@FindBy(xpath = "//a[contains(text(),'Desktop PC with CDRW')]")//e29
	WebElement Desktop_PC_with_CDRW_Link;
	
	@FindBy(xpath = "//h1[contains(text(),'Desktop PC with CDRW')]")//e30
	WebElement Verify_Desktop_PC_with_CDRW_Link_Page;
	
	@FindBy(xpath = "//a[contains(text(),'Elite Desktop PC')]")//e31
	WebElement Elite_Desktop_PC_Link;
	
	@FindBy(xpath = "//h1[contains(text(),'Elite Desktop PC')]")//e32
	WebElement Verify_Elite_Desktop_PC_Link_Page;
	
	@FindBy(xpath = "//a[contains(text(),'Simple Computer')]")//e33
	WebElement Simple_Computer_Link;
	
	@FindBy(xpath = "//label[contains(text(),'Processor')]")//e34
	WebElement Simple_Computer_Processor_RadioButton;
	
	@FindBy(xpath = "//input[@name=\"product_attribute_74_6_27\"]")//e35
	WebElement Simple_Computer_Ram_RadioButton;
	
	@FindBy(xpath = "//input[@name=\"product_attribute_74_3_28\"]")//e36
	WebElement Simple_Computer_HDD_RadioButton;
	
	@FindBy(xpath = "//input[@name=\"product_attribute_74_8_29\"]")//e37
	WebElement Simple_Computer_Software_CheckBoxButton;
	
	@FindBy(id = "addtocart_74_EnteredQuantity")//e38
	WebElement Add_Quantity_Simple_Computer;

	@FindBy(id = "add-to-cart-button-74")//e39
	WebElement Add_To_Cart_Botton_Simple_Computer;
	
	@FindBy(xpath= "//h2[@class='title']//a[contains(text(),'Notebooks')]") //e40
	WebElement NoteBook_Link;

	@FindBy(xpath = "//h1[contains(text(),'Notebooks')]")//e41
	WebElement Verify_NoteBook_Link_Page;
	
	@FindBy(xpath = "//a[contains(text(),'14.1-inch Laptop')]")//e42
	WebElement NoteBook_14_1_inch_Laptop_Link;
	
	@FindBy(id = "addtocart_31_EnteredQuantity")//e43
	WebElement Add_Quantity_NoteBook_14_1_inch_Laptop_Link;

	@FindBy(id = "add-to-cart-button-31")//e44
	WebElement Add_To_Cart_Botton_NoteBook_14_1_inch_Laptop_Link;
	
	@FindBy(xpath= "//h2[@class='title']//a[contains(text(),'Accessories')]") //e45
	WebElement Accessories_Link_Page;

	@FindBy(xpath = "//h1[contains(text(),'Accessories')]")//e46
	WebElement Verify_Accessories_Page;
	
	@FindBy(xpath = "//a[contains(text(),'TCP Coaching day')]")//e47
	WebElement TCP_Coaching_day_Link;
	
	@FindBy(id = "addtocart_63_EnteredQuantity")//e48
	WebElement Add_Quantity_TCP_Coaching_day_Link;

	@FindBy(id = "add-to-cart-button-63")//e49
	WebElement Add_To_Cart_Botton_TCP_Coaching_day_Link;
	
	@FindBy(xpath = "//a[contains(text(),'TCP Instructor Led Training')]")//e50
	WebElement TCP_Instructor_Led_Training_Link;
	
	@FindBy(id = "addtocart_66_EnteredQuantity")//e51
	WebElement Add_Quantity_TCP_Instructor_Led_Training_Link;

	@FindBy(id = "add-to-cart-button-66")//e52
	WebElement Add_To_Cart_Botton_TCP_Instructor_Led_Training_Link;
	
	@FindBy(xpath = "//a[contains(text(),'TCP Public Complete')]")//e53
	WebElement TCP_Public_Complete_Link;
	
	@FindBy(id = "addtocart_65_EnteredQuantity")//e54
	WebElement Add_Quantity_TCP_Public_Complete_Link;

	@FindBy(id = "add-to-cart-button-65")//e55
	WebElement Add_To_Cart_Botton_TCP_Public_Complete_Link;
	
	@FindBy(xpath = "//a[contains(text(),'TCP Public MT')]")//e56
	WebElement TCP_Public_MT_Link;
	
	@FindBy(id = "addtocart_62_EnteredQuantity")//e57
	WebElement Add_Quantity_TCP_Public_MT_Link;

	@FindBy(id = "add-to-cart-button-62")//e58
	WebElement Add_To_Cart_Botton_TCP_Public_MT_Link;
	
	@FindBy(xpath = "//a[contains(text(),'TCP Public RPA')]")//e59
	WebElement TCP_Public_RPA_Link;
	
	@FindBy(id = "addtocart_64_EnteredQuantity")//e60
	WebElement Add_Quantity_TCP_Public_RPA_Link;

	@FindBy(id = "add-to-cart-button-64")//e61
	WebElement Add_To_Cart_Botton_TCP_Public_RPA_Link;
	
	@FindBy(xpath = "//div[6]//div[1]//div[2]//h2[1]//a[1]")//e62
	WebElement TCP_Self_Paced_Training_Link;
	
	@FindBy(id = "addtocart_61_EnteredQuantity")//e63
	WebElement Add_Quantity_TCP_Self_Paced_Training_Link;

	@FindBy(id = "add-to-cart-button-61")//e64
	WebElement Add_To_Cart_Botton_TCP_Self_Paced_Training_Link;
	
	@FindBy(xpath = "//a[contains(text(),'TCP Self-Paced Training additional month')]")//e65
	WebElement TCP_Self_Paced_Training_additional_month_Link;
	
	@FindBy(id = "addtocart_67_EnteredQuantity")//e66
	WebElement Add_Quantity_TCP_Self_Paced_Training_additional_month_Link;

	@FindBy(id = "add-to-cart-button-67")//e67
	WebElement Add_To_Cart_Botton_TCP_Self_Paced_Training_additional_month_Link;


public DemoWorkShop_Computers_Page() {
	
	PageFactory.initElements(driver, this);
}

public void Click_Computers_Page_Link(String strComputersExp) {
	
	log("Clicking on Computers Link");
	Computers_Page.click();	//e1  

	log("Verifying the Computers page is displayed");
	String strComputersAct = Verify_Computers_Page.getText();	//E2
	System.out.println(strComputersAct);
	if(strComputersExp.equalsIgnoreCase(strComputersAct)){
		log("Computers page is displayed with expected :" + strComputersExp + " is matched with Actual value : " + strComputersAct);
	}else {
		log("Computers page is not displayed with expected :" + strComputersExp + " is not matched with Actual value : " + strComputersAct);
	}	
	System.out.println("***************************************************");		
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
			
			
//	log("Selecting Smart phone ");
//	Click_Phone_Covr_Img.click();//E14
//	
//	log("Selecting product manufacturer by Index  ");
//	Select Manufacturer = new Select(Select_product_maufacturer_By);//e15
//	Manufacturer.selectByIndex(1);
//											
//	log("Selecting product color by Index");
//	Select Products_Color = new Select(Selec_product_Color_By);//e16
//	Products_Color.selectByIndex(2);
//	
//	log("Adding Quantity of Phone Cover");
//	Add_Quantity_Phone_Cover.clear();//E17
//	Add_Quantity_Phone_Cover.sendKeys("10");//E17
//	Click_Phone_Cover_Add_To_cart_button.click();//E18
	
	log("Navigating back to Cell phones page ");
	driver.navigate().back();
	System.out.println("***************************************");
	
}	
}
