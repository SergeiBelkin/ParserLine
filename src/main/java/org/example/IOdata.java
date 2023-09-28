package org.example;

import java.util.Scanner;

public class IOdata {
    String name;

    @Override
    public String toString() {
        return "IOdata{" +
                "name='" + name + '\'' +
                '}';
    }

    public String inputText(String text){
            System.out.println(text);
            Scanner in = new Scanner(System.in);
            name = in.nextLine();
            in.close();
            return name;
        }


}
