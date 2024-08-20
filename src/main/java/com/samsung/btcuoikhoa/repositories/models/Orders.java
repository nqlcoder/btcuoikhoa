package com.samsung.btcuoikhoa.repositories.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "orders")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_qty", nullable = false)
    private int totalQty;

    @Column(name = "total_amount", nullable = false)
    private Long totalAmount;

    @Column(name = "status", nullable = false)
    private boolean status;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Orders> orders;
}

