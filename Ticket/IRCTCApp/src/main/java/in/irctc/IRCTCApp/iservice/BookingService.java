package in.irctc.IRCTCApp.iservice;

import org.springframework.stereotype.Service;

import in.irctc.IRCTCApp.dto.PassengerDTO;
import in.irctc.IRCTCApp.dto.TicketDTO;

@Service
public interface BookingService {
	TicketDTO bookTicket(PassengerDTO p);
	TicketDTO getTicket(Integer ticketId);
}
