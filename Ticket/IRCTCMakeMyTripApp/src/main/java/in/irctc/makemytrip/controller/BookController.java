package in.irctc.makemytrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.irctc.makemytrip.dto.PassengerDTO;
import in.irctc.makemytrip.service.BookingService;

@Controller
public class BookController {
	@Autowired
	BookingService service;

	@GetMapping("/")
	public String landing() {
		return "TicketBooking";
	}
	
	@GetMapping("/displayTicket")
	public String displayTicket() {
		return "DisplayTicket";
	}
	
	@PostMapping("/book")
	public String bookTicket(@ModelAttribute PassengerDTO p, Model m) {
		m.addAttribute("ticketId", service.bookTicket(p).getTicketId());
		return "TicketBooking";
	}

	@GetMapping("/getTicket")
	public String getTicket(@RequestParam Integer ticketId, Model m) {
		m.addAttribute("ticket", service.getTicket(ticketId));
		return "DisplayTicket";
	}
}
