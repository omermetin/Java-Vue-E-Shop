package com.omrmtn.eshoppingapp.product.service;
import com.omrmtn.eshoppingapp.product.domain.MoneyTypes;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductDeliveryService {
    public String getDeliveryInfo(String productId) {
        //TODO
        return"Tomorrow";
    }

    public boolean freeDeliveryCheck(String productId, BigDecimal price, MoneyTypes moneyType) {
        //TODO
        return true;
    }
}
