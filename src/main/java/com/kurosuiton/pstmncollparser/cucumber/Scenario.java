package com.kurosuiton.pstmncollparser.cucumber;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Структура сценария
 *
 * @author Artem_Velichkin
 */
public class Scenario {

    /**
     * Список тегов
     */
    @Getter
    @Setter
    private ArrayList<String> tags;

    /**
     * Название теста
     */
    @Getter
    @Setter
    private String name;

    /**
     * Список шагов
     */
    @Getter
    @Setter
    private ArrayList<Step> steps;

}
