package pkg;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alrt {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/anjan/OneDrive/Luminar/works/Java/alert.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//driver.switchTo().alert().accept();
		Alert a=driver.switchTo().alert();
		String str=a.getText();
		System.out.println(str);
		if(str.equals("hello i am an alert box"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("anjana");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("123");
	}

}
