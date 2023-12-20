package steps;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistratorNewUser;

public class Registert_New_User{
 
	RegistratorNewUser newuser = new RegistratorNewUser(TestBase.getDriver());

	@Given("User is at the Home page")
	public void user_is_at_the_home_page() {
	 WebDriver driver = TestBase.getDriver();
	 driver.get("https://www.amazon.in/");
	}
	
	@When("Move to signin button")
	public void move_to_signin_button() throws Exception {
		newuser.newUserRegistration();
	}
	
	@When("click on Start here")
	public void click_on_start_here() {
		newuser.signup();
	}
	
	@When("Enter The Detail")
	public void enter_the_detail() {
		newuser.filldetails();
	}
	
	@Then("Click on verify Mobile button")
	public void click_on_verify_mobile_button() {
		newuser.VerifyMobileNumber();
	}
	
	
	
	
	
	
	
	
	
	
}
