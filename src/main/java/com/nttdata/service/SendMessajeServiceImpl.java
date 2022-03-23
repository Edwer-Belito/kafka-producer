package com.nttdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.nttdata.model.Product;

@Service
public class SendMessajeServiceImpl implements SendMessajeService{

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	@Value("${kafka.topic}")
	private String kafkaTopic;
	
	@Override
	public String sendMessaje(Product product) {

		kafkaTemplate.send(kafkaTopic,"key",product);
		
		return "message send!";
	}

}
