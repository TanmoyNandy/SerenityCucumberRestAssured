package bdd.stepDefinition;

import bdd.serenitySteps.PostwelcomeMessageSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PostWelcomeMessageStepDef {
	
	@Steps
	PostwelcomeMessageSteps postWelcomeMessageSteps;
	
	@Given("User sets up the Welcome Message request in proper {string}")
	public void user_sets_up_the_Welcome_Message_request_in_proper(String environment) {
	    System.out.println(environment);
	}

	@And("User uses the following parameters:")
	public void user_uses_the_following_parameters(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
	}

	@When("User sends the request with {string} in the {string}")
	public void user_sends_the_request_with_in_the(String welcomeMsgData, String jsonTemplate) {
	    System.out.println(welcomeMsgData);
	    System.out.println(jsonTemplate);
	}

	@Then("User should get back the proper response")
	public void user_should_get_back_the_proper_response() {
	    
	}



}
