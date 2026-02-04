package in.irctc.IRCTCApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import in.irctc.IRCTCApp.entity.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger, Integer>{
	


}
