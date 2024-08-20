package com.samsung.btcuoikhoa.repositories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "products")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150)
    private String name;

    @Column(length = 200)
    private String picture;
    private Long price;

//    @OneToMany
//    @JoinColumn(name = "catalog_Id")
//    private List<Products> products;

    @ManyToOne
    @JoinColumn(name = "catalog_id")
    private Catalogs catalog;
}
