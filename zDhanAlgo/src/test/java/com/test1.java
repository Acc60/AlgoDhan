package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObject.Filloutforms;
import PageObject.loginPage;
import PageObject.mainPage;
import utilities.DataProviders;


public class test1 extends baseClass {
	
	
	
	    
	    @Test(priority=1,groups="sanity")
	    public void test() throws InterruptedException {
	    	System.out.println("Inside main test method");
	    	
	    	mainPage mp=new mainPage(driver);
	    	String titles=mp.pagetitletext();
	    	System.out.println(titles);
	    	//Assert.assertEquals("Automation Practice",titles);
	    	System.out.println(mp.fontColor());
	    	Thread.sleep(2000);
	    }
	    	
	    @Test(priority=2,groups={"sanity","regression"})
	    	public void fillformss() throws InterruptedException {
	    	//Interacting with fill out forms Page
	    	System.out.println("Starting interacting with fill out forms");
	    	
	    	Filloutforms forms=new Filloutforms(driver);
	    	forms.fillforms();
	    	String formtitle=forms.navigatefillform();
	    	//forms.navigatefillform();
	    	System.out.println(formtitle);
	    	Thread.sleep(2000);
	    	System.out.println("to the fill form page");
	    	forms.sendname1();
	    	Thread.sleep(4000);
	    	forms.sendmess1();Thread.sleep(4000);
	    	forms.button1();Thread.sleep(2000);
	    	forms.sendname2();Thread.sleep(2000);
	    	forms.sendmess2();Thread.sleep(2000);
	    	//forms.capText();Thread.sleep(4000);
	    	//forms.button2();
	    	driver.navigate().back();
	    	Thread.sleep(5000);
	    	System.out.println("sending name to the field");
	    	
	    	//forms.dealcaptcha();
	    	//Thread.sleep(3000);
	    	}
	    	
	    	//Navigating to login Page
	   // @Test(priority=2,enabled=true,dataProvider="logindata",dataProviderClass=DataProviders.class)
	    @Test(priority=2)
	    public void lognpages() throws InterruptedException {	
	    
	    	System.out.println("Inside login page landing at homepage");
	    	loginPage lp=new loginPage(driver);
	    	lp.loginpagein();
	    	Thread.sleep(4000);
	    	lp.verifyentry();
	    	Thread.sleep(4000);
	    	lp.loginprocess();
	    	Thread.sleep(4000);
	    	//System.out.println(name);
	    	//System.out.println(password);
	    	//loginPage lp=new loginPage(driver);
	    	//lp.loginpagein();
	    	//System.out.println("enterd the login page ");
	    	
	    	System.out.println("Testing new branch push");
	    	
	    }
	    }
	    


