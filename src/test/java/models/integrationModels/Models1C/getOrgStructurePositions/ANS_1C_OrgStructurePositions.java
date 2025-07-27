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
public class ANS_1C_OrgStructurePositions {

	@JsonProperty("OrgStructurePositions")
	private List<OrgStructurePositionsItem> orgStructurePositions;
}