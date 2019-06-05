package support.domain.queryParams;

public enum GetStatusFromHomeTimelineEnum {
	COUNT("count"),
	STATUS("status");
	
	private final String queryParams;
	
	private GetStatusFromHomeTimelineEnum(String queryParams) {
		this.queryParams = queryParams;
	}
	
	public String getQueryParam()
	{
		return queryParams;
	}

}
