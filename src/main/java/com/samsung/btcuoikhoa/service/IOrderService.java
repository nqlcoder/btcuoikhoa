package com.samsung.btcuoikhoa.service;

import com.samsung.btcuoikhoa.entity.OrderDetails;
import com.samsung.btcuoikhoa.entity.Orders;
import com.samsung.btcuoikhoa.entity.Users;

import java.util.List;

public interface IOrderService {
    public List<Orders> findAll();

    public Orders findByUsers(Users user);

    public void createOrder(Orders order, OrderDetails orderDetails);
}
