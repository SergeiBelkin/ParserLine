package org.example;

import java.io.*;
import java.util.HashMap;

public class WriterOfFile {
    public void writerOf (HashMap<String,String>map){
        String name = map.get("0");

        try (FileWriter writ = new FileWriter(name+".txt", true)){
            writ.write("<"+map.get("0")+">");
            writ.write("<"+map.get("2")+">");
            writ.write("<"+map.get("1")+">");
            writ.write("<"+map.get("date")+">");
            writ.write("<"+map.get("number")+">");
            writ.write("<"+map.get("gender")+">");
            writ.write('\n');



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
