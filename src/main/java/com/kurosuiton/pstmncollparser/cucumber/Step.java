package com.kurosuiton.pstmncollparser.cucumber;

import lombok.Getter;
import lombok.Setter;

/**
 * Структура шага
 *
 * @author Artem_Velichkin
 */
public class Step {

    /**
     * Ключевое слово
     */
    @Getter
    @Setter
    private String keyword;

    /**
     * Текст шага
     */
    @Getter
    @Setter
    private String text;

}
