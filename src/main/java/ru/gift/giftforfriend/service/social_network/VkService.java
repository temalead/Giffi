package ru.gift.giftforfriend.service.social_network;

import org.springframework.stereotype.Service;

import java.util.List;

import static ru.gift.giftforfriend.service.social_network.SocialNetwork.VK;

@Service
public class VkService implements SocialClientService {

    @Override
    public List<String> getHashTagsOfAllPosts(List<String> hashTags) {
        return null;
    }

    @Override
    public List<String> getTextsOfAllPosts(List<String> text) {
        return null;
    }

    @Override
    public List<String> getNamesOfNeededGifts() {
        return null;
    }


    @Override
    public SocialNetwork getType() {
        return VK;
    }

    @Override
    public String getUsername(String link) {
        return link.substring(link.lastIndexOf("/") + 1);
    }
}
