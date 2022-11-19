package ru.gift.giftforfriend.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstagramServiceImpl implements InstagramService {

    @Override
    public List<String> getHashTagsOfAllPosts(List<String> hashTags) {
        return null;
    }

    @Override
    public List<String> getTextsOfAllPosts(List<String> text) {
        return null;
    }

    @Override
    public List<String> getNeededGifts(String username) {
        return null;
    }
}
