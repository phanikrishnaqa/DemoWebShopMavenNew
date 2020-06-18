package com.demoworkshop.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoworkshop.qa.TestBase;
public class DemoWorkShop_HomePage extends TestBase{
public static final Logger log = Logger.getLogger(DemoWorkShop_HomePage.class.getName());
	
	
	@FindBy(className ="ico-login")
	WebElement Login;
	
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	WebElement DemoWorkShop;
	
	
	
	public DemoWorkShop_HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void DemoWorkShop_Homepage(String strDemoworkshop) 
	{		
		log("Verifying the home page is displayed");
		String strDemoWorkShopAct = DemoWorkShop.getText();
		if(strDemoworkshop.equalsIgnoreCase(strDemoWorkShopAct)){
			log("Home page is displayed with expected :" + strDemoworkshop + " is matched with Actual value : " + strDemoWorkShopAct);
		}else {
			log("Home page is not displayed with expected :" + strDemoworkshop + " is not matched with Actual value : " + strDemoWorkShopAct);
		}		
	}
}
