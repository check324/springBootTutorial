package com.infotech.book.ticket.app;

import com.infotech.book.ticket.app.entities.Ticket;
import com.infotech.book.ticket.app.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
import java.util.Date;

@SpringBootApplication
public class TicketBookingManagementAppApplication implements CommandLineRunner {

	@Autowired
	private TicketBookingService ticketBookingService;

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingManagementAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("Beijing");
		ticket.setSourceStation("Changsha");
		ticket.setPassengerName("Tea");
		ticket.setEmail("tianjiang@tesla.com");
		ticketBookingService.createTicket(ticket);
		System.out.println("dataSource: " + dataSource );
	}
}
