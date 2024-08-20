package com.samsung.btcuoikhoa.services;

import com.samsung.btcuoikhoa.repositories.OrderDetailRepository;
import com.samsung.btcuoikhoa.repositories.OrderRepository;
import com.samsung.btcuoikhoa.repositories.ProductRepository;
import com.samsung.btcuoikhoa.repositories.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private ProductRepository productRepository;

//    public void createOrder(Cart cart, Users user) {
//        // Tạo đối tượng Order
//        Orders order = Orders.builder()
//                .user(user)
//                .totalQty(cart.getCartItems().values().stream().mapToInt(Integer::intValue).sum())
//                .totalAmount(calculateTotalAmount(cart))
//                .status(false) // Đơn hàng mới chưa xử lý
//                .build();
//
//        // Lưu Order vào cơ sở dữ liệu
//        Orders savedOrder = orderRepository.save(order);
//
//        // Lưu từng OrderDetail vào cơ sở dữ liệu
//        for (Map.Entry<Long, Integer> entry : cart.getCartItems().entrySet()) {
//            Long productId = entry.getKey();
//            int qty = entry.getValue();
//            // Giả sử bạn đã có một phương thức để lấy Product từ productId
//            Optional<Products> product = getProductById(productId);
//
//            OrderDetails orderDetail = OrderDetails.builder()
//                    .order(savedOrder)
//                    .product(product)
//                    .unitPrice(product.get().getPrice())
//                    .qty(qty)
//                    .build();
//
//            orderDetailRepository.save(orderDetail);
//        }
//    }
//
//    private Long calculateTotalAmount(Cart cart) {
//        // Tính tổng giá trị đơn hàng
//        return cart.getCartItems().entrySet().stream()
//                .mapToLong(entry -> {
//                    Optional<Products> product = getProductById(entry.getKey());
//                    return product.get().getPrice() * entry.getValue();
//                })
//                .sum();
//    }
//
//    private Optional<Products> getProductById(Long productId) {
//        return productRepository.findById(productId);
//    }
}


