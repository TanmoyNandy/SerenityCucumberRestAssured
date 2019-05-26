package support.domain;

public enum EndpointResources {
	STATUSFROMHOMETIMELINE("/statuses/home_timeline.json"),
	POSTTWEET("/statuses/update.json"),
	DELETETWEET("/statuses/destroy/"),
	WELCOMEMESSAGE("/direct_messages/welcome_messages/new.json"),
	DELETEWELCOMEMESSAGE("/direct_messages/welcome_messages/destroy.json");
	
	private final String resource;
	
	private EndpointResources(String resource) {
		this.resource = resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	
	

}
