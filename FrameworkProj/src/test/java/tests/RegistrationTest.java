package tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.Registration;
import resources.Base;

public class RegistrationTest extends Base {
	
	WebDriver driver;

@BeforeMethod
public void openApplication() throws IOException {
	driver=intialzeDriver();
	driver.get(prop.getProperty("url"));
	}
@Test
public void registration(){
	
	LandingPage landingPage = new LandingPage(driver);
	landingPage.myAccountDropdown().click();
	landingPage.Register().click();
	
	Registration resgistrationpage=new Registration(driver);
	resgistrationpage.firstname().sendKeys("Dummy");
	resgistrationpage.lastname().sendKeys("Insan");
	resgistrationpage.email().sendKeys("dummyinsan@gmail.com");
	resgistrationpage.telephone().sendKeys("9999999999");
	resgistrationpage.password().sendKeys("Dummy@2597");
	resgistrationpage.confirm().sendKeys("Dummy@2597");
	resgistrationpage.checkbox().click();
	resgistrationpage.submit().click();
	
}
@AfterMethod
public void closure() {
	
	driver.close();
	
}
}
