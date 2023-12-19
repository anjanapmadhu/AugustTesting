package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redifff_drop {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		WebElement day = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select D =new Select(day);
		D.selectByValue("20");
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select M=new Select(month);
		M.selectByIndex(9);
		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select y=new Select(year);
		y.selectByVisibleText("2001");
		
		List<WebElement> li = D.getOptions();
		System.out.println(li.size());
		List<WebElement> lii = M.getOptions();
		System.out.println(lii.size());
		List<WebElement> lis = y.getOptions();
		System.out.println(lis.size());
		
	 
	}
	

}
