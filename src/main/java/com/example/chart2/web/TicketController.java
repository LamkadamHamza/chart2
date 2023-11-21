package com.example.chart2.web;

import com.example.chart2.repository.TicketRepository;
import com.example.chart2.service.Ticketservice;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@AllArgsConstructor  @NoArgsConstructor
public class TicketController {

       private Ticketservice ticketservice;



    @GetMapping("/barChart")
    public String  GetTickets(Model model){
        List<Long> site = ticketservice.listTiket().stream().map(x->x.getSite()).collect(Collectors.toList());
        List<Long> CA = ticketservice.listTiket().stream().map(x->x.getSite()).collect(Collectors.toList());

        model.addAttribute("site","site");
        model.addAttribute("CA","CA");

        return  "barChart";
    }



}
