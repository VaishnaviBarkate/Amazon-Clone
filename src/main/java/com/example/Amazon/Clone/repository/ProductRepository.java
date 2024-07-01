package com.example.Amazon.Clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Amazon.Clone.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
