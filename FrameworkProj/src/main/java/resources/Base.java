package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	WebDriver driver;
	public Properties prop;
    public WebDriver intialzeDriver() throws IOException {
	 prop=new Properties();
	
	String propPath=System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
	
	FileInputStream fis=new FileInputStream(propPath);
	
	prop.load(fis);
	
	String browserName=prop.getProperty("browser");
	if (browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if (browserName.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else if (browserName.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	return driver;
} 
}
