package ru.gift.giftforfriend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gift.giftforfriend.model.User;
import ru.gift.giftforfriend.service.marketplace.OzonService;
import ru.gift.giftforfriend.service.social_network.SocialClientService;
import ru.gift.giftforfriend.service.social_network.SocialNetwork;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ru.gift.giftforfriend.service.social_network.SocialNetwork.INST;
import static ru.gift.giftforfriend.service.social_network.SocialNetwork.VK;

@Service
public class GiftsGiver {

    private final Map<SocialNetwork, SocialClientService> socialNetworkServices = new HashMap<>();
    public OzonService ozonService;

    public List<String> findNeededGifts(User user) {
        SocialNetwork socialNetwork = LinkResolver.determineSocialNetwork(user.getUrl());

        List<String> namesOfNeededGifts = socialNetworkServices.get(socialNetwork).getNamesOfNeededGifts();
        return ozonService.getGifts(namesOfNeededGifts, user.getLowPrice(), user.getHighPrice());
    }

    @Autowired
    public GiftsGiver(List<SocialClientService> socialNetworkServices) {
        socialNetworkServices.forEach(service -> this.socialNetworkServices.put(service.getType(), service));
    }


    @Autowired
    public void setOzonService(OzonService ozonService) {
        this.ozonService = ozonService;
    }


    private static class LinkResolver {

        static SocialNetwork determineSocialNetwork(String link) {

            String site = link.substring(link.lastIndexOf("://") + 1);

            if (site.startsWith("vk")) {
                return VK;
            } else if (site.startsWith("inst")) {
                return INST;
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }
}
