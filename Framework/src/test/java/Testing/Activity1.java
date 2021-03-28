package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		//System.setProperty("webdriver.gecko.driver","D:\\Library\\geckoDriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://google.com");

	}

}
