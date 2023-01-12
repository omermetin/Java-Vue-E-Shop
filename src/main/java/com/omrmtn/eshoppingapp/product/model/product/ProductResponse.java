package com.omrmtn.eshoppingapp.product.model.product;

import com.omrmtn.eshoppingapp.product.domain.MoneyTypes;
import com.omrmtn.eshoppingapp.product.model.ProductSellerResponse;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductResponse {
    private String id;
    private String image;
    private String name;
    private String description;
    private ProductSellerResponse seller;
    private String features;
    private int available;
    private boolean freeDelivery;
    private String deliveryIn;
    private BigDecimal price;
    private String moneySymbol;
    private String categoryId;
    private MoneyTypes moneyType;
}
