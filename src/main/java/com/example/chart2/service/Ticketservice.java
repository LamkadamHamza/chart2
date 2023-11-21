package com.example.chart2.service;

import com.example.chart2.model.Ticket;

import java.util.Date;
import java.util.List;

public interface Ticketservice {

    List<Ticket>  listTiket();

    List<Ticket>   getTicket(Date datec);

}
