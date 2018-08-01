package com.kurosuiton.pstmncollparser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kurosuiton.pstmncollparser.fileutils.FileUtil;
import com.kurosuiton.pstmncollparser.json.JsonParser;
import com.kurosuiton.pstmncollparser.postman.Collection;

/**
 * @author Artem_Velichkin
 */
public class Runner {

    public static void main(String[] args) {
//        String testString = FileUtil.fileReader("src\\main\\resources\\collections\\Collection.json");
        String testString = FileUtil.fileReader(args[0]);
        Collection collection = new JsonParser(testString).getCollectionFromString(testString);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String x = gson.toJson(collection);
        System.out.println(x);
    }

}
