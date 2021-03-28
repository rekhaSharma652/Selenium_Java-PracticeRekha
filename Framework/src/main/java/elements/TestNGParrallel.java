package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGParrallel {

	
	WebDriver driver;
	@Test
	public void test1() throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new FirefoxDriver();
		driver.get("Http://www.google.com");
		System.out.println("I am Inside one" +Thread.currentThread().getId());

		Thread.sleep(3000);
		driver.close();

	}
	
	@Test
	public void test2() throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new FirefoxDriver();
		driver.get("Http://www.facebook.com");
		System.out.println("I am Inside Two"+Thread.currentThread().getId());

		Thread.sleep(3000);
		driver.close();

	}


}
