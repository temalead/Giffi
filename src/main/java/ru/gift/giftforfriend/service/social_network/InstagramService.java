package ru.gift.giftforfriend.service.social_network;

import org.springframework.stereotype.Service;

import java.util.List;

import static ru.gift.giftforfriend.service.social_network.SocialNetwork.INST;

@Service
public class InstagramService implements SocialClientService {

    public static final String START_POSITION_OF_USERNAME = "@";

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
        return INST;
    }

    @Override
    public String getUsername(String link) {
        return link.substring(link.lastIndexOf(START_POSITION_OF_USERNAME) + 1);
    }
}
