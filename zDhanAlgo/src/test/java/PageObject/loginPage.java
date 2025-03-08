package PageObject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class loginPage extends basePage {
	
	public  loginPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//*[@id=\"post-507\"]/div/div/div/div[2]/div/div[1]/div/div/div/div/ul/li[6]/a")
	WebElement loginlink;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div/article/h2")
	WebElement entrytext; 
	
	@FindBy(xpath="//*[@id=\"user[email]\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"user[password]\"]")
	WebElement password;
		
	@FindBy(xpath="//Button[@Class='button button-primary g-recaptcha']")
	WebElement submit;

	
	public void loginpagein() {
		loginlink.click();
	}
	
	public void verifyentry() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		entrytext=wait.until(ExpectedConditions.visibilityOf(entrytext));
		String a=entrytext.getText();
		Assert.assertEquals(a, "Welcome Back!");
		
	}
	
	public void loginprocess() throws InterruptedException {
		email.sendKeys("abc@gmail.com");
		password.sendKeys("abc");
		Thread.sleep(2000);
		submit.click();
	}
}

