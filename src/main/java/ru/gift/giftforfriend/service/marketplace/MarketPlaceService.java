package ru.gift.giftforfriend.service.marketplace;

import java.math.BigDecimal;
import java.util.List;

public interface MarketPlaceService {

    /**
     *
     * @param giftNames имена подарков которые нашла нейросеть
     * @param lowPrice нижняя планка цены
     * @param highPrice верхняя планка цены
     * @return список предложенных для покупок подарков
     */
    List<String> getGifts(List<String> giftNames, BigDecimal lowPrice, BigDecimal highPrice);

}
