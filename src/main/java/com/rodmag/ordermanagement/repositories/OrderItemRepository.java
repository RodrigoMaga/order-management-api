package com.rodmag.ordermanagement.repositories;

import com.rodmag.ordermanagement.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
