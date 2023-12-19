package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Demoguru {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test()
	{
		Actions act=new Actions(driver);
		WebElement button=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(button).perform();
		//act.perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
		Alert a=driver.switchTo().alert();  //store in an interface to do multiple things
		//Alert=driver.switchTo().alert().accept();[only for ok]
		System.out.println(a.getText());    //to get text
		a.accept();
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick).perform();
		Alert b=driver.switchTo().alert();
		System.out.println(b.getText());
		b.accept();
		
	}
	
	

}
