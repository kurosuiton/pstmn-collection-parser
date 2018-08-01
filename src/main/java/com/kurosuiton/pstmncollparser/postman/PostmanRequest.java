package com.kurosuiton.pstmncollparser.postman;

import lombok.Getter;

import java.util.ArrayList;

/**
 * Запрос Postman
 *
 * @author Artem_Velichkin
 */
public class PostmanRequest {

    /**
     * Название
     */
    @Getter
    private String name;

    /**
     * Список событий
     */
    @Getter
    private ArrayList<Event> event;

    /**
     * Запрос
     */
    @Getter
    private Request request;

    /**
     * Ответ
     */
    @Getter
    private ArrayList<String> response;

    /**
     * Конструктор запроса Postman
     *
     * @param name     название
     * @param event    список событий
     * @param request  запрос
     * @param response ответ
     */
    public PostmanRequest(String name, ArrayList<Event> event, Request request, ArrayList<String> response) {
        this.name = name;
        this.event = event;
        this.request = request;
        this.response = response;
    }

}
