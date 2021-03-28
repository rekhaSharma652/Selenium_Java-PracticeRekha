package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotation {
	
	WebDriver driver;
  @Test
  public void TestCase1() 
  {
	  System.out.println("This is my first TestCase");
	  driver.get("http://www.google.com");
	  System.out.println("CurrentPage is" +driver.getTitle());

  }
  @Test
  public void TestCase2() {
	  System.out.println("This is my Second TestCase");
	  driver.get("http://www.Facebook.com");
	  System.out.println("CurrentPage is" +driver.getTitle());


  }
  @BeforeMethod
  public void beforeMethod() {
  
  System.out.println("This is my beforemethod");
  //driver= new FirefoxDriver();
//  System.out.println("Browseropen");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is my Afteremethod");
//driver.quit();
//System.out.println("Browserclose");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is my beforeclass");
	  driver= new FirefoxDriver();
	  System.out.println("Browseropen");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is my Afterclass");
	  driver.quit();
	  System.out.println("Browserclose");


  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is my beforeTest");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is my afterTest");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is my beforeSuite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is my afterSuite");

  }

}
