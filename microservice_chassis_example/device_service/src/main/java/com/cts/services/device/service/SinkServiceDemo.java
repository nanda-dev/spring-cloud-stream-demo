package com.cts.services.device.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class SinkServiceDemo implements ISink {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	@StreamListener(Sink.INPUT)
    public void receivePayload(String payload) {
		logger.info("Received: {}.", payload);
    }

}
