package com.norgini.sqs.consumer;

import org.springframework.stereotype.Component;

import io.awspring.cloud.sqs.annotation.SqsListener;

@Component
public class MyConsumer {
	
	@SqsListener("minha-fila")
	public void listen(MyMessage message) {
		System.out.println("Message received: " + message.content());
	}

}
