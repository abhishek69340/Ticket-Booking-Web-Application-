package in.irctc.IRCTCApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.irctc.IRCTCApp.entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer>{

}
