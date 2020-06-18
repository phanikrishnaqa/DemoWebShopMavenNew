package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoworkshop.qa.TestBase;
public class DemoWorkShop_Books_Page extends TestBase{
	
	public static final Logger log = Logger.getLogger(DemoWorkShop_Books_Page.class.getName());
	
	@FindBy(xpath= "//ul[@class='top-menu']//a[contains(text(),'Books')]") //e1
	WebElement Books_Link_Page;
	
	@FindBy(xpath = "//h1[contains(text(),'Books')]")//e2
	WebElement Verify_Books_Page;

	@FindBy(id="products-orderby")//e3
	WebElement Select_Products_Sort_By;
	
	@FindBy(id="products-pagesize")//e4
	WebElement Select_Display_products_PageSize;

	@FindBy(id="products-viewmode")//e5
	WebElement Select_View_As_Products;
	
	@FindBy(xpath = "//div[@class='master-wrapper-content']//div[1]//div[1]//div[2]//h2[1]//a[1]")//e6
	WebElement Computing_Internet_Book_Img;
	
	@FindBy(xpath = "//input[@name='addtocart_13.EnteredQuantity']")//e7
	WebElement Add_Quantity_Computig_Internet_Book;
	
	@FindBy(id = "add-to-cart-button-13")//e8
	WebElement Add_To_Cart_Botton_Computig_Internet_Book;
	
	@FindBy(xpath = "//div[@class='product-list']//div[3]//div[1]//div[1]//a[1]//img[1]")//e9
	WebElement Fiction_Book_img;

	@FindBy(id = "addtocart_45_EnteredQuantity")//e10
	WebElement Add_Quantity_Fiction_Book;
	
	@FindBy(id = "add-to-cart-button-45")//e11
	WebElement Add_To_Cart_Botton_Fiction_Book;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[5]/div/div[1]/a/img")//e12
	WebElement Health_Book_Img;	

	@FindBy(id = "addtocart_22_EnteredQuantity")//e13
	WebElement Add_Quantity_Health_Book;
	

	@FindBy(id = "add-to-cart-button-22")//e14
	WebElement Add_To_Cart_Botton_Health_Book;
	
	
	@FindBy(xpath = "//div[6]//div[1]//div[1]//a[1]//img[1]")//e15
	WebElement Science_Book_Img;

	@FindBy(id = "addtocart_27_EnteredQuantity")//e16
	WebElement Add_Quantity_Science_Book;
	

	@FindBy(id = "add-to-cart-button-27")//e17
	WebElement Add_To_Cart_Botton_Science_Book;
	

public DemoWorkShop_Books_Page() {
	PageFactory.initElements(driver, this);
}

public void Click_Books_Link(String strBooksExp) {
	log("Clicking on Books Link");
	Books_Link_Page.click();	//e1  String strBooksExp
	
	log("Verifying the Books page is displayed");
	String strBooksAct = Verify_Books_Page.getText();	//E2
	System.out.println(strBooksAct);
	if(strBooksExp.equalsIgnoreCase(strBooksAct)){
		log("Books page is displayed with expected :" + strBooksExp + " is matched with Actual value : " + strBooksAct);
	}else {
		log("Books page is not displayed with expected :" + strBooksExp + " is not matched with Actual value : " + strBooksAct);
	}	
	System.out.println("***************************************");		
}

public void Click_Computing_Internet_Book_Img() {
			
	log("Selecting product position by it index value  ");
	Select Products_Sort_By = new Select(Select_Products_Sort_By);//e3
	Products_Sort_By.selectByIndex(1);
			
	log("Selecting display size of product");
	Select Display_products = new Select(Select_Display_products_PageSize);
	Display_products.selectByIndex(2);//e4
			
	log("Selecting view of products ");
	Select View_As_Products = new Select(Select_View_As_Products);
	View_As_Products.selectByVisibleText("List");;//e5
	
	
	log("Selecting Computing and Internet Book ");
	Computing_Internet_Book_Img.click();	//e6
		
	log("Adding Quantity of Computing and Internet Book ");
	Add_Quantity_Computig_Internet_Book.clear();	//e7
	Add_Quantity_Computig_Internet_Book.sendKeys("10");//e7
	Add_To_Cart_Botton_Computig_Internet_Book.click();	//e8
		
	log("Navigating back to Book page ");
	driver.navigate().back();
	System.out.println("***************************************");
}

public void Click_Fiction_Book_Img() {
	log("Clicking on Books Link");
	Fiction_Book_img.click(); //e9
	
	log("Adding Quantity of Fiction Book ");
	Add_Quantity_Fiction_Book.clear();//e10
	Add_Quantity_Fiction_Book.sendKeys("10");//e10
	Add_To_Cart_Botton_Fiction_Book.click();//e11
	
	log("Navigating back to Book page ");
	driver.navigate().back();
	System.out.println("***************************************");
}	

public void Click_Health_Book_Img() {
	log("adding Health Book to cart");
	Health_Book_Img.click();//e12
	
	log("Adding Quantity of Health Book ");
	Add_Quantity_Health_Book.clear();//e13
	Add_Quantity_Health_Book.sendKeys("10");//e13
	Add_To_Cart_Botton_Health_Book.click();//e14
	
	log("Navigating back to Book page ");
	driver.navigate().back();
	System.out.println("***************************************");
}

public void Click_Science_Book_Img() {
	log("Adding Science Book to cart");
	Science_Book_Img.click();//e15
	
	log("Adding Quantity of Science Book ");
	Add_Quantity_Science_Book.clear();//e16
	Add_Quantity_Science_Book.sendKeys("15");//e16
	Add_To_Cart_Botton_Science_Book.click();//e17
	System.out.println("***************************************");
	
}
}
