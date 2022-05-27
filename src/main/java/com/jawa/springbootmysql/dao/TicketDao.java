package com.jawa.springbootmysql.dao;

import com.jawa.springbootmysql.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<Ticket,Integer> {
}
