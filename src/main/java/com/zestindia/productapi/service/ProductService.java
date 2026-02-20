package com.zestindia.productapi.service;

import com.zestindia.productapi.dto.request.ProductRequest;
import com.zestindia.productapi.dto.response.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<ProductResponse> getAllProducts(Pageable pageable);
    ProductResponse getProductById(Long id);
    ProductResponse createProduct(ProductRequest request, String username);
    ProductResponse updateProduct(Long id, ProductRequest request, String username);
    void deleteProduct(Long id);
}