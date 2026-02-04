package in.irctc.IRCTCApp.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.irctc.IRCTCApp.dto.PassengerDTO;
import in.irctc.IRCTCApp.dto.TicketDTO;
import in.irctc.IRCTCApp.entity.Passenger;
import in.irctc.IRCTCApp.entity.Ticket;
import in.irctc.IRCTCApp.iservice.BookingService;
import in.irctc.IRCTCApp.mapper.PassengerMapper;
import in.irctc.IRCTCApp.mapper.TicketMapper;
import in.irctc.IRCTCApp.repository.PassengerRepo;
import in.irctc.IRCTCApp.repository.TicketRepo;

@Service
public class BookingServiceImpl implements BookingService{
	@Autowired
	private PassengerRepo prepo;
	@Autowired
	private TicketRepo trepo;
	@Autowired
	private TicketMapper tmapper;
	@Autowired
	private PassengerMapper pmapper;
	
	@Override
	public TicketDTO bookTicket(PassengerDTO p) {

	    Passenger passenger = pmapper.toEntity(p);
	    Passenger savedPassenger = prepo.save(passenger);

	    TicketDTO tdto = new TicketDTO();
	    BeanUtils.copyProperties(p, tdto);
	    tdto.setCost(1000.00);
	    tdto.setStatus("CONFIRMED");
	    tdto.setPId(savedPassenger.getPId());

	    Ticket ticket = tmapper.toEntity(tdto);
	    ticket.setPassenger(savedPassenger); 

	    Ticket savedTicket = trepo.save(ticket);
	    return tmapper.toDto(savedTicket);
	}


	@Override
	public TicketDTO getTicket(Integer ticketId) {
		Ticket t = trepo.findById(ticketId).get();
		return tmapper.toDto(t) ;
	}

}
