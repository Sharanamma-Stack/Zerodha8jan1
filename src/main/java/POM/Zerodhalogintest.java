package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodhalogintest {
	 

		@FindBy(xpath="//input[@id='userid']")private WebElement userName;

		@FindBy(xpath="//input[@id='password']")private WebElement password;
		
	    @FindBy(xpath="//button[@class='button-orange wide']")private WebElement submit;
	    
	    @FindBy(xpath="//input[@id='pin']")private WebElement PinNumber;
	    
	    @FindBy(xpath="//button[@type='submit']")private WebElement loginsub;
	    
	    public Zerodhalogintest(WebDriver driver)
	    {
	    PageFactory.initElements(driver,this);
	    }
	    public void enterUsername(String user) {
	    	userName.sendKeys(user);
	    }
	    public void enterPassword (String pass) {
	    	password.sendKeys(pass);
	    }
	    public void clickOnSubmit() {
	    	submit.click();
	    }
	    
	    public void enterpnumber(String pin) {
	    	PinNumber.sendKeys(pin);
	    }
	    
	    public void create()
	    {
	    	loginsub.click();}
	    
 

}
