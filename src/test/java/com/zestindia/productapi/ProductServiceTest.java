package com.zestindia.productapi;

import com.zestindia.productapi.dto.request.ProductRequest;
import com.zestindia.productapi.dto.response.ProductResponse;
import com.zestindia.productapi.entity.Product;
import com.zestindia.productapi.exception.ResourceNotFoundException;
import com.zestindia.productapi.repository.ProductRepository;
import com.zestindia.productapi.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productService;

    @Test
    void getAllProducts_ShouldReturnPage() {
        Product product = Product.builder()
                .id(1L).productName("Test Product")
                .createdBy("user").createdOn(LocalDateTime.now())
                .build();
        Page<Product> page = new PageImpl<>(List.of(product));
        when(productRepository.findAll(any(PageRequest.class))).thenReturn(page);

        Page<ProductResponse> result = productService.getAllProducts(PageRequest.of(0, 10));

        assertEquals(1, result.getTotalElements());
        assertEquals("Test Product", result.getContent().get(0).getProductName());
    }

    @Test
    void getProductById_WhenExists_ShouldReturn() {
        Product product = Product.builder()
                .id(1L).productName("Test")
                .createdBy("user").createdOn(LocalDateTime.now())
                .build();
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        ProductResponse response = productService.getProductById(1L);

        assertEquals("Test", response.getProductName());
    }

    @Test
    void getProductById_WhenNotExists_ShouldThrow() {
        when(productRepository.findById(99L)).thenReturn(Optional.empty());
        assertThrows(ResourceNotFoundException.class,
                () -> productService.getProductById(99L));
    }

    @Test
    void createProduct_ShouldSaveAndReturn() {
        ProductRequest request = new ProductRequest();
        request.setProductName("New Product");

        Product saved = Product.builder()
                .id(1L).productName("New Product")
                .createdBy("admin").createdOn(LocalDateTime.now())
                .build();
        when(productRepository.save(any())).thenReturn(saved);

        ProductResponse response = productService.createProduct(request, "admin");

        assertEquals("New Product", response.getProductName());
        verify(productRepository, times(1)).save(any());
    }

    @Test
    void deleteProduct_WhenNotExists_ShouldThrow() {
        when(productRepository.existsById(99L)).thenReturn(false);
        assertThrows(ResourceNotFoundException.class,
                () -> productService.deleteProduct(99L));
    }
}