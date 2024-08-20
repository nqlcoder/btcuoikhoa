package com.samsung.btcuoikhoa.services;

import com.samsung.btcuoikhoa.repositories.CatalogRepository;
import com.samsung.btcuoikhoa.repositories.models.Catalogs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    private CatalogRepository catalogRepository;

    public List<Catalogs> getAllCatalogs() {
        return catalogRepository.findAll();
    }
}

