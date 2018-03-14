package io.swagger.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

import io.swagger.model.CreateOrderRequest;
import io.swagger.model.CreateOrderResponse;
import io.swagger.model.OrderDetails;
import io.swagger.model.CreateOrderResponse.StatusEnum;

@EnableBinding(Source.class)
@Service
public class OrderServiceImpl implements OrderService {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	Source msgSource;
	
	@Override
	public CreateOrderResponse createOrder(CreateOrderRequest orderRequest) {
		logger.info("Create Mock Order for Customer: {}", orderRequest.getCustomerId());
		//Return Mock response
		CreateOrderResponse resp = new CreateOrderResponse();
		resp.setOrderId(1001L);
		resp.setStatus(StatusEnum.PLACED);
		resp.setMessage("Order placed successfully.");
		
		logger.info("Order {} created. Notify downstream apps...", resp.getOrderId());
		msgSource.output().send(MessageBuilder.withPayload("ORDER_TO_PROCESS:" + resp.getOrderId()).build());
		
		return resp;
	}

	@Override
	public OrderDetails getOrderDetailsMock(Long orderId) {
		logger.info("Get Mock Order Details object...");
		//Return Mock response
		OrderDetails order = new OrderDetails();
		order.setOrderId(orderId);
		order.setStatus(OrderDetails.StatusEnum.COMPLETE);
		order.setMessage("Order details fetched successfully");		
		return order;
	}

}
