package support.domain;

import static support.domain.EndpointResources.STATUSFROMHOMETIMELINE;
import static support.domain.queryParams.GetStatusFromHomeTimelineEnum.COUNT;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import support.dataProvider.ConfigFileReader;
import support.dataProvider.DataHub;
import support.domain.pojoRequest.GetStatusFromHomeTimelineData;

public class Test {

	public static void main(String[] args) {
		ConfigFileReader configFileReader = new ConfigFileReader();
		HashMap<String, String> datamap = new HashMap<String, String>();
		datamap = DataHub.DataMap(COUNT.getQueryParam(), "1");		
		
		GetStatusFromHomeTimelineData getStatusFromHomeTimelineData = new GetStatusFromHomeTimelineData(datamap);
		System.out.println("a");
		RequestSpecification req = RestAssured.given();
		System.out.println("b");
		req.baseUri(configFileReader.getEndpoint());
		System.out.println("c");
		req.auth().oauth(configFileReader.getConsumerAPIKey(), configFileReader.getConsumerSecretAPIKey(), configFileReader.getAccessToken(), configFileReader.getAccessTokenSecret());
		System.out.println("d");
		req.queryParam(COUNT.getQueryParam(), (getStatusFromHomeTimelineData.getCount()));
		System.out.println("e");
		Response resp = req.get(configFileReader.getEndpoint()+STATUSFROMHOMETIMELINE.getResource());
		System.out.println("f");
		System.out.println(resp.statusCode());

	}

}
