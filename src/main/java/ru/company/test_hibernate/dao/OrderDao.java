package ru.company.test_hibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.company.test_hibernate.models.Order;

@Repository
public interface OrderDao extends JpaRepository<Order, Long> {
}
