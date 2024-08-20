package com.samsung.btcuoikhoa.repository;

import com.samsung.btcuoikhoa.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
}