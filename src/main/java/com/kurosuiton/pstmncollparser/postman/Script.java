package com.kurosuiton.pstmncollparser.postman;

import lombok.Getter;

import java.util.ArrayList;

/**
 * Скрипт
 *
 * @author Artem_Velichkin
 */
class Script {

    /**
     * Тип скрипта
     */
    @Getter
    private String type;

    /**
     * Тело скрипта
     */
    @Getter
    private ArrayList<String> exec;

}
