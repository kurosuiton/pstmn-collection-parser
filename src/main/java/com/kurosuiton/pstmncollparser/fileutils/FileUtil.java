package com.kurosuiton.pstmncollparser.fileutils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Artem_Velichkin
 */
public class FileUtil {

    /**
     * Reader from file
     *
     * @param path path to file
     * @return return String from file
     */
    public static String fileReader(String path) {
        final String[] result1 = {""};
        try {
            Files.lines(Paths.get(path), StandardCharsets.UTF_8).forEach(o -> result1[0] += o);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result1[0];
    }

}
