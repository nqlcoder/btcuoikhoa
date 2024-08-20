package com.samsung.btcuoikhoa.repository;

import com.samsung.btcuoikhoa.entity.Orders;
import com.samsung.btcuoikhoa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdersRepository extends JpaRepository<Orders, Long> {
    public Orders findByUser(Users users);
}