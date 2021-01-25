package com.example.HW.repositories;

import com.example.HW.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryProductRepository implements ProductRepository {

    private List<Product> products;

    public InMemoryProductRepository(){
        products = new ArrayList<>();
        products.add(new Product(0, "Bread", 30));
        products.add(new Product(1, "Wine", 340));
        products.add(new Product(2, "Cheese", 145));
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(int id) {
        return products.get(id);
    }

    @Override
    public void add(Product product) {
    }
}
