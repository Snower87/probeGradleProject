package models.integrationModels.Models1C;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DataItem{

	@JsonProperty("tutor_fl_id")
	private String tutorFlId;

	@JsonProperty("Head_dep_ID")
	private String headDepID;

	@JsonProperty("unit_name")
	private String unitName;

	@JsonProperty("user_ID")
	private String userID;

	@JsonProperty("Parent_unit_id")
	private String parentUnitId;

	@JsonProperty("employee_id")
	private String employeeId;

	@JsonProperty("unit_guid")
	private String unitGuid;

	@JsonProperty("Parent_unit_guid")
	private String parentUnitGuid;

	@JsonProperty("tutor_fl_guid")
	private String tutorFlGuid;

	@JsonProperty("fl_id")
	private String flId;

	@JsonProperty("unit_id")
	private String unitId;

	@JsonProperty("zgd_fl_id")
	private String zgdFlId;

	@JsonProperty("zgd_fl_guid")
	private String zgdFlGuid;
}