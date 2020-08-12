package com.wendel.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendel.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
