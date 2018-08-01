package com.kurosuiton.pstmncollparser.postman;

import lombok.Getter;

/**
 * Хедер запроса
 *
 * @author Artem_Velichkin
 */
class Header {

    /**
     * Ключ
     */
    @Getter
    private String key;

    /**
     * Значение
     */
    @Getter
    private String value;

}
