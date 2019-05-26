package bdd.serenitySteps;

import io.restassured.response.Response;

public class CommonSteps {
	
	public int verifyStatus(Response resp)
	{
		return resp.statusCode();		
	}

}
