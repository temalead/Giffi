package ru.gift.giftforfriend.service.social_network;

import java.util.List;

/**
 * Интерфейс, отправляющий различную информацию о постах пользователю микросервису с нейронкой
 * и получающий названия товаров, необходимых пользователю
 *
 * @author Tema Nikulin
 */
public interface SocialClientService {

    /**
     * Отправляет список всех хэштегов всех фото пользователя
     * @param hashTags хэштеги постов
     * @return список названий нужных товаров
     */
    List<String> getHashTagsOfAllPosts(List<String> hashTags);

    /**
     * Отправляет список всех хэштегов всех фото пользователя
     * @param text тексты постов
     * @return список названий нужных товаров
     */
    List<String> getTextsOfAllPosts(List<String> text);

    /**
     * @return необходимые подарки
     */
    List<String> getNamesOfNeededGifts();

    /**
     * Определяет тип социальной сети, которую ввёл пользователь
     * @return тип соц.сети
     */
    SocialNetwork getType();

    /**
     *
     * @param link ссылка на страницу пользователя
     * @return имя пользователя
     */
    String getUsername(String link);
}
