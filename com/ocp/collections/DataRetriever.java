package com.ocp.collections;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by agermenos on 3/4/2017.
 */
public class DataRetriever {
    public static String getMuchData(){
        StringBuilder sb = new StringBuilder();
        try (InputStream in = Files.newInputStream(Paths.get("classpath:/resources/data.txt"));
             BufferedReader reader =
                     new BufferedReader(new InputStreamReader(in))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        return sb.toString();
    }
}
