package ru.gift.giftforfriend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
@EnableConfigurationProperties
public class GiftForFriendApplication {

    public static void main(String[] args) {
        SpringApplication.run(GiftForFriendApplication.class, args);
    }

}
