package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String Expectedtitle="Amazon";
		if(actualtitle.equals(Expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}
