package support.domain.pojoRequest;

import java.util.HashMap;

//@Getter
public class GetStatusFromHomeTimelineData {
	
	public String getCount() {
		return count;
	}

	private String count;
	
	public GetStatusFromHomeTimelineData(HashMap<String, String> datamap)
	{
		this.count = datamap.get("count");
	}

}
