package com.jawa.springbootmysql.controller;

import com.jawa.springbootmysql.dao.TicketDao;
import com.jawa.springbootmysql.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketDao ticketDao;

    @PostMapping("/bookTickets")
    public String bookTickets(@RequestBody List<Ticket> tickets){
        ticketDao.saveAll(tickets);
        return "No of tickets booked::" + tickets.size();
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTickets() {
        return (List<Ticket>) ticketDao.findAll();
    }
}
