package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class RegistratorNewUser extends TestBase {

    @FindBy(xpath = "//a[@data-nav-role='signin']//span[@class='nav-line-1 nav-progressive-content']")private WebElement ClickonSignin;
    @FindBy(xpath = "//a[@id='createAccountSubmit']")private WebElement createaccount;
   @FindBy(xpath = "//input[@id='ap_customer_name']")private WebElement firstAndLastName;
    @FindBy(xpath =  "//input[@id='ap_phone_number']")private WebElement mobileNumber;
    @FindBy(xpath = "//input[@id='ap_email']")private WebElement eMailId;
    @FindBy(xpath = "//input[@id='ap_password']")private WebElement password;
    @FindBy(xpath = "//input[@id='continue']")private WebElement verifyMobileNumbercontinue;


    public RegistratorNewUser(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
          
    public void newUserRegistration() throws Exception 
    {
    	ClickonSignin.click();
    }
    
    public void signup()
    {
     	createaccount.click();
    }
    
    public void filldetails() 
    {
    	firstAndLastName.sendKeys("deepak");    
    	mobileNumber.sendKeys("9876543212");      
    	eMailId.sendKeys("deepak12345678@gmail.com");      
    	password.sendKeys("12345678");        
      }
            
    public void VerifyMobileNumber()
    {
    	verifyMobileNumbercontinue.click();
    	
    }
    
}
