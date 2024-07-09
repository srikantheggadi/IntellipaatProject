package Stepdefination;

import Utilles.TextContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LearnMoreAlert {
	TextContext context;
	String confirmationmessage;
	public LearnMoreAlert(TextContext context) {
		this.context=context;
	}
	@Given("User click on the confirmation box")
	public void user_click_on_the_confirmation_box() {
	   context.pageobjectmanager.getLearnMoreAlertPage().clickConfirmationBox();
	}

	@When("User get the confirmation message text and click the cancel button")
	public void user_get_the_confirmation_message_text_and_click_the_cancel_button() {
	 confirmationmessage = context.pageobjectmanager.getLearnMoreAlertPage().getConfirmationmessageText();
	 System.out.println("Confirmation message: " + confirmationmessage);
	 context.pageobjectmanager.getLearnMoreAlertPage().clickCancelButton();
	}

	
	
	@Then("Validate the confirmation and UI text")
	public void validate_the_confirmation_and_ui_text() {
		System.out.println("Validating the confirmation message.");
	 Assert.assertEquals("Press a Button !", confirmationmessage);
	 String uiText=context.pageobjectmanager.getLearnMoreAlertPage().getConfirmBoxUiText();
	 System.out.println("UI text: " + uiText);
	 Assert.assertEquals("You Pressed Cancel", uiText);

	}
}
