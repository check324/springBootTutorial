package com.infotech.book.ticket.app.service;


import com.infotech.book.ticket.app.dao.TicketBookingDao;
import com.infotech.book.ticket.app.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketBookingService {

    @Autowired
    private TicketBookingDao ticketBookingDao;
    public Ticket createTicket(Ticket ticket) {
        return ticketBookingDao.save(ticket);
    }

    public Ticket getTicketById(Integer ticketId) {
        return ticketBookingDao.findById(ticketId).orElse(null);
    }

    public Iterable<Ticket> getAllBookedTickets() {
        return ticketBookingDao.findAll();
    }

    public void deleteTicket(Integer ticketId) {
        ticketBookingDao.deleteById(ticketId);
    }

    public Ticket updateTicket(Integer ticketId, String newEmail) {
        Ticket ticketFromDB = ticketBookingDao.findById(ticketId).orElse(null);
        ticketFromDB.setEmail(newEmail);
        return ticketBookingDao.save(ticketFromDB);
    }
}
