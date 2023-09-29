package org.example;

import java.util.HashMap;
import java.util.Map;

public class IndentifierData {
    Map<String,String> data = new HashMap<>();
    public Map<String, String> identif(String [] array){
        if (array.length == 6){
            int count = 0;
        for (String x:array
             ) {
            try {
                if (x.length() == 10) {
                    data.put("number", x);
                    int a = Integer.parseInt(x);
                }
                else if (x.length() == 1 && (x.equals("f")  || x.equals("m"))) {
                    data.put("gender", x);

                }
                else if(x.length() == 8 && x.indexOf(".") == 2 && x.lastIndexOf(".") == 5) {

                        data.put("date", x);

                }
                else if(count < 3){

                    data.put(Integer.toString(count) , x);
                    count++;
                }
                else{
                    int a = Integer.parseInt("asd");
                }
            } catch (NumberFormatException e) {
                System.out.println("не верный формат " + x);
            }
        }
        }else {
            System.out.println("введены не корректные, полные данные");
        }
        System.out.println("data = " + data);
        return data;
    }
}


