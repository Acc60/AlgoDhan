package com;
import org.testng.annotations.Test;

import PageObject.DynamicPage;

@Test
public class Test2 extends baseClass{
	
	
	public void dynamicpages() throws InterruptedException {
	
	DynamicPage dl=new DynamicPage(driver);
	
	dl.mess();
	dl.mainlink();
   Thread.sleep(4000);
   
   dl.sexndtext2();
   dl.nextsprintlink2();
   Thread.sleep(4000);
   
   dl.text31();
   dl.text32();dl.nextsprint3();
   Thread.sleep(4000);

}
	}
