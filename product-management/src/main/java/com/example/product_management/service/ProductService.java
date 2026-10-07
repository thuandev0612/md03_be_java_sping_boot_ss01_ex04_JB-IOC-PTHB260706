package com.example.product_management.service;

import com.example.product_management.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// Spring tự tạo và quản lý đối tượng ProductService.
@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        // Dữ liệu mẫu được lưu tạm trong RAM.
        products.add(new Product(1, "Bàn phím cơ", 500000));
        products.add(new Product(2, "Chuột không dây", 250000));
        products.add(new Product(3, "Màn hình", 3000000));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
