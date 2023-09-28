package org.example;

import java.util.Arrays;

public class ParserString {
    public String[] parse(String text){
        IOdata textIN = new IOdata();//
        String [] in =  textIN.inputText(text).split(" ");
        return in;
    }
}
