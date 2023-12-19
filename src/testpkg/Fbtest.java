package testpkg;

import org.testng.annotations.Test;

import base.Baseclass;
import pagepkg.Fbpage;
import utilities.Excelutil;

public class Fbtest extends Baseclass {
	@Test
	public void verifyloginwithvalidcred()
	{
		Fbpage p1=new Fbpage(driver);
		String x1="D:\\data.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutil.getRowCount(x1,Sheet);
		for(int i=1;i<rowCount;i++)
		{
			String username=Excelutil.getCellVale(x1, Sheet, i, 0);
			System.out.println("username---"+username);
			String passwd=Excelutil.getCellVale(x1,Sheet,i,1);
			System.out.println("password---"+passwd);
			p1.setvalues(username, passwd);
			p1.login();
		}
	}
	

}
