package com.cts.services.device.rest.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.services.device.rest.controller.vm.CarrierActivateRequest;
import com.cts.services.device.rest.controller.vm.RequestResponse;
import com.cts.services.device.service.ISource;

import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

@Controller
public class DevicesApiController implements DevicesApi {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ISource notifyService;

    public ResponseEntity<RequestResponse> activeUsingPOST(@ApiParam(value = "Activate request" ,required=true )  @Valid @RequestBody CarrierActivateRequest request,
        @ApiParam(value = "M2M-MC Session Token" ,required=true) @RequestHeader(value="VZ-M2M-Token", required=true) String vzM2MToken) {
        
    	logger.info("Activate API invoked.");
    	
    	notifyService.activateServiceForLeadId(request);        
        
        return new ResponseEntity<RequestResponse>(HttpStatus.OK);
    }

}
