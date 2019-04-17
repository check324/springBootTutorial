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
public class TicketBookingManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingManagementAppApplication.class, args);
	}
}