package com.samsung.btcuoikhoa.controllers;

import com.samsung.btcuoikhoa.repositories.models.Catalogs;
import com.samsung.btcuoikhoa.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/catalogs")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping
    public String listCatalogs(Model model) {
        List<Catalogs> catalogs = catalogService.getAllCatalogs();
        model.addAttribute("catalogs", catalogs);
        return "catalogs";
    }
}

