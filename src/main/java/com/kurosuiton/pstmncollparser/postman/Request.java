package com.kurosuiton.pstmncollparser.postman;

import lombok.Getter;

import java.util.ArrayList;

/**
 * Запрос
 *
 * @author Artem_Velichkin
 */
class Request {

    /**
     * Метод
     */
    @Getter
    private String method;

    /**
     * Список хедеров
     */
    @Getter
    private ArrayList<Header> header;

    /**
     * Тело запроса
     */
    @Getter
    private Body body;

    /**
     * URL запроса
     */
    @Getter
    private Url url;

    /**
     * Описание
     */
    @Getter
    private String description;

}
