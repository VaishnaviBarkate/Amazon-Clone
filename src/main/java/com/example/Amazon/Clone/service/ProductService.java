package com.example.Amazon.Clone.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Amazon.Clone.model.Product;
import com.example.Amazon.Clone.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
