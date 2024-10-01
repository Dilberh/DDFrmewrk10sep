package testcasepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

import utilitiespackage.Configutration;

public class BaseCl {
	
	public static WebDriver driver=null;
	public static Configutration rc= new Configutration();
	String Url1= rc.geturl();
	String Brow=rc.getbrowser();
	@BeforeClass
	public void browserL()
	{
		switch(Brow.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver();break;
		
		case "msedge":driver=new EdgeDriver();break;
		
		}
		
	}

}
