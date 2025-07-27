package models.integrationModels.Models1C.getOrgStructurePositions;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrgStructurePositionsItem{

	@JsonProperty("unit_guid")
	private String unitGuid;

	@JsonProperty("positions")
	private List<PositionsItem> positions;
}