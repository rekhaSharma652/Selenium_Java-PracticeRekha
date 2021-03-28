package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	@BeforeMethod
	public void SetupBrowser()
	{

		 driver= new FirefoxDriver();
		driver.get("Http://www.google.com");
		System.out.println("OPen Browser");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority=1)
	public void googleTitleTest()
	{
		
		String title=driver.getTitle();
		System.out.println("Title is" + title);
	}
	@Test(priority=2)
	public void googleLogoTest()
	{
		
		boolean logo=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println("Logo is" + logo);
	}
	
	@Test(priority=3)
	public void EmailLinkTest()
	{
	boolean Email	=driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/&ogbl']")).isDisplayed();
		System.out.println("Email is" + Email);
	}
	
	@AfterMethod
	public void closeDriver()
	{
		driver.close();
		System.out.println("close Browser");

	
	}
}
