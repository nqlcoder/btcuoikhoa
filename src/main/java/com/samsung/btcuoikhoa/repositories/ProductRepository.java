package com.samsung.btcuoikhoa.repositories;

import com.samsung.btcuoikhoa.repositories.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductRepository extends JpaRepository<Products, Long> {
    List<Products> findByNameContainingIgnoreCase(String name);
}
