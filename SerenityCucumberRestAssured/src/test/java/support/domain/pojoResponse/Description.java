package support.domain.pojoResponse;

import java.util.ArrayList;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Description {
	ArrayList<Object> urls = new ArrayList<Object>();

}
