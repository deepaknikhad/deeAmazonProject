package steps;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.*;
import pages.Validateproduct;

public class Validate_Product {

	Validateproduct vp = new Validateproduct(TestBase.getDriver());
	
	@When("Search phone")
	public void search_phone() throws Exception {
		vp.searchphone();
	}
	
	@When("apply filters")
	public void apply_filters() throws Exception {
	  vp.applyfilters();
	}
	
	@Then("validate the filtered list")
	public void validate_the_filtered_list() {
	    String validat = vp.validatee();
		Assert.assertEquals(validat, "X-level Compatible With Iphone 12 Pro Max Case Ultra-Thin Soft Flexible Tpu Matte Finish Coating Grip Slim Fit Phone Case [Guardian Series] Light Protective Back Cover 6.7\" 2020,Black");
	}
	
}
