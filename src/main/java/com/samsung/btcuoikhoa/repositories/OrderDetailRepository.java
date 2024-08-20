package com.samsung.btcuoikhoa.repositories;

import com.samsung.btcuoikhoa.repositories.models.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetails, Long> {
}

