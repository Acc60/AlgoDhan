package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicPage extends basePage {
	
	public DynamicPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath ="//*[@id=\'post-507\']/div/div/div/div[2]/div/div[1]/div/div/div/div/ul/li[5]/a")
	WebElement DynamicLink;
	
	@FindBy(xpath="//*[@id=\'post-927\']/div/form/input[1]")
	WebElement text2; 
	
	@FindBy(xpath="//*[@id=\'submitForm\']")
	WebElement submitlink2;
	
	@FindBy(xpath="//*[@id=\'post-927\']/div/form/a")
	WebElement nextSprint2;
	
	@FindBy(xpath="//*[@id=\'post-932\']/div/form/input[1]")
	WebElement sptext31;
	@FindBy(xpath="//*[@id=\'post-932\']/div/form/input[2]")
	WebElement sptext32;
	@FindBy(xpath="//*[@id=\'post-932\']/div/form/p[2]/a")
	WebElement nextSprint3;
	
	
	
	public void mainlink() {
		DynamicLink.click();
	}
	
	public void mess() {
		System.out.println("Printing first line inside dynamic page");
	}
	
	public void sexndtext2() {
		text2.sendKeys("Testing Text");
	}
	
	public void submit2() {
		submitlink2.click();
	}
	
	public void nextsprintlink2() {
		nextSprint2.click();
	}
	
	public void text31() {
		sptext31.sendKeys("Testing 3rd sp text1");
	}

	public void text32() {
		sptext32.sendKeys("Testing 3rd sp text2");
	}
	
	public void nextsprint3() {
		nextSprint3.click();
	}
}
