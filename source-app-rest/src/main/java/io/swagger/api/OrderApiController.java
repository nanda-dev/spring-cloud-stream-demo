package io.swagger.api;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;
import io.swagger.model.CreateOrderRequest;
import io.swagger.model.CreateOrderResponse;
import io.swagger.model.OrderDetails;
import io.swagger.service.OrderService;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-05T12:35:53.697Z")

@RestController
@RequestMapping("/api")
public class OrderApiController implements OrderApi {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private OrderService orderService;

	public ResponseEntity<CreateOrderResponse> createOrder(
			@ApiParam(value = "Created Order object", required = true) @Valid @RequestBody CreateOrderRequest orderRequest) {		
		logger.info("Create Order");		
		CreateOrderResponse resp = orderService.createOrder(orderRequest);		
		return new ResponseEntity<CreateOrderResponse>(resp, HttpStatus.OK);
	}

	public ResponseEntity<OrderDetails> getOrderDetails(
			@ApiParam(value = "Order Details Fetched", required = true) @PathVariable("orderId") Long orderId) {
		logger.info("Get Order Details for order: {}", orderId);
		OrderDetails order = orderService.getOrderDetailsMock(orderId);
		return new ResponseEntity<OrderDetails>(order, HttpStatus.OK);
	}


}
