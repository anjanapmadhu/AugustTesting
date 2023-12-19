package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googleprgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//titleverification
		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String Expectedtitle="Google";
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
