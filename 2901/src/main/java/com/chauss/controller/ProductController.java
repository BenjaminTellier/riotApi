package com.chauss.controller;

import com.chauss.entity.Product;
import com.chauss.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{produt_id}")
    public ResponseEntity<Product> getProductById(@PathVariable int product_id) {
        System.out.println("fonction getProductByID");
        try {
            return ResponseEntity.ok(productService.getProductById(product_id));
        } catch (Exception exception) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        System.out.println("fonction save");
        try {
            return ResponseEntity.ok(productService.save(product));
        } catch (Exception exception) {
            return ResponseEntity.badRequest().build();
        }
    }
}
