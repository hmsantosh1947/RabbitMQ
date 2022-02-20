package com.san.rabbitmq.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.san.rabbitmq.service.RabbitMQService;

@RestController
@RequestMapping("/rabbit")
public class Controller {

	@Autowired
	RabbitMQService mqService;
	
	@GetMapping
	public String sendMessage() {
		mqService.send("HelloWorld");
		
		return "Message sent !!!";
	}
}
