package org.example;

import java.util.HashMap;
import java.util.Map;

public class IndentifierData {
    Map data = new HashMap<>();
    public void identif(String [] array){
        if (array.length == 6){
        for (String x:array
             ) {
            try {
                if (x.length() == 10) {
                    data.put("number", Integer.parseInt(x));
                    System.out.println(Integer.parseInt(x));
                }
                else if (x.length() == 1) {
                    data.put("gender", x);
                    System.out.println(" i'ts gender ");
                }
                else if(x.indexOf(".") == 2){
                    data.put("date", x);
                    System.out.println(" enter data ");
                }
            } catch (NumberFormatException e) {
                System.out.println("не число " + x);
            }
        }
        }else {
            System.out.println("введены не корректные, полные данные");
        }
    }
}


