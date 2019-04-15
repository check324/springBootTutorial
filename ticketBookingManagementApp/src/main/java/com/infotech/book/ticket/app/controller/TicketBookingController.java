package com.infotech.book.ticket.app.controller;

import com.infotech.book.ticket.app.entities.Ticket;
import com.infotech.book.ticket.app.service.TicketBookingService;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;

@RequestMapping(value = "/api/tickets")
@RestController
public class TicketBookingController {

    @Autowired
    private TicketBookingService ticketBookingService;

    @PostMapping(value = "/createticket")
    public Ticket CreateTicket(@RequestBody Ticket ticket){
        return ticketBookingService.createTicket(ticket);
    }

    @GetMapping(value = "/ticket/{ticketId}")
    public Ticket getTicketByID(@PathVariable("ticketId") Integer ticketId){
        return ticketBookingService.getTicketById(ticketId);
    }

    @GetMapping(value = "/ticket/allTickets")
    public Iterable<Ticket> getAllBookedTickets(){
        return ticketBookingService.getAllBookedTickets();
    }

    @DeleteMapping(value = "/ticket/{ticketId}")
    public void deleteTicket(@PathVariable("ticketId") Integer ticketid){
        ticketBookingService.deleteTicket(ticketid);
    }

    @PutMapping(value = "/ticket/{ticketId}/{newEmail:.+}")
    public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId, @PathVariable("newEmail") String newEmail){
        return ticketBookingService.updateTicket(ticketId, newEmail);
    }
}
