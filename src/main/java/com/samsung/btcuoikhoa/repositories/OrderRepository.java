package com.samsung.btcuoikhoa.repositories;

import com.samsung.btcuoikhoa.repositories.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {
}

