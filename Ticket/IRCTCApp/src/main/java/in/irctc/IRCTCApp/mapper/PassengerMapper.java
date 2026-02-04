package in.irctc.IRCTCApp.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import in.irctc.IRCTCApp.dto.PassengerDTO;
import in.irctc.IRCTCApp.entity.Passenger;

@Component
public class PassengerMapper {
	public PassengerDTO toDto(Passenger p) {
		PassengerDTO pdto = new PassengerDTO(); 
		BeanUtils.copyProperties(p, pdto);
		return pdto;
	}
	
	public Passenger toEntity(PassengerDTO pdto) {
		Passenger p = new Passenger(); 
		BeanUtils.copyProperties(pdto, p);
		return p;
	}
}
