package com.cts.services.device.service;

import com.cts.services.device.dto.SamplePayload;
import com.cts.services.device.rest.controller.vm.CarrierActivateRequest;

public interface ISource {
	
	public void activateServiceForLeadId(CarrierActivateRequest request);
	
	public void sendPayload(SamplePayload payload);
	
	public void sendMessage(String payload);

}
