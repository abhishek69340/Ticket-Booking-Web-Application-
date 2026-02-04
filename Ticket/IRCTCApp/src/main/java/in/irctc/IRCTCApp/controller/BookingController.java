package in.irctc.IRCTCApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.irctc.IRCTCApp.dto.PassengerDTO;
import in.irctc.IRCTCApp.dto.TicketDTO;
import in.irctc.IRCTCApp.iservice.BookingService;

@RestController
public class BookingController {
	@Autowired
	private BookingService bservice;
	
	@PostMapping("/ticket")
	public ResponseEntity<TicketDTO> bookTicket(@RequestBody PassengerDTO p){
		TicketDTO t = bservice.bookTicket(p);
		return new ResponseEntity<TicketDTO>(t,HttpStatus.CREATED);
	}
	@GetMapping("/ticket/{ticketId}")
	public ResponseEntity<TicketDTO> getTicket(@PathVariable Integer ticketId){
		TicketDTO t = bservice.getTicket(ticketId);
		return ResponseEntity.ok(t);
	}
}
