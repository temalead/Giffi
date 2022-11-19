package ru.gift.giftforfriend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gift.giftforfriend.model.User;
import ru.gift.giftforfriend.service.UserPostService;

import java.util.List;

@RestController
@Slf4j
public class HomeController {

    private final UserPostService service;

    public HomeController(UserPostService service) {
        this.service = service;
    }

    @GetMapping("/gift")
    public List<String> getGifts(User user) {

        return service.findNeededGifts(user);
    }
}
