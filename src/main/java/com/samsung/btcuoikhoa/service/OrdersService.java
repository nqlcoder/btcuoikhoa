package com.samsung.btcuoikhoa.service;

import com.samsung.btcuoikhoa.entity.OrderDetails;
import com.samsung.btcuoikhoa.entity.Orders;
import com.samsung.btcuoikhoa.entity.Users;
import com.samsung.btcuoikhoa.repository.IOrderDetailsRepository;
import com.samsung.btcuoikhoa.repository.IOrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService implements IOrderService{

    @Autowired
    IOrdersRepository repository;

    @Autowired
    IOrderDetailsRepository ordersDetailsRepository;

    @Override
    public List<Orders> findAll() {
        return repository.findAll();
    }

    @Override
    public Orders findByUsers(Users user) {
        return repository.findByUser(user);
    }

    @Override
    public void createOrder(Orders order, OrderDetails orderDetails) {
        repository.save(order);
        ordersDetailsRepository.save(orderDetails);
    }
}
