package com.samsung.btcuoikhoa.repository;

import com.samsung.btcuoikhoa.entity.Catalogs;
import com.samsung.btcuoikhoa.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductsRepository extends JpaRepository<Products, Long> {
    List<Products> findByCatalog(Catalogs catalog);
}
