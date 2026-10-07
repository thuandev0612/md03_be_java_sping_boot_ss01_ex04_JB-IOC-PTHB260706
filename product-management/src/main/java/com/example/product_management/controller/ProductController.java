package com.example.product_management.controller;

import com.example.product_management.model.Product;
import com.example.product_management.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    // Spring truyền Bean ProductService vào constructor: đây là DI.
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Nhận GET /api/products và trả danh sách sản phẩm dưới dạng JSON.
    @GetMapping("/api/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
