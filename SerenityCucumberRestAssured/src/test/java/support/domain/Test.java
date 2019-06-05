package support.domain;

import static support.domain.EndpointResources.STATUSFROMHOMETIMELINE;
import static support.domain.queryParams.GetStatusFromHomeTimelineEnum.COUNT;

import java.util.HashMap;

import com.codoid.products.exception.FilloException;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import support.dataProvider.ConfigFileReader;
import support.dataProvider.DataHub;
import support.dataProvider.ExcelReaderUtility;
import support.domain.pojoRequest.GetStatusFromHomeTimelineData;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println(System.getProperty("user.dir"));
			ExcelReaderUtility.DataMap("Environment", "Env", "DEVENV");
		} catch (FilloException e) {
			e.printStackTrace();
		}

	}

}
