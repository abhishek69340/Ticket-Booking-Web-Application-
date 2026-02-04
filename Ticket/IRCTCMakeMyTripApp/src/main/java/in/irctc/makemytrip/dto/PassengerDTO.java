package in.irctc.makemytrip.dto;

import lombok.Data;

@Data
public class PassengerDTO {
	private Integer pId;
	private String name;
	private String fromS;
	private String toS;
	private String journeyDate;
	private Integer trainNum;
}
