package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mainPage extends basePage{

	public mainPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath ="//*[@id=\'Automation_Practice\']/span/strong/span/span")
	WebElement pageTitle;
	
	
	public String pagetitletext() {
		String pagetitles=pageTitle.getText();
		
		//return color;
		return pagetitles;
		
	}
	
	public String fontColor() {
		
		String color=pageTitle.getCssValue("color");
		//return color;
		return color;
		
	}
	
	
}
