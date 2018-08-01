package com.kurosuiton.pstmncollparser.postman;

import lombok.Getter;

import java.util.ArrayList;

/**
 * Папка с запросами
 *
 * @author Artem_Velichkin
 */
public class Folder {

    /**
     * Название
     */
    @Getter
    private String name;

    /**
     * Описание
     */
    @Getter
    private String description;

    /**
     * Список папок
     */
    @Getter
    private ArrayList<Folder> folders;

    /**
     * Спиок запросов
     */
    @Getter
    private ArrayList<PostmanRequest> postmanRequests;

    /**
     * Конструктор папки
     *
     * @param name            название
     * @param description     описание
     * @param folders         список папок
     * @param postmanRequests список запросов
     */
    public Folder(String name, String description, ArrayList<Folder> folders, ArrayList<PostmanRequest> postmanRequests) {
        this.name = name;
        this.description = description;
        this.folders = folders;
        this.postmanRequests = postmanRequests;
    }

}
