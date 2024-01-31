package com.chauss.service;

import com.chauss.entity.Product;
import com.chauss.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product getProductById(int product_id) {
        return productRepository.getReferenceById(product_id);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }
}
