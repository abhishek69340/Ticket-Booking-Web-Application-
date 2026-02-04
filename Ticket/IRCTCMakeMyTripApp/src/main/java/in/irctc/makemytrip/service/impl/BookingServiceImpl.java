package in.irctc.makemytrip.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.irctc.makemytrip.dto.PassengerDTO;
import in.irctc.makemytrip.dto.TicketDTO;
import in.irctc.makemytrip.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	@Override
	public TicketDTO bookTicket(PassengerDTO p) {
		WebClient client = WebClient.create();
		return client.post()
					.uri("http://localhost:8080/ticket")
					.bodyValue(p)
					.retrieve()
					.bodyToMono(TicketDTO.class)
					.block();
	}
	@Override
	public TicketDTO getTicket(Integer ticketId) {
		WebClient client = WebClient.create();
		return client.get()
					.uri("http://localhost:8080/ticket/{ticketId}",ticketId)
					.retrieve()
					.bodyToMono(TicketDTO.class)
					.block();
	}
}
