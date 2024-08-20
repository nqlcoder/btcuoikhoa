package com.samsung.btcuoikhoa.controller;

import com.samsung.btcuoikhoa.entity.Products;
import com.samsung.btcuoikhoa.service.IProductService;
import com.samsung.btcuoikhoa.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UsersService userService;

    //Demo nen dung truc tiep product repository
    @Autowired
    IProductService productService;

    @GetMapping("/")
    public String welcome(final Model model)
    {
        List<Products> lstProducts = productService.findAll();
        model.addAttribute("products", lstProducts);
        return "welcome";
    }

    @GetMapping("/home")
    public String Home()
    {
        return "welcome";
    }

    @GetMapping("/catalog{id}")
    public String getProductsByCatalog(@PathVariable Long id, Model model)
    {
        model.addAttribute("products", productService.getListProductByCatalogsId(id));
        return "welcome";
    }

}
