package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("User is on the page")
	public void user_is_on_the_page() {
	    System.out.println("I am in Given");
	}
	@When("User logs into application")
	public void user_logs_into_application() {
		  System.out.println("I am in When");

	}
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		  System.out.println("I am in Then");
	  
	}
	

}
