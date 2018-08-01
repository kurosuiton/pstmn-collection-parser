package com.kurosuiton.pstmncollparser.postman;

import lombok.Getter;

import java.util.ArrayList;

/**
 * Класс коллекции Postman
 *
 * @author Artem_Velichkin
 */
public class Collection {

    /**
     * Информация о коллекции
     */
    @Getter
    private CollectionInfo info;

    /**
     * Список папок
     */
    @Getter
    private ArrayList<Folder> folders;

    /**
     * Список запросов
     */
    @Getter
    private ArrayList<PostmanRequest> requests;

    /**
     * Конструктор коллекции
     *
     * @param info     информация
     * @param folders  список папок
     * @param requests список запросов
     */
    public Collection(CollectionInfo info, ArrayList<Folder> folders, ArrayList<PostmanRequest> requests) {
        this.info = info;
        this.folders = folders;
        this.requests = requests;
    }

}
