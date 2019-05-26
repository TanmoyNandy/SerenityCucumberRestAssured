package support.domain.pojoResponse;

import java.util.ArrayList;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Entities {
		 
	ArrayList<Object> urls = new ArrayList<Object>();
	ArrayList<Object> hashtags = new ArrayList<Object>();
	ArrayList<Object> user_mentions = new ArrayList<Object>();
	ArrayList<Object> symbols = new ArrayList<Object>();
	
	ArrayList<Object> url = new ArrayList<Object>();
	ArrayList<Object> description = new ArrayList<Object>();
}