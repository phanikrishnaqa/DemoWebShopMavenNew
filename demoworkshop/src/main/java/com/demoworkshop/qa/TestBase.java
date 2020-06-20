package com.demoworkshop.qa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.demoworkshop.util.WebEventListener;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class TestBase {

public static final Logger log = Logger.getLogger(TestBase.class.getName());
	
public static Properties prop;
public static WebDriver driver;
public static ITestResult result;
public static ExtentReports extentRep;
public static ExtentTest extentTest;
public  static EventFiringWebDriver e_driver;
public static WebEventListener eventListener;

ChromeOptions options;

public TestBase(){
	try {
		prop = new Properties();
		File fs = new File(System.getProperty("user.dir") + "/src/main/java/com/demoworkshop/qa/config/config.properties");
		FileInputStream f = new FileInputStream(fs);
		prop.load(f);
		options = new ChromeOptions();
    	options.setPageLoadStrategy(PageLoadStrategy.NONE);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}

static {
	Calendar calendar = Calendar.getInstance();
	SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
	extentRep = new ExtentReports(System.getProperty("user.dir") + "/src/main/java/com/demoworkshop/qa/extentreportgenerator" + formatter.format(calendar.getTime()) + ".html", false);
}																										//extentreportgenerator_07_06_20_01_01_01.html

public void init() throws IOException {	
	File log4jconfpath = new File("./src/main/resources/log4j.properties");
	PropertyConfigurator.configure(log4jconfpath.getAbsolutePath());
	selectBrowsers(prop.getProperty("browser"));
	getURL(prop.getProperty("url"));
}

public void selectBrowsers(String browser) {
	
	System.out.println("------------------------OS Name--------------------------------");
	System.out.println(System.getProperty("os.name"));
	String osName = System.getProperty("os.name");
	
	if(osName.contains("Window")) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\selenium softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(options); // driver will control the chrome browser instances
			e_driver = new EventFiringWebDriver(driver);
			// Now create object of EventListerHandler to register it with EventFiringWebDriver
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver = e_driver;
		}else if(browser.equals("firefox"))
		{
			//driver = new GeckoDriverService(); 
			
		}else if(browser.equals("ie")) {
			//driver = new InternetExplorerDriver();
		}
	}else if(osName.contains("Mac")){
		if(browser.equals("chrome")) {
			driver = new ChromeDriver(); // driver will control the chrome browser instances
		}else if(browser.equals("firefox"))
		{
			//driver = new GeckoDriverService(); 
			
		}else if(browser.equals("ie")) {
			//driver = new InternetExplorerDriver();
		}
	}else if((osName.contains("ubantu"))) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver(); // driver will control the chrome browser instances
		}else if(browser.equals("firefox"))
		{
			//driver = new GeckoDriverService(); 
			
		}else if(browser.equals("ie")) {
			//driver = new InternetExplorerDriver();
		}
	}
	
}	

public void getURL(String url) {
	
	log.info("Navigating to browser : " + url);
	driver.get(url); //get the url from the properties file open the browser
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();  // after loading the browser it will maximize your browser
	
}

public void  waitforElement(WebDriver driver, int timeinMillisec, WebElement webelement) {
	WebDriverWait webdrWait = new WebDriverWait(driver,timeinMillisec);  //Static wait for your objects to identify
	webdrWait.until(ExpectedConditions.visibilityOf(webelement));
}


public String getScreenShot(String name) throws IOException {
	
	Calendar caldr = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");		
	
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String reportDir = new File(System.getProperty("user.dir")).getAbsolutePath();
	File destFile = new File(reportDir + name + sdf.format(caldr.getTime()) + ".jpeg");
	FileUtils.copyFile(scrFile,destFile);
	String strFilePath = destFile.getAbsolutePath();
	
	Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/></a>");
	
	return strFilePath;
}

@BeforeClass
public void beforeClass() {
	 System.out.println("Before Class");
	 Calendar calendar = Calendar.getInstance();
	 SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
	 //extentRep = new ExtentReports(System.getProperty("user.dir") + "/src/main/java/com/demoworkshop/qa/extentreportgenerator" + formatter.format(calendar.getTime()) + ".html", false);
	 extentRep = new ExtentReports(System.getProperty("user.dir")+"\\test-output\\ExtentReportResults.html",true);
	 extentRep.addSystemInfo("Hostname",System.getenv("COMPUTERNAME"));
	 extentRep.addSystemInfo("User Name", System.getenv("USERNAME"));
	// extentRep.addSystemInfo("Environment", prop.getProperty();
}

public void Select_Value_From_Dropdown(WebElement objSelectDropdown, int selectByIndex) {
	
	Select dropdown = new Select(objSelectDropdown);
	dropdown.selectByIndex(selectByIndex);
	
}

public void log(String data) {
	log.info(data);
	extentTest.log(LogStatus.INFO,data);  //Extent report
	Reporter.log(data); //extent report for HTML generation
}

@AfterMethod(alwaysRun=true)
public void getResult(ITestResult result) {
	String screenshotPath = null;
	 System.out.println("@After Method");
	    try
	    { 
			if(result.getStatus()==ITestResult.SUCCESS) {
				extentTest.log(LogStatus.PASS,result.getName() + " test is Pass");
			}else if(result.getStatus()==ITestResult.SKIP) {
				extentTest.log(LogStatus.SKIP,result.getName() + " test is skipped and the reason is "+ result.getThrowable());
			}else if(result.getStatus()==ITestResult.FAILURE) {
				//to add name in extent report
				extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); 
				 //to add error/exception in extent report
				extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable());
				try {
					screenshotPath = getScreenShot(result.getName());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//to add screenshot in extent report
				extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); 
				
			}else if(result.getStatus()==ITestResult.STARTED) {
				extentTest.log(LogStatus.INFO,result.getName() + " test is started");
			}
			extentRep.endTest(extentTest);
			extentRep.flush();

	    }
	    catch(Throwable t)
	    {
	    	extentTest.log(LogStatus.ERROR,t.fillInStackTrace());
	    }
}


public void endTest() {
	closeBrowser();
}

private void closeBrowser() {
	log.info("browser closed");
	extentRep.endTest(extentTest);
	extentRep.flush();
	
}

public WebElement waitForElement(WebElement webelement, long timeoutInSeconds) {
	WebDriverWait wait = new WebDriverWait(driver,timeoutInSeconds);
	wait.until(ExpectedConditions.elementToBeClickable(webelement));
	return webelement;
}
	
}