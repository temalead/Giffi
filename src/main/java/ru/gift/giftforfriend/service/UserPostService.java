package ru.gift.giftforfriend.service;

import org.springframework.stereotype.Service;
import ru.gift.giftforfriend.model.User;

import java.util.List;

@Service
public class UserPostService {

    private final InstagramService instService;

    public UserPostService(InstagramService instService) {
        this.instService = instService;
    }

    public List<String> findNeededGifts(User user) {

        String username = getUsername(user.getUrl());
        return instService.getNeededGifts(username);
    }

    private String getUsername(String url) {
        return url.substring(url.lastIndexOf("@") + 1);
    }
}
