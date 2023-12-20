package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

public static WebDriver driver;
public static WebDriverWait wait; 
protected static Actions act;
	
public WebDriver initilizationBrowser(String browsername)
{
	if(browsername.equals("Chrome"))
	{
	  //  driver = new ChromeDriver();
	}
	else if(browsername.equals("Firefox"))
	{
	    driver = new FirefoxDriver();
	}
	else if(browsername.equals("Edge"))
	{
	    driver = new EdgeDriver();
	}
	else if(browsername.equals("chrome"))
	{
		driver = new ChromeDriver();
	}
	
	return driver;  
}

public static WebDriver getDriver()
{
	return driver;
}
	
}
