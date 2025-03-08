package com;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class baseClass {

	public WebDriver driver = null;

	
    @BeforeClass(groups={"sanity","regression"})
   // @Parameters({"os","browser"})
	//public void setup(String os,String browser) throws InterruptedException, MalformedURLException {
    public void setup()throws InterruptedException {
	System.out.println("Inside Base class method 1st line");
	
	
	
	//switch(browser)
	//{
	//case "chrome" :
	
	/*	//code for selenium grid configuration
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setPlatform(Platform.WIN10);
		cap.setBrowserName("chrome");
		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);*/
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAHUL\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
    ChromeOptions option=new ChromeOptions();
    option.addArguments("--remote-allow-origins=*");
    driver=new ChromeDriver();
   // break;
	
	
	//case "edge" :
	
    
	/*	//code for selenium grid configuration
		DesiredCapabilities cap1=new DesiredCapabilities();
		cap1.setPlatform(Platform.WIN10);
		cap1.setBrowserName("MicrosoftEdge");
		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap1);*/
		
      //  System.setProperty("webdriver.edge.driver","C:\\Users\\RAHUL\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
        //driver=new EdgeDriver();
  // break;
	//}
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    
   // driver.get("C:\\Users\\RAHUL\\Downloads\\Sushil Raghuwanshi-Resume");
    
    driver.get("https://ultimateqa.com/automation");
    System.out.println("browser opened successfully");
    Thread.sleep(5000);
    
    }
    
    @AfterClass(groups= {"sanity","regression"})
    public void teardown() {
    	System.out.println("closing the browser");
    	driver.quit();
    
    }
	
}
