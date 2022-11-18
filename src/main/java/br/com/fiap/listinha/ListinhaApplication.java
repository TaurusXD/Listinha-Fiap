package br.com.fiap.listinha;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class ListinhaApplication {

	@Autowired
	ObjectMapper mapper;
	public static void main(String[] args) {
		SpringApplication.run(ListinhaApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void doAfterStartup(){
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		mapper.setDateFormat(df);
	}
}
