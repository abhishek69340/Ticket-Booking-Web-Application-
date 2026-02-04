package in.irctc.makemytrip.service;

import in.irctc.makemytrip.dto.PassengerDTO;
import in.irctc.makemytrip.dto.TicketDTO;

public interface BookingService {
	TicketDTO bookTicket(PassengerDTO p);
	TicketDTO getTicket(Integer ticketId);
	
}
