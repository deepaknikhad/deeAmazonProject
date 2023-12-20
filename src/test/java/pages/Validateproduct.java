package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.TestBase;

public class Validateproduct extends TestBase{
	
    @FindBy(xpath = "//input[@placeholder='Search Amazon.in']")private WebElement search;
    @FindBy(id = "nav-search-submit-button")private WebElement searchbutton;
    @FindBy(xpath = "//span[@class='a-button-text a-declarative']")private WebElement sortby;
    @FindBy(xpath  = "//div[@id='a-popover-6']//ul//li[4]")private WebElement avgcustomer;
    @FindBy(xpath  = "//span[text()='X-level Compatible With Iphone 12 Pro Max Case Ultra-Thin Soft Flexible Tpu Matte Finish Coating Grip Slim Fit Phone Case [Guardian Series] Light Protective Back Cover 6.7\" 2020,Black']")private WebElement iphon12;
 
   
    public Validateproduct(WebDriver driver)   {
        PageFactory.initElements(driver, this);
    }
    
    public void searchphone() throws Exception  {
    	search.sendKeys("phone");   
    	searchbutton.click();
    }
    
    public void applyfilters() throws Exception   {
    	sortby.click();
    	act = new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).build().perform();
    	Thread.sleep(5000);
    	iphon12.click();
    }

    public String validatee()
    {
    String i12 = iphon12.getText();
    System.out.println(i12);
	return i12;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
