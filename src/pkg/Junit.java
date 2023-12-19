package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//System.out.println("browseropen");
	}
	@Test
	public void titleverification()
	{
			String acttitle=driver.getTitle();
			System.out.println("acttitle");
			//System.out.println("testactivity");
			
	}
	@Test
	public void contentverify()
	{
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@After
	public void exit()
	{
		driver.quit();
	}

}
