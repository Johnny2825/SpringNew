package com.example.HW.repositories;

import com.example.HW.model.Product;
import java.util.List;

public interface ProductRepository {
    List<Product> getAllProducts();
    Product getProductById(int id);
    void add(Product product);
}
