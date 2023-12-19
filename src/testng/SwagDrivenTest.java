package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagDrivenTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() throws IOException
	{
		File f=new File("D:\\swag.xlsx");
		FileInputStream abc=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(abc);
		XSSFSheet data=wb.getSheet("Sheet1");
		System.out.println(data.getLastRowNum());
		
		for(int i=1;i<=data.getLastRowNum();i++)
		{
			String username=data.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+username);
			String password=data.getRow(i).getCell(1).getStringCellValue();
			System.out.println(password);
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}
	
	

}
}
