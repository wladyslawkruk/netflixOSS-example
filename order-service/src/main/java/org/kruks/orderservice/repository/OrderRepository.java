package org.kruks.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.kruks.orderservice.domain.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAll();

    Optional<Order> findById(Long id);

}
