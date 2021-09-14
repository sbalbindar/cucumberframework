package step;

import amazonImplementation.Product;
import amazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchStep {
	Product product;
	Search search;
	@Given("I have a search field on amazon")
	public void i_have_a_search_field_on_amazon() {
	    System.out.println("search page");
	}

	@When("I search for laptop {string} and price {int}")
	public void i_search_for_laptop_and_price(String laptopname, Integer price) {
		product=new Product(laptopname,price);
	    
	}

	@Then("Product name {string} should be displayed")
	public void product_name_should_be_displayed(String laptopname) {
		search= new Search();
		search.displayProduct(product);
		
	    
	}

}
