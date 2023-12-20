package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.TestBase;

public class SearchProduct extends TestBase{
 
    @FindBy(xpath = "//input[@placeholder='Search Amazon.in']")private WebElement search;
    @FindBy(xpath = "//div[@class='autocomplete-results-container']")private 	List<WebElement> productlist;
    @FindBy(xpath = "//div[@aria-label='iphone 15 pro max']")private 	WebElement selectfromlist;
 //@FindBy(xpath = "(//span[text()='iPhone 15 Pro Max (256 GB) - Natural Titanium'])[1]")private WebElement iphone15;
   @FindBy(xpath = "(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")private WebElement iphone15;  
   @FindBy(xpath = "(//span[text()='1,56,900'])[5]")private WebElement iphoneprice;
    @FindBy(xpath = "//input[@id='buy-now-button']")private WebElement addcart;

    public SearchProduct(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    
    public void buyiphone()   {
    	search.sendKeys("iphone");
    }
    
    public void selectfromlist() throws Exception
    {   Thread.sleep(2000);
    	selectfromlist.click();  	
    	for (WebElement option : productlist) {
			if (option.getText().contains(" 15 pro max")) {
				option.click();
				break;
			}
		}
    }
    
   public void productdetailspage()
   {
	   iphone15.click();
   }
    
   public void verifyprice() throws Exception
   {
      String iphonep = iphoneprice.getText();
	  System.out.println("Prive of iphone 15 pro max is : " + iphonep);
      Thread.sleep(3000);
   }

   public void addtocart() throws Exception
   {
	   addcart.click(); //it will not run because of secure transcition
   }
}
