package bdd.serenitySteps;

import io.restassured.RestAssured;
import net.thucydides.core.annotations.Step;

public class PostwelcomeMessageSteps {
	
	
	
	@Step
	public void xyz()
	{
		RestAssured.baseURI = configFileReader.getEndpoint();
	}

}
