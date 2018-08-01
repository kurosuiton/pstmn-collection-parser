package com.kurosuiton.pstmncollparser.postman;

import lombok.Getter;

/**
 * Событие
 *
 * @author Artem_Velichkin
 */
class Event {

    /**
     * Слушатель
     */
    @Getter
    private String listen;

    /**
     * Скрипт
     */
    @Getter
    private Script script;

}
