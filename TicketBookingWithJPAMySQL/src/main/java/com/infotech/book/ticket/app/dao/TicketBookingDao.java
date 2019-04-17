package com.infotech.book.ticket.app.dao;

import com.infotech.book.ticket.app.entities.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {

}
