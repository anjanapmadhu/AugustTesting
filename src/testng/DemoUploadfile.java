package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoUploadfile {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test()
	{
	driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\anjan\\OneDrive\\Luminar\\NOTES\\SEMINAR.pdf");
	driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}

}
