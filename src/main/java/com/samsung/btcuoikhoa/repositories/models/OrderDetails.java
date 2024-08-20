package com.samsung.btcuoikhoa.repositories.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "OrderDetails")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "unit_price", nullable = false)
    private Long unitPrice;

    @Column(name = "qty", nullable = false)
    private int qty;

    @OneToMany
    @JoinColumn(name = "order_id")
    private List<OrderDetails> orderDetails;
}

