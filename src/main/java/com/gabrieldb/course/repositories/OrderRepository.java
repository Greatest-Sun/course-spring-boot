package com.gabrieldb.course.repositories;

import com.gabrieldb.course.entities.Order;
import com.gabrieldb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
