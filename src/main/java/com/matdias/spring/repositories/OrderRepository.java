package com.matdias.spring.repositories;

import com.matdias.spring.entities.Order;
import com.matdias.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
