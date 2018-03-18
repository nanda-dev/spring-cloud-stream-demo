package com.cts.services.device.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.cts.services.device.dto.SamplePayload;
import com.cts.services.device.rest.controller.vm.CarrierActivateRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@EnableBinding(Source.class)
@Service
public class SourceServiceDemo implements ISource {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	Source msgSource;
	
	@Override
	public void activateServiceForLeadId(CarrierActivateRequest request) {
		SamplePayload payloadObj = new SamplePayload();
		
		if(request != null) {
			payloadObj.setLeadId(request.getLeadId());
			payloadObj.setServicePlan(request.getServicePlan());
			logger.info("Sample Payload created.");
		}
		
		this.sendPayload(payloadObj);				
	}	

	@Override
	public void sendPayload(SamplePayload payloadObj) {
		String payload = "";
		
		try {
			payload = new ObjectMapper().writeValueAsString(payloadObj);
		} catch (JsonProcessingException e) {
			logger.error("Error creating payloadJson: {}", e);
		}
		
		logger.info("Sending JSON message to queue: {}", payload);
		
		this.sendMessage(payload);
		
		logger.info("Activation request queued for processing.");
		
	}
	
	@Override
	public void sendMessage(String payload) {
		logger.info("Sending message to Queue.");
		msgSource.output().send(MessageBuilder.withPayload(payload).build());
		logger.info("Message sent.");
	}
}
