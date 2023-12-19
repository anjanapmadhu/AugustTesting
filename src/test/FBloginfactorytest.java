package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FBloginfactory;

public class FBloginfactorytest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void login()
	{
		FBloginfactory ob=new FBloginfactory(driver);
		ob.setvalues("abc@gamil", "asdf");
		ob.login();
	}

}
