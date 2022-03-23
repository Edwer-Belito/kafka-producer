package com.nttdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.model.Product;
import com.nttdata.service.SendMessajeService;

@RestController
@RequestMapping("/kafka")
public class SendMessajeController {

	@Autowired
	private SendMessajeService messajeService;
	
	@PostMapping("/sendMessage")
	public String sendMessage(@RequestBody Product product) {
		
		return messajeService.sendMessaje(product);
	}
}
