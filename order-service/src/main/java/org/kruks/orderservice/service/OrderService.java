package org.kruks.orderservice.service;

import org.kruks.orderservice.domain.Order;
import org.kruks.orderservice.domain.OrderDto;
import org.kruks.orderservice.domain.StatusDto;

import java.util.Optional;

public interface OrderService {

    Optional<Order> addOrder(OrderDto orderDto);

    Boolean updateOrderStatus(Long id, StatusDto statusDto);
}
