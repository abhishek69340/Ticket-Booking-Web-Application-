package in.irctc.IRCTCApp.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import in.irctc.IRCTCApp.dto.TicketDTO;
import in.irctc.IRCTCApp.entity.Ticket;

@Component
public class TicketMapper {

    public TicketDTO toDto(Ticket t) {
        TicketDTO tdto = new TicketDTO();
        BeanUtils.copyProperties(t, tdto);
        tdto.setPId(t.getPassenger().getPId());
        return tdto;
    }

    public Ticket toEntity(TicketDTO tdto) {
        Ticket t = new Ticket();
        BeanUtils.copyProperties(tdto, t);
        return t;
    }
}

