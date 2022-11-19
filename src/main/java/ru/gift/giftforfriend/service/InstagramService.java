package ru.gift.giftforfriend.service;

import java.util.List;

/**
 * Интерфейс, отправляющий различную информацию о постах пользователю микросервису с нейронкой
 * и получающий названия товаров, необходимых пользователю
 *
 * @author Tema Nikulin
 */
public interface InstagramService {

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
     * @param username - имя пользователя, которому выбирается подарок
     * @return необходимые подарки
     */
    List<String> getNeededGifts(String username);
}
