package com.samsung.btcuoikhoa.repositories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "catalogs")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Catalogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150)
    private String name;

    @Column(columnDefinition = "bit default 0")
    private boolean status;

    @OneToMany(mappedBy = "catalog")
    private List<Products> products;
}
