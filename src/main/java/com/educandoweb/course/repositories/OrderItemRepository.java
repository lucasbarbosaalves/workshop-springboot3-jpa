package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;

/* Gera uma implementação padrão do JPA Repository, sem necessidade de implementar basta a assinatura */
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
