package com.kurosuiton.pstmncollparser.cucumber;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Структура функционала
 *
 * @author Artem_Velichkin
 */
public class Feature {

    /**
     * Локализация фичей для определенного языка
     */
    @Getter
    @Setter
    private String language;

    /**
     * Автор сценариев
     */
    @Getter
    @Setter
    private String author;

    /**
     * Список тегов общих для всех сценариев в фиче
     */
    @Getter
    @Setter
    private ArrayList<String> tags;

    /**
     * Название функционала
     */
    @Getter
    @Setter
    private String name;

    /**
     * Описание сценариев
     */
    @Getter
    @Setter
    private String description;

    /**
     * Предыстория
     */
    @Getter
    @Setter
    private Precondition precondition;

    /**
     * Список сценариев
     */
    @Getter
    @Setter
    private ArrayList<Scenario> scenarios;

}
