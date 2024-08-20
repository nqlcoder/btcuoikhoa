package com.samsung.btcuoikhoa.controllers;

import com.samsung.btcuoikhoa.repositories.models.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cart")
@SessionAttributes("cart")
public class CartController {

    @ModelAttribute("cart")
    public Cart initCart() {
        return new Cart();
    }

    @PostMapping("/add")
    public String addToCart(@ModelAttribute("cart") Cart cart, @RequestParam("productId") Long productId, @RequestParam("qty") int qty) {
        cart.addProduct(productId, qty);
        return "redirect:/cart/view";
    }

    @GetMapping("/view")
    public String viewCart(@ModelAttribute("cart") Cart cart, Model model) {
        model.addAttribute("cartItems", cart.getCartItems());
        return "cart";
    }
}

