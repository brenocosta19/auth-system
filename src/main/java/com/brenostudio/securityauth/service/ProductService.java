package com.brenostudio.securityauth.service;

import com.brenostudio.securityauth.model.Product;
import com.brenostudio.securityauth.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> getAllProducts() {
        return repository.findAll();
    }
    // Get product by id
    public Optional<Product> getProductById(UUID id) {
        return repository.findById(id);
    }

    // Save/Update product
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    // Delete product
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }


}
