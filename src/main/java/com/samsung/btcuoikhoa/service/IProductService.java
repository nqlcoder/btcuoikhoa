package com.samsung.btcuoikhoa.service;

import com.samsung.btcuoikhoa.entity.Products;

import java.util.List;

public interface IProductService {
    public List<Products> findAll();

    public List<Products> getListProductByCatalogsId(long catalogId);

    public Products getProductById(long id);
}
