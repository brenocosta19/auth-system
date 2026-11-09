package com.brenostudio.securityauth.repositories;

import com.brenostudio.securityauth.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
