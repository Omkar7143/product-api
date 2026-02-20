package com.zestindia.productapi.controller;

import com.zestindia.productapi.dto.request.ItemRequest;
import com.zestindia.productapi.dto.response.ApiResponse;
import com.zestindia.productapi.dto.response.ItemResponse;
import com.zestindia.productapi.service.ItemService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/{id}/items")
    public ResponseEntity<ApiResponse<List<ItemResponse>>> getItemsByProduct(
            @PathVariable Long id) {
        return ResponseEntity.ok(
                ApiResponse.success("Items fetched", itemService.getItemsByProductId(id)));
    }

    @PostMapping("/{id}/items")
    public ResponseEntity<ApiResponse<ItemResponse>> addItem(
            @PathVariable Long id,
            @Valid @RequestBody ItemRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.success("Item added", itemService.addItemToProduct(id, request)));
    }
}