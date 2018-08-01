package com.kurosuiton.pstmncollparser.json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.kurosuiton.pstmncollparser.postman.Collection;
import com.kurosuiton.pstmncollparser.postman.Folder;
import com.kurosuiton.pstmncollparser.postman.Item;
import com.kurosuiton.pstmncollparser.postman.PostmanRequest;

import java.util.ArrayList;

/**
 * @author Artem_Velichkin
 */
public class JsonParser {

    private final String collectionJsonString;

    public JsonParser(String text) {
        this.collectionJsonString = text;
    }

    public Collection getCollectionFromString(String testString) {
        Gson gson = new Gson();
        Item item = gson.fromJson(testString, Item.class);
        return new Collection(item.getInfo(), getFoldersFromItems(item.getItem()), getRequstsFromItems(item.getItem()));
    }

    private ArrayList<Folder> getFoldersFromItems(ArrayList<JsonObject> jsonObjects) {
        ArrayList<Folder> folders = new ArrayList<>();
        Gson gson = new Gson();
        for (JsonObject jsonObject : jsonObjects) {
            Item item = gson.fromJson(jsonObject, Item.class);
            if (item.getRequest() == null) {
                Folder folder = new Folder(item.getName(), item.getDescription(), getFoldersFromItems(item.getItem()), getRequstsFromItems(item.getItem()));
                folders.add(folder);
            }
        }
        return folders;
    }

    private ArrayList<PostmanRequest> getRequstsFromItems(ArrayList<JsonObject> jsonObjects) {
        ArrayList<PostmanRequest> postmanRequests = new ArrayList<>();
        Gson gson = new Gson();
        for (JsonObject jsonObject : jsonObjects) {
            if (jsonObject.get("request") != null) {
                PostmanRequest postmanRequest = gson.fromJson(jsonObject, PostmanRequest.class);
                postmanRequests.add(postmanRequest);
            }
        }
        return postmanRequests;
    }

}
