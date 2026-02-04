package in.irctc.IRCTCApp.dto;

import lombok.Data;

@Data
public class TicketDTO {
	private Integer ticketId;
	private String name;
	private Integer pId;
	private Double cost;
	private String fromS;
	private String toS;
	private String journeyDate;
	private String status;
}
