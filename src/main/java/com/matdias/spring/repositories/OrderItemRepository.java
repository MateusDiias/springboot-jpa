package com.matdias.spring.repositories;

import com.matdias.spring.entities.Category;
import com.matdias.spring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
