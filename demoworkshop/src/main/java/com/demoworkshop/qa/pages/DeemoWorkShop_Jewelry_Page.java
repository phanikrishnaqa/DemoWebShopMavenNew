package com.demoworkshop.qa.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoworkshop.qa.TestBase;
public class DeemoWorkShop_Jewelry_Page extends TestBase{

	public static final Logger log = Logger.getLogger(DemoWorkShop_Books_Page.class.getName());
	
	@FindBy(xpath= "//ul[@class='top-menu']//a[contains(text(),'Jewelry')]") //e1
	WebElement Jewelry_Link;

	@FindBy(xpath = "//h1[contains(text(),'Jewelry')]")//e2
	WebElement Verify_Jewelry_Page;

	@FindBy(id="products-orderby")//e3
	WebElement Select_Products_Sort_By;

	@FindBy(id="products-pagesize")//e4
	WebElement Select_Display_products_PageSize;

	@FindBy(id="products-viewmode")//e5
	WebElement Select_View_As_Products;

	@FindBy(xpath = "//a[contains(text(),'Black & White Diamond Heart')]")//e6
	WebElement Black_White_Diamond_Heart_Jewelry;

	@FindBy(id = "addtocart_14_EnteredQuantity")//e7
	WebElement Add_Quantity_Black_White_Diamond_Heart_Jewelry;

	@FindBy(id = "add-to-cart-button-14")//e8
	WebElement Add_To_Cart_Botton_Black_White_Diamond_Heart_Jewelry;

	@FindBy(xpath = "//a[contains(text(),'Create Your Own Jewelry')]")//e9
	WebElement Create_Your_Own_Jewelry;
	
	@FindBy(css ="option")//e10
	List <WebElement> Select_By_products_Material;
	
	@FindBy(id="product_attribute_71_10_16")//e11
	WebElement Select_products_Length;
	
	@FindBy(xpath ="//input[@name ='product_attribute_71_11_17']")//e12
	List <WebElement> Select_Pendent_Shape;

	@FindBy(id = "addtocart_71_EnteredQuantity")//e13
	WebElement Add_Quantity_Heart_Shape_Pendent;

	@FindBy(id = "add-to-cart-button-71")//e14
	WebElement Add_To_Cart_Botton_Heart_Shape_Pendent;

	@FindBy(xpath = "//a[contains(text(),'Diamond Pave Earrings')]")//e15
	WebElement Diamond_Pave_Earrings;	

	@FindBy(className = "button-2 email-a-friend-button")//e16
	WebElement Send_email_a_friend_button;

	@FindBy(xpath = "//input[@id='FriendEmail']")//e17
	WebElement Enter_Friend_Email_ID;
	
	@FindBy(xpath = "//span[contains(text(),'Wrong email')]")//e18
	WebElement Enter_Friend_Email_ID_Wrong;

	@FindBy(xpath = "//input[@id='YourEmailAddress']")//e19
	WebElement Enter_Your_Email_ID;

	@FindBy(xpath = "//span[@ for='YourEmailAddress']")//e20
	WebElement Enter_Your_Email_ID_Wrong;
	
	@FindBy(xpath = "//textarea[@id='PersonalMessage']")//e21
	WebElement Enter_Presonal_Message;

	@FindBy(xpath = "//input[@name='send-email']")//e22
	WebElement send_email_Botton;
	
	@FindBy(xpath = "//a[@class='product']")//e23
	WebElement Product_Sent_Name;
	
	@FindBy(xpath = "//div[@class='result']")//e24
	WebElement Product_Sent_Result;

	@FindBy(xpath = "//a[contains(text(),'Diamond Tennis Bracelet')]")//e25
	WebElement Diamond_Tennis_Bracelet_Jewelry;

	@FindBy(xpath = "//a[contains(text(),'Vintage Style Three Stone Diamond Engagement Ring')]")//e26
	WebElement Stone_Diamond_Engagement_Ring;
	

	public DeemoWorkShop_Jewelry_Page() {
		
		PageFactory.initElements(driver, this);
	}

public void Click_Books_Link(String strJewelryExp) {

	log("Clicking on Jewelry Link");
	Jewelry_Link.click();	//e1  

	log("Verifying the Jewelry page is displayed");
	String strJewelryAct = Verify_Jewelry_Page.getText();	//E2
	System.out.println(strJewelryAct);
	if(strJewelryExp.equalsIgnoreCase(strJewelryAct)){
		log("Jewelry page is displayed with expected :" + strJewelryExp + " is matched with Actual value : " + strJewelryAct);
	}else {
		log("Jewelry page is not displayed with expected :" + strJewelryExp + " is not matched with Actual value : " + strJewelryAct);
	}	
	System.out.println("***************************************");		
	}

public void Click_Black_White_Diamond_Heart_Jewelry_Img() {
		
	
	Select_Value_From_Dropdown(Select_Products_Sort_By,1);
	Select_Value_From_Dropdown(Select_Display_products_PageSize,2);	
	Select_Value_From_Dropdown(Select_View_As_Products,1);

	log("Selecting Black_White_Diamond_Heart_Jewelry ");
	Black_White_Diamond_Heart_Jewelry.click();	//e6
	
	log("Adding Quantity of Black_White_Diamond_Heart_Jewelry ");
	Add_Quantity_Black_White_Diamond_Heart_Jewelry.clear();	//e7
	Add_Quantity_Black_White_Diamond_Heart_Jewelry.sendKeys("10");//e7
	Add_To_Cart_Botton_Black_White_Diamond_Heart_Jewelry.click();	//e8
	
	log("Navigating back to Jewelry page ");
	driver.navigate().back();
	System.out.println("***************************************");
	
}

public void Click_Create_Your_Own_Jewelry_Img() {
	
	log("Clicking on Create_Your_Own_Jewelry Link");
	Create_Your_Own_Jewelry.click(); //e9
	
	log("Seleting meterial of Create Your Own Jewelry");//e10
			
	for(WebElement option : Select_By_products_Material)
	{
		if (option.getAttribute("value").equalsIgnoreCase("47"))
		{
			option.click();
		}
	}
	
	log("Giving the length of chain in CM");//e11
	Select_products_Length.sendKeys("20");
	
	log("Seleting Pendent Shape for chain");//e12
	for(int i=0; i<Select_Pendent_Shape.size();i++)
	{
		WebElement RadioButton = Select_Pendent_Shape.get(i);
		String PendentShape = RadioButton.getAttribute("Value");
		System.out.println("Type of Meterial"+PendentShape);
		if (PendentShape.equalsIgnoreCase("49"))
		{
			RadioButton.click();
		}
	}
	
	log("Adding Quantity of Heart_Shape_Pendent ");
	Add_Quantity_Heart_Shape_Pendent.clear();//e13
	Add_Quantity_Heart_Shape_Pendent.sendKeys("10");//e13
	Add_To_Cart_Botton_Heart_Shape_Pendent.click();//e14

	log("Navigating back to jewelry page ");
	driver.navigate().back();
	System.out.println("***************************************");
}	

public void Click_Diamond_Pave_Earrings_Img() {
	log("Clicking Diamond_Pave_Earrings link");
	Diamond_Pave_Earrings.click();//e15

	log("CLicking on Email a friend button ");
	Send_email_a_friend_button.click();//e16
	
	log("Giving Friends Email ID");
	Enter_Friend_Email_ID.sendKeys("Srinivs@gmail.com");//e17
	
	log("Giving Sender Email ID");
	Enter_Your_Email_ID.sendKeys("");//e19
	
	log("Sending Friend a Message");
	Enter_Presonal_Message.sendKeys("Hello Srinivas Happy Birthday");//e21
	
	log("CLicking on send Email button ");
	send_email_Botton.click();//e22
	
	log("Getting the text of the gift sent");
	System.out.println(Product_Sent_Name.getText());//e23
	
	log("Getting Gift sent sucess message");
	System.out.println(Product_Sent_Result.getText());//e24
	
	log("Getting the text of the gift sent");
	Product_Sent_Result.click();;//e23

	log("Navigating back to Jewerly page ");
	driver.navigate().back();
	
	System.out.println("***************************************");
}

public void Click_Diamond_Tennis_Bracelet_Jewelry_link() {
	log("Clicking on Diamond Tennis Bracelet Jewelry");
	Diamond_Tennis_Bracelet_Jewelry.click();//e15
	
	log("CLicking on Email a friend button ");
	Send_email_a_friend_button.click();//e16
	
	log("Giving Friends Email ID");
	Enter_Friend_Email_ID.sendKeys("Srinivs@gmail.com");//e17
	
	log("Giving Sender Email ID");
	Enter_Your_Email_ID.sendKeys("");//e19
	
	log("Sending Friend a Message");
	Enter_Presonal_Message.sendKeys("Happy Birthday Srinivas");//e21
	
	log("CLicking on send Email button ");
	send_email_Botton.click();//e22
	
	log("Getting the text of the gift sent");
	System.out.println(Product_Sent_Name.getText());//e23
	
	log("Getting Gift sent sucess message");
	System.out.println(Product_Sent_Result.getText());//e24
	
	Product_Sent_Name.click();
	
	log("Navigating back to Jewerly page ");
	driver.navigate().back();
	
	System.out.println("***************************************");

}

public void Stone_Diamond_Engagement_Ring() {
	
	log("Clicking on Stone_Diamond_Engagement_Ring");
	Stone_Diamond_Engagement_Ring.click();//e15
	
	log("CLicking on Email a friend button ");
	Send_email_a_friend_button.click();//e16
	
	log("Giving Friends Email ID");
	Enter_Friend_Email_ID.sendKeys("Srinivs@gmail.com");//e17
	
	log("Giving Sender Email ID");
	Enter_Your_Email_ID.sendKeys("");//e19
	
	log("Sending Friend a Message");
	Enter_Presonal_Message.sendKeys("Happy Birthday Srinivas");//e21
	
	log("CLicking on send Email button ");
	send_email_Botton.click();//e22
	
	log("Getting the text of the gift sent");
	System.out.println(Product_Sent_Name.getText());//e23
	
	log("Getting Gift sent sucess message");
	System.out.println(Product_Sent_Result.getText());//e24
	
	Product_Sent_Name.click();
	
	log("Navigating back to Jewerly page ");
	driver.navigate().back();
					
	System.out.println("***************************************");

}
}
