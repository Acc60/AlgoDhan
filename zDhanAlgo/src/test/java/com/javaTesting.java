package com;
import java.lang.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
public class javaTesting {
	
	public static void main(String[] args) {
		System.out.println("first line inside java testing class");
		
		
		/*
		 * String s1="Nitish"; char[] s11=s1.toCharArray(); for(int
		 * i=0;i<=s11.length-1;i++) { System.out.println(s11[i]); }
		 */
		
		/*String n1="Nitish";
		String n2="Kumar";
		System.out.println(n2.equalsIgnoreCase(n1));
		System.out.println(!(n2.equals(n1)));
		
		/*String a="Nitsh";
		String b="Kumar";
		
		
		@SuppressWarnings("rawtypes")
		ArrayList<String> l1=new ArrayList<String>();
		l1.add(a);
		l1.add(b);
		System.out.println(l1);
		System.out.println(l1.get(0));
	
		for(int i=0;i<=l1.size()-1;i++) {
			System.out.println(l1.get(i));
		}
		
		
		
		/*Lambda function in Java
		
		Lambda function could be only implemented using Functional interface;
		Functional interface is that which contains only one abstract method
		
		
		Predicate (test - retuens boolean true or false)
		Function  (apply - returns some value )
		Consumer (Accept - doesnt return any value)
	    Supplier ( Get - doent accept any input but produces output like Date) */
		
		
	/*	int ad=0;
		String s1="12+5";
		String[] s2=s1.split("\\+");
		//List<Integer> listOfInteger = convertStringListToIntList(s2, Integer::parseInt);
		for (String s:s2){
		System.out.println(s);
		int i=Integer.valueOf(s);
		ad+=i;
		}
		System.out.println(ad);
	/*	byte a=3;
		long b=a;
		System.out.println(a);
		System.out.println(b);
		
		boolean c=true;
		System.out.println(c);
		
		ArrayList[] l1=new ArrayList[4];
		
		String g="Nitish";
		char[] g1=g.toCharArray();
		String g11=g1.toString();
		System.out.println(g);
		System.out.println(g1);
		System.out.println(g11);
		
		List list=new ArrayList<Object>();
		List<String> l11=new ArrayList<String>();
		l11.add(g);
		
		Set set=new HashSet<Object>();
		Set<Integer> set1= new HashSet<Integer>();
		set1.add(1);
		set1.add(1);
		System.out.println(set1);
		
		Map<String,Integer> map=new HashMap<String, Integer>();
		map.put(g,(int) a);
		System.out.println(map);
		
		System.out.println(Pattern.matches("[/d]","a"));
		
 /*  driver.findElement(By.xpath("//*[@id=\'post-507\']/div/div/div/div[2]/div/div[1]/div/div/div/div/ul/li[7]/a")).click();
        
        System.out.println("moved to table wal page");
        Thread.sleep(2000);
        
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,650)");
       
       Thread.sleep(1000);
       
       System.out.println("Scrolled down the page");
       
       //WebElement wb1=driver.findElement(By.xpath("//*[@id=\"post-909\"]/div/div/div/div[3]/div/div[1]/div[9]/div/div/div/select"));
      // Select dd=new Select(wb1);
      // dd.selectByIndex(1);
       
       
       //driver.findElement(By.xpath("//*[@id='post-909']/div/div/div/div[3]/div/div[1]/div[8]/div/div/div/form/input[1])")).click();
       
        
     /*   Thread.sleep(1000);
      List<WebElement> tb=driver.findElements(By.xpath("//*[@id=\"post-909\"]/div/div/div/div[3]/div/div[2]/div[4]/div"));
      int count=0;
      System.out.println(tb.size());
      System.out.println("before printing the webelements");
      for (WebElement wb:tb) {
    	  count++;
    	  String s= wb.findElement(By.tagName("tr")).getText();
    	  System.out.println(s);
    	  System.out.println(count);
    	  
      }
       
       driver.findElement(By.xpath("//*[@id=\"post-507\"]/div/div/div/div[2]/div/div[1]/div/div/div/div/ul/li[4]/a")).click();
       
       String s1=driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_1\"]/div[2]/form/div/div/p/span")).getText();
    // [@id="et_pb_contact_form_1"]/div[2]/form/div/div/p/span
        
        Thread.sleep(1000);
        System.out.println(s1);
        System.out.println("All operations completed");
       // driver.quit();
         
         
        //Code to take scrrenshot
        
      //  File fil=(TakesScreenshot)driver.(getscreenshotAs(OutputType.FILE));
       // File Des=new File("");
        //FileUtils.copyFile(fil, Des);
		
		//Code to catture a captcha
        
        //Using ITessarect iimg=new ITesseract();
     //   String srg=iimg.doCR(fil);
        
       //Now, srg String is having the captcha value 
		
       // Assert.assertEquals("","");
        
        
        
        /*CODES TO RUN SELENIUM GRID STANDALONE
        
        String huburl="http://localhost:4444/wd/hub";
        
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setPlatform(platform.WIN10);
        cap.BrowserName("chrome");
        Webdriver driver= new RemoteWebDriver(new URL(huburl),cap);
        
        driver.get("");
        System.out.println(driver.getTitle());
        driver.quit();*/
        
        /* Few important commands in Docker
        
        docker version
        docker info 
        docker login
        docker help
        
        for docker images
        
        docker images
        docker pull ubuntu
        docker rmi <imageId>
        
        for container commands
        
        docker ps
        docker run <container id>
        docker start <container id>
        docker stop <container id>
        docker rmi <container id>
        
        system related
        
        docker stats
        docker system df 
        
        Also, we can directly integrate the docker to Eclipse by adding a
         "docker compose.yaml" file under src/test/resources/
         here, we need to define certain ports for hub and nodes
        
        */
        
        
        
        
        
        
        
        
        
      //  WebElement wb=driver.findElement(By.name(""));
      // WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(5000));
      // wait.until(ExpectedConditions.elementToBeClickable(wb));
	}


	}
		
		
	

