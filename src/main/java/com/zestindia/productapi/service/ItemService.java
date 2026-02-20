package com.zestindia.productapi.service;

import com.zestindia.productapi.dto.request.ItemRequest;
import com.zestindia.productapi.dto.response.ItemResponse;
import java.util.List;

public interface ItemService {
    List<ItemResponse> getItemsByProductId(Long productId);
    ItemResponse addItemToProduct(Long productId, ItemRequest request);
}