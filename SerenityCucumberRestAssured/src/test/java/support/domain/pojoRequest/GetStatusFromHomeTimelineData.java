package support.domain.pojoRequest;

import java.util.HashMap;
import lombok.Getter;

@Getter
public class GetStatusFromHomeTimelineData {
	
	private String count;
	
	public GetStatusFromHomeTimelineData(HashMap<String, String> datamap)
	{
		this.count = datamap.get("count");
	}

}
