package ru.gift.giftforfriend.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class User {
    private String url;
    private BigDecimal lowPrice;
    private BigDecimal highPrice;
}
