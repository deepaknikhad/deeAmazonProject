package steps;

import base.TestBase;
import io.cucumber.java.en.*;
import pages.SearchProduct;

public class Search_Product {
	
	SearchProduct sp = new SearchProduct(TestBase.getDriver());
	
	@When("Search iphone")
	public void search_iphone() {
		sp.buyiphone();
	}
	
	@When("select from the list")
	public void select_from_the_list() throws Exception {
	    sp.selectfromlist();
	}
	
	@When("go to product details page")
	public void go_to_product_details_page() {
	  sp.productdetailspage();
	}
	
	@When("select and store price in a variable") 
	public void select_and_store_price_in_a_variable() throws Exception {
	 sp.verifyprice();
	}
	
	@Then("add to cart")
	public void add_to_cart() throws Exception {
	//    sp.addtocart();
	}
}
