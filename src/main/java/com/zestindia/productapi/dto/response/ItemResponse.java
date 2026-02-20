package com.zestindia.productapi.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemResponse {
    private Long id;
    private Integer quantity;
    private Long productId;
}