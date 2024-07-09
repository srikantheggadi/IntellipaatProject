package Stepdefination;

import Utilles.TextContext;
import io.cucumber.java.en.*;

public class Amazon {
	TextContext context;
	public Amazon(TextContext context) {
    this.context=context;
	}
	@Given("User enter the product name and click on baby wishlist page")
	public void homepage() throws InterruptedException {
     context.pageobjectmanager.getAmazonhomepage().babywishlist();
	}
	@When("User click on benefits")
	public void user_click_on_benefits() {
		context.pageobjectmanager.getBabyWishlist().clickBenefit();
    
	}

	@Then("User verify the baby wishlist Benefits page")
	public void user_verify_the_baby_wishlist_benefits_page() {
		context.pageobjectmanager.getBabyBenefits().getBenefitpagetitle();
	}
	@Given("user enters the product name")
	public void user_enters_the_product_name() {

	}

	@When("user selects the memory capacity")
	public void user_selects_the_memory_capacity() {

	}
}
