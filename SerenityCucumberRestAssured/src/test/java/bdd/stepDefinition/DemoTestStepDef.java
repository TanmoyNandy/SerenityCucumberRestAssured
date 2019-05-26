package bdd.stepDefinition;

import bdd.serenitySteps.StatusFromHomeTimelineSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import support.domain.pojoResponse.StatusFromHomeTimelinePOJO;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;


public class DemoTestStepDef {
	
	List<StatusFromHomeTimelinePOJO> statuses;
	
	@Steps
	StatusFromHomeTimelineSteps statusFromHomeTimeline;
	
	
	 
	
	@Given("I need to fetch {string} tweet from the home timeline")
	public void i_need_to_fetch_tweet_from_the_home_timeline(String string) {
	    statusFromHomeTimeline.fetchTweetsFromHometimeline(string);
	}

	@When("I send the request to fetch the tweets")
	public void i_send_the_request_to_fetch_the_tweets() {
		statusFromHomeTimeline.sendRequest();
	}

	@Then("The API should return a proper response")
	public void the_API_should_return_a_proper_response() {
	    statuses = statusFromHomeTimeline.getStatuses();
	    assertThat(statuses).isNotEmpty();
	}

	@And("The Id in the response should not be null")
	public void the_Id_in_the_response_should_not_be_null() {
	    for(StatusFromHomeTimelinePOJO s : statuses)
	    {
	    	System.out.println(s.getId());
	    	assertThat(s.getId()).isNotNull();
	    }
	}

	@And("The text field in the response should not be null")
	public void the_text_field_in_the_response_should_not_be_null() {
		for(StatusFromHomeTimelinePOJO s : statuses)
		{
	    	System.out.println(s.getText());
			assertThat(s.getText()).isNotNull();
	    }
	}

	@And("The Following parameter in the response should be {string}")
	public void the_Following_parameter_in_the_response_should_be(String string) {
		System.out.println("ekhane elo "+string);
		for(StatusFromHomeTimelinePOJO s : statuses)
		{
			System.out.println("bhetore dhuklo");
			System.out.println(s.getUser().getFollowing());
			assertThat(s.getUser().getFollowing()).isEqualTo(string);
		}
	}
	
}
