package ru.gift.giftforfriend.service.marketplace;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OzonService implements MarketPlaceService{
    @Override
    public List<String> getGifts(List<String> giftNames, BigDecimal lowPrice, BigDecimal highPrice) {
        return null;
    }
}
