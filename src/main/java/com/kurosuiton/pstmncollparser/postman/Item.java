package com.kurosuiton.pstmncollparser.postman;

import com.google.gson.JsonObject;
import lombok.Getter;

import java.util.ArrayList;

/**
 * @author Artem_Velichkin
 */
public class Item {

    @Getter
    private CollectionInfo info;

    @Getter
    private String name;

    @Getter
    private String description;

    @Getter
    private ArrayList<JsonObject> item;

    @Getter
    private ArrayList<JsonObject> event;

    @Getter
    private JsonObject request;

    @Getter
    private ArrayList<JsonObject> response;
}
