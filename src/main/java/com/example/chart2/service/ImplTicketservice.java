package com.example.chart2.service;

import com.example.chart2.model.Ticket;
import com.example.chart2.repository.TicketRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
@AllArgsConstructor @NoArgsConstructor
public class ImplTicketservice  implements Ticketservice{

    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> listTiket() {
        List<Ticket> Tickets = ticketRepository.findAll();

        return Tickets;
    }

    @Override
    public List<Ticket> getTicket(Date datec) {
        return null;
    }
}
