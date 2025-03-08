package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Filloutforms extends basePage {
	
	
	
	
	public Filloutforms(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//*[@id=\"post-507\"]/div/div/div/div[2]/div/div[1]/div/div/div/div/ul/li[4]/a")
	WebElement fillformlink;
	
	@FindBy(xpath="//*[@id=\'et_pb_contact_name_0\']")
	WebElement name1;
	
	@FindBy(xpath="//*[@id=\'et_pb_contact_name_1\']")
	WebElement name2;
	
	@FindBy(xpath="//*[@id=\"et_pb_contact_message_0\"]")
	WebElement mess1;
	
	@FindBy(xpath="//*[@id=\"et_pb_contact_message_1\"]")
	WebElement mess2;
	
	
	@FindBy(xpath="//*[@id=\'et_pb_contact_form_1\']/div[2]/form/div/div/p/span")
	WebElement captcha;
	
	@FindBy(xpath="//*[@id=\"et_pb_contact_form_1\"]/div[2]/form/div/div/p/input")
	WebElement captext;
	
	@FindBy(xpath="//*[@id=\"et_pb_contact_form_0\"]/div[2]/form/div/button")
	WebElement Button1;
	
	@FindBy(xpath="")
	WebElement Button2;
	
	public void fillforms() {
		fillformlink.click();
	}
	
	public String navigatefillform() {
		
		String title=driver.getCurrentUrl();
		return title;
	}
	
	public void sendname1() {
		name1.sendKeys("Nitish");
	}
	
	public void sendname2() {
		name2.sendKeys("Kumar");
	}
	
	public void sendmess1(){
		mess1.sendKeys("Message1");
	}
	
	public void sendmess2() {
		mess2.sendKeys("Message2");
	}
	
	public void button1() {
		Button1.click();
	}
	int a=19;
	
	public void capText() {
		captext.sendKeys(String.valueOf(19));
	}
	
	public void button2() {
		Button2.click();
	}
	
	public void dealcaptcha() {
		String cap=captcha.getText();
		System.out.println(cap);
		int ad=0;
		
		String[] s2=cap.split("\\+");
		//List<Integer> listOfInteger = convertStringListToIntList(s2, Integer::parseInt);
		for (String s:s2){
		System.out.println(s);
		int i=Integer.valueOf(s);
		ad+=i;
		}
		String s11=String.valueOf(ad);
		System.out.println(ad);
		captext.sendKeys(s11);
		
	}
	
	

}
