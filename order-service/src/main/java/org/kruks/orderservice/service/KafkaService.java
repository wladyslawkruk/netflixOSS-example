package org.kruks.orderservice.service;

import org.kruks.orderservice.domain.OrderKafkaDto;

public interface KafkaService {

    void produce(OrderKafkaDto orderKafkaDto);
}
