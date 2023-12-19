package testng;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extended_Report {
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	@BeforeTest
	public void beftest()
	{
		reporter=new ExtentHtmlReporter(".Reporter/myreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("fubctional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname","localhost");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("testername","anjana");
		extent.setSystemInfo("Browser Name", "chrome");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		
	}
	@BeforeMethod
	public void setup()
	{
		driver.get("https://www/facebook.com");
	}
	@Test
	public void fbtitleverification() throws IOException
	{
		test=extent.createTest("Fb title verification");
		String Exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(Exp, actual);
	}
	@Test
	public void fbbuttontest()
	{
		test=extent.createTest("Fbbuttontest");
		String buttontext=driver.findElement(By.xpath("//*[@name=\"login\"])")).getText();
		Assert.assertEquals(buttontext, "register");
	}
	@Test
	public void fblogotest()
	{
		test=extent.createTest("Fb logo test");
		boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
		Assert.assertTrue(b);
		
		
	}
	
	

}
