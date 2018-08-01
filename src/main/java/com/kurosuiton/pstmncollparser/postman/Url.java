package com.kurosuiton.pstmncollparser.postman;

import lombok.Getter;

import java.util.ArrayList;

/**
 * URL запроса
 *
 * @author Artem_Velichkin
 */
class Url {

    /**
     * Полный путь
     */
    @Getter
    private String raw;

    /**
     * Хост
     */
    @Getter
    private ArrayList<String> host;

    /**
     * Endpoint
     */
    @Getter
    private ArrayList<String> path;

}
