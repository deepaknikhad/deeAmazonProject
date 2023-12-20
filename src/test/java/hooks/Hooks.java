package hooks;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	WebDriver driver;
	Properties prop ;
	FileInputStream fis;
	TestBase df;
	
	@Before
	public void LaunchBrowser() throws Exception
	{		
	    prop  = new Properties();        
	    String path = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
        fis = new FileInputStream(path);
        prop.load(fis);

       String browsername = prop.getProperty("browser");
       df = new TestBase();
       driver = df.initilizationBrowser(browsername);
        driver.manage().window().maximize();     
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));
	}
		
	@After
	public void afterHook()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
