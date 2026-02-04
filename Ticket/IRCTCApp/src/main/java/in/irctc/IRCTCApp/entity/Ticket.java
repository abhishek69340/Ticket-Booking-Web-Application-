package in.irctc.IRCTCApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ticketId;
	private String name;
	private Double cost;
	private String fromS;
	private String toS;
	private String journeyDate;
	private String status;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Passenger passenger;
}
