package com.kurosuiton.pstmncollparser.cucumber;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Структура предыстории
 *
 * @author Artem_Velichkin
 */
public class Precondition {

    /**
     * Список сценариев
     */
    @Getter
    @Setter
    private ArrayList<Scenario> scenarios;

}
