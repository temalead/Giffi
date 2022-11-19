package ru.gift.giftforfriend.util;

import com.github.instagram4j.instagram4j.IGClient;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

@UtilityClass
public class InstagramClient {

    private static IGClient igClient = null;
    private final String username = System.getenv("inst_username");

    private final String password = System.getenv("inst_password");

    public static IGClient instagramClient() {
        if (igClient == null) {
            igClient = buildInstagramClient();
        }

        return igClient;
    }


    @SneakyThrows
    public static IGClient buildInstagramClient() {
        return IGClient.builder()
                .username(username)
                .password(password)
                .login();
    }


}
