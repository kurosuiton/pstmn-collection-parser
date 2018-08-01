package com.kurosuiton.pstmncollparser.postman;

import lombok.Getter;

/**
 * Тело запроса
 *
 * @author Artem_Velichkin
 */
class Body {

    /**
     * Тип запроса
     */
    @Getter
    private String mode;

    /**
     * Параметры тела
     */
    @Getter
    private String raw;

}
