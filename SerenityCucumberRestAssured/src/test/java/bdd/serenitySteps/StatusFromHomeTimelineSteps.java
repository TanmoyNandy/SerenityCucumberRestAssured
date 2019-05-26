package bdd.serenitySteps;

import java.util.HashMap;
import java.util.List;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import lombok.Getter;
import net.thucydides.core.annotations.Step;
import support.dataProvider.ConfigFileReader;
import support.dataProvider.DataHub;
import support.domain.pojoRequest.GetStatusFromHomeTimelineData;
import support.domain.pojoResponse.StatusFromHomeTimelinePOJO;
import static support.domain.EndpointResources.*;
import static support.domain.queryParams.GetStatusFromHomeTimelineEnum.*;

@Getter
public class StatusFromHomeTimelineSteps {
	
	ConfigFileReader configFileReader;
	List<StatusFromHomeTimelinePOJO> statuses;
	RequestSpecification req;
	
	@Step
	public void fetchTweetsFromHometimeline(String numberOfStatuses)
	{
		configFileReader = new ConfigFileReader();		
		RestAssured.baseURI = configFileReader.getEndpoint();
		
		HashMap<String, String> datamap = new HashMap<String, String>();
		datamap = DataHub.DataMap(COUNT.getQueryParam(), numberOfStatuses);		
		GetStatusFromHomeTimelineData getStatusFromHomeTimelineData = new GetStatusFromHomeTimelineData(datamap);
		
		/*
		 * statuses = given(). auth().oauth(configFileReader.getConsumerAPIKey(),
		 * configFileReader.getConsumerSecretAPIKey(),
		 * configFileReader.getAccessToken(), configFileReader.getAccessTokenSecret()).
		 * queryParam(COUNT.getQueryParam(),
		 * (getStatusFromHomeTimelineData.getCount())). when().
		 * get(STATUSFROMHOMETIMELINE.getResource()). then().log().ifError().
		 * extract().response().jsonPath().getList("",
		 * StatusFromHomeTimelinePOJO.class);
		 */
		
		req = RestAssured.given().
				auth().oauth(configFileReader.getConsumerAPIKey(), configFileReader.getConsumerSecretAPIKey(), configFileReader.getAccessToken(), configFileReader.getAccessTokenSecret()).
				queryParam(COUNT.getQueryParam(), (getStatusFromHomeTimelineData.getCount()));
	}
	
	@Step
	public void sendRequest()
	{
		statuses = req.when().
							get(STATUSFROMHOMETIMELINE.getResource()).
						then().
							extract().response().jsonPath().getList("",StatusFromHomeTimelinePOJO.class);		
	}
}
