package com.samsung.btcuoikhoa.controllers;

import com.samsung.btcuoikhoa.repositories.models.Products;
import com.samsung.btcuoikhoa.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String searchProducts(@RequestParam("name") String name, Model model) {
        List<Products> products = productService.searchProductsByName(name);
        model.addAttribute("products", products);
        return "products";
    }
}

