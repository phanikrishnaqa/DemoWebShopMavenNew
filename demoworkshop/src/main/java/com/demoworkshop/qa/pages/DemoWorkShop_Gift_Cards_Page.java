package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoworkshop.qa.TestBase;
public class DemoWorkShop_Gift_Cards_Page extends TestBase{
	public static final Logger log = Logger.getLogger(DemoWorkShop_Gift_Cards_Page.class.getName());
	
	@FindBy(xpath= "//ul[@class='top-menu']//a[contains(text(),'Gift Cards')]") //e1
	WebElement Gift_Cards_Link_Page;

	@FindBy(xpath = "//h1[contains(text(),'Gift Cards')]")//e2
	WebElement Verify_Gift_Cards_Page;
	
	//#####################################################################2
	
	@FindBy(id="products-orderby")//e3
	WebElement Select_Products_Sort_By;

	@FindBy(id="products-pagesize")//e4
	WebElement Select_Display_products_PageSize;

	@FindBy(id="products-viewmode")//e5
	WebElement Select_View_As_Products;

	//#####################################################################3
	
	@FindBy(xpath = "//div[@class='master-wrapper-main']//div[4]//div[1]//div[1]//a[1]//img[1]")//e6
	WebElement $100_Physical_Gift_Card_Img;
	
	@FindBy(id = "giftcard_4_RecipientName")//e7
	WebElement Recipients_Name_$100_Physical_Gift_Card;

	@FindBy(id = "giftcard_4_SenderName")//e8
	WebElement Your_Name_$100_Physical_Gift_Card;
	
	@FindBy(id = "giftcard_4_Message")//e9
	WebElement Message_$100_Physical_Gift_Card;

	@FindBy(id = "addtocart_4_EnteredQuantity")//e10
	WebElement Add_Quantity_$100_Physical_Gift_Card;

	@FindBy(id = "add-to-cart-button-4")//e11
	WebElement Add_To_Cart_Botton_$100_Physical_Gift_Card;

	//##################################################################### 6
			
	@FindBy(xpath = "//a[contains(text(),'$25 Virtual Gift Card')]")//e12
	WebElement $25_Virtual_Gift_Card_img;
	
	@FindBy(id = "giftcard_2_RecipientName")//e13
	WebElement Recipients_Name_$25_Virtual_Gift_Card;

	@FindBy(id = "giftcard_2_RecipientEmail")//e14
	WebElement Recipients_Email_$25_Virtual_Gift_Card;
	
	@FindBy(id = "giftcard_2_SenderName")//e15
	WebElement Your_Name_$25_Virtual_Gift_Card;

	@FindBy(id = "giftcard_2_SenderEmail")//e16
	WebElement Your_Email_Botton_$25_Virtual_Gift_Card;
	
	@FindBy(id = "giftcard_2_Message")//e17
	WebElement Message_$25_Virtual_Gift_Card;
		
	@FindBy(id = "addtocart_2_EnteredQuantity")//e18
	WebElement Add_Quantity_$25_Virtual_Gift_Card;

	@FindBy(id = "add-to-cart-button-2")//e19
	WebElement Add_To_Cart_Botton_$25_Virtual_Gift_Card;

	//##################################################################### 8
		
	@FindBy(xpath = "//a[contains(text(),'$5 Virtual Gift Card')]")//e20
	WebElement $5_Virtual_Gift_Card_Img;	

	@FindBy(id = "giftcard_1_RecipientName")//e21
	WebElement Recipients_Name_$5_Virtual_Gift_Card;

	@FindBy(id = "giftcard_1_RecipientEmail")//e22
	WebElement Recipients_Email_$5_Virtual_Gift_Card;
	
	@FindBy(id = "giftcard_1_SenderName")//e23
	WebElement Your_Name_$5_Virtual_Gift_Card;

	@FindBy(id = "giftcard_1_SenderEmail")//e24
	WebElement Your_Email_Botton_$5_Virtual_Gift_Card;
	
	@FindBy(id = "giftcard_1_Message")//e25
	WebElement Message_$5_Virtual_Gift_Card;
		
	@FindBy(id = "addtocart_1_EnteredQuantity")//e26
	WebElement Add_Quantity_$5_Virtual_Gift_Card;

	@FindBy(id = "add-to-cart-button-1")//e27
	WebElement Add_To_Cart_Botton_$5_Virtual_Gift_Card;

	//##################################################################### 8
		
	@FindBy(xpath = "//a[contains(text(),'$50 Physical Gift Card')]")//e28
	WebElement $50_Physical_Gift_Card_Img;
	
	@FindBy(id = "giftcard_3_RecipientName")//e29
	WebElement Recipients_Name_$50_Physical_Gift_Card;

	@FindBy(id = "giftcard_3_RecipientName")//e30
	WebElement Your_Name_$50_Physical_Gift_Card;
	
	@FindBy(id = "giftcard_3_Message")//e31
	WebElement Message_$50_Physical_Gift_Card;

	@FindBy(id = "addtocart_3_EnteredQuantity")//e32
	WebElement Add_Quantity_$50_Physical_Gift_Card;

	@FindBy(id = "add-to-cart-button-3")//e33
	WebElement Add_To_Cart_Botton_$50_Physical_Gift_Card;

	//##################################################################### 6
	

public DemoWorkShop_Gift_Cards_Page() {
	
	PageFactory.initElements(driver, this);
}

public void Click_Gift_Cards_Link(String strGiftCardsExp) {
	
	log("Clicking on Gift Cards Link Page");
	Gift_Cards_Link_Page.click();	//e1  

	log("Verifying the Physical Gift Card page is displayed");
	String strGiftCardsAct = Verify_Gift_Cards_Page.getText();	//E2
	System.out.println(strGiftCardsAct);
	if(strGiftCardsExp.equalsIgnoreCase(strGiftCardsAct)){
		
	log(" Gift Card page is displayed with expected :" + strGiftCardsExp + " is matched with Actual value : " + strGiftCardsAct);
	}else {
		log(" Physical Gift Card page is not displayed with expected :" + strGiftCardsExp + " is not matched with Actual value : " + strGiftCardsAct);
	}	
	System.out.println("***************************************");		
}

public void Click_$100_Physical_Gift_Card_Link() {
		
	
	Select_Value_From_Dropdown(Select_Products_Sort_By,1);
	Select_Value_From_Dropdown(Select_Display_products_PageSize,2);
	Select_Value_From_Dropdown(Select_View_As_Products,1);
	
	
	log("Selecting $100 Physical Gift Card ");
	$100_Physical_Gift_Card_Img.click();	//e6
	
	log("Entering Recipients Name through send keys");//e7
	Recipients_Name_$100_Physical_Gift_Card.sendKeys("Srinivas");
	
	log("Entering sender Name through send keys");//e8
	Your_Name_$100_Physical_Gift_Card.sendKeys("Phani Krishna");

	log("Entering message through send keys");//e9
	Message_$100_Physical_Gift_Card.sendKeys("Hi Srinivas Happy Birthday");
	
	log("Adding Quantity of $100 Physical Gift Card ");
	Add_Quantity_$100_Physical_Gift_Card.clear();	//e10
	Add_Quantity_$100_Physical_Gift_Card.sendKeys("10");//e10
	Add_To_Cart_Botton_$100_Physical_Gift_Card.click();	//e11
	
	log("Navigating back to Book page ");
	driver.navigate().back();
	
	System.out.println("***************************************");
	
}

public void Click_$25_Virtual_Gift_Card_Link() {
	
	log("Selecting $25 Virtual Gift Card ");
	$25_Virtual_Gift_Card_img.click();	//e12
	
	log("Entering Recipients Name through send keys");//e13
	Recipients_Name_$25_Virtual_Gift_Card.sendKeys("Srinivas");
	
	log("Entering Recipients Email ID through send keys");//e14
	Recipients_Email_$25_Virtual_Gift_Card.sendKeys("Srinivas@gmail.com");
	
	log("Entering sender Name through send keys");//e15
	Your_Name_$25_Virtual_Gift_Card.sendKeys("Phani Krishna");

	log("Entering Recipients Email ID through send keys");//e16
	Your_Email_Botton_$25_Virtual_Gift_Card.sendKeys("Phani@mail.com");
	
	log("Entering message through send keys");//e17
	Message_$25_Virtual_Gift_Card.sendKeys("Hi Srinivas Happy Birthday");
	
	log("Adding Quantity of $25 Virtual Gift Card ");
	Add_Quantity_$25_Virtual_Gift_Card.clear();	//e18
	Add_Quantity_$25_Virtual_Gift_Card.sendKeys("10");//e18
	Add_To_Cart_Botton_$25_Virtual_Gift_Card.click();	//e19
	
	log("Navigating back to Book page ");
	driver.navigate().back();
	
	System.out.println("***************************************");
	
}	

public void Click_$5_Virtual_Gift_Card_Link() {
	
	log("Selecting $5 Virtual Gift Card ");
	$5_Virtual_Gift_Card_Img.click();	//20
	
	log("Entering Recipients Name through send keys");//21
	Recipients_Name_$5_Virtual_Gift_Card.sendKeys("Srinivas");
	
	log("Entering Recipients Email ID through send keys");//e22
	Recipients_Email_$5_Virtual_Gift_Card.sendKeys("Srinivas@gmail.com");
	
	log("Entering sender Name through send keys");//e23
	Your_Name_$5_Virtual_Gift_Card.sendKeys("Phani Krishna");

	log("Entering Recipients Email ID through send keys");//e24
	Your_Email_Botton_$5_Virtual_Gift_Card.sendKeys("Phani@mail.com");
	
	log("Entering message through send keys");//e25
	Message_$5_Virtual_Gift_Card.sendKeys("Hi Srinivas Happy Birthday");
	
	log("Adding Quantity of  $5 Virtual Gift Card ");
	Add_Quantity_$5_Virtual_Gift_Card.clear();	//e26
	Add_Quantity_$5_Virtual_Gift_Card.sendKeys("10");//e26
	Add_To_Cart_Botton_$5_Virtual_Gift_Card.click();	//e27
	
	log("Navigating back to Book page ");
	driver.navigate().back();
	
	System.out.println("***************************************");
	
}

public void Click_$50_Physical_Gift_Card_Link() {

	log("Selecting $50 Physical Gift Card ");
	$50_Physical_Gift_Card_Img.click();	//28
	
	log("Entering Recipients Name through send keys");//e29
	Recipients_Name_$50_Physical_Gift_Card.sendKeys("Srinivas");
	
	log("Entering sender Name through send keys");//e30
	Your_Name_$50_Physical_Gift_Card.sendKeys("Phani Krishna");

	log("Entering message through send keys");//e31
	Message_$50_Physical_Gift_Card.sendKeys("Hi Srinivas Happy Birthday");
	
	log("Adding Quantity of  $50 Physical Gift Card ");
	Add_Quantity_$50_Physical_Gift_Card.clear();	//e32
	Add_Quantity_$50_Physical_Gift_Card.sendKeys("10");//e32
	Add_To_Cart_Botton_$50_Physical_Gift_Card.click();	//e33
	
	System.out.println("***************************************");
	
}
}
