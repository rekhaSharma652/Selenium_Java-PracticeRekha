package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Halfebay {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("Http://www.google.com");
	}
@AfterMethod
public void TearDown()
{
	driver.quit();
}

}
