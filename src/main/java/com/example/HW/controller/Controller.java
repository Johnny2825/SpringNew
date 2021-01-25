package com.example.HW.controller;


import com.example.HW.model.Product;
import com.example.HW.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository( ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/index")
    public String index(Model model){
        List<Product> products = productRepository.getAllProducts();
        model.addAttribute("products", products);
        return "index";
    }

}
