package io.swagger.service;

import io.swagger.model.CreateOrderRequest;
import io.swagger.model.CreateOrderResponse;
import io.swagger.model.OrderDetails;

public interface OrderService {
	public OrderDetails getOrderDetailsMock(Long orderId);

	public CreateOrderResponse createOrder(CreateOrderRequest orderRequest);

}
