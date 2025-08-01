package models.integrationModels.Models1C.getOrgStructurePositions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PositionsItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("guid")
	private String guid;
}