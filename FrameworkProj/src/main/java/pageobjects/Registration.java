package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	
 WebDriver driver;
 
	public Registration(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="input-firstname")
	WebElement FN;
	
	@FindBy(id="input-lastname")
	WebElement LN;
	
	@FindBy(id="input-email")
	WebElement emailid;
	
	@FindBy(id="input-telephone")
	WebElement tele;
	
	@FindBy(id="input-password")
	WebElement pwd;
	
	@FindBy(id="input-confirm")
	WebElement Confirmpwd;
   
	
	@FindBy(name="agree")
	WebElement checkbox;
    
	
	@FindBy(css="input[type='submit']")
	WebElement submit;
	
    public WebElement firstname() {
		return FN;
	}
    
    public WebElement lastname() {
		return LN;
	}
    
    public WebElement email() {
		return emailid;
	}
    
    public WebElement telephone() {
		return tele;
	}
    
    public WebElement password() {
		return pwd;
	}
    
    public WebElement confirm() {
		return Confirmpwd;
	}
    
    public WebElement checkbox() {
		return checkbox;
	}
    
    public WebElement submit() {
		return submit;
	}
}
