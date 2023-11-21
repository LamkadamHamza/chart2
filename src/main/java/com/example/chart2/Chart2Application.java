package com.example.chart2;

import com.example.chart2.model.Ticket;
import com.example.chart2.repository.TicketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Date;

@SpringBootApplication
public class Chart2Application implements WebMvcConfigurer {


	public void addViewController(ViewControllerRegistry registry)
	{
		registry.addViewController("/index").setViewName("index");
	}


	public static void main(String[] args) {
		SpringApplication.run(Chart2Application.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(TicketRepository ticketRepository){
		return  args -> {

			Ticket  t1 = new Ticket();
			t1.setSite(1L);
			t1.setCa(Math.random()*100);
			t1.setDateC(new Date());
			ticketRepository.save(t1);


			Ticket  t2= new Ticket();
			t2.setSite(2L);
			t2.setCa(Math.random()*100);
			t2.setDateC(new Date());
			ticketRepository.save(t2);



			Ticket  t3 = new Ticket();
			t3.setSite(3L);
			t3.setCa(Math.random()*100);
			t3.setDateC(new Date());
			ticketRepository.save(t3);

		};

	}
}
