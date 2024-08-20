package com.samsung.btcuoikhoa.services;

import com.samsung.btcuoikhoa.repositories.ProductRepository;
import com.samsung.btcuoikhoa.repositories.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Products> searchProductsByName(String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }
}

