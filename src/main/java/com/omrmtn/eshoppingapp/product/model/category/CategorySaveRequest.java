package com.omrmtn.eshoppingapp.product.model.category;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategorySaveRequest {
    private String name;
}
